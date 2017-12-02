package de.sebastianmonzel.ordersalamiprocess.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.web.client.RestTemplate;

import javax.inject.Named;

@Named("getSalamiStockCountDelegate")
public class GetSalamiStockCountDelegate implements JavaDelegate {

    private RestTemplate restTemplate = new RestTemplate();

    public void execute(DelegateExecution delegateExecution) throws Exception {
        Long salamiStockCount = restTemplate.getForObject("http://localhost:8080/stock/salami/count", Long.class);

        System.out.println("Actual salami stock count = " + salamiStockCount);
        delegateExecution.setVariable("stockCount", salamiStockCount);
    }

}

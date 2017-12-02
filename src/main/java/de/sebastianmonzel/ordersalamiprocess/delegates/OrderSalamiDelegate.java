package de.sebastianmonzel.ordersalamiprocess.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.web.client.RestTemplate;

import javax.inject.Named;

@Named("orderSalamiDelegate")
public class OrderSalamiDelegate implements JavaDelegate {

    private RestTemplate restTemplate = new RestTemplate();

    public void execute(DelegateExecution delegateExecution) throws Exception {
        Long salamiStockCount = restTemplate.getForObject("http://localhost:8080/stock/salami", Long.class);
        System.out.println("Let me send you some salami. Actual salami stock count = " + salamiStockCount);
    }

}

package de.sebastianmonzel.ordersalamiprocess.api;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderAPI {

    @Autowired
    private RuntimeService runtimeService;

    @RequestMapping(
            method= RequestMethod.GET,
            path = "/order/salami")
    public String orderSalami() {
        ProcessInstance ordersalamiprocess = runtimeService.startProcessInstanceByKey("ordersalamiprocess");
        return "Started process with id" + ordersalamiprocess.getId();
    }



}

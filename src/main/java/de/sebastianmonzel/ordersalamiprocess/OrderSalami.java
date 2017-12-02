package de.sebastianmonzel.ordersalamiprocess;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named("orderSalamiDelegate")
public class OrderSalami implements JavaDelegate {

    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Let me order some salami.");
    }
}

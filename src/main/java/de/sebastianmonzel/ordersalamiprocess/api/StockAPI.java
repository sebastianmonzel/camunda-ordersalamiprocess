package de.sebastianmonzel.ordersalamiprocess.api;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockAPI {
    
    // just to simulate stock - use static mechanism with attention
    private static int stockcount = 10;


    @RequestMapping(
            method=RequestMethod.GET,
            path = "/stock/salami/count")
    public int stockcount() {
        return stockcount;
    }

    @RequestMapping(
            method=RequestMethod.GET,
            path = "/stock/salami")
    public int fetchASalami() {
        return --stockcount;
    }

}

package com.demo.oxygen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @RequestMapping(method = RequestMethod.GET, value = "/buy", produces = "text/pain")
    public String pay(){
        return "We are buying a product";
    }

}

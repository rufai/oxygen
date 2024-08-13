
package com.demo.oxygen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @RequestMapping(method = RequestMethod.GET, value = "/inventory", produces = "text/pain")
    public String pay(){
        return "All items on sale";
    }

}

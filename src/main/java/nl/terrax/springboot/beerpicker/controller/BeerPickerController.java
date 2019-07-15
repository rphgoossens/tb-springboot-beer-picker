package nl.terrax.springboot.beerpicker.controller;

import nl.terrax.springboot.beerpicker.model.Beer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-beer/1.0")
public class BeerPickerController {

    @RequestMapping(value = "/beer", method = RequestMethod.GET, produces = "application/json")
    public Beer pickABeer() {

        return new Beer("Brand");

    }

}

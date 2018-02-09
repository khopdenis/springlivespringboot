package internship.springlivespringboot.controller;

import internship.springlivespringboot.domain.Car;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class SimpleController {

    @RequestMapping("/car/{id}")
    public Car getCar(@PathVariable Long id) {
        if(Objects.equals(id, 1L)) {
            return new Car(1L, "Volkswagen AG", "Audi", "Q5", 220);
        } else {
            return new Car(2L, "Volkswagen AG", "Porsche", "Cayenne", 350);
        }
    }

}

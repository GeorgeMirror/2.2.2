package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    private CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String printCar(@RequestParam(name = "count", required = false, defaultValue = "5") int count,
                           ModelMap model) {
        if (count<0 && count>=5) {
            model.addAttribute("listCar", carService.getListCar(5));
        } else {
            model.addAttribute("listCar", carService.getListCar(count));
        }

        return "cars";
    }
}

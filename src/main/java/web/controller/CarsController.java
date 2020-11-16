package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.DAO.CarDAO;

@Controller
public class CarsController {
    private CarDAO carDAO;

    public CarsController(CarDAO carDAO) { this.carDAO = carDAO; }

    @GetMapping("/cars")
    public String test2(@RequestParam(value = "count", defaultValue = "5")  int count, Model model) {
        model.addAttribute("carList", carDAO.getList(count));
        return "cars";
    }
}

package com.example.customermanagement;

import com.example.customermanagement.model.entity.Customer;
import com.example.customermanagement.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("customers/list");
        List<Customer> customers = customerService.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/info")
    public String info(Model model, @RequestParam("id") int id) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "customers/info";
    }


}

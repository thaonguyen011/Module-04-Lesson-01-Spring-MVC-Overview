package com.example.currencyconverter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CurrencyConverterController {
    @GetMapping("/convert")
    public ModelAndView show() {
        ModelAndView modelAndView = new ModelAndView("convert/list");
        return modelAndView;
    }

    @PostMapping("/convert")
    public ModelAndView convert(@RequestParam float usd, @RequestParam float currency) {

        float result = usd * currency;

        ModelAndView modelAndView = new ModelAndView("convert/list");
        modelAndView.addObject("result", result);
        return modelAndView;

    }
}

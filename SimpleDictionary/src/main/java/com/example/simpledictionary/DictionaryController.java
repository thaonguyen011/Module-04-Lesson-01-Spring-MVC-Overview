package com.example.simpledictionary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {

    @GetMapping("/dictionary")
    public ModelAndView show() {
        return new ModelAndView("/index");
    }

    @PostMapping("/dictionary")
    public ModelAndView look(@RequestParam String word) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "xin chào");
        dictionary.put("computer", "máy tính");
        dictionary.put("water", "nước");
        dictionary.put("ball", "qủa bóng");

        String result = dictionary.get(word);

        if (result == null) {
            result = "not found";
        }

        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}

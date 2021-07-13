package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.CurrencyConverter;

@Controller
public class CurrencyController {
    @Autowired
    private CurrencyConverter currencyConverter;

    @GetMapping("calculate")
    public String showForm(){
        return "form";
    }

    @GetMapping("convert")
    public ModelAndView calculate(@RequestParam("usd") long usd,@RequestParam("rate") double rate){
        double result = currencyConverter.calculate(usd, rate);
        ModelAndView modelAndView = new ModelAndView("result");
        modelAndView.addObject("result",result);
        return modelAndView;
    }
}

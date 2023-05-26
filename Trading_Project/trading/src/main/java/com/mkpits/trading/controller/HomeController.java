package com.mkpits.trading.controller;

import com.mkpits.trading.dto.response.TradingDatadto;
import com.mkpits.trading.services.TradingDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

//    Autowired members must be defined in valid Spring bean (@Component|@Service|...)

@Autowired

public TradingDataService TradingDataServices;//interface

@GetMapping("/index")
    public String home(Model model){

       return "index";
    }

    @GetMapping("/dashboard")

    public String dashboard (Model model){

        List<TradingDatadto> tradingDataDtoList = TradingDataServices.getTradingData();///method implement in trading data

        model.addAttribute("trading",tradingDataDtoList);// trading used in html v b ̣


        return "dashboard";
    }

}

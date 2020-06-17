package com.kipngetich.populardishes.controller;

import org.springframework.stereotype.Controller;

/**
 * Created by Kipngetich
 */
@Controller
public class HomeController {
    public String index(){
        return "index";
    }
}

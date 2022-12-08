/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epfo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author asurase
 */
@RestController
@RequestMapping(value = "/api")
public class ApiController {
    
    @RequestMapping(value="/getuser",method = RequestMethod.GET)
    public String getUSer(){
        return "Hello user ABC";
    }
}

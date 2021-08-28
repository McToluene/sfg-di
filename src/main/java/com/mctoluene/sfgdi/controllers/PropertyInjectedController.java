package com.mctoluene.sfgdi.controllers;

import com.mctoluene.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return  greetingService.sayGreeting();
    }
}

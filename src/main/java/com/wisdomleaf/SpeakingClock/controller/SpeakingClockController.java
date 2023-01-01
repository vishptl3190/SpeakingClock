package com.wisdomleaf.SpeakingClock.controller;

import com.wisdomleaf.SpeakingClock.bean.RequestBean;
import com.wisdomleaf.SpeakingClock.bean.ResponseBean;
import com.wisdomleaf.SpeakingClock.service.SpeakingClockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpeakingClockController {

    @Autowired
    SpeakingClockService service;

    @RequestMapping("/")
    public String displayMessage()
    {
        return "Hi Wisdom Leaf";
    }

    @RequestMapping(value = "/process",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    @ResponseBody
    public ResponseBean processTime(@RequestBody RequestBean bean){
        ResponseBean respBean = service.processTime(bean);
        return respBean;
    }
}

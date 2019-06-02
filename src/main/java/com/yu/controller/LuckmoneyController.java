package com.yu.controller;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.yu.entity.Luckmoney;
import com.yu.service.ILuckmoneyService;
import com.yu.service.impl.LuckmoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yousan on 2019/6/2 12:29.
 */
@RestController
public class LuckmoneyController {
    @Autowired
    private ILuckmoneyService luckmoneyService;

    @GetMapping("/all")
    public List<Luckmoney> findAll(){
        return luckmoneyService.findAll();
    }

    @GetMapping("/query/{id}")
    public Luckmoney queryById(@PathVariable Integer id){
        return luckmoneyService.findById(id);
    }

    @PostMapping("/add")
    public Object addLuckmoney(@RequestBody Luckmoney luckmoney){
        return luckmoneyService.insert(luckmoney);
    }
    @PutMapping("/update/{id}/{name}")
    public Luckmoney updateLuckmoney(@PathVariable("id") Integer id,
                                     @PathVariable("name") String name){
        return luckmoneyService.update(id,name);
    }

    @PostMapping("/batch")
    public List<Luckmoney> batchSend(@RequestBody List<Luckmoney> list){
        return luckmoneyService.batchSend(list);
    }
}

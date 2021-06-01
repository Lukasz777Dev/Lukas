package com.forbusypeople.budget.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;


@RestController
@RequestMapping("/assets")
public class AssetsController {

    @GetMapping
    public List<Integer> getAssets() {
        return asList(1, 3, 5);
    }

}

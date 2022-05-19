package com.itstep.mytravelapp.controller;
import com.itstep.mytravelapp.service.GoogleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GoogleController {

    @Autowired
    private GoogleService service;

}

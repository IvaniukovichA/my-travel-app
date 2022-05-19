package com.itstep.mytravelapp.controller;

import com.itstep.mytravelapp.service.impl.BookingService;
import com.itstep.mytravelapp.service.impl.TopHotelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {

    @Autowired
    private TopHotelsService thService;

    @Autowired
    private BookingService bkService;


}

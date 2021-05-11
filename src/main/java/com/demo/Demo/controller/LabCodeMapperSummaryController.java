package com.demo.Demo.controller;

import com.demo.Demo.entity.LabCodeMapperSummary;
import com.demo.Demo.service.LabCodeMapperSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class LabCodeMapperSummaryController {

    @Autowired(required = false)
    private LabCodeMapperSummaryService labCodeMapperSummaryService;

    @RequestMapping(value = "/fetch")
    public Object fetchDetails(){
        return labCodeMapperSummaryService.fetchDetails();
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public ResponseEntity<?> save(@RequestBody LabCodeMapperSummary labCodeMapperSummary){

        return new ResponseEntity( labCodeMapperSummaryService.saveLabMapperSummary(labCodeMapperSummary),HttpStatus.CREATED);
    }
}

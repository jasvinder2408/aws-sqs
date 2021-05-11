package com.demo.Demo.service;


import com.demo.Demo.entity.LabCodeMapperSummary;
import com.demo.Demo.repository.LabCodeMapperSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabCodeMapperSummaryImpl implements LabCodeMapperSummaryService {
    @Autowired
    private LabCodeMapperSummaryRepository labCodeMapperSummaryRepository;
    @Override
    public Object fetchDetails() {
        return labCodeMapperSummaryRepository.findAll();
    }

    @Override
    public LabCodeMapperSummary saveLabMapperSummary(LabCodeMapperSummary labCodeMapperSummary) {
       return  labCodeMapperSummaryRepository.save(labCodeMapperSummary);
            }


}

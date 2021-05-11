package com.demo.Demo.serviceImpl;

import com.demo.Demo.entity.LabCodeMapperSummary;
import com.demo.Demo.repository.LabCodeMapperSummaryRepository;
import com.demo.Demo.service.LabCodeMapperSummaryImpl;
import com.demo.Demo.service.LabCodeMapperSummaryService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class LabCodeMapperSummaryImplTest {
    @Mock
    private LabCodeMapperSummaryRepository labCodeMapperSummaryRepository;

    @InjectMocks
    @Autowired
    private LabCodeMapperSummaryImpl labCodeMapperSummaryService;
    @Before
    public void init(){
        //labCodeMapperSummaryService=new LabCodeMapperSummaryImpl();
    }
    @Test
    public void fetch_should_return_data(){
        when(labCodeMapperSummaryRepository.findAll()).thenReturn(Arrays.asList(new LabCodeMapperSummary()));
       Object obj=labCodeMapperSummaryService.fetchDetails();
        Assert.assertNotNull(obj);
    }
}


package com.demo.Demo.repository;

import com.demo.Demo.entity.LabCodeMapperSummary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabCodeMapperSummaryRepository extends CrudRepository<LabCodeMapperSummary,String> {
}

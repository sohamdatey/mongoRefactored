package com.reporting.test.report.liabilitybyfund.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.reporting.test.report.liabilitybyfund.model.LiabilityByFundConfig;

 
@Repository
public interface LiabilityByFundConfigMongoRepository extends MongoRepository<LiabilityByFundConfig, String>{

}

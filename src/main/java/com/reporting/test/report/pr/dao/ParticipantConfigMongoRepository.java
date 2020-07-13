package com.reporting.test.report.pr.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.reporting.test.report.liabilitybyfund.model.LiabilityByFundConfig;
import com.reporting.test.report.pr.model.ParticipantConfig;

 
@Repository
public interface ParticipantConfigMongoRepository extends MongoRepository<ParticipantConfig, String>{

}

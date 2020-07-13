package com.reporting.test.report.liabilitybyfund;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.reporting.test.report.liabilitybyfund.dao.LiabilityByFundConfigMongoRepository;
import com.reporting.test.report.liabilitybyfund.model.LiabilityByFundConfig;
import com.reporting.test.report.liabilitybyfund.model.LiabilityByFundReportData;
import com.reporting.test.report.pr.model.ParticipantConfig;

@RestController
@RequestMapping(value = "/reports/liabilityByFund")
public class LiabilityByFundController {

	@Autowired
	LiabilityByFundConfigMongoRepository configMongoRepository;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public void hello() {
		
		System.out.println("hello");
	}
	@RequestMapping(value = "/calc", method = RequestMethod.POST, produces = "application/json")
	public LiabilityByFundReportData calculate(@RequestBody String requestConfigBody) {
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			System.out.println("before insert: "+mapper.readValue(requestConfigBody, LiabilityByFundConfig.class));
			configMongoRepository.insert(mapper.readValue(requestConfigBody, LiabilityByFundConfig.class));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new LiabilityByFundReportData();
	}
	

	@RequestMapping(value = "/compose", method = RequestMethod.POST, produces = "application/text")
	public byte[] compose(@RequestParam(required=false,name="id") String id,@RequestParam(required=false,name="format") String format,@RequestBody String requestConfigBody) {
		
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(id);
		System.out.println(format);
		byte[] array = null;
		try {
			System.out.println("before insert: "+mapper.readValue(requestConfigBody, LiabilityByFundConfig.class));
			configMongoRepository.insert(mapper.readValue(requestConfigBody, LiabilityByFundConfig.class));
			array = Files.readAllBytes(Paths.get("S:/mongodb/mongo test project files/test.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return array;
		
	}


	

}


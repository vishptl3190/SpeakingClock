package com.wisdomleaf.SpeakingClock;

import com.wisdomleaf.SpeakingClock.bean.RequestBean;
import com.wisdomleaf.SpeakingClock.bean.ResponseBean;
import com.wisdomleaf.SpeakingClock.service.SpeakingClockService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootTest
class SpeakingClockApplicationTests {

	@Autowired
	SpeakingClockService service;
	@Test
	void testServiceMethod(){

		RequestBean reqBean =new RequestBean();
		reqBean.setInput_time("8:34:pm");
		ResponseBean resBean = service.processTime(reqBean);
//		System.out.println(resBean.getMessage());
		Assert.hasText("It's eight thirty four and it's a MidDay",resBean.getMessage());
	}

	@Test
	void testInputIsNullOrNot(){
		RequestBean reqBean =new RequestBean();
		reqBean.setInput_time(null);
		ResponseBean resBean = service.processTime(reqBean);
		System.out.println(resBean.getErrorMessage());
		Assert.hasText("Input is null, please enter proper time.",resBean.getErrorMessage());
	}

}

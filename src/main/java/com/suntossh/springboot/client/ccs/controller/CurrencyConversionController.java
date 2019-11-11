package com.suntossh.springboot.client.ccs.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.suntossh.springboot.client.ccs.model.CurrencyConversionInfo;
import com.suntossh.springboot.client.ccs.proxy.ForexServiceFeignProxy;

@RestController
public class CurrencyConversionController {

	@Autowired
	private Environment env;

	@Autowired
	ForexServiceFeignProxy proxy;
	
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public ResponseEntity<CurrencyConversionInfo> convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		System.out.println("HB");
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);

//		ResponseEntity<CurrencyConversionInfo> responseEntity = new RestTemplate().getForEntity(
//				"http://localhost:8020/currency-exchange/from/{from}/to/{to}", CurrencyConversionInfo.class,
//				uriVariables);

		
		
		CurrencyConversionInfo body = proxy.retrieveExchangeValue(from, to);
		body.setPort(env.getProperty("server.port"));
		System.out.println(body.toString());
		return new ResponseEntity<CurrencyConversionInfo>(body, HttpStatus.OK);
	}

}

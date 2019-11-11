package com.suntossh.springboot.client.ccs.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.suntossh.springboot.client.ccs.model.CurrencyConversionInfo;

@FeignClient(name="forex-service", url="localhost:8020")
public interface ForexServiceFeignProxy {
  @GetMapping("/currency-exchange/from/{from}/to/{to}")
  public CurrencyConversionInfo retrieveExchangeValue
    (@PathVariable("from") String from, @PathVariable("to") String to);
}
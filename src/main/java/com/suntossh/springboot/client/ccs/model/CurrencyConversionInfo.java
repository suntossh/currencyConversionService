package com.suntossh.springboot.client.ccs.model;

import java.math.BigDecimal;

public class CurrencyConversionInfo {

	private String fromCcy;
	private String toCcy;
	private BigDecimal rate;
	private BigDecimal value;
	private BigDecimal totalValue;
	private String port;

	/**
	 * @return the fromCcy
	 */
	public String getFromCcy() {
		return fromCcy;
	}

	/**
	 * @param fromCcy the fromCcy to set
	 */
	public void setFromCcy(String fromCcy) {
		this.fromCcy = fromCcy;
	}

	/**
	 * @return the toCcy
	 */
	public String getToCcy() {
		return toCcy;
	}

	/**
	 * @param toCcy the toCcy to set
	 */
	public void setToCcy(String toCcy) {
		this.toCcy = toCcy;
	}

	/**
	 * @return the rate
	 */
	public BigDecimal getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	/**
	 * @return the value
	 */
	public BigDecimal getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(BigDecimal value) {
		this.value = value;
	}

	/**
	 * @return the totalValue
	 */
	public BigDecimal getTotalValue() {
		return totalValue;
	}

	/**
	 * @param totalValue the totalValue to set
	 */
	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
	}

	/**
	 * @return the port
	 */
	public String getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(String port) {
		this.port = port;
	}

	public CurrencyConversionInfo(String fromCcy, String toCcy, BigDecimal rate, BigDecimal value,
			BigDecimal totalValue, String port) {
		super();
		this.fromCcy = fromCcy;
		this.toCcy = toCcy;
		this.rate = rate;
		this.value = value;
		this.totalValue = totalValue;
		this.port = port;
	}
	
	

	public CurrencyConversionInfo() {}

	@Override
	public String toString() {
		return "CurrencyConversionInfo [fromCcy=" + fromCcy + ", toCcy=" + toCcy + ", rate=" + rate + ", value=" + value
				+ ", totalValue=" + totalValue + ", port=" + port + "]";
	}

}

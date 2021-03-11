package com.adp.demo.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CurrencyDTO {

	private int id;
	@NotNull
	@Size(min = 1, max = 50)
	private String currencyName;
	@NotNull
	@Size(min = 1, max = 50)
	private String currencyType;
	@NotNull
	@Min(1)
	private BigDecimal value;
	
	private BigInteger available;
		
	public CurrencyDTO() {
	}
	
	public CurrencyDTO(int id, String currencyName, String currencyType, BigDecimal value, BigInteger available) {
		this.id = id;
		this.currencyName = currencyName;
		this.currencyType = currencyType;
		this.value = value;
		this.available = available;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCurrencyName() {
		return currencyName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	public String getCurrencyType() {
		return currencyType;
	}
	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public BigInteger getAvailable() {
		return available;
	}
	public void setAvailable(BigInteger available) {
		this.available = available;
	}
	
	
	
	
}

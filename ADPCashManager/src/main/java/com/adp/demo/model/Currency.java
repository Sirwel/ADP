package com.adp.demo.model;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Currency")
public class Currency {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "currency_id")
	private int id;
	
	@Column(name = "currency_name")
	private String currencyName;
	
	@Column(name = "currency_type")
	private String currencyType;
	
	@Column(name = "currency_value")
	private BigDecimal value;
	
	@Column(name = "currency_availability")
	private BigInteger available;
		
	public Currency() {
	}
	
	public Currency(int id, String currencyName, String currencyType, BigDecimal value, BigInteger available) {
		super();
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

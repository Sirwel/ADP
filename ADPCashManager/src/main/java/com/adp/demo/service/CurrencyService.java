package com.adp.demo.service;

import java.math.BigDecimal;

import com.adp.demo.dto.CurrencyDTO;
import com.adp.demo.model.Currency;

public interface CurrencyService {
	
	
	Currency getChange(BigDecimal value, String name,String changeType);
	
	public void updateCurrency(CurrencyDTO currDTO);
	

}

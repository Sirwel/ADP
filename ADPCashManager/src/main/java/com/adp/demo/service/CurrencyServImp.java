package com.adp.demo.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adp.demo.dto.CurrencyDTO;
import com.adp.demo.model.Currency;
import com.adp.demo.repository.CashManagerRepo;

@Service
@Transactional
public class CurrencyServImp implements CurrencyService {
	
	@Autowired
	private CashManagerRepo mngRepo;
	

	@Override
	public Currency getChange(BigDecimal value, String name,String changeType) {
		Optional<List<Currency>> curr =  mngRepo.getCurrencybyType(name,changeType);
		
		/*used to store possible changes for a given currency.
		It will help to compute the minimum number of coins that adds up to N currency bill/coin  */
		BigDecimal[] coinVal = null;
		
		if (curr.isPresent()) {
			coinVal = curr.get().stream().map(x ->x.getValue()).toArray(BigDecimal[]::new);
		}else { throw new EntityNotFoundException();}

		//algorithm implementation and logic for handling hibernate transactions are missing
		
		return null;
	}


	@Override
	public void updateCurrency(CurrencyDTO currDTO) {
				
	}

}

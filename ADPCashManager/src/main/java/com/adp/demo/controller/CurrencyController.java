package com.adp.demo.controller;

import java.math.BigDecimal;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adp.demo.dto.CurrencyDTO;
import com.adp.demo.service.CurrencyService;

@RestController
public class CurrencyController {

	@Autowired
	private CurrencyService currencyServ;

	@GetMapping(value = "/currency", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getChange(@Valid
			@RequestParam(name = "value", required = true)
			@NotNull(message = "Currency cannot be null or empty")
			@DecimalMin(value = "1", message = "A minimum amount of currency is required to process the change.") BigDecimal currency,
			@RequestParam(name = "name", required = false,defaultValue = "Dollar") String cuName,
			@RequestParam(name = "ctype", required = false,defaultValue = "Coin") String changeType
			) {
		currencyServ.getChange(currency,cuName,changeType);

		
		return ResponseEntity.ok("");

	}
	@PutMapping(value = "/currency", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateChange( @RequestBody @Validated CurrencyDTO currDTO) {
		
		currencyServ.updateCurrency(currDTO);

		return ResponseEntity.ok("");

	}
	

}

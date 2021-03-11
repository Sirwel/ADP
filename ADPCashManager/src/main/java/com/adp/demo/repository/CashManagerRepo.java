package com.adp.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.adp.demo.model.Currency;

@Repository
public interface CashManagerRepo extends JpaRepository<Currency,Integer> {

	@Query("FROM Currency WHERE currency_name = :name and currency_type = :type")
	Optional<List<Currency>> getCurrencybyType(@Param("name") String name, @Param("type") String type);
	

}

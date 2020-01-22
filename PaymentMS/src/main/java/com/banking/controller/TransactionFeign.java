package com.banking.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.banking.dto.TransactionDTO;

@FeignClient("TransactionMS")
public interface TransactionFeign {

	@PostMapping(value = "/transaction")
	void saveTransaction(@RequestBody TransactionDTO transDTO);
}

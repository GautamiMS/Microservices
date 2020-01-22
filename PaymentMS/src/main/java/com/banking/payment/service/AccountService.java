package com.banking.payment.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.payment.dto.AccountDTO;
import com.banking.payment.entity.Account;
import com.banking.payment.repository.AccountRepository;

@Service
public class AccountService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	AccountRepository accountRepository;
	
	/*
	 * @Autowired AccountExtraService accountExtraService;
	 */

	//private Map<Integer, Account> DB = new HashMap<>();
	
	/*
	 * public List<Account> getAccountList() { List<Account> list = new
	 * ArrayList<>(); if(list.isEmpty()) { list.addAll(DB.values()); } return list;
	 * }
	 */
	
	/*
	 * public String getAccountById(Integer accountNumber){
	 * 
	 * String str = ""; if(accountNumber != 0) str = "Valid"; else str = "Invalid";
	 * return str; //return accountRepository.getEmployeeById(accountNumber); }
	 */

	public AccountDTO getAccount(Integer accountNumber) {

		logger.info("Get account request, inside Service. AccNumber : ", accountNumber);

		Account account = accountRepository.findById(accountNumber).get();

		AccountDTO accountDTO = AccountDTO.valueOf(account);

		return accountDTO;

	}

	public void updateAccount(AccountDTO accountDTO) {

		logger.info("Update account request, inside Service. RequestBody : ", accountDTO);

		Account account = accountDTO.createEntity();

		accountRepository.save(account);
	}

}
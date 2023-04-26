package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.RequestSuccess;
import com.example.demo.entity.Bank;
import com.example.demo.enums.DemoErrorCode;
import com.example.demo.exception.DemoException;
import com.example.demo.repository.BankRepository;
import com.example.demo.repository.BranchRepository;

@Service
public class DemoService {

	
//	@Autowired
//	private BankRepository bankRepository;

	//@Autowired
	//private BranchRepository branchRepository;



	/**
	 * 
	 */
	public DemoService() {
	}

	/**
	 * @param model
	 * @return
	 */
	public List<Bank> getBankList() throws DemoException {
		System.out.println("getBankList start.");
		//List<Bank> bankList = bankRepository.findAll();
		//if (bankList == null) {
			//bankList = new ArrayList<Bank>();
		//}
		//System.out.println("Found " + bankList.size() + " banks in the repository.");
		//return bankList;
		return new ArrayList<>();
	}

	/**
	 * @param name
	 * @return
	 */
	public RequestSuccess addBank(String name) throws DemoException {
		if (name == null) {
			throw new DemoException(DemoErrorCode.EXDEMO_NULL_REQUEST.name());
		}
		// RequestSuccess response = new RequestSuccess();
		//bankRepository.save(new Bank(name, new ArrayList(), new ArrayList()));
		RequestSuccess response = new RequestSuccess();
		response.setSuccess(true);
		return response;
	}

	/**
	 * @param loginId
	 * @return
	 */
	public RequestSuccess updateDemoById(String loginId) throws DemoException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param loginId
	 * @return
	 */
	public RequestSuccess deleteDemoById(String loginId) throws DemoException {
		// TODO Auto-generated method stub
		return null;
	}

}

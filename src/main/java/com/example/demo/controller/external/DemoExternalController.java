package com.example.demo.controller.external;


import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.RequestSuccess;
import com.example.demo.entity.Bank;
import com.example.demo.exception.DemoException;
import com.example.demo.services.DemoService;

//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author Precious Pearl A. Sano Ventura <pr3_cious_15@yahoo.com>
 *
 */
//@RestController
@Controller
@RequestMapping("/external/")
@Transactional
//@Tag(name = "Demo API Sample")
public class DemoExternalController {

	
	private final DemoService demoService;
	
	@Autowired
	public DemoExternalController(DemoService demoService) {
		System.out.println("DemoExternalController created with service.");
		this.demoService = demoService;
		System.out.println("Controller Constructor : is demoService is null ? " + (demoService == null));
	}
	 
	@GetMapping("/banks")
	//@Operation(summary = "BANK-LIST", description = "Get bank list by id")
	private String getBankList(Model model) throws DemoException {
		System.out.println("is demoService null must be true ? " + (demoService == null));
		System.out.println("is getBankList null must be true " + ((demoService != null && demoService.getBankList() == null) == false));
		if (demoService != null && demoService.getBankList() != null) {
			model.addAttribute("banks",demoService.getBankList());
		} else {
			model.addAttribute("banks", new ArrayList<Bank>());
		}
		
		return "banks_html";
	}
	
	@PostMapping("/banks")
	//@Operation(summary = "BANK-NEW-SUBMISSION", description = "Submission new bank")
	//ResponseEntity<RequestSuccess>
	private String addBank(@RequestParam String name) throws DemoException {
		demoService.addBank(name);
		return "redirect:/banks";
	}
	
	@PatchMapping("/test")
	//@Operation(summary = "TEST-UPDATE-SUBMISSION", description = "Submission update demo by ID")
	public ResponseEntity<RequestSuccess> updateDemoById(
			@RequestHeader(name = "x-api-login-id", required=false) String loginId) throws DemoException {
		return ResponseEntity.ok(demoService.updateDemoById(loginId));
	}
	
	@DeleteMapping("/test")
	//@Operation(summary = "TEST-DELETE-SUBMISSION", description = "Submission delete demo by ID")
	public ResponseEntity<RequestSuccess> deleteDemoById(
			@RequestHeader(name = "x-api-login-id", required=false) String loginId) throws DemoException {
		return ResponseEntity.ok(demoService.deleteDemoById(loginId));
	}
}

package com.example.demo.dto;

import java.util.List;

import lombok.Data;

@Data
public class Demo {
	
	private String id;
	private String demo;
	private String desc;
	private List<Subdemo> subDemo;

}

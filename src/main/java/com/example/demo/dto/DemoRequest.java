/**
 * 
 */
package com.example.demo.dto;
import java.util.List;

import lombok.Data;
/**
 * @author Precious Pearl A. Sano Ventura <pr3_cious_15@yahoo.com>
 *
 */
@Data
public class DemoRequest {

	private String loginId;
	private String id;
	private String demo;
	private String desc;
	private List<Subdemo> subdemos;
}

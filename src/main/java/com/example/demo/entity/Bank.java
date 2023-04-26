/**
 * 
 */
package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Precious Pearl A. Sano Ventura <pr3_cious_15@yahoo.com>
 *
 */
@Entity
@Table(name = "BANK")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Bank extends AbstractPersistable<Long> {

	@Size(max = 255)
	@Column(name = "name", length = 255)
	private String name;
	
	@OneToMany(mappedBy = "bank")
	private List<Branch> branches = new ArrayList<>();
	
	@OneToMany(mappedBy = "bank")
	private List<Account> accounts = new ArrayList<>();
}

/**
 * 
 */
package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Precious Pearl A. Sano Ventura <pr3_cious_15@yahoo.com>
 *
 */
@Entity
@Table(name = "ACCOUNT")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Account extends AbstractPersistable<Long> {

	@Column(name = "balance", precision = 9, scale = 2)
	private BigDecimal balance = new BigDecimal(0);
	
	@ManyToOne
	private Bank bank;
	
	@ManyToMany(mappedBy = "accounts")
	private List<Person> owners = new ArrayList<>();
}

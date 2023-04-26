/**
 * 
 */
package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
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
@Table(name = "BRANCH")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Branch extends AbstractPersistable<Long> {

	@Size(max = 255)
	@Column(name = "address", length = 255)
	private String address;
	
	@ManyToOne
	private Bank bank;
}

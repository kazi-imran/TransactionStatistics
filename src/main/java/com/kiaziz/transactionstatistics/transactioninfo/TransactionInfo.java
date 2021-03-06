package com.kiaziz.transactionstatistics.transactioninfo;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class TransactionInfo implements Serializable {

	
	private static final long serialVersionUID = -3810170718559389936L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double amount;

	
	private ZonedDateTime transactionTimeStamp;

	public TransactionInfo(Double amount, ZonedDateTime transactionTimeStamp) {
		this.amount = amount;
		this.transactionTimeStamp = transactionTimeStamp;

	}

}

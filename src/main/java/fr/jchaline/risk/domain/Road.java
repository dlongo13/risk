package fr.jchaline.risk.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Represent the link between two territories, 
 * an none-oritented way
 * @author jeremy
 *
 */
@Entity
@Table(name = "road")
public class Road {
	
	@Id
	@GeneratedValue
	@Column(unique = true, nullable = false)
	private Long id;
	
	@Column
	private int weight;
	
	@ManyToOne
	private Territory from;
	
	@ManyToOne
	private Territory to;
	
	
	public Road(Territory from, Territory to) {
		this.from = from;
		this.to = to;
	}

	public Road(Territory from, Territory to, int weight) {
		this.from = from;
		this.to = to;
		this.weight = weight;
	}


	public Territory getFrom() {
		return from;
	}


	public void setFrom(Territory from) {
		this.from = from;
	}


	public Territory getTo() {
		return to;
	}


	public void setTo(Territory to) {
		this.to = to;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	


}

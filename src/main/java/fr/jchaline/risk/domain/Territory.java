package fr.jchaline.risk.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Territory {
	
	@Id
	@GeneratedValue
	@Column(unique = true, nullable = false)
	private Long id;
	
	@Column
	private String name;

	@Column
	private int xaxis;
	
	@Column
	private int yaxis;
	
	public Territory () {
	}
	
	public Territory (String name) {
		this.name = name;
	}

	public Territory (String name, int xaxis, int yaxis) {
		this.name = name;
		this.xaxis = xaxis;
		this.yaxis = yaxis;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getXaxis() {
		return xaxis;
	}

	public void setXaxis(int xaxis) {
		this.xaxis = xaxis;
	}

	public int getYaxis() {
		return yaxis;
	}

	public void setYaxis(int yaxis) {
		this.yaxis = yaxis;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}

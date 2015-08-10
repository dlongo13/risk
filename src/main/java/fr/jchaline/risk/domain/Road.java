package fr.jchaline.risk.domain;

/**
 * Represent the link between two territories, 
 * an oritented way
 * @author jeremy
 *
 */
public class Road {
	
	private int weight;
	private Territory from;
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

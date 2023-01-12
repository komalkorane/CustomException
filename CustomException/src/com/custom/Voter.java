package com.custom;

public class Voter {

	String name;
	int voterId;
	int age;
	int adhar;
	public Voter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Voter [name=" + name + ", voterId=" + voterId + ", age=" + age + ", adhar=" + adhar + "]";
	}

	public Voter(String name, int voterId, int age, int adhar) {
		super();
		this.name = name;
		this.voterId = voterId;
		this.age = age;
		this.adhar = adhar;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVoterId() {
		return voterId;
	}
	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}
	public int getAdhar() {
		return adhar;
	}
	public void setAdhar(int adhar) {
		this.adhar = adhar;
	}
	
	
	
}

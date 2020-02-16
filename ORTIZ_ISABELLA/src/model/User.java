package model;

import java.util.ArrayList;

public class User {
	
	public final static String CC = "CC";
	public final static String TI = "TI";
	public final static String RC = "RC";
	public final static String PA = "PA";
	public final static String CE = "CE";
	
	private String documentType;
	private String documentNumber;
	private String name;
	private String lastName;
	private String phone;
	private String address;
	
	private ArrayList<Turn> turns;
	
	
	public User(String documentType, String documentNumber, String name, String lastName) {
		this.documentType = documentType;
		this.documentNumber = documentNumber;
		this.name = name;
		this.lastName = lastName;
		this.phone = null;
		this.address = null;
		setTurns(new ArrayList<Turn>());
	}
	
	
	
	
	

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Turn> getTurns() {
		return turns;
	}

	public void setTurns(ArrayList<Turn> turns) {
		this.turns = turns;
	}
	
	
	

}

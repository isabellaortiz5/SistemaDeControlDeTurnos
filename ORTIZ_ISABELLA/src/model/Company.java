package model;

import java.util.ArrayList;

import customeExceptions.*;

public class Company {
	private ArrayList<User> users;
	private Turn given;
	private Turn attended;
	
	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public Turn getGiven() {
		return given;
	}

	public void setGiven(Turn given) {
		this.given = given;
	}

	public Turn getAttended() {
		return attended;
	}

	public void setAttended(Turn attended) {
		this.attended = attended;
	}

	public Company() {
		this.users = new ArrayList<User>();
		this.given = new Turn("");
		this.attended = new Turn("A00");
	}
	
	public User search(String dt, String id) throws NotFoundException {
		User user = null;
		boolean found = false;
		for (int i = 0; i < users.size() && !found; i++) {
			if (dt.equals(users.get(i).getDocumentType()) && id.equals(users.get(i).getDocumentNumber())) {
				found = true;
				user = users.get(i);
			}
		}
		if (user == null){
			throw new NotFoundException(dt, id);
			
		}
		return user;
	}

	public void addUser(String documentT, String documentN, String name, String lastName) throws EmptyFieldException, DuplicatedUserException {
		if (documentN.equals("")) {
			throw new EmptyFieldException(" document Number ");
		}
		if (name.equals("")) {
			throw new EmptyFieldException(" name ");
		}
		if (lastName.equals("")) {
			throw new EmptyFieldException(" last name ");
		}
		for (int i = 0; i < users.size(); i++) {
			if (documentT.equals(users.get(i).getDocumentType()) && documentN.equals(users.get(i).getDocumentNumber())) {
				throw new DuplicatedUserException(documentT, documentN);
				
			}
			
		}
		
		users.add(new User(documentT, documentN, name, lastName));
		
	}
	
	public String advance (String turn) {
		char letter = turn.charAt(0);
		char num1 = turn.charAt(1);
		char num2 = turn.charAt(2);
		String numbers = num1 + num2+"";
		int integer = Integer.parseInt(numbers);
		if(turn.isEmpty()){
			return "A00";
		}
		if (integer == 99) {
			integer = 0;
		} else {
			integer++;
		}
		if(integer == 0 ) {
			if (letter == 'Z') {
				letter = 'A';
			} else {
				letter++; 
			}
		}
		
		String codeNumber = "";
		switch (integer) {
		case 0:
			codeNumber = "00";
			break;
		case 1:
			codeNumber = "01";

			break;
		case 2:
			codeNumber = "02";

			break;
		case 3:
			codeNumber = "03";

			break;
		case 4:
			codeNumber = "04";

			break;
		case 5:
			codeNumber = "05";

			break;
		case 6:
			codeNumber = "06";

			break;
		case 7:
			codeNumber = "07";

			break;
		case 8:
			codeNumber = "08";

			break;
		case 9:
			codeNumber = "09";

			break;
		

		default:
			codeNumber = Integer.toString(integer);
			break;
		}
		turn = letter + codeNumber + "";
		return turn;
		
	}

	public void addPhone(String phone, String documentT, String documentN) throws NotFoundException {
		User user =search(documentT, documentN);
		user.setPhone(phone);
		
	}

	public void addAddress(String address, String documentT, String documentN) throws NotFoundException {
		User user =search(documentT, documentN);
		user.setAddress(address);
	}
	
	
	

}

package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import customeExceptions.*;
import model.*;

public class Main {
	
	private Scanner sc;
	private Company company;

	public static void main(String[] args) {	
		Main main= new Main();
		main.menu();
	}

	private void menu() {
		boolean exit = false;
		while (!exit) {
			System.out.println("Please choose an option");
			System.out.println("1. Add user");
			System.out.println("2. Register turn");
			System.out.println("3. Attend turn");
			try {
				int option = sc.nextInt();
				switch (option) {
				case 1:
					addUser();
					break;
					
				case 2:
					registerTurn();
					break;
					
				case 3:
					attendTurn();
					break;
					
				case 4:
					exit = true;
					break;
					
				default:
					throw new InvalidOptionException(option);
				}
			} catch (InputMismatchException e) {
				System.out.println("Strings is not a valid option");
			} catch (InvalidOptionException e) {
				e.getMessage();
				
			}
		}
	}

	private void attendTurn() {
		
	}

	private void registerTurn() {		
	}

	private void addUser() {
		
		try {
			System.out.println("Write the document type");
			System.out.println("1. CC");
			System.out.println("2. TI");
			System.out.println("3. RC");
			System.out.println("4. PA");
			System.out.println("5. CE");
			
			int dt = sc.nextInt();
			String documentT = "";
			
			switch (dt) {
			case 1:
				documentT = User.CC;
				break;
			case 2:
				documentT = User.TI;	
				break;
			
			case 3:
				documentT = User.RC;
				break;
			
			case 4:
				documentT = User.PA;
				break;
			case 5:
				documentT = User.CE;
				break;


			default:
				throw new InvalidOptionException(dt);
			}
			System.out.println("Write the document number");
			String documentN = sc.nextLine();
			System.out.println("write the user name");
			String name = sc.nextLine();
			System.out.println("write the user last name");
			String lastName = sc.nextLine();
			System.out.println("Write the user phone number");
			String phone = sc.nextLine();
			System.out.println("Write the user address");
			String address = sc.nextLine();
			company.addUser(documentT, documentN, name, lastName);
			company.addPhone(phone, documentT, documentN);
			company.addAddress(address, documentT, documentN);
			

		} catch (InvalidOptionException e) {
			e.getMessage();
			
		} catch (InputMismatchException e) {
			System.out.println("Strings is not a valid option");

		} catch (EmptyFieldException e) {
			e.getMessage();

		} catch (DuplicatedUserException e) {
			e.getMessage();

		} catch (NotFoundException e) {
			e.getMessage();
		}
		
		
	}

	public Main() {
		sc = new Scanner(System.in);
		company = new Company();
		
	}
	

}

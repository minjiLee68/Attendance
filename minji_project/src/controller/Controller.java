package controller;


import java.util.Scanner;

import model.InformationManager;
import model.StudentManager;
import view.UI;


public class Controller {
	Scanner sc = new Scanner(System.in);

	StudentManager studentmanager = new StudentManager();
	InformationManager informationManager = new InformationManager();

	UI ui = new UI();

	int stNumber, deNumber;
	String name, birth, phNumber;
	int minji;

	public int inputNumber() {
		return sc.nextInt();
	}

	public void insert() {

		ui.name();
		name = sc.next();
		ui.birth();
		birth = sc.next();
		while (!informationManager.isValidateBirth(birth)) {
			ui.errorMessage();
			birth = sc.next();

		}
		ui.phNumber();
		phNumber = sc.next();
		while (!informationManager.isValidatePhnumber(phNumber)) {
			ui.errorMessage();
			phNumber = sc.next();
		}
		studentmanager.addStudent(name, birth, phNumber);
	}

	public void delete() {
		ui.deNumber();
		deNumber = sc.nextInt();
		studentmanager.deleteStudent(deNumber);
	}

	public void set() {
		ui.seNumber();
		stNumber = sc.nextInt();
		ui.sePhNumber();
		phNumber = sc.next();
//		studentmanager.setStudent(stNumber, phNumber);
	}

	public void print() {
//		studentmanager.print();
	}

}

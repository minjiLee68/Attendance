package model;


import java.util.ArrayList;
import java.util.Scanner;


public class InformationManager {
	ArrayList<Student> student = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public boolean isValidateBirth(String birth) {
		if (birth.length() != 6) {
			return false;
		}
		return true;
	}

	public boolean isValidatePhnumber(String phNumber) {

		if (phNumber.charAt(3) == '-' && phNumber.charAt(8) == '-' && phNumber.length() == 13) {
			return true;
		}
		return false;
	}

}

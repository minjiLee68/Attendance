package controller;

import view.UI;

public class Attendance {

	public static void main(String[] args) {
		Controller con = new Controller();

		while (true) {
			UI ui = new UI();
			ui.print();
			int n = con.inputNumber();
			switch (n) {
			case 1:
				con.insert();
				break;
			case 2:
				con.delete();
				break;
			case 3:
				con.set();
				break;
			case 4:
				con.print();
				break;
			case 5:
				return;
			}
		}
	}
}

package model;

import java.util.ArrayList;

public class StudentManager {
	ArrayList<Student> students = new ArrayList<>();
	InformationManager brithremove = new InformationManager();

	public void addStudent(String name, String birth, String phNumber) {
		Student student = new Student(students.size() + 1, name, birth, phNumber);
		students.add(student);
	}

	public void deleteStudent(int number) {
		for (int i = 0; i < students.size(); i++) {
			Student a = students.get(i);
			if (a.studentNumber == number) {
				students.remove(i);
				for (int j = i; j < students.size(); j++) {
					students.get(j).studentNumber -= 1;
				}
				return;
			}

		}
	}
}

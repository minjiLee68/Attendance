package view;

public class UI {
	
	public void print() {
	      System.out.println("입력하세요. 1.학생등록 2.학생삭제 3.학생수정 4.학생출력 5.종료");
	   }


	public void stNumber() {
		System.out.println("번호를 입력하세요.");
	}

	public void name() {
		System.out.println("이름을 입력하세요.");
	}

	public void birth() {
		System.out.println("생일을 입력하세요. ex)000203");
	}

	public void phNumber() {
		System.out.println("전화번호를 입력하세요. ex)010-1111-2222");
	}

	public void deNumber() {
		System.out.println("삭제할 학생의 번호를 입력하세요.");
	}

	public void seNumber() {
		System.out.println("수정할 학생의 번호를 입력하세요.");
	}

	public void sePhNumber() {
		System.out.println("수정할 학생의 전화번호를 입력하세요.");
	}

	public void errorMessage() {
		System.out.println("다시 입력하세요.");
	}

}

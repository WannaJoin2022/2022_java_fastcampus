package ch09;

public class Student {
	
	int StudentId;
	String studentName;
	Subject korea;
	Subject math;
	
	
	public Student(int StudentId, String studentName) {
		this.studentName = studentName;
		this.StudentId = StudentId;
		
		this.korea = new Subject();
		this.math = new Subject();
		
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectNaME = name;
		math.score = score;
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectNaME = name;
		korea.score = score;
	}
	
	public void showStudentSocre() {
		int total = korea.score + math.score;
		System.out.println(studentName + " 학생의 총점은 " + total + "입니다");
	}
}

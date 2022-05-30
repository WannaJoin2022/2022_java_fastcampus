package ch24;

import java.util.ArrayList;

public class Student {

	int studentId;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student (int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject (String name, int score) {
		// 객체를 만들어서 arrayList에 담아야해
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
		
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		for (Subject subject : subjectList) {
			
			total += subject.getScorePoint();
			System.out.println(" 학생 " + studentName + "의 " + subject.getName() + " 과목 성적은 " + subject.getScorePoint() + "입니다");
		}
		System.out.println(" 학생 " + studentName + "의 총점은 " +  total + "입니다");
	}
	
}

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
		// ��ü�� ���� arrayList�� ��ƾ���
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
		
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		for (Subject subject : subjectList) {
			
			total += subject.getScorePoint();
			System.out.println(" �л� " + studentName + "�� " + subject.getName() + " ���� ������ " + subject.getScorePoint() + "�Դϴ�");
		}
		System.out.println(" �л� " + studentName + "�� ������ " +  total + "�Դϴ�");
	}
	
}

package com.taohan.online.exam.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
  *学生信息
  */
@Component
@Scope("prototype")
public class StudentInfo {

	private Integer studentId;
	private String studentName;
	
	public StudentInfo()
	{
	}
	
	public StudentInfo(Integer studentId, String studentName, String studentAccount, String studentPwd, ClassInfo classInfo, GradeInfo grade)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAccount = studentAccount;
		this.studentPwd = studentPwd;
		this.classInfo = classInfo;
		this.grade = grade;
	}
	
	public void setStudentId(Integer studentId)
	{
		this.studentId = studentId;
	}
	
	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	
	public void setStudentAccount(String studentAccount)
	{
		this.studentAccount = studentAccount;
	}
	
	public void setStudentPwd(String studentPwd)
	{
		this.studentPwd = studentPwd;
	}
	
	public void setClassInfo(ClassInfo classInfo)
	{
		this.classInfo = classInfo;
	}
	
	public void setGrade(GradeInfo grade)
	{
		this.grade = grade;
	}
	
	public Integer getStudentId()
	{
		return studentId;
	}
	
	public String getStudentName()
	{
		return studentName;
	}
	
	public String getStudentAccount()
	{
		return studentAccount;
	}
	
	public String getStudentPwd()
	{
		return studentPwd;
	}
	
	public ClassInfo getClassInfo()
	{
		return classInfo;
	}
	
	public GradeInfo getGrade()
	{
		return grade;
	}
	
	private String studentAccount;
	private String studentPwd;
	private ClassInfo classInfo;
	private GradeInfo grade;

	@Override
	public String toString() {
		return "StudentInfo [studentId=" + studentId + ", studentName="
				+ studentName + ", studentAccount=" + studentAccount
				+ ", studentPwd=" + studentPwd + ", classInfo=" + classInfo
				+ ", grade=" + grade + "]";
	}
}

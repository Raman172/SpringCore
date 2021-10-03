package com.springcore.ref;

public class A {
	private int studentId;
	private B objB;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public B getObjB() {
		return objB;
	}
	public void setObjB(B objB) {
		this.objB = objB;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A(int studentId, B objB) {
		super();
		this.studentId = studentId;
		this.objB = objB;
	}
	@Override
	public String toString() {
		return "A [studentId=" + studentId + ", objB=" + objB + "]";
	}
	

}

package com.nt.beans;

public class Student {
	private int sno;
	private String sname;
	private LibraryMembership lib;
	
	public Student() {
		System.out.println("Student:0-param constructor");
	}
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public LibraryMembership getLib() {
		return lib;
	}
	public void setLib(LibraryMembership lib) {
		this.lib = lib;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", lib=" + lib + "]";
	}
	
	

}

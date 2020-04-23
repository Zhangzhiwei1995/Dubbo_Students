package org.student.pojo;

import java.io.Serializable;
//内存到硬盘 或者网络传输 需要序列化
public class Student implements Serializable{
	private int snum;
	private String sname;
	private int sage;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int snum, String sname, int sage) {
		super();
		this.snum = snum;
		this.sname = sname;
		this.sage = sage;
	}
	@Override
	public String toString() {
		return "Student [snum=" + snum + ", sname=" + sname + ", sage=" + sage + "]";
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public int getSnum() {
		return snum;
	}
	public void setSnum(int snum) {
		this.snum = snum;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}

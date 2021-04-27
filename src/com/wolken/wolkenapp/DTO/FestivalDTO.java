package com.wolken.wolkenapp.DTO;

public class FestivalDTO {
	private int festivalid;
	private int festivalname;
	private String month;
	private int no_of_days;
	public int getFestivalid() {
		return festivalid;
	}
	public void setFestivalid(int festivalid) {
		this.festivalid = festivalid;
	}
	public int getFestivalname() {
		return festivalname;
	}
	public void setFestivalname(int festivalname) {
		this.festivalname = festivalname;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getNo_of_days() {
		return no_of_days;
	}
	public void setNo_of_days(int no_of_days) {
		this.no_of_days = no_of_days;
	}
	public FestivalDTO() {
		super();
	}
	
	
}

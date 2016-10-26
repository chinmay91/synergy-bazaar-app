package com.synergy.bazaar.rest.user.vo;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.synergy.bazaar.rest.utils.JsonDateSerializer;

@JsonInclude(Include.NON_NULL)
public class TestVO {
	
	private int tid;
	private String name;
	private String color;
	@JsonSerialize(using=JsonDateSerializer.class)
	private Timestamp doe;
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Timestamp getDoe() {
		return doe;
	}
	public void setDoe(Timestamp doe) {
		this.doe = doe;
	}
	@Override
	public String toString() {
		return "TestEntity [tid=" + tid + ", name=" + name + ", color=" + color + ", doe=" + doe + "]";
	}
	
}

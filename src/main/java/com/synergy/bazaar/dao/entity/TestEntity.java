package com.synergy.bazaar.dao.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="test_tbl")
@Entity
public class TestEntity {
	
	private int tid;
	private String name;
	private String color;
	private Timestamp doe;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	
	@Column(name="name",length=100)
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

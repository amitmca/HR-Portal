package com.yalarifi.hrportal.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.yalarifi.hrportal.entity.classid.TitleID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="titles")
public class Title {
	
	@EmbeddedId
	private TitleID id;
	
	/*
	@Column(name="emp_no")
	private int empNo;
	
	private String title;
	
	@Column(name="from_date")
	private Date fromDate;
	*/
	
	@Column(name="to_date")
	private Date toDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("empNo")
	@JoinColumn(name="emp_no")
	private Employee employee;
}

package com.upemor.sesioncuatro.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="MEMBER")
public class Member {
	
	@Id
	@GeneratedValue
	@Column(name= "ID")
	private int id;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name= "NAME")
	private String name;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name="CREATED")
	@DateTimeFormat(pattern ="yyyy-MM-dd'T'HH:mm:ss")
	private Date createdDate;
	
	@ManyToMany()
	@JoinTable(
	name = "MEMBER_ROLES",
	joinColumns = {@JoinColumn(name = "MEMBER_ID")}, 
	inverseJoinColumns = {@JoinColumn(name = "ROLE_ID")})

	private List<Role> role;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public List<Role> getRole() {
		return role;
	}

	public void setRole(List<Role> role) {
		this.role = role;
	}
	
}

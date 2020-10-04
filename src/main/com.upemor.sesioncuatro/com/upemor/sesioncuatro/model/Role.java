package com.upemor.sesioncuatro.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {
	@Id
	@GeneratedValue
	private int id;
	
    private String name;

    @ManyToMany(mappedBy = "role")
    private List<Member> members;

	/**
	 * 
	 * @return the id
	 */
    public int getId() {
		return id;
	}

    /**
     * 
     * @param id the id to set
     */
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public Role() {
		// TODO Auto-generated constructor stub
	}
    
}
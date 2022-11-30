package com.mfu.rentbook_backend.domain;

import java.util.Set;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "CATEGORY")
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="CATEGORY_ID")
	private Long id;

	@Column(name="CATEGORY_NAME")
	private String name;
	
	//@JsonIgnore
	@OneToMany(mappedBy = "category")
	private Set<Book> books;
	
	public Category() {}

	public Category(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Category(String name) {
		this(null,name);
	}

	public Long getCategoryId() {
		return id;
	}

	public void setCategoryId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return name;
	}

	public void setCategoryName(String name) {
		this.name = name;
	}
	
	public Set<Book> getBooks() {
	    return this.books;
	}
}
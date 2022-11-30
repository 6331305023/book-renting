package com.mfu.rentbook_backend.domain;

import java.util.HashSet;
import java.util.Set;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "RENTAL")
public class Rental {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="RENTAL_ID")
	private Long id;

	@Column(name="BOOK_NAME")
	private String name;
	
	@Column(name="BOOK_PRICE")
	private String price;
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="BOOK_ID")
	private Book rentalBook;
	
	public Rental(){}
	
	public Rental(Long id, String name, String price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Rental(String name, String price){
		this(null,name, price);
	}

	public Long getRentalId() {
		return id;
	}

	public void setRentalId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	public Book getRentalBook() {
		return rentalBook;
	}

	public void setRentalBook(Book rentalBook) {
		this.rentalBook = rentalBook;
	}

	public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
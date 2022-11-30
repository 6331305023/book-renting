package com.mfu.rentbook_backend.domain;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "BOOK")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="BOOK_ID")
	private Long id;
	
	@Column(name="BOOK_NAME")
	private String name;
	
	@Column(name="BOOK_DESC")
	private String desc;
	
	@Column(name="BOOK_PRICE")
	private String price;
	
	@JsonIgnore
	@OneToMany(mappedBy = "rentalBook")
    private Set<Rental> rentalIn;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="CATEGORY_ID")
	private Category category;
	
	public Book() {}

	public Book(Long id, String name, String desc, String price) {
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
	}
	public Book(String name, String desc, String price) {
		this(null,name,desc,price);
	}
	public Long getBookId() {
		return id;
	}
	public void setBookId(Long id) {
		this.id = id;
	}
	public String getBookName() {
		return name;
	}
	public void setBookName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Set<Rental> getRentalIn() {
		return rentalIn;
	}

	public void rentalBike(Rental rental) {
		rentalIn.add(rental);
	}
	
	public Category getCategory() {
        return category;
    }

    public void setShop(Category category) {
        this.category = category;
    }
}


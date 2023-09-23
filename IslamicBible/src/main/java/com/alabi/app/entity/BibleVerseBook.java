package com.alabi.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BibleVerseBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String bibleBook;
	
	public BibleVerseBook() {
		
	}

	public BibleVerseBook(Integer id, String bibleBook) {
		this.id = id;
		this.bibleBook = bibleBook;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBibleBook() {
		return bibleBook;
	}

	public void setBibleBook(String bibleBook) {
		this.bibleBook = bibleBook;
	}
	
	
}

package com.alabi.app.entity;

import org.springframework.format.annotation.NumberFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class IslamicBible {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	@Column(nullable = false)
	private String topic;
	@Column(nullable = false)
	private String bibleVersion;
	@Column(nullable = false)
	private String bibleBook;
	@NumberFormat
	@Column(nullable = false)
	private int bibleChapter;
	@NumberFormat
	@Column(nullable = false)
	private int bibleVerse;		
	@Column(nullable = false, length = 500)
	private String bibleText;	
	@Column(nullable = false, length = 500)
	private String bibleExplanation;
	@NumberFormat
	@Column(nullable = false)
	private int quranicChapter;
	@NumberFormat
	@Column(nullable = false)	
	private int quranicVerse;
	@Column(nullable = false, length = 500)
	private String quranicText;
	@Column(nullable = false, length = 500)
	private String quranicExplanation;
	
	public IslamicBible() {
		super();
	}
	
	public IslamicBible(Integer id, String topic, String bibleVersion, String bibleBook, int bibleChapter,
			int bibleVerse, String bibleText, String bibleExplanation, int quranicChapter, int quranicVerse,
			String quranicText, String quranicExplanation) {
		super();
		this.id = id;
		this.topic = topic;
		this.bibleVersion = bibleVersion;
		this.bibleBook = bibleBook;
		this.bibleChapter = bibleChapter;
		this.bibleVerse = bibleVerse;
		this.bibleText = bibleText;
		this.bibleExplanation = bibleExplanation;
		this.quranicChapter = quranicChapter;
		this.quranicVerse = quranicVerse;
		this.quranicText = quranicText;
		this.quranicExplanation = quranicExplanation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getBibleVersion() {
		return bibleVersion;
	}

	public void setBibleVersion(String bibleVersion) {
		this.bibleVersion = bibleVersion;
	}

	public String getBibleBook() {
		return bibleBook;
	}

	public void setBibleBook(String bibleBook) {
		this.bibleBook = bibleBook;
	}

	public int getBibleChapter() {
		return bibleChapter;
	}

	public void setBibleChapter(int bibleChapter) {
		this.bibleChapter = bibleChapter;
	}

	public int getBibleVerse() {
		return bibleVerse;
	}

	public void setBibleVerse(int bibleVerse) {
		this.bibleVerse = bibleVerse;
	}

	public String getBibleText() {
		return bibleText;
	}

	public void setBibleText(String bibleText) {
		this.bibleText = bibleText;
	}

	public String getBibleExplanation() {
		return bibleExplanation;
	}

	public void setBibleExplanation(String bibleExplanation) {
		this.bibleExplanation = bibleExplanation;
	}

	public int getQuranicChapter() {
		return quranicChapter;
	}

	public void setQuranicChapter(int quranicChapter) {
		this.quranicChapter = quranicChapter;
	}

	public int getQuranicVerse() {
		return quranicVerse;
	}

	public void setQuranicVerse(int quranicVerse) {
		this.quranicVerse = quranicVerse;
	}
	
	public String getQuranicText() {
		return quranicText;
	}

	public void setQuranicText(String quranicText) {
		this.quranicText = quranicText;
	}

	public String getQuranicExplanation() {
		return quranicExplanation;
	}

	public void setQuranicExplanation(String quranicExplanation) {
		this.quranicExplanation = quranicExplanation;
	}
	
}

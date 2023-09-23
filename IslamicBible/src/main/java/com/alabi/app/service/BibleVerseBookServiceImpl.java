package com.alabi.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alabi.app.entity.BibleVerseBook;
import com.alabi.app.repository.BibleVerseBookRepository;

@Service
public class BibleVerseBookServiceImpl implements BibleVerseBookService{

	private BibleVerseBookRepository bookRepository;
	
	@Autowired
	public BibleVerseBookServiceImpl(BibleVerseBookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public void createBibleVerseBook(BibleVerseBook bibleVerseBook) {
		
		bookRepository.save(bibleVerseBook);
	}

	@Override
	public List<BibleVerseBook> readBibleVerseBook() {
		
		return bookRepository.findAll();
	}

	@Override
	public void updateBibleVerseBook(Integer id) {
		
		bookRepository.save(bookRepository.findById(id).get());
	}

	@Override
	public void deleteBibleVerseBook(Integer id) {
		
		bookRepository.deleteById(id);
	}

	@Override
	public BibleVerseBook findBookById(Integer id) {
		return bookRepository.findById(id).get();
	}

	
}

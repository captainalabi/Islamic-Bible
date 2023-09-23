package com.alabi.app.service;

import java.util.List;

import com.alabi.app.entity.BibleVerseBook;

public interface BibleVerseBookService {
	 void createBibleVerseBook(BibleVerseBook bibleVerseBook);
	 List<BibleVerseBook> readBibleVerseBook();
	 void updateBibleVerseBook(Integer id);
	 void deleteBibleVerseBook(Integer id);
	 BibleVerseBook findBookById(Integer id);
}

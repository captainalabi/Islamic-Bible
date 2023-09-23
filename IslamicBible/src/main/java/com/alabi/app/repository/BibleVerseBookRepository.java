package com.alabi.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alabi.app.entity.BibleVerseBook;

@Repository
public interface BibleVerseBookRepository extends JpaRepository <BibleVerseBook, Integer> {

}

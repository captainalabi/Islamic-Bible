package com.alabi.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.alabi.app.entity.BibleVerseBook;
import com.alabi.app.service.BibleVerseBookService;


@Controller
public class BibleVerseBookController {

	private BibleVerseBookService bookService;
	
	@Autowired
	public BibleVerseBookController(BibleVerseBookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping("/showBookForm")
	public String showBookForm(Model model) {
		model.addAttribute("bibleVerseBook", new BibleVerseBook());
		return "bookForm";
	}
	
	@GetMapping("/getBookForm")
	public ModelAndView getBookForm(@RequestParam Integer id) {
		ModelAndView mav = new ModelAndView("bookForm");
		BibleVerseBook bibleVerseBook = bookService.findBookById(id);
		mav.addObject(bibleVerseBook);
		return mav;
	}
	
	@PostMapping("/createBook")
	public String createBook(@ModelAttribute BibleVerseBook bibleVerseBook) {
		try {
		bookService.createBibleVerseBook(bibleVerseBook);
		}catch(Exception e) {System.out.println("cause :::::::::::::::::" + e.getCause());}
		return "redirect:listBooks";
	}
	
	@GetMapping("/listBooks")
	public String listBooks(Model model) {
		model.addAttribute("bookList", bookService.readBibleVerseBook());
		return "listBooks";
	}
	
	@GetMapping("/updateBooks/{id}")
	public void updateBooks(Model model, @PathVariable("id") Integer id) {
		bookService.updateBibleVerseBook(id);
		model.addAttribute("bookList", bookService.readBibleVerseBook());
	}
	
	@GetMapping("/deleteBooks")
	public String deleteBooks(@RequestParam Integer id) {
		bookService.deleteBibleVerseBook(id);
		return "redirect:/listBooks";
	}
}

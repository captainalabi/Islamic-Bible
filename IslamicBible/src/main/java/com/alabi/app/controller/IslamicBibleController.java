package com.alabi.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.alabi.app.entity.BibleVerseBook;
import com.alabi.app.entity.IslamicBible;
import com.alabi.app.service.BibleVerseBookService;
import com.alabi.app.service.BibleVersionService;
import com.alabi.app.service.IslamicBibleService;

@Controller
public class IslamicBibleController {

	private IslamicBibleService islamicBibleService;
	private BibleVerseBookService bookService;
	private BibleVersionService versionService;

	@Autowired
	public IslamicBibleController(IslamicBibleService islamicBibleService, 
			BibleVerseBookService bookService,
			BibleVersionService versionService) {
		super();
		this.islamicBibleService = islamicBibleService;
		this.bookService = bookService;
		this.versionService = versionService;
	}
	
	@GetMapping("/")
	public String indexPage() {
		return "index";
	}
	
	@GetMapping("/show-create-islamicBibleForm")
	public String showCreateIslamicBibleForm(Model model) {	
		model.addAttribute("booksList", bookService.readBibleVerseBook());
		model.addAttribute("versionsList", versionService.readBibleVersion());
		model.addAttribute("islamicBible", new IslamicBible());
		return "create-islamicBible";
	}
	
	@GetMapping("/listAllIslamicBible")
	public String listAllIslamicBible(Model model) {	
		
		model.addAttribute("testVar", "myVar");
		
		model.addAttribute("listAllIslamicBible", islamicBibleService.readIslamicBible());
		return "listAllIslamicBible";
	}
	
	@GetMapping("/test")
	public String test(Model model) {	
		
		model.addAttribute("testVar", "myVar2");
		
		model.addAttribute("listAllIslamicBible", islamicBibleService.readIslamicBible());
		return "test";
	}
	
	@GetMapping("/getCreateIslamicBibleForm")
	public String getCreateIslamicBibleForm(Model model) {	
		List <BibleVerseBook> booksList = bookService.readBibleVerseBook();
		model.addAttribute("booksList", booksList);
		model.addAttribute("islamicBible", new IslamicBible());
		return "create-islamicBible";
	}
	
	@PostMapping("/createIslamicBible")
	public String createIslamicBible(Model model, IslamicBible islamicBible) {		
		islamicBibleService.createIslamicBible(islamicBible);
		model.addAttribute("listAllIslamicBible", islamicBibleService.readIslamicBible());
		return "redirect:/listAllIslamicBible";
	}
	
	@GetMapping("/updateIslamicBible")
	public ModelAndView updateIslamicBible(@RequestParam Integer id, Model model){
		model.addAttribute("versionsList", versionService.readBibleVersion());
		model.addAttribute("booksList", bookService.readBibleVerseBook());
		ModelAndView mav = new ModelAndView("create-islamicBible");
		IslamicBible islamicBible = islamicBibleService.searchById(id);
		mav.addObject(islamicBible);
		return mav;
	}
	
	@GetMapping("/deleteIslamicBible")
	public String deleteIslamicBible(@RequestParam Integer id){
		islamicBibleService.deleteIslamicBibleById(id);		
		return "redirect:/listAllIslamicBible";
	}
}


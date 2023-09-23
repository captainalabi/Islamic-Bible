package com.alabi.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.alabi.app.entity.BibleVersion;
import com.alabi.app.service.BibleVersionService;


@Controller
public class BibleVersionController {

	private BibleVersionService versionService;
	
	@Autowired
	public BibleVersionController(BibleVersionService versionService) {
		this.versionService = versionService;
	}

	@GetMapping("/showVersionForm")
	public String showBookForm(Model model) {
		model.addAttribute("bibleVersion", new BibleVersion());
		return "versionForm";
	}
	
	@GetMapping("/getVersionForm")
	public ModelAndView getBookForm(@RequestParam Integer id) {
		ModelAndView mav = new ModelAndView("versionForm");
		BibleVersion bibleVersion = versionService.findById(id);
		mav.addObject(bibleVersion);
		return mav;
	}
	
	@PostMapping("/createVersion")
	public String createBook(@ModelAttribute BibleVersion bibleVersion) {		
			versionService.createBibleVersion(bibleVersion);		
		return "redirect:listVersions";
	}
	
	@GetMapping("/listVersions")
	public String listBooks(Model model) {
		model.addAttribute("versionList", versionService.readBibleVersion());
		return "listVersions";
	}
		
	@GetMapping("/deleteVersions")
	public String deleteVersions(@RequestParam Integer id) {
		versionService.deleteBibleVersion(id);
		return "redirect:/listVersions";
	}
}

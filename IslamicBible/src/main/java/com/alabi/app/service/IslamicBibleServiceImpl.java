package com.alabi.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alabi.app.entity.IslamicBible;
import com.alabi.app.repository.IslamicBibleRepository;

@Service
public class IslamicBibleServiceImpl implements IslamicBibleService{

	private IslamicBibleRepository islamicBibleRepository;
	
	@Autowired
	public IslamicBibleServiceImpl(IslamicBibleRepository islamicBibleRepository) {
		super();
		this.islamicBibleRepository = islamicBibleRepository;
	}

	@Override
	public void createIslamicBible(IslamicBible islamicBible) {

		islamicBibleRepository.save(islamicBible);		
	}

	@Override
	public List<IslamicBible> readIslamicBible() {
		
		return islamicBibleRepository.findAll();
	}

	@Override
	public void updateIslamicBible(IslamicBible islamicBible) {
		
		islamicBibleRepository.save(islamicBible);
	}

	@Override
	public void deleteIslamicBibleById(Integer id) {
		
		islamicBibleRepository.deleteById(id);
	}

	@Override
	public IslamicBible searchById(Integer id) {
		
		return islamicBibleRepository.findById(id).get();
	}

}

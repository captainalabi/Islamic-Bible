package com.alabi.app.service;

import java.util.List;

import com.alabi.app.entity.IslamicBible;

public interface IslamicBibleService {
	
	void createIslamicBible(IslamicBible islamicBible);
	List <IslamicBible> readIslamicBible();
	void updateIslamicBible(IslamicBible islamicBible);
	void deleteIslamicBibleById(Integer id);
	IslamicBible searchById(Integer id);
}

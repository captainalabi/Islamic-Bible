package com.alabi.app.service;

import java.util.List;

import com.alabi.app.entity.BibleVersion;

public interface BibleVersionService {
	 void createBibleVersion(BibleVersion bibleVersion);
	 List<BibleVersion> readBibleVersion();
	 void deleteBibleVersion(Integer id);
	 BibleVersion findById(Integer id);
}

package com.alabi.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alabi.app.entity.BibleVersion;
import com.alabi.app.repository.BibleVersionRepository;

@Service
public class BibleVersionServiceImpl implements BibleVersionService{

	private BibleVersionRepository versionRepository;
	
	@Autowired
	public BibleVersionServiceImpl(BibleVersionRepository versionRepository) {
		super();
		this.versionRepository = versionRepository;
	}

	@Override
	public void createBibleVersion(BibleVersion bibleVersion) {
		versionRepository.save(bibleVersion);
	}

	@Override
	public List<BibleVersion> readBibleVersion() {
		return versionRepository.findAll();
	}

	@Override
	public void deleteBibleVersion(Integer id) {
		versionRepository.deleteById(id);
	}

	@Override
	public BibleVersion findById(Integer id) {
		return versionRepository.findById(id).get();
	}

	
}

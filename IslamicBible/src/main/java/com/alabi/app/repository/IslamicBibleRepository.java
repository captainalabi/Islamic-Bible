package com.alabi.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alabi.app.entity.IslamicBible;

@Repository
public interface IslamicBibleRepository extends JpaRepository<IslamicBible, Integer>{

}

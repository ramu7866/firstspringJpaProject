package com.twg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twg.springboot.entity.Newtable;


public interface NewtableRepository extends JpaRepository<Newtable, Long> {
	 

}

package com.twg.springboot.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.twg.springboot.entity.Newtable;
import com.twg.springboot.repository.NewtableRepository;

@Service
public class NewtableServiceimpl implements NewtableService {
    
	@Autowired
	private NewtableRepository newtableRepository;
	
	@Override
	public Newtable saveNewtable(Newtable newtable) {
		
		return newtableRepository.save(newtable);
	}

	@Override
	public Newtable updateNewtable(Newtable newtable) {
	
		return newtableRepository.save(newtable);
	}

	@Override
	public void deleteNewtable(Newtable newtable) {
		newtableRepository.delete(newtable);

	}

	@Override
	public Newtable findById(long id) {
		
		return newtableRepository.findById(id).get();
	}

	@Override
	public List<Newtable> findAll() {
		
		return newtableRepository.findAll();
	}

}

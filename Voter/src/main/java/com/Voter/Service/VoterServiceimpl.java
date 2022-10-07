package com.Voter.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Voter.entity.voter;
import com.Voter.repo.voterrepo;

@Service
public class VoterServiceimpl {

	@Autowired
	private voterrepo repo;
	
	public List<voter> getAllVehicleData() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public voter getvoter(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get() ;
	}

	public void addvoter(voter v) {
		// TODO Auto-generated method stub
		repo.save(v);
		
	}

	public void deletevoter(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}

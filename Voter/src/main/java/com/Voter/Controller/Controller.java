package com.Voter.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Voter.Service.VoterServiceimpl;
import com.Voter.entity.voter;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class Controller {

	@Autowired
	VoterServiceimpl ser;
	
	@GetMapping("/voter")
	public List<voter> getAllVoter(){
		return ser.getAllVehicleData();
	}
	

	@GetMapping("/voter/{id}")
	public voter getVoter(@PathVariable Integer id) {
		return ser.getvoter(id);
	}
	
	@PostMapping("/voter")
	public void addvoter(@RequestBody voter v) {
		ser.addvoter(v);
}
	@DeleteMapping("voter/{id}")
	public void delete(@PathVariable Integer id) {
		ser.deletevoter(id);
	}
	
	
	
}

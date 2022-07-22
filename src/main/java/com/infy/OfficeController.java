package com.infy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/office")
public class OfficeController {
	@Autowired
	officeRepository repo;
	
	@GetMapping("/getoffice/{id}")
	public Office getOffice(@PathVariable("id") int id) {
		return repo.findById(id).get();
	}
	@PostMapping("/addoffice")
	public Office getOffice(@RequestBody Office o) {
		repo.save(o);
		return o;
	}

}

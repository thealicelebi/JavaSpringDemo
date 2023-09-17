package com.javacourse.project.hibernateAndJpaa.restApi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javacourse.project.hibernateAndJpaa.Business.ICountryService;
import com.javacourse.project.hibernateAndJpaa.entity.Country;

@RestController
@RequestMapping("/api")
public class CountryController {
	
	private ICountryService countryService;

	@Autowired
	public CountryController(ICountryService countryService) {
		this.countryService = countryService;
	}
	
	@GetMapping("/countries")
	List<Country> get(){
		 return countryService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Country country){
		 countryService.add(country);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Country country){
		 countryService.updete(country);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Country country){
		 countryService.delete(country);
	}
	
	@GetMapping("/countries/{id}")
	Country getCountryId(@PathVariable int id){
		 return countryService.getCountryId(id);
	}
	


}

package com.javacourse.project.hibernateAndJpaa.Business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.javacourse.project.hibernateAndJpaa.DataAccessLayer.ICountryDal;
import com.javacourse.project.hibernateAndJpaa.entity.Country;

@Service
public class CountryManager implements ICountryService{

	private ICountryDal countryDal;
	
	@Autowired
	public CountryManager(ICountryDal countryDal) {
		this.countryDal = countryDal;
	}

	@Override
	@Transactional
	public List<Country> getAll() {
		return countryDal.getAll();
	}

	@Override
	public void add(Country country) {
		countryDal.add(country);		
	}

	@Override
	public void updete(Country country) {
		countryDal.updete(country);
		
	}

	@Override
	public void delete(Country country) {
		countryDal.delete(country);
		
	}

	@Override
	public Country getCountryId(int id) {
		return this.countryDal.getCountryId(id);
	}

}

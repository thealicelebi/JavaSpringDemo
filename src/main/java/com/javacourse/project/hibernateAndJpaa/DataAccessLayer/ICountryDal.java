package com.javacourse.project.hibernateAndJpaa.DataAccessLayer;

import java.util.List;
import com.javacourse.project.hibernateAndJpaa.entity.*;

public interface ICountryDal {

	List<Country> getAll();
	void add(Country country);
	void updete(Country country);
	void delete(Country country);
	Country getCountryId(int id);
	
	
	
}

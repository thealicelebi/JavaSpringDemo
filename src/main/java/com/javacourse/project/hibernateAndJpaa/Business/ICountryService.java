package com.javacourse.project.hibernateAndJpaa.Business;

import java.util.List;
import com.javacourse.project.hibernateAndJpaa.entity.Country;

public interface ICountryService {

	List<Country> getAll();
	void add(Country country);
	void updete(Country country);
	void delete(Country country);
	Country getCountryId(int id);
}

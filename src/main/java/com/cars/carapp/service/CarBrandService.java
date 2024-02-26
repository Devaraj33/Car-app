package com.cars.carapp.service;

import java.util.List;

import com.cars.carapp.entity.CarBrand;

public interface CarBrandService {

	public List<String> getCarBrands();
	public List<CarBrand> getAllModelsByBrand(String brand);
	public List<CarBrand> getAllModelsByPrice(int price);
	
	
}

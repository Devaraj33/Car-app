package com.cars.carapp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.carapp.entity.CarBrand;
import com.cars.carapp.reposiory.CarBrandRepository;
import com.cars.carapp.service.CarBrandService;

@Service
public class CarBrandServiceImpl implements CarBrandService{

	
	@Autowired
	
	private CarBrandRepository carBrandRepo;
	
	@Override
	public List<String> getCarBrands() {
		// TODO Auto-generated method stub
		return carBrandRepo.getBrands();
	}

	@Override
	public List<CarBrand> getAllModelsByBrand(String brand) {
		// TODO Auto-generated method stub
		return carBrandRepo.getModelsByBrand(brand);
	}

	@Override
	public List<CarBrand> getAllModelsByPrice(int price) {
		// TODO Auto-generated method stub
		List<CarBrand> carBrands = new ArrayList<>();
		if(price ==0) {
			carBrands = carBrandRepo.getModelsByPriceLessThanFivelacs();
		}else {
			carBrands = carBrandRepo.getModelsByPricegreaterThanFivelacs();
		}
		return carBrands;
	}
}

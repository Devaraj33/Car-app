package com.cars.carapp.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cars.carapp.entity.CarBrand;
import com.cars.carapp.service.CarBrandService;

@RestController
@RequestMapping("/carBrand")
public class CarBrandController {
@Autowired
private CarBrandService carBrandService;
	
	 @GetMapping("/getBrands")
	    public ResponseEntity<List<String>> getAllBrands() {
	         return new ResponseEntity(carBrandService.getCarBrands(), HttpStatus.OK);
	    }
	 
	 @GetMapping("/getModels")
	    public ResponseEntity<List<CarBrand>> getAllModels(@RequestParam("brand") String brand) {
	         return new ResponseEntity(carBrandService.getAllModelsByBrand(brand), HttpStatus.OK);
	    }
	 
	 @GetMapping("/getModelsByPrice")
	    public ResponseEntity<List<CarBrand>> getAllModelsByPrice(@RequestParam("price") int price) {
	         return new ResponseEntity(carBrandService.getAllModelsByPrice(price), HttpStatus.OK);
	    }
	 
}

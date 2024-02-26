package com.cars.carapp.reposiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cars.carapp.entity.CarBrand;

@Repository
public interface CarBrandRepository extends JpaRepository<CarBrand, Integer> {

	@Query(value="SELECT brand FROM cars group by brand", nativeQuery = true)
	List<String> getBrands();

	@Query(value="SELECT * FROM cars where brand = :brand", nativeQuery = true)
	List<CarBrand> getModelsByBrand(@Param("brand") String brand);
	
	@Query(value="SELECT * FROM cars where price <500000", nativeQuery = true)
	List<CarBrand> getModelsByPriceLessThanFivelacs();

	@Query(value="SELECT * FROM cars where price >500000", nativeQuery = true)
	List<CarBrand> getModelsByPricegreaterThanFivelacs();
}

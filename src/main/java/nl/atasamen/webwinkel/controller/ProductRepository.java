package nl.atasamen.webwinkel.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.atasamen.webwinkel.domein.Product;

@Component
public interface ProductRepository extends CrudRepository< Product,Long >{

	
	
}

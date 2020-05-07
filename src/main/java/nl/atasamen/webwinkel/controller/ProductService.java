package nl.atasamen.webwinkel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nl.atasamen.webwinkel.domein.Product;

@Service
@Transactional
public class ProductService {

	@Autowired
	ProductRepository pr;
	
	public Iterable<Product> getAllProducts() {
		Iterable<Product> producten = pr.findAll();
		return producten;
	}
	public void slaProductOp(Product product) {
		pr.save(product);
	}
}

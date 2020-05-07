package nl.atasamen.webwinkel.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.atasamen.webwinkel.controller.ProductService;
import nl.atasamen.webwinkel.domein.Product;

@RestController
public class ProductEndpoint {
	
	@Autowired
	ProductService ps;

	@GetMapping("/allproducts")
	public Iterable<Product> getAllProducts() {
		Iterable<Product> producten =  ps.getAllProducts();
		return producten;
	}
	@PostMapping("/newproduct")
	public void maakNieuwProduct(@RequestBody Product product) {
		System.out.println("we zijn in nieuw product "+product.getNaam());
		ps.slaProductOp(product);
		
		
	}
}

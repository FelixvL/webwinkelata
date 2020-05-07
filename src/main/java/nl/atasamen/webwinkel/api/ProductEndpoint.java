package nl.atasamen.webwinkel.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductEndpoint {

	@GetMapping("/allproducts")
	public String getAllProducts() {
		return "Mijn Lijst met Producten";
	}
}

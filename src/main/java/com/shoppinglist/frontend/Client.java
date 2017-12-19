package com.shoppinglist.frontend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import com.shoppinglist.api.ShoppingListDTO;

@Controller
public class Client {

//	@Autowired
//	private RestOperations restOperations;
//
//	 public ShoppingListDTO getShoppingList() {
//		 return restOperations.getForObject("http://localhost:8080/shopping-list/element", ShoppingListDTO.class);
//	 }
	 
	@RequestMapping("/test")
	public String getCustomerList(Model model) {
			RestTemplate restTemplate = new RestTemplate();
	        ResponseEntity<ShoppingListDTO> list = restTemplate.getForEntity("http://localhost:8080/shopping-list/element", ShoppingListDTO.class);
	        model.addAttribute("list", list.getBody());
	        return "shopping-list";
		}
	
	@RequestMapping("/test1")
	public ResponseEntity<?> get() {
			RestTemplate restTemplate = new RestTemplate();
	        ResponseEntity<ShoppingListDTO> list = restTemplate.getForEntity("http://localhost:8080/shopping-list/element", ShoppingListDTO.class);
	        return list;
		}
}

package com.emi.inventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emi.inventory.service.InventoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

	private final InventoryService service;
	
	@GetMapping()
	public boolean checkInventory(@RequestParam String kuCode, @RequestParam Integer quantity) {
		return service.isInStock(kuCode, quantity);
	}
}

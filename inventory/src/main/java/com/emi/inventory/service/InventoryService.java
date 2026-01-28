package com.emi.inventory.service;

import org.springframework.stereotype.Service;

import com.emi.inventory.repository.InventoryRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {

	private final InventoryRepo repo;
	
	public boolean isInStock(String skuCode ,Integer quantity) {
		return repo.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode,quantity);
	}
}

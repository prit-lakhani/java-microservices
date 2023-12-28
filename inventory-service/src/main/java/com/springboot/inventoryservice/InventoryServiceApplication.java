package com.springboot.inventoryservice;

import com.springboot.inventoryservice.model.Inventory;
import com.springboot.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class);
    }
    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
        return  args -> {
            Inventory inventory = new Inventory();
            inventory.setSkuCode("Iphone 15");
            inventory.setQuantity(100);

            Inventory inventory1 = new Inventory();
            inventory1.setSkuCode("Pixel 8");
            inventory1.setQuantity(100);

            Inventory inventory2 = new Inventory();
            inventory2.setSkuCode("Samsung 23 Ultra");
            inventory2.setQuantity(0);

            inventoryRepository.save(inventory);
            inventoryRepository.save(inventory1);
            inventoryRepository.save(inventory2);
        };
    }
}

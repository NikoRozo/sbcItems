package com.niko.sbc.items.services;

import com.niko.sbc.items.Clients.ProductFeignClient;
import com.niko.sbc.items.models.Item;
import com.niko.sbc.items.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class ItemServiceFeign implements ItemService {
    @Autowired
    private ProductFeignClient client;

    @Override
    public List<Item> getAllItems() {
        return client.findAll().stream().map(product ->
             new Item(product, new Random().nextInt(10) + 1)
        ).toList();
    }

    @Override
    public Optional<Item> getItemById(Long id) {
        try {
            Product product = client.findById(id);
            return Optional.of(new Item(product, new Random().nextInt(10) + 1));
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}

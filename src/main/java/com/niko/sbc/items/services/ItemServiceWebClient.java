package com.niko.sbc.items.services;

import com.niko.sbc.items.models.Item;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceWebClient implements ItemService{
    private final WebClient.Builder client;

    public ItemServiceWebClient(WebClient.Builder client) {
        this.client = client;
    }

    @Override
    public List<Item> getAllItems() {
        return List.of();
    }

    @Override
    public Optional<Item> getItemById(Long id) {
        return Optional.empty();
    }
}

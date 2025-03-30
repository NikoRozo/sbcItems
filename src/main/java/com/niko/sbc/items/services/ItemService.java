package com.niko.sbc.items.services;

import com.niko.sbc.items.models.Item;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    List<Item> getAllItems();

    Optional<Item> getItemById(Long id);
}

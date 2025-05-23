package com.niko.sbc.items.controllers;

import com.niko.sbc.items.models.Item;
import com.niko.sbc.items.services.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Optional;

@RestController
public class ItemController {
    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<?> findAll(@RequestParam(name = "name", required = false) String name,
                                     @RequestHeader(name = "token-request", required = false) String token) {
        System.out.println("Token: " + token);
        System.out.println("Name: " + name);
        return ResponseEntity.ok(this.service.getAllItems());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Optional<Item> item = service.getItemById(id);
        if (item.isPresent()) {
            return ResponseEntity.ok(item.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.singletonMap("message", "No existen productos"));
    }
}

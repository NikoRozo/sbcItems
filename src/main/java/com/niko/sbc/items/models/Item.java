package com.niko.sbc.items.models;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    private Product product;
    private int quantity;

    public Double getTotal() {
        return product.getPrice() * quantity;
    }
}

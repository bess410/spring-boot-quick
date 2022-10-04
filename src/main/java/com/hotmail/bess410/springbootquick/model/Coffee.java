package com.hotmail.bess410.springbootquick.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class Coffee {
    private final String id;
    private String name;

    public Coffee(String name) {
        this(UUID.randomUUID().toString(), name);
    }
}

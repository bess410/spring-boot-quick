package com.hotmail.bess410.springbootquick.utils;

import com.hotmail.bess410.springbootquick.model.Coffee;
import com.hotmail.bess410.springbootquick.repository.CoffeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@AllArgsConstructor
public class DataLoader {
    private final CoffeeRepository coffeeRepository;

    @PostConstruct
    private void loadData() {
        this.coffeeRepository.saveAll(List.of(
                new Coffee("Кофе растворимый"),
                new Coffee("Кофе турецкий"),
                new Coffee("Кофе колумбийский"),
                new Coffee("Кофе Tres Pontas")
        ));
    }
}

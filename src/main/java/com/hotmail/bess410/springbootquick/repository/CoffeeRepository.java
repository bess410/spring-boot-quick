package com.hotmail.bess410.springbootquick.repository;

import com.hotmail.bess410.springbootquick.model.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {
}

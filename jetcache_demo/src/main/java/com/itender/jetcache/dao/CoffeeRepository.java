package com.itender.jetcache.dao;

import com.itender.jetcache.entity.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yuan
 * @create 2021-10-26 10:36
 */
public interface CoffeeRepository extends JpaRepository<Coffee, Integer> {
}

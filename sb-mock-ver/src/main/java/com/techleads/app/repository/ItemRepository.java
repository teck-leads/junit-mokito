package com.techleads.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techleads.app.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}

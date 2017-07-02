package com.rose.web;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyDataEntityRepository extends JpaRepository<MyDataEntity, Integer> {

}

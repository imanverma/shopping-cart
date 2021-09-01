package com.narayan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.narayan.entity.Apparal;

@Repository
public interface ApparalRepository extends JpaRepository<Apparal, Integer> {

}

package com.indian.andolan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indian.andolan.model.Demand;

public interface DemandRepository extends JpaRepository<Demand, Long>  {

}

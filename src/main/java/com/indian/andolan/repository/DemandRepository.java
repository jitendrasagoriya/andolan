package com.indian.andolan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indian.andolan.model.Demand;


@Repository
public interface DemandRepository extends JpaRepository<Demand, Long>  {

}

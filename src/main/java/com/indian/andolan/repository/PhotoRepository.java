package com.indian.andolan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indian.andolan.model.Photos;

@Repository
public interface PhotoRepository  extends JpaRepository<Photos, Long>{

}

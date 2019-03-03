package com.indian.andolan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indian.andolan.model.Photos;

public interface PhotoRepository  extends JpaRepository<Photos, Long>{

}

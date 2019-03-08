package com.indian.andolan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indian.andolan.model.EventUpdate;


@Repository
public interface EventUpdateRepository extends JpaRepository<EventUpdate, Long>  {

}

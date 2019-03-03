package com.indian.andolan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indian.andolan.model.Event;

public interface EventRepository extends JpaRepository<Event, Long>  {

}

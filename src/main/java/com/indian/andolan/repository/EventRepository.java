package com.indian.andolan.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.indian.andolan.model.Event;

@Repository(value="event")
public interface EventRepository extends JpaRepository<Event, String>  {
	
	@Query("SELECT E FROM Event E WHERE E.isActive = :isActive")
	public Page<Event> getActive(@Param("isActive") Boolean active,Pageable pageable);

}

package com.indian.andolan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indian.andolan.model.Team;
import com.indian.andolan.model.TeamPrimeryKey;

@Repository
public interface TeamRepository extends JpaRepository<Team, TeamPrimeryKey> {

}

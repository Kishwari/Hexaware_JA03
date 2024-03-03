package com.hexaware.cricketmanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.cricketmanagement.entities.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer>{

	@Modifying
	@Query("delete from Player p where p.jerseyNumber = ?1")
	int deletePlayerByJerseyNumber(int jerseyNumber) ;

	Optional<Player> findByJerseyNumber(int jerseyNumber);
}

package com.hexaware.cricketmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.cricketmanagement.dto.PlayerDTO;
import com.hexaware.cricketmanagement.entities.Player;
import com.hexaware.cricketmanagement.exception.PlayerNotFoundException;
import com.hexaware.cricketmanagement.repository.PlayerRepository;

import jakarta.transaction.Transactional;
@Transactional
@Service
public class PlayerServiceImp implements IPlayerService {

	@Autowired
	PlayerRepository repository;
	
	@Override
	public Player addPlayer(PlayerDTO playerdto) {
		Player player=new Player();
		player.setPlayerId(playerdto.getPlayerId());
		player.setPlayerName(playerdto.getPlayerName());
		player.setJerseyNumber(playerdto.getJerseyNumber());
		player.setRole(playerdto.getRole());
		player.setTotalMatches(playerdto.getTotalMatches());
		player.setTeamName(playerdto.getTeamName());
		player.setStateName(playerdto.getStateName());
		player.setDescription(playerdto.getDescription());
		return repository.save(player);
	}

	@Override
	public Player updatePlayer(PlayerDTO playerdto) {
		Player player=new Player();
		player.setPlayerId(playerdto.getPlayerId());
		player.setPlayerName(playerdto.getPlayerName());
		player.setJerseyNumber(playerdto.getJerseyNumber());
		player.setRole(playerdto.getRole());
		player.setTotalMatches(playerdto.getTotalMatches());
		player.setTeamName(playerdto.getTeamName());
		player.setStateName(playerdto.getStateName());
		player.setDescription(playerdto.getDescription());
		return repository.save(player);
	}

	@Override
	public Player getPlayerById(int playerId) {
		
		return repository.findById(playerId).orElse(null);
	}

	@Override
	public String deletePlayerById(int playerId) {
		repository.deleteById(playerId);
		return "Record deleted";
	}

	@Override
	public List<Player> getAllPlayers() {

		return repository.findAll();
	}

	@Override
	public String deletePlayerByJerseyNumber(int jerseyNumber) throws PlayerNotFoundException {
		Optional<Player> player = repository.findByJerseyNumber(jerseyNumber);
        if (player.isPresent()) {
        	 repository.deletePlayerByJerseyNumber(jerseyNumber);
        	 return "Player deleted";
        }
        
        throw new PlayerNotFoundException("Player not found with jersey number: " + jerseyNumber);
        
	}
}

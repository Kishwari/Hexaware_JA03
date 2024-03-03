package com.hexaware.cricketmanagement.service;

import java.util.List;

import com.hexaware.cricketmanagement.dto.PlayerDTO;
import com.hexaware.cricketmanagement.entities.Player;
import com.hexaware.cricketmanagement.exception.PlayerNotFoundException;

public interface IPlayerService {

	public Player addPlayer(PlayerDTO playerdto);
	 
	public Player updatePlayer(PlayerDTO playerdto);
 
	public Player getPlayerById(int playerId);
 
	public String deletePlayerById(int playerId);
	
	public  List<Player>  getAllPlayers();
	
	// user defined
	
	public String deletePlayerByJerseyNumber(int jerseyNumber) throws PlayerNotFoundException;
	

}

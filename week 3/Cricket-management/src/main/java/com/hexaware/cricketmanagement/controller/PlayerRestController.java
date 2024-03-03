package com.hexaware.cricketmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.cricketmanagement.dto.PlayerDTO;
import com.hexaware.cricketmanagement.entities.Player;
import com.hexaware.cricketmanagement.exception.PlayerNotFoundException;
import com.hexaware.cricketmanagement.service.IPlayerService;

@RestController
@RequestMapping("api/player")
@CrossOrigin("http://localhost:4200")
public class PlayerRestController {

	@Autowired
	IPlayerService service;
	@PostMapping("/add")
	public Player insertPlayer(@RequestBody PlayerDTO playerdto) {
		return service.addPlayer(playerdto);
	}

	@PutMapping("/update")
	public Player updatePlayer(@RequestBody PlayerDTO playerdto) {
		return service.updatePlayer(playerdto);
	}

	@GetMapping("/get/{playerId}")
	public Player getEmployeeById(@PathVariable int playerId)  {
		return service.getPlayerById(playerId);
		
	}

	@DeleteMapping("/delete/{playerId}")
	public String deleteById(@PathVariable int playerId) {
		return service.deletePlayerById(playerId);
	}
	@DeleteMapping("/deletebyJerseyNumber/{jerseyNumber}")
	public String deletePlayerByJerseyNumber(@PathVariable int jerseyNumber) throws PlayerNotFoundException {
	 service.deletePlayerByJerseyNumber(jerseyNumber);
	 return "Player deleted successfully";
	}
	
	@GetMapping("/getall")
	public List<Player> getAll() {
		return service.getAllPlayers();
	}

}

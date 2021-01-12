package com.example.demo.controller;

import com.example.demo.model.Player;
import com.example.demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @RequestMapping(value = "/players", method = RequestMethod.GET)
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @RequestMapping(value = "/players/add", method = RequestMethod.POST)
    public Player addPlayer(@RequestBody Player player){
        return playerService.addPlayer(player);
    }
}

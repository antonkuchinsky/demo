package com.example.demo.controllers;

import com.example.demo.models.Dice;
import com.example.demo.models.Player;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    private Player player;


    @GetMapping("/rollDice")
    public int rollDice()
    {
        return Dice.roll();
    }


    @PostMapping("/movePlayer")
    public void movePlayer(@RequestBody int steps)
    {
        player.move(steps);
    }

    @GetMapping("/getPlayerPosition")
    public int getPlayerPosition()
    {
        return player.getPosition();
    }
}


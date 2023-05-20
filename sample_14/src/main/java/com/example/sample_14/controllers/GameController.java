package com.example.sample_14.controllers;

import com.example.sample_14.model.Game;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GameController {
    Game game = new Game("Civilization", 2010);
    @GetMapping("/game")
    @ResponseBody
    public String getGame() {
        return game.toString();
    }
}

package com.example.sample_14.controllers;

import com.example.sample_14.model.Level;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LevelController {
    Level level = new Level("hard", "Level 1");
    @GetMapping("/")
    @ResponseBody
    public String getLevel() {
        return level.toString();
    }
}

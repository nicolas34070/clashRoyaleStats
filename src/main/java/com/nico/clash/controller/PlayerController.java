package com.nico.clash.controller;

import com.nico.clash.model.Player;
import com.nico.clash.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class PlayerController {

    PlayerService playerService;

    //@GetMapping(value = "/playerInfo/{playerTag}")
    @GetMapping(value = "/playerInfo/")
    public @ResponseBody
    String getPlayerInfo(@PathVariable String playerTag) throws IOException {
        String playerInfo = playerService.getPlayerInfo(playerTag);

        return playerInfo;
    }

}

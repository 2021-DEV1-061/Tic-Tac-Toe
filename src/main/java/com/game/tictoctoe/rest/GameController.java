package com.game.tictoctoe.rest;

import com.game.tictoctoe.dto.RequestGamingDto;
import com.game.tictoctoe.model.Game;
import com.game.tictoctoe.service.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/game")
public class GameController {

    @Autowired
    GameService gameService;

    @RequestMapping(value = "/updateGameState", produces = "application/json", method = RequestMethod.POST)
    public ResponseEntity<Game> updateGameState(@RequestBody RequestGamingDto requestGamingDto) {

        return new ResponseEntity<Game>(this.gameService.play(0, 0, null), HttpStatus.OK);

    }

}
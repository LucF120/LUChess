package jar.api; 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chessboard.*;
import chesspiece.*;
import util.*;

@RestController
@RequestMapping("/chess")
public class ChessGameController {

    // Simple in-memory storage
    private Map<String, ChessBoard> games = new HashMap<>();

    // GET all games
    @GetMapping
    public Map<String, ChessBoard> getAllGames() {
        return games;
    }
    
    // GET a specific game by ID
    @GetMapping("/{id}")
    public ResponseEntity<ChessBoard> getGame(@PathVariable String id) {
        ChessBoard game = games.get(id);
        if (game == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(game);
    }
    
    // POST to create a new game
    @PostMapping
    public ChessBoard createGame(@RequestBody ChessBoard game) {
        String id = UUID.randomUUID().toString();
        games.put(id, game);
        return game;
    }
    
    // PUT to update a game (make a move)
    @PutMapping("/{id}/move")
    public ResponseEntity<ChessBoard> makeMove(@PathVariable String id, @RequestBody MoveRequest moveRequest) {
        ChessBoard game = games.get(id);
        if (game == null) {
            return ResponseEntity.notFound().build();
        }
        
        try{
            char file = moveRequest.from.charAt(0);
            int rank = Integer.parseInt(moveRequest.from.substring(1, 2));
            char destFile = moveRequest.to.charAt(0);
            int destRank = Integer.parseInt(moveRequest.to.substring(1, 2));
            game.movePiece(file, rank, destFile, destRank);
        } catch(Exception e) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(game);
        // Apply the move to your game (implement according to your chess logic)

    }
    
    // DELETE to remove a game
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGame(@PathVariable String id) {
        if (!games.containsKey(id)) {
            return ResponseEntity.notFound().build();
        }
        
        games.remove(id);
        return ResponseEntity.noContent().build();
    }
    
    // Inner class for move requests
    public static class MoveRequest {
        private String from;
        private String to;
        
        // Getters and setters
        public String getFrom() { return from; }
        public void setFrom(String from) { this.from = from; }
        public String getTo() { return to; }
        public void setTo(String to) { this.to = to; }
    }
}


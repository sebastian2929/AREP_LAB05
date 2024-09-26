package edu.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class FootballPlayerController {

    @Autowired
    private FootballPlayerRepository repository;

    @GetMapping
    public List<FootballPlayer> getAllPlayers() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FootballPlayer> getPlayerById(@PathVariable Long id) {
        return repository.findById(id)
                .map(player -> ResponseEntity.ok().body(player))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public FootballPlayer createPlayer(@RequestBody FootballPlayer player) {
        return repository.save(player);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FootballPlayer> updatePlayer(@PathVariable Long id, @RequestBody FootballPlayer player) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        player.setId(id);
        return ResponseEntity.ok(repository.save(player));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayer(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

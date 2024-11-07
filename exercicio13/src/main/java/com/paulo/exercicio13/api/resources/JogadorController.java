package com.paulo.exercicio13.api.resources;

import com.paulo.exercicio13.api.dto.JogadorDTO;
import com.paulo.exercicio13.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @PostMapping
    public ResponseEntity<JogadorDTO> criarJogador(@Validated @RequestBody JogadorDTO jogadorDTO) {
        JogadorDTO jogadorCriado = jogadorService.criarJogador(jogadorDTO);
        return ResponseEntity.ok(jogadorCriado);
    }

    @GetMapping
    public ResponseEntity<List<JogadorDTO>> listarJogadores() {
        List<JogadorDTO> jogadores = jogadorService.listarJogadores();
        return ResponseEntity.ok(jogadores);
    }

}

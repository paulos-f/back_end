package com.paulo.exercicio13.service;

import com.paulo.exercicio13.api.dto.JogadorDTO;
import com.paulo.exercicio13.api.mapper.JogadorMapper;
import com.paulo.exercicio13.model.entity.Jogador;
import com.paulo.exercicio13.model.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    @Autowired
    private JogadorMapper jogadorMapper;

    public JogadorDTO criarJogador(JogadorDTO jogadorDTO) {
        Jogador jogador = jogadorMapper.toEntity(jogadorDTO);
        jogador = jogadorRepository.save(jogador);
        return jogadorMapper.toDTO(jogador);
    }

    public List<JogadorDTO> listarJogadores() {
        List<JogadorDTO> lista = jogadorRepository
                .findAll()
                .stream()
                .map(jogador -> jogadorMapper.toDTO(jogador))
                .collect(Collectors.toList());
        return lista;
    }
}

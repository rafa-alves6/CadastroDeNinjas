package dev.java10x.CadastroDeNinjas.Missoes;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MissoesService {
    private final MissoesRepository repository;

    public List<MissoesModel> listarTodas() {
        return repository.findAll();
    }

    public MissoesModel salvar(MissoesModel missao) {
        return repository.save(missao);
    }

    public MissoesModel buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Missão não encontrada"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

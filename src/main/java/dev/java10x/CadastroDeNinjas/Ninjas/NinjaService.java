package dev.java10x.CadastroDeNinjas.Ninjas;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NinjaService {
    private final NinjaRepository repository;

    public List<NinjaModel> listarTodos() {
        return repository.findAll();
    }

    public NinjaModel salvar(NinjaModel ninja) {
        return repository.save(ninja);
    }
}

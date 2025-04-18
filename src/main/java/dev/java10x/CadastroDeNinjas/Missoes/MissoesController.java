package dev.java10x.CadastroDeNinjas.Missoes;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
@RequiredArgsConstructor
public class MissoesController {
    private final MissoesService service;

    @GetMapping
    public List<MissoesModel> listar() {
        return service.listarTodas();
    }

    @PostMapping
    public MissoesModel cadastrar(@RequestBody MissoesModel missao) {
        return service.salvar(missao);
    }

    @GetMapping("/{id}")
    public MissoesModel buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}

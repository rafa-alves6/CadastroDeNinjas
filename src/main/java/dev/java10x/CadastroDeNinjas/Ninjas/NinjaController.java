package dev.java10x.CadastroDeNinjas.Ninjas;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
@RequiredArgsConstructor
public class NinjaController {
    private final NinjaService service;

    @GetMapping
    public List<NinjaModel> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public NinjaModel cadastrar(@RequestBody NinjaModel ninja) {
        return service.salvar(ninja);
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Olá! Seja bem-vindo.";
    }
}

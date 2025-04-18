package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Para sinalizar que se trata de uma class Controller
@RequestMapping // Usado para fazer requisição de um método {GET, PUT, POST, PATCH, DELETE} (pra cada response, precisa de um get...?)
public class NinjaController {
    @GetMapping("/boasvindas") // Definição da rota (localhost:8080{ boasvindas }) *pelo apache tomcat*
    public String boasVindas() {
        return "Olá! Seja bem-vindo.";
    }
}

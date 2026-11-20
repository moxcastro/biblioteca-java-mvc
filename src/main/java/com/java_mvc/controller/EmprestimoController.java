package com.java_mvc.controller;

import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java_mvc.model.Emprestimo;

@Controller
@RequestMapping("/emprestimos")
public class EmprestimoController {

    @GetMapping
    public String inicio() {
        return "emprestimos/inicio";
    }

    @GetMapping("/emprestimo")
    public String exibirEmprestimo(Model model) {
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setUsuario("maria.silva");
        emprestimo.setNomeUsuario("Maria Silva");
        emprestimo.setLivro("Dom Casmurro");
        emprestimo.setDataEmprestimo(LocalDateTime.now());
        emprestimo.setDataDevolucao(LocalDateTime.now().plusDays(7));
        emprestimo.setStatus("Retirado");

        model.addAttribute("emprestimo", emprestimo);

        return "emprestimo";
    }
}
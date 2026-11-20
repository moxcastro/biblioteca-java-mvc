package com.java_mvc.model;

import java.time.LocalDateTime;

public class Emprestimo {
    private String usuario;
    private String nomeUsuario;
    private String livro;
    private LocalDateTime dataEmprestimo;
    private LocalDateTime dataDevolucao;
    private String status;

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getNomeUsuario() { return nomeUsuario; }
    public void setNomeUsuario(String nomeUsuario) { this.nomeUsuario = nomeUsuario; }

    public String getLivro() { return livro; }
    public void setLivro(String livro) { this.livro = livro; }

    public LocalDateTime getDataEmprestimo() { return dataEmprestimo; }
    public void setDataEmprestimo(LocalDateTime dataEmprestimo) { this.dataEmprestimo = dataEmprestimo; }

    public LocalDateTime getDataDevolucao() { return dataDevolucao; }
    public void setDataDevolucao(LocalDateTime dataDevolucao) { this.dataDevolucao = dataDevolucao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
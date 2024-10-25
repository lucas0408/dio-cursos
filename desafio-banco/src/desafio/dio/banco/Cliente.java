/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.dio.banco;

import java.util.Objects;

public class Cliente {
    private String nome;
    private String email;
    private String fone;
    private String cpf;

    public Cliente(String nome, String email, String fone, String cpf) {
        this.nome = nome;
        this.email = email;
        this.fone = fone;
        setCpf(cpf);  // Validação do CPF ao definir o valor
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        if (!isValidCpf(cpf)) {
            throw new IllegalArgumentException("CPF inválido.");
        }
        this.cpf = cpf;
    }

    private boolean isValidCpf(String cpf) {
        // Implementar lógica de validação de CPF (simplificado)
        return cpf != null && cpf.matches("\\d{11}");
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.cpf, other.cpf);
    }

    public void alterarEmail(String novoEmail) {
        this.email = novoEmail;
    }

    public void alterarFone(String novoFone) {
        this.fone = novoFone;
    }
}

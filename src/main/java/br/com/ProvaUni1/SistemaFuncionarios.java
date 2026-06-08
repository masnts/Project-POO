package br.com.ProvaUni1;

import java.util.HashMap;
import java.util.Map;

public class SistemaFuncionarios implements ISistemaFuncionarios {
    private Map<String, Funcionario> funcionarios;


    public SistemaFuncionarios() {
        this.funcionarios = new HashMap<String, Funcionario>();
    }


    public void cadastrarFuncionario(String cpf, String nome, Funcionario.TipoFuncionario
            tipo, double salario) throws FuncionarioJaExisteException {
        if (this.funcionarios.containsKey(cpf)) {
            throw new FuncionarioJaExisteException(
                    "Já existe funcionário com o cpf " + cpf);
        } else {
            this.funcionarios.put(cpf, new Funcionario(cpf, nome, tipo,
                    salario));
        }

    }
}
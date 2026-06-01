package br.com.ProvaUni1;

import java.util.List;

public interface ISistemaFuncionarios {
    public interface SistemaFuncionarios {
        public void cadastrarFuncionario(Funcionario funcionario)
                throws FuncionarioJaExisteException;
        public void cadastrarFuncionario(String cpf, String nome, Funcionario.TipoFuncionario
                tipo, double salario) throws FuncionarioJaExisteException;
        public void alterarSalarioDeFuncionario(String cpfFuncionario,
                                                double novoSalario) throws FuncionarioInexistenteException;
        public int contarFuncionariosDoTipo(Funcionario.TipoFuncionario tipo);
        public boolean funcionarioJaExiste(String cpfFuncionario);
        public List<Funcionario> pesquisarFuncionariosPorTipo(
                Funcionario.TipoFuncionario tipo);
        public Funcionario pesquisarFuncionario(String cpfFuncionario)
                throws FuncionarioInexistenteException;
        public List<Funcionario> pesquisarFuncionariosComSalarioMaiorQue(
                double valor);
    }


}

package br.com.ProvaUni1;

public class Funcionario {
    private String cpf;
    private String nome;
    private TipoFuncionario tipo;
    private double salario;

    public enum TipoFuncionario{
        GARCON, GERENTE, COZINHEIRO, FAXIMEIRO
    }

    public Funcionario(String cpf, String nome, TipoFuncionario tipo, double salario){
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
        this.tipo = tipo;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoFuncionario getTipo() {
        return tipo;
    }

    public void setTipo(TipoFuncionario tipo) {
        this.tipo = tipo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", salario=" + salario +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


}

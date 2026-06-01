package br.com.Adocao.execoes;

public class PessoaNaoEsxisteException extends Exception {
    public PessoaNaoEsxisteException(String mensagem){
        super(mensagem);
    }
}

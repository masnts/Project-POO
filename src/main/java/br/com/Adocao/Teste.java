package br.com.Adocao;

public class Teste {
    public static void main(String[] args){
        GerenciamentoAdocao sistema= new GerenciamentoAdocao();


        Animal a1 = new Animal("bob", Animal.Sexo.MACHO,123, Animal.Especie.CAVALO,"11/09/2022",true,"ponei",false);
        Animal a2= new Animal("Marli", Animal.Sexo.FEMEA,134, Animal.Especie.CACHORRO,"34/56/7777",false,"pischer",false);
        sistema.cadastrarAnimal(a1);
        sistema.cadastrarAnimal(a2);

        String listaAnimais = sistema.listarAnimaisDisponiveis();
        System.out.println("Animais Disponivéis para adoção: \n"+listaAnimais);

        Pessoa p1=new Pessoa("111.111.111-11","Mayara","Sitio Itamatai","83 9999-9999");
        Pessoa p2=new Pessoa("788.345.222-11","Yuri","Guarabira","83 9876-9999");
        sistema.cadastrarPessoa(p1);
        sistema.cadastrarPessoa(p2);

        sistema.realizarAdocao(p1,a1,"11/44/3333",111);
        System.out.println("Adoções realizadas: \n"+sistema.listarAdocoes());
        System.out.println("\nPessoas cadastradas:\n"+sistema.listarPessoasCadastradas());
        String listaAnimaisDisponiveis = sistema.listarAnimaisDisponiveis();
        System.out.println("\nAnimais disponiveis para adoção:\n"+listaAnimaisDisponiveis);


    }
}

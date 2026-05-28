import execoes.PessoaNaoEsxisteException;

import java.util.ArrayList;
import java.util.List;



public class GerenciamentoAdocao implements IGerenciamentoAdocao{
    private List<Animal> animais = new ArrayList<>();
    private List<Pessoa> pessoas = new ArrayList<>();
    private List<Adocao> adocoes  = new ArrayList<>();




    @Override
    public void cadastrarAnimal(Animal animalNovo) {
        animais.add(animalNovo);
    }


    @Override
    public void cadastrarPessoa(Pessoa pessoaNova) {
        pessoas.add(pessoaNova);
    }


    @Override
    public void realizarAdocao(Pessoa pessoa, Animal animal, String data, int codigo) {
        if(animal.isAdotado()){
            System.out.println("o animal ja foi adotado");
            return;
        }
        animal.setAdotado(true);
        Adocao novaAdocao = new Adocao(pessoa,animal,data,codigo);
        adocoes.add(novaAdocao);
        System.out.println("Adoção realizada com sucesso");

    }


    @Override
    public Animal consultarAnimal(int codigoAnimal) {
        for(Animal a : animais){
            if(a.getCodigo()==codigoAnimal){
                return a;
            }
        }
        return null;
    }

    @Override
    public Pessoa consultarPessoa(String cpfPessoa) throws PessoaNaoEsxisteException {


        for(Pessoa p : pessoas){
            if(p.getCpf().equals(cpfPessoa)){
                return p;
            }
        }
        return null;
    }

    @Override
    public Adocao consultarAdocao(int codigoAdocao) {
        for(Adocao a : adocoes){
            if(a.getCodAdocao()==codigoAdocao){
                return a;
            }
        }
        return null;
    }


    public String listarAnimaisDisponiveis() {
        if(animais.isEmpty()){
            return "Nenhum animal encontrado";
        }
        StringBuilder sb = new StringBuilder();
        for(Animal a : animais){
            if(!a.isAdotado()){
                sb.append(a.toString()).append("\n");
            }
        }
        return sb.toString();
    }


    public String listarPessoasCadastradas() {
        if(pessoas.isEmpty()){
            return "Nenhuma pessoa cadastrada";
        }
        StringBuilder sb= new StringBuilder();
        for(Pessoa p : pessoas){
            sb.append(p.getNome()+"\n");
        }
        return sb.toString();
    }


    public String listarAdocoes() {
        if(adocoes.isEmpty()){
            return "Nenhuma Adoção realizada";
        }
        StringBuilder sb= new StringBuilder();
        for(Adocao a : adocoes){
            sb.append("Código: ").append(a.getCodAdocao())
                    .append(" | Adotante: ").append(a.getAdotante().getNome())
                    .append(" | Animal: ").append(a.getAnimalAdotado().getNome())
                    .append(" | Data: ").append(a.getDataDeAdocao())
                    .append("\n");

        }
        return sb.toString();
    }
}

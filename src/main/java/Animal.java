public class Animal {
    private Especie especie;
    private Sexo sexo;
    private int codigo;
    private boolean castrado;
    private String nome;
    private String nascimento;
    private String raca;

    public Animal(String nome, Sexo sexo, int codigo, Especie especie, String nascimento, boolean castrado, String raca){
        this.nome=nome;
        this.sexo=sexo;
        this.codigo=codigo;
        this.especie=especie;
        this.castrado=castrado;
        this.nascimento=nascimento;
        this.raca=raca;
    }

    public Animal(){
        this("Sem nome",Sexo.NAOEXISTE,000,Especie.NAOEXISTE,"00/00/0000",false,"não tem");
    }



    public enum Especie{
        GATO, CACHORRO, CAVALO, BOI, NAOEXISTE
    }
    public enum Sexo{
        MACHO, FEMEA, NAOEXISTE
    }

    //metódos gets

    public String getNome(){
        return nome;
    }
    public Especie getEspecie() {
        return especie;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public boolean isCastrado() {
        return castrado;
    }

    public String getRaca() {
        return raca;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNascimento() {
        return nascimento;
    }

    //metódos sets

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setEspecie(Especie especie){
        this.especie=especie;
    }
    public void setSexo(Sexo sexo){
        this.sexo=sexo;
    }
    public void setCastrado(boolean castrado){
        this.castrado=castrado;
    }
    public void setRaca(String raca){
        this.raca=raca;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

    //toString
    @Override
    public String toString(){
        return "Animal:"+
                this.especie+"\n, Nome: "+this.nome+", código: "+this.codigo+
                "\nRaça: "+this.raca+
                "\nSexo: "+this.sexo+
                "\nData de nascimento: "+this.nascimento+
                "\nCastrado: "+this.castrado;
    }
}



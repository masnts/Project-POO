public class Animal {
 private String nome;
 private int codigo;
 private String sexo;
 private boolean castrado;
 private String nascimento;

 public Animal(String nome, int codigo, String sexo, boolean castrado, String nascimento){
     this.nome = nome;
     this.codigo = codigo;
     this.sexo = sexo;
     this.castrado = castrado;
     this.nascimento = nascimento;

 }
 public Animal (){
     this("Sem nome",000,"indescoberto",false,"00-00-00");
 }
 public String getNome(){
     return nome;
 }
 public int getCodigo(){
     return codigo;
 }
public String getSexo(){
     return sexo;
}
public boolean isCastrado(){
     return castrado;
}
public String getNascimento() {
    return nascimento;
}

public void setNascimento(String nascimento){
     this.nascimento = nascimento;
}
public void setNome(String nome){
     this.nome = nome;
}
}

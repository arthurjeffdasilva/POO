//Criar a classe Funcionario
public class Funcionario {
     //Criar atributos
     private int codigo;
     private String nome;
     private int cpf;
     private String endereço;
     private int telefone;
     private int idade;
     private float salario;

     //Criar o construtor
    public Funcionario(int codigo, String nome, int cpf, String endereço, int telefone, int idade, float salario){
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereço = endereço;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public int getCpf(){
        return cpf;
    }

    public String getEndereço(){
        return endereço;
    }

    public int getTelefone(){
        return telefone;
    }

    public int getIdade(){
        return idade;
    }

    public float getSalario(){
        return salario;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public void setEndereço(String endereço){
        this.endereço = endereço;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public String ToString(){
        return "codigo: " + codigo + "nome: " + nome + "cpf: " + cpf + "endereço: " + endereço + "telefone: " + telefone + "idade: " + idade + "salario: " + salario ;
    }

    public void Imprimir(){
        System.out.printf("codigo: %d, nome: %s, cpf: %d, endereço: %s, telefone: %d, idade: %d, salario: %.2f", codigo, nome, cpf, endereço, telefone, idade, salario);
    }
}
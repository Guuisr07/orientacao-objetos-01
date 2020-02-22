package exercicios;

public class Funcionarios {
    public Integer idade;
    public String nome;
    public String email;
    public Double salario;
    public Double porcentagem;

    public String obterDadosFuncionarios() {
        return nome + " " + idade + " " + email + "( )" + salario;
    }

    public Double promoverAumento(){
        return salario = salario + ( salario * porcentagem)/100;
    }

}

package Exemplos.ex01;

public class Funcionario {
    private String nome;
    private String setor;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    public double calcularImposto(double salario){
        if (salario >= 1903.99 && salario <= 2826.65) {
            return salario - (salario * 0.075);
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            return salario - (salario * 0.15);
        }else if (salario >= 3751.06 && salario <= 4664.68) {
            return salario - (salario * 0.225);
        }else if (salario > 4664.68) {
            return salario - (salario * 0.275);
        }
        return salario;
    }
}
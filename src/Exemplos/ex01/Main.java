package Exemplos.ex01;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.setNome("Marcos");
        f1.setSetor("Vendedor");
        f1.setSalario(4664.69);

        System.out.println(f1.getNome() + "\n" + f1.getSetor() + "\n" + f1.getSalario());
        System.out.printf("Nome do funcionário: %s\nSetor: %s\nSalário: %.2f\n", f1.getNome(), f1.getSetor(), f1.getSalario());

        System.out.printf("Valor do salário com desconto: %.2f", + f1.calcularImposto(f1.getSalario()));
    }
}
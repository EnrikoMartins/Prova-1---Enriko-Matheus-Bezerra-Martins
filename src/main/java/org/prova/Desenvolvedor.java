package org.prova;

public class Desenvolvedor extends Funcionario{
    private String linguagemPrincipal;
    private int projetosConcluidos;

    public Desenvolvedor(String nome, double salario, String departamento, int desempenho, String linguagemPrincipal, int projetosConcluidos) {
        super(nome, salario, departamento, desempenho);
        this.linguagemPrincipal = linguagemPrincipal;
        this.projetosConcluidos = projetosConcluidos;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public int getProjetosConcluidos() {
        return projetosConcluidos;
    }

    public void setProjetosConcluidos(int projetosConcluidos) {
        this.projetosConcluidos = projetosConcluidos;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Linguagem principal : " + getLinguagemPrincipal());
        System.out.println("Números de projetos cocluídos: "+ getLinguagemPrincipal());
    }

    @Override
    public double calcularBonus(double percentualBonus) {
        if (getProjetosConcluidos() > 5) {
            return super.calcularBonus(percentualBonus) + 1000;
        } else {
            return super.calcularBonus(percentualBonus);
        }
    }
}

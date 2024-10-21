package org.prova;

public class Gerente extends Funcionario{
    private double bonusFixo;

    public Gerente(String nome, double salario, String departamento, int desempenho, double bonusFixo) {
        super(nome, salario, departamento, desempenho);
        this.bonusFixo = bonusFixo;
    }

    public double getBonusFIxo(){
        return bonusFixo;
    }

    public void setBonusFixo(double bonusFixo) {
        this.bonusFixo = bonusFixo;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Bônus Fixo: " + getBonusFIxo());
    }
    @Override
    public double calcularSalarioAnual() {
        return super.calcularSalarioAnual() + bonusFixo;
    }
}

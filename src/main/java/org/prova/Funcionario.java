package org.prova;

public class Funcionario {
    private String nome;
    private double salario;
    private String departamento;
    private int desempenho;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario, String departamento, int desempenho) {
        this.nome = nome;
        this.salario = salario;
        this. departamento = departamento;
        this.desempenho = desempenho;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getDesempenho() {
        return desempenho;
    }

    public void setDesempenho(int desempenho) {
        this.desempenho = desempenho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Desempenho: " + getDesempenho());
    }

    public double calcularSalarioAnual() {
        return getSalario() * 12;
    }

    public double calcularBonus(double percentualBonus) {
        if (getDesempenho() > 90) {
            return calcularSalarioAnual() + (calcularSalarioAnual() * (0.2));
        } else if (getDesempenho() >= 70 && getDesempenho() <= 90) {
            return calcularSalarioAnual() + (calcularSalarioAnual() * (0.1));
        } else if (getDesempenho() < 70) {
            return calcularSalarioAnual() + (calcularSalarioAnual() * (0.05));
        } else {
            return getSalario();
        }

    }
}

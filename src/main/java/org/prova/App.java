package org.prova;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuarSistema = true;
        while (continuarSistema) {
            System.out.println("1 - Gerente");
            System.out.println("2 - Desenvolvedor");
            System.out.println("3 - sair");
            System.out.println();
            System.out.print("Qual a sua escolha? ");
            int resposta = sc.nextInt();
            sc.nextLine();

            switch (resposta) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Salário: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Departamento: ");
                    String departamento = sc.nextLine();

                    System.out.print("Desempenho: ");
                    int desempenho = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Bonus fixo:");
                    double bonusFixo = sc.nextDouble();
                    sc.nextLine();

                    Gerente gerente = new Gerente(nome,salario,departamento,desempenho, bonusFixo);

                    System.out.println("---------------------------");

                    gerente.mostrarDados();
                    System.out.println("Salário anual: " +gerente.calcularSalarioAnual());

                    System.out.println("---------------------------");
                    break;
                case 2:
                    System.out.print("Nome: ");
                    nome = sc.nextLine();

                    System.out.print("Salário: ");
                    salario = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Departamento: ");
                    departamento = sc.nextLine();

                    System.out.print("Desempenho: ");
                    desempenho = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Linguagem principal: ");
                    String linguagemPrincipal = sc.nextLine();

                    System.out.print("Quantos projetos concluidos? ");
                    int projetosConcluidos = sc.nextInt();
                    Desenvolvedor desenvolvedor = new Desenvolvedor(nome,salario,departamento,desempenho, linguagemPrincipal,projetosConcluidos );

                    System.out.println("---------------------------");

                    desenvolvedor.mostrarDados();
                    System.out.println("Salário anual: " + desenvolvedor.calcularSalarioAnual());

                    if (desenvolvedor.getDesempenho() > 90) {
                        System.out.println("Salário com bônus: " + desenvolvedor.calcularBonus(20));
                    } else if (desenvolvedor.getDesempenho()  >= 70 && desenvolvedor.getDesempenho()  <= 90) {
                        System.out.println("Salário com bônus: " + desenvolvedor.calcularBonus(10));
                    } else if (desenvolvedor.getDesempenho()  < 70) {
                        System.out.println("Salário com bônus: " + desenvolvedor.calcularBonus(5));
                    }
                    System.out.println("---------------------------");
                    break;
                default:
                    continuarSistema = false;
                    break;
            }
        }
    }
}

package br.com.faculdade.model;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleEstudantes {
    public static ArrayList<Estudante> list = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void adicionarEstudante() {
        System.out.println("Fazer matricula de um estudante");

        System.out.println("Digite o numero Matricula:");
        long matriculaEstudante = scanner.nextLong();

        System.out.println("Digite o nome do estudante:");
        String nomeEstudante = scanner.next();

        System.out.println("Digite o email do estudante:");
        String emailEstudante = scanner.next();

        System.out.println("Digite o telefone do estudante:");
        long telefoneEstudante = scanner.nextLong();

        System.out.println("Digite o endereco do estudante:");
        String enderecoCompletoEstudante = scanner.next();

        Estudante estudante = new Estudante(matriculaEstudante, nomeEstudante, emailEstudante, telefoneEstudante, enderecoCompletoEstudante);
        list.add(estudante);

    }

    public static void buscarEstudante() {
        System.out.println("digite o numero da matricula do estudante:");
        String input = scanner.next();

        if (input.equalsIgnoreCase("cancelar")) {
            System.out.println("Cancelado.");
        }else {
            long buscarEstudante = Long.parseLong(input);
            Estudante estudanteBuscar = null;

            for (Estudante estudante: list) {
                if (estudante.getMatriculaEstudante() == buscarEstudante){
                    estudanteBuscar = estudante;
                    break;
                }
            }

            if (estudanteBuscar != null){
                System.out.println(estudanteBuscar);
            }
        }
    }

    public static void removerEstudante() {
        System.out.println("Remover a inscricao de um estudante \n caso nao queira remover digite: cancelar \n digite o numero da matricula do estudante:");
        String input = scanner.next();

        if (input.equalsIgnoreCase("cancelar")) {
            System.out.println("Cancelado.");
        } else {

            long matriculaRemover = Long.parseLong(input);
            Estudante estudanteRemover = null;

            for (Estudante estudante : list) {
                if (estudante.getMatriculaEstudante() == matriculaRemover) {
                    estudanteRemover = estudante;
                    break;
                }
            }

            if (estudanteRemover != null) {
                list.remove(estudanteRemover);
                System.out.println("Estudante removido com sucesso.");
            } else {
                System.out.println("Não foi possível encontrar um estudante com a matrícula especificada.");
            }
        }
    }

    public static void listarEstudantes() {
        for (Estudante estudante : list
        ) {
            System.out.println(estudante);
        }
    }
}

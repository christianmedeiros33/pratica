package br.com.faculdade.model;

import java.util.Scanner;

public class ProgramaInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroEscolhido;
        do {
            System.out.println("-- software de estudantes --\n------------");
            System.out.println("Digite a opcao que deseja:\n1. Adicionar um estudante.\n2. Deletar um estudante.\n3. Listar estudantes.\n4. Buscar um estudante.\n5. Encerrar.\n------------");
            numeroEscolhido = scanner.nextInt();
            switch (numeroEscolhido) {
                case 1: {
                    ControleEstudantes.adicionarEstudante();
                    break;
                }
                case 2: {
                    ControleEstudantes.removerEstudante();
                    break;
                }
                case 3: {
                    ControleEstudantes.listarEstudantes();
                    break;
                }
                case 4: {
                    ControleEstudantes.buscarEstudante();
                    break;
                }
            }
        } while (numeroEscolhido != 5);
    }

}

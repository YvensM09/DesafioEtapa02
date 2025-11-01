package Desafio2;

import javax.swing.*;

public class Desafio {
    public static void main(String[] args) {

        Estacionamento estacionamento = new Estacionamento(11);
        int operacao;
        do {
            operacao = Integer.parseInt(JOptionPane.showInputDialog(
                            " -------- ESTACIONAMENTO --------\n" +
                            "---Escolha a operação desejada---\n" +
                            "| Opção 1 - Emitir Ticket    \n" +
                            "| Opção 2 - Pagar Ticket     \n" +
                            "| Opção 3 - Consultar Saldo  \n" +
                            "| Opção 4 - Listar Tickets   \n" +
                            "| Opção 5 - Sair             \n" +
                    "\n"));

            switch (operacao){
                case 1:
                    estacionamento.emitirTicket();
                    break;

                case 2:
                    estacionamento.pagarTicket();
                    break;

                case 3:
                    estacionamento.consultarSaldo();
                    break;

                case 4:
                    estacionamento.listarTicket();
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null,"Sistema encerrado.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida!");
            }
        } while (operacao != 5);

        }
    }


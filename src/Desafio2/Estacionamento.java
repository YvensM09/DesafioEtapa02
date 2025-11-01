package Desafio2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    static private List <Ticket> tickets;
    private double saldo;
    private double estaciomentoCusto;

    public Estacionamento () {

    }

    public Estacionamento(double estaciomentoCusto) {
        this.tickets = new ArrayList<>();
        this.saldo = 0.0;
        this.estaciomentoCusto = estaciomentoCusto;
    }

    public void emitirTicket (){
        Ticket ticket = new Ticket(estaciomentoCusto);
        tickets.add(ticket);

        JOptionPane.showMessageDialog(null,"Ticket emitido com sucesso!");
    }

    public Ticket encontrarTicket (int numeroTicket) {
        Ticket ticket = null;
        if (tickets.size() > 0) {
            for (Ticket t: tickets) {
                if (t.getTicketNumero() == numeroTicket) {
                    ticket = t;
                }
            }
        } return ticket;
    }

    public void pagarTicket (){
        int numeroTick = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do seu ticket. "));

        Ticket ticket = encontrarTicket(numeroTick);

        if (ticket != null){
            if (!ticket.getTicketPagamento()) {
                ticket.pagar();
                saldo += ticket.getTicketValor();
                JOptionPane.showMessageDialog(null, "Pagamento realizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null,"O Ticker#"+ticket.getTicketNumero()+" já está pago!");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Ticket não encontrado!");
        }
    }

    public void consultarSaldo (){
        JOptionPane.showMessageDialog(null,"Saldo: "+Utilitario.doubleToString(saldo));;
    }

    public void listarTicket (){
        if(tickets.size() > 0) {
            for (Ticket ticket: tickets){
                JOptionPane.showMessageDialog(null,ticket);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Nenhum ticket foi emitido!");
        }
    }

}

package Desafio2;

public class Ticket {
    private static int ticketContador = 1;
    private int ticketNumero;
    private double ticketValor = 0;
    private boolean ticketPagamento;

    public Ticket(double ticketValor) {
        this.ticketNumero = ticketContador++;
        this.ticketValor = ticketValor;
        this.ticketPagamento = false;
    }

    public void pagar(){
        this.ticketPagamento = true;
    }

    @Override
    public String toString() {
        return "Ticket #" + getTicketNumero() +
                "\nValor:" + Utilitario.doubleToString(this.getTicketValor()) +
                "\nPago: " + (ticketPagamento ? "Sim" : "Não");
    }

    // Setters e Getters
    public int getTicketNumero() {
        return ticketNumero;
    }

    public void setTicketNumero(int ticketNumero) {
        this.ticketNumero = ticketNumero;
    }

    public double getTicketValor() {
        return ticketValor;
    }

    public void setTicketValor(double ticketValor) {
        this.ticketValor = ticketValor;
    }

    public boolean getTicketPagamento() {
        return ticketPagamento;
    }

    public void setTicketPagamento(boolean ticketPagamento) {
        this.ticketPagamento = ticketPagamento;
    }
}

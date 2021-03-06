package br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.modifique.data.payment;

import br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.modifique.data.*;

import java.time.*;
import java.time.format.*;

public abstract class Payment {
    protected String state;
    protected LocalDate dateToReceive;
    protected Double payment;
    protected Card card;

    public Payment(
            String state,
            Double payment,
            Card card,
            LocalDate dateToReceive
    ) {
        this.state = state;
        this.payment = payment;
        this.dateToReceive = dateToReceive;
        this.card = card;
    }

    protected abstract Double getFinalPayment();

    public String[] transactionStatus() {
        return new String[]{state, payment.toString(), getFinalPayment().toString(), dateToReceive.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))};
    }
}

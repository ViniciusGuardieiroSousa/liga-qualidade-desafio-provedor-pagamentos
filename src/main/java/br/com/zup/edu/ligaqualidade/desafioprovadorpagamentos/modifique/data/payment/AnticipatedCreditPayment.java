package br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.modifique.data.payment;

import br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.modifique.data.*;
import br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.modifique.data.payment.*;

import java.time.LocalDate;

public class AnticipatedCreditPayment extends Payment {
    private Double anticipatedRate;

    public AnticipatedCreditPayment(Double value, Card card, Double anticipatedRate) {
        super("pago", value, card, LocalDate.now());
        this.anticipatedRate = anticipatedRate;
    }

    @Override
    public Double getFinalPayment() {
        return (payment * 0.95) * (1 - anticipatedRate);
    }
}

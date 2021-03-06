package br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.modifique.data.payment;

import br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.modifique.data.*;
import br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.modifique.data.payment.*;

import java.time.LocalDate;

public class DebitPayment extends Payment {

    public DebitPayment(
            Double value,
            Card card
    ) {
        super("pago", value,card, LocalDate.now());
    }

    @Override
    public Double getFinalPayment() {
        return payment * 0.97;
    }
}

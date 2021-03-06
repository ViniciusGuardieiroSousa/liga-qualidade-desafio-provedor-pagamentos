package br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.modifique.data.payment;

import br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.modifique.data.*;
import br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.modifique.data.payment.*;

import java.time.LocalDate;

public class CreditPayment extends Payment {

    public CreditPayment(Double value, Card card) {
        super(
                "aguardando_pagamento",
                value,
                card,
                LocalDate.now().plusDays(30)
        );

    }

    @Override
    public Double getFinalPayment() {
        return payment * 0.95;
    }
}

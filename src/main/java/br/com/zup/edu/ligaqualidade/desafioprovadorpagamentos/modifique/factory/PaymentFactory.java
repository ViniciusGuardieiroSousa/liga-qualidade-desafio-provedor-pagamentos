package br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.modifique.factory;

import br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.modifique.data.*;
import br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.modifique.data.payment.*;

public final class PaymentFactory {

    public static Payment payment(Double anticipatedRate, Double value, Card card, String paymentMethod) {
        Payment payment;
        if (anticipatedRate != null) {
            payment = new AnticipatedCreditPayment(value, card, anticipatedRate);
        } else if (paymentMethod.equals("DEBITO")) {
            payment = new DebitPayment(value, card);
        } else {
            payment = new CreditPayment(value, card);
        }
        return payment;
    }
}

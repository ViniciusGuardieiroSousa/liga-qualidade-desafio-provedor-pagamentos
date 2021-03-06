package br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.modifique.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Card {
    LocalDate cardValidation;
    String cardNumber;
    String cardName;
    String cardCVV;

    public Card(String cardValidation, String cardNumber, String cardName, String cardCVV) {
        this.cardValidation = LocalDate.parse(cardValidation, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.cardCVV = cardCVV;
    }
}

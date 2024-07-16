package org.alura.currency;

import org.alura.interfaces.Currency;

public class Real implements Currency {

    @Override
    public String getCode() {
        return "BRL";
    }

    @Override
    public String getTitle() {
        return "Real Brasileiro";
    }
}

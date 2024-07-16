package org.alura.currency;

import org.alura.interfaces.Currency;

public class Euro implements Currency {
    @Override
    public String getCode() {
        return "EUR";
    }

    @Override
    public String getTitle() {
        return "Euro";
    }
}

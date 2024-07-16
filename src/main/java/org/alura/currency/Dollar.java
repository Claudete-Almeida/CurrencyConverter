package org.alura.currency;

import org.alura.interfaces.Currency;

public class Dollar implements Currency {

    @Override
    public String getCode() {
        return "USD";
    }

    @Override
    public String getTitle() {
        return "Dollar";
    }
}

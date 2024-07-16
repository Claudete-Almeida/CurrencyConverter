package org.alura.currency;

import org.alura.interfaces.Currency;

public class ArgentinianPeso implements Currency {

    @Override
    public String getCode() {
        return "ARS";
    }

    @Override
    public String getTitle() {
        return "Peso Argentino";
    }
}

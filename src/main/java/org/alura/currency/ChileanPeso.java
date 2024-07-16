package org.alura.currency;

import org.alura.interfaces.Currency;

public class ChileanPeso implements Currency {

    @Override
    public String getCode() {
        return "CLP";
    }

    @Override
    public String getTitle() {
        return "Peso Chileno";
    }
}

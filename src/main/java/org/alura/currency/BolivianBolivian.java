package org.alura.currency;

import org.alura.interfaces.Currency;

public class BolivianBolivian  implements Currency {

    @Override
    public String getCode() {
        return "BOB";
    }

    @Override
    public String getTitle() {
        return "Boliviano Boliviano";
    }
}

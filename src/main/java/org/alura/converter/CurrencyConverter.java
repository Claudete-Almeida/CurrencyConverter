package org.alura.converter;

import org.alura.connection.CurrencyConverterApi;
import org.alura.interfaces.Currency;
import org.alura.models.CurrencyObj;

import java.util.Scanner;

public class CurrencyConverter {
    private CurrencyConverterApi currencyApi;
    private Scanner scanner = new Scanner(System.in);
    private String value;
    private CurrencyObj currencyObj;

    public CurrencyConverter(Currency currencyOrigin, Currency currencyDestiny) {
        this.currencyApi = new CurrencyConverterApi(currencyOrigin.getCode(), currencyDestiny.getCode());
    }

    public void convert () {
        System.out.println("Insisa o valor:");
        do{
            this.value = scanner.next();
        } while (this.value.matches("[0-9.,]"));
        value.replace(',', '.');

        this.currencyObj = this.currencyApi.convertCurrencies(this.value);

    }

    public void printConversion () {
        System.out.println("======================================================\n" +
                "Resultado da conversão \n" +
                "Data da convesão = " + this.currencyObj.getTime_last_update_utc() + '\n' +
                "Moeda base = " + this.currencyObj.getBase_code() + '\n' +
                "Moeda alvo = " + this.currencyObj.getTarget_code() + '\n' +
                "Taxa de convesão = " + this.currencyObj.getConversion_rate() + '\n' +
                "Valor convertido = " + this.currencyObj.getConversion_result());
                    
    }
}

package org.alura.connection;

import org.alura.models.CurrencyObj;

public class CurrencyConverterApi {
    private ApiConnection apiConnection;
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/70761910ae80a4cfce9a5368/pair/";
    private String codeOne;
    private String codeTwo;

    public CurrencyConverterApi(String codeOne, String codeTwo) {
        this.codeOne = codeOne;
        this.codeTwo = codeTwo;
        this.apiConnection = new ApiConnection(BASE_URL);
    }

    public CurrencyObj convertCurrencies (String value) {
        return this.apiConnection.createRequest(this.codeOne + "/" + this.codeTwo + "/" + value, CurrencyObj.class);
    }

}

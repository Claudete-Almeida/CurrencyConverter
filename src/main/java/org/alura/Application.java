package org.alura;

import org.alura.converter.CurrencyConverter;
import org.alura.currency.*;
import org.alura.interfaces.Currency;

import java.util.Scanner;

public class Application {
    private CurrencyConverter currencyConverter;
    private Scanner read = new Scanner(System.in);
    private int option;

    public void startApp () {
        do {
            this.showMenu();
            this.option = this.read.nextInt();
            switch (this.option) {
                case 1:
                    this.handleConversion(new Real(), new Dollar());
                    break;
                case 2:
                    this.handleConversion(new Dollar(), new Real());
                    break;
                case 3:
                    this.handleConversion(new Real(), new Euro());
                    break;
                case 4:
                    this.handleConversion(new Euro(), new Real());
                    break;
                case 5:
                    this.handleConversion(new Real(), new ChileanPeso());
                    break;
                case 6:
                    this.handleConversion(new ChileanPeso(), new Real());
                    break;
                case 7:
                    this.handleConversion(new Real(), new ArgentinianPeso());
                    break;
                case 8:
                    this.handleConversion(new ArgentinianPeso(), new Real());
                    break;
                case 0:
                    System.out.println("Encerrando aplicação");
                    break;
                default:
                    System.out.println("Opção inválida!");

            }
        } while(this.option != 0);
    }

    private void showMenu () {
        System.out.println("""
                   ===============================================
                   Escolha a moeda de origem\n
                   1 - Conversão de Real para Dólar US
                   2 - Conversão de Dólar US para Real
                   3 - Conversão de Real para Euro
                   4 - Conversão de Euro para Real
                   5 - Conversão de Real para Libra UK
                   6 - Conversão de Libra UK para Real
                   7 - Conversão de Real para Peso Argentino
                   8 - Conversão de Peso Argentino para Real
                   0 - Sair\n
                   ===============================================
                   """);
    }

    private void exitMenu() {
        System.out.println("""
                   ===============================================
                   Pressione 1 para continuar usando.
                   ===============================================
                   """);
        this.option = this.read.nextInt();
        if (this.option != 1){
            System.exit(0);
        }
    }

    private void handleConversion (Currency currencyOne, Currency currencyTwo) {
        this.currencyConverter = new CurrencyConverter(currencyOne, currencyTwo);
        this.currencyConverter.convert();
        this.currencyConverter.printConversion();
        this.exitMenu();
    }
}

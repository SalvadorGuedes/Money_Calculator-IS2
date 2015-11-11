package moneycalculator;

public class MoneyCalculator {

    public static void main(String[] args) {
        Currency euro = new Currency("EUR", "Euro", "€");
        Currency libra = new Currency("LIB", "Libra ", "$");
        Money money = new Money(300, euro);
        ExchangeRate exchangeRate = new ExchangeRate(euro, libra, 1.21);
                
        Money result = MoneyExchanger.Exchange(money, exchangeRate);
        
        System.out.println(result.getAmount()+" "+result.getCurrency().getSymbol());
    }
    
}

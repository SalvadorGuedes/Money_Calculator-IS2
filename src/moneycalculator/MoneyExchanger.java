package moneycalculator;

public class MoneyExchanger {
    
    public static Money Exchange (Money money,ExchangeRate exchangeRate){
        return new Money(money.getAmount()*exchangeRate.getRate(),exchangeRate.getTo());
    }
        
}

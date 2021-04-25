package exceptionhandling;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        super();
        this.currency = currency;
        this.amount = amount;
    }

    public  void add(Amount that) throws CurrenciesDontMatchException {
        if(!this.currency.equals(that.currency)){
            throw new CurrenciesDontMatchException(this.currency + " and " + that.currency + " currencies don't match.");
        }
        this.amount = this.amount + that.amount;
    }

    public String toString(){
        return amount + " " + currency;
    }
}

class CurrenciesDontMatchException extends Exception{
    public CurrenciesDontMatchException(String str){
        super(str);
    }

}

public class ThrowingExceptionRunner {

    public static void main(String[] args) throws CurrenciesDontMatchException {

        Amount amount1 = new Amount("USD", 10);
        Amount amount2 = new Amount("EUR", 20);
        amount1.add(amount2);
        System.out.println(amount1);
    }
}

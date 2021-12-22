import java.util.HashMap;
//Ещё не дописан

public class DataCaching implements Runnable {

    private static class CurrencyStorage{
        HashMap<String, Currency> currenciesNBU = new HashMap<String, Currency>();
        HashMap<String, Currency> currenciesPB = new HashMap<String, Currency>();
        HashMap<String, Currency> currenciesMono = new HashMap<String, Currency>();
    }
    //добавить методы

    private static CurrencyStorage currencyStorage;
    private DataCaching(){}

    public static CurrencyStorage getInstance(){
        if(currencyStorage == null){
            currencyStorage = new CurrencyStorage();
        }
        return currencyStorage;
    }

    @Override
    public void run() {
        {
            do {
                try {
                    //взаимодействие с BankResponce

                    Thread.sleep(5 * 60 * 1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (true);
        }
    }
}

package com.goit.project;

import java.util.HashMap;
//Ещё не дописан

public class DataCaching implements Runnable {

    private static class CurrencyStorage{
        HashMap<String, Currency> currenciesNBU = new HashMap<String, Currency>();
        HashMap<String, Currency> currenciesPB = new HashMap<String, Currency>();
        HashMap<String, Currency> currenciesMono = new HashMap<String, Currency>();
    }

    private void parseCurrencyResponse(HashMap<String, BigDecimal> curMap){

        for (Map.Entry<String, BigDecimal> entry : curMap.entrySet()) {
                String key = entry.getKey();
                BigDecimal value = entry.getValue();

        }

    }

    public Currency getEURNBU{
        return CurrencyStorage.currenciesNBU.get("EUR");
    }
    public Currency getUSDNBU{
        return CurrencyStorage.currenciesNBU.get("USD");
    }
    public Currency getRUBNBU{
        return CurrencyStorage.currenciesNBU.get("RUB");
    }
    public Currency getEURPB{
        return CurrencyStorage.currenciesPB.get("EUR");
    }
    public Currency getUSDPB{
        return CurrencyStorage.currenciesPB.get("USD");
    }
    public Currency getRUBPB{
        return CurrencyStorage.currenciesNBU.get("RUB");
    }
    public Currency getEURMono{
        return CurrencyStorage.currenciesNBU.get("EUR");
    }
    public Currency getUSDMono{
        return CurrencyStorage.currenciesNBU.get("USD");
    }
    public Currency getRUBMono{
        return CurrencyStorage.currenciesNBU.get("RUB");
    }

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
                    //взаимодействие с BankResponce, надо видеть код BankResponce
                    (new BankResponse(PB)).getCurrency();
                    (new BankResponse(NBU)).getCurrency();
                    (new BankResponse(Monobank)).getCurrency();
                    Thread.sleep(5 * 60 * 1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } while (true);
        }
    }
}

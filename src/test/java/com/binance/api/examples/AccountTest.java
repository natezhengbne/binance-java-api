package com.binance.api.examples;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.account.Account;
import com.binance.api.client.domain.account.AssetBalance;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.junit.Test;

import java.math.BigDecimal;

public class AccountTest {

    @Test
    public void getAccountTest() {
        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance();
        BinanceApiRestClient client = factory.newRestClient();
        // Get account balances
        Account account = client.getAccount(60_000L, System.currentTimeMillis());
        for (AssetBalance balance : account.getBalances()) {
            if (new BigDecimal(balance.getFree()).compareTo(BigDecimal.ZERO) > 0) {
                System.out.println(balance);
            }
        }

    }
}

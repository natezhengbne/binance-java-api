package com.binance.api.examples;

import com.binance.api.client.BinanceApiAsyncRestClient;
import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.TimeInForce;
import com.binance.api.client.domain.account.Order;
import com.binance.api.client.domain.account.request.*;

import java.util.List;

import static com.binance.api.client.domain.account.NewOrder.limitBuy;
import static com.binance.api.client.domain.account.NewOrder.marketBuy;

/**
 * Examples on how to place orders, cancel them, and query account information.
 */
public class OrdersExampleAsync {

  public static void main(String[] args) {
    BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance(
            "uPK6Mkd74ux6mw8TlcrEQY14vNI0YE92vZMvpgvPhlAIx0qO9rmAlqmhC6o4VzMT",
            "CvZ4b26yjIdR9KYBv0fMti0mfClywzgqOKe1bh2efchNc6V72mvlz6n7ffHYoUTH");
    BinanceApiRestClient client = factory.newRestClient();

//    // Getting list of open orders
//    List<Order> ethusdt1 = client.getOpenOrders(new OrderRequest("ETHUSDT"));
//    ethusdt1.stream().filter(s -> s.getOrderId()==)
//
//    // Get status of a particular order
//    client.getOrderStatus(new OrderStatusRequest("LINKETH", 745262L),
//        response -> System.out.println(response));
//
//    // Getting list of all orders with a limit of 10
//    client.getAllOrders(new AllOrdersRequest("LINKETH").limit(10), response -> System.out.println(response));

    // Canceling an order
//    CancelOrderResponse ethusdt = client.cancelOrder(new CancelOrderRequest("ETHUSDT", 1965088167L));
//    System.out.println(ethusdt);
//
//    // Placing a test LIMIT order
//    client.newOrderTest(limitBuy("LINKETH", TimeInForce.GTC, "1000", "0.0001"),
//        response -> System.out.println("Test order has succeeded."));
//
//    // Placing a test MARKET order
//    client.newOrderTest(marketBuy("LINKETH", "1000"), response -> System.out.println("Test order has succeeded."));
//
//    // Placing a real LIMIT order
//    client.newOrder(limitBuy("LINKETH", TimeInForce.GTC, "100", "0.1"),
//        response -> System.out.println(response));
  }
}

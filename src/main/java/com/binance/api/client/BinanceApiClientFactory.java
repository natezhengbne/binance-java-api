package com.binance.api.client;

import com.binance.api.client.impl.BinanceApiAsyncRestClientImpl;
import com.binance.api.client.impl.BinanceApiRestClientImpl;
import com.binance.api.client.impl.BinanceApiWebSocketClientImpl;

import static com.binance.api.client.impl.BinanceApiServiceGenerator.getSharedClient;

/**
 * A factory for creating BinanceApi client objects.
 */
public class BinanceApiClientFactory {

  /**
   * API Key
   */
  private String apiKey="uPK6Mkd74ux6mw8TlcrEQY14vNI0YE92vZMvpgvPhlAIx0qO9rmAlqmhC6o4VzMT";

  /**
   * Secret.
   */
  private String secret="CvZ4b26yjIdR9KYBv0fMti0mfClywzgqOKe1bh2efchNc6V72mvlz6n7ffHYoUTH";

  /**
   * Instantiates a new binance api client factory.
   *
   * @param apiKey the API key
   * @param secret the Secret
   */
  private BinanceApiClientFactory(String apiKey, String secret) {
    this.apiKey = apiKey;
    this.secret = secret;
  }

  /**
   * New instance.
   *
   * @param apiKey the API key
   * @param secret the Secret
   *
   * @return the binance api client factory
   */
  public static BinanceApiClientFactory newInstance(String apiKey, String secret) {
    return new BinanceApiClientFactory(apiKey, secret);
  }

  /**
   * New instance without authentication.
   *
   * @return the binance api client factory
   */
  public static BinanceApiClientFactory newInstance() {
    String apiKey="uPK6Mkd74ux6mw8TlcrEQY14vNI0YE92vZMvpgvPhlAIx0qO9rmAlqmhC6o4VzMT";

    /**
     * Secret.
     */
    String secret="CvZ4b26yjIdR9KYBv0fMti0mfClywzgqOKe1bh2efchNc6V72mvlz6n7ffHYoUTH";
    return new BinanceApiClientFactory(apiKey, secret);
  }

  /**
   * Creates a new synchronous/blocking REST client.
   */
  public BinanceApiRestClient newRestClient() {
    return new BinanceApiRestClientImpl(apiKey, secret);
  }

  /**
   * Creates a new asynchronous/non-blocking REST client.
   */
  public BinanceApiAsyncRestClient newAsyncRestClient() {return new BinanceApiAsyncRestClientImpl(apiKey, secret);
  }

  /**
   * Creates a new web socket client used for handling data streams.
   */
  public BinanceApiWebSocketClient newWebSocketClient() {
    return new BinanceApiWebSocketClientImpl(getSharedClient());
  }
}

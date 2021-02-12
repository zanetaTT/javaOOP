import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class StocksTest {
    @Mock
    ProductPricingService price;

    @Test
    void canGetPriceOfStocks() {
        // mocking stock class
        Stocks mockedStock = mock(Stocks.class);

        //mocking price method
        when(mockedStock.price(mockedStock.getTicker(), mockedStock.getExchange())).thenReturn(10.0);

        // assertion
        assertEquals(10.0, mockedStock.price(mockedStock.getTicker(), mockedStock.getExchange()));
    }
}
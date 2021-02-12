import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FuturesTest {
    @Mock
    ProductPricingService price;

    @Test
    void canGetPriceOfFutures() {
        // mocking the class
        Futures mockedFuture = mock(Futures.class);

        // mocking price method
        when(mockedFuture.price(mockedFuture.getExchange(), mockedFuture.getContractCode(), mockedFuture.getContractMonth(), mockedFuture.getContractYear())).thenReturn(10.0);

        // assertion
        assertEquals(10.0, mockedFuture.price(mockedFuture.getExchange(), mockedFuture.getContractCode(), mockedFuture.getContractMonth(), mockedFuture.getContractYear()));
    }
}
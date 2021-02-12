import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;

class TradeTest {

    @Test
    void canAddNewProduct() throws ProductAlreadyRegisteredException {
        // mocking a product and trade
        Product mockedProduct = mock(Product.class);
        Trade myTrade = new Trade();

        // add product
        myTrade.addNewProduct(mockedProduct);

        // assert using product list size
        assertEquals(1, myTrade.getProductListSize());
    }

    @Test
    void addingDuplicateProductsThrowsException() throws ProductAlreadyRegisteredException{
        // mocking a product
        Product mockedProduct = mock(Product.class);

        Trade myTrade = new Trade();

        // add first product
        myTrade.addNewProduct(mockedProduct);

        // asserting the exception
        assertThrows(ProductAlreadyRegisteredException.class, () -> {
            myTrade.addNewProduct(mockedProduct);
        }, "No exception thrown");
    }

    @Test
    void quantityRecordedForRegisteredTrade() throws ProductAlreadyRegisteredException {
        // mocking a product
        Product mockedProduct = mock(Product.class);

        Trade myTrade = new Trade();

        // registering product
        myTrade.addNewProduct(mockedProduct);

        int prodQuantity = anyInt();

        // adding trade
        myTrade.trade(mockedProduct, prodQuantity);

        assertEquals(prodQuantity, myTrade.getQuantityOfProductTraded(mockedProduct));
    }

    @Test
    void noQuantityRecordedForUnregisteredTrade(){
        // mocking a product
        Product mockedProduct = mock(Product.class);

        Trade myTrade = new Trade();

        myTrade.trade(mockedProduct, anyInt());

        assertEquals(null, myTrade.getQuantityOfProductTraded(mockedProduct));
    }
}
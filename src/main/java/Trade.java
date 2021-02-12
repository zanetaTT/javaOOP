import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class Trade implements MontrealTradedProducts{
    private List<Product> registeredProducts = new ArrayList<>();
    private Map<Product, Integer> productsWithQuantity = new HashMap<>();

    public Trade() {
    }

    public int getProductListSize(){
        return registeredProducts.size();
    }

    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        // check if product list is empty
        if (registeredProducts.isEmpty()){
            registeredProducts.add(product);
        } else{
            // checking to get a match of product
            List<Product> products =  registeredProducts.stream()
                                                        .filter(p -> p.getId() == product.getId())
                                                        .collect(Collectors.toList());

            if (products.isEmpty()){
                registeredProducts.add(product);
            }else{
                throw new ProductAlreadyRegisteredException("Product already exists");
            }
        }
    }

    @Override
    public void trade(Product product, int quantity) {
        // checking to get a match of product
        List<Product> products =  registeredProducts.stream()
                                                    .filter(p -> p.getId() == product.getId())
                                                    .collect(Collectors.toList());

        //  if not registered, no quantity is recorded
        if (products.isEmpty()){
            productsWithQuantity.put(product, null);
        }else{
            productsWithQuantity.put(product, quantity);
        }
    }

    public Integer getQuantityOfProductTraded(Product product){
        return productsWithQuantity.get(product);
    }

    @Override
    public int totalTradeQuantityForDay() {
        return 0;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        return 0;
    }
}

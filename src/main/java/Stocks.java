public class Stocks extends Product{
    private String id;
    private double value;
    private String ticker;
    private String exchange;

    public Stocks(String id, double value, String ticker, String exchange) {
        super(id, value);
        this.ticker = ticker;
        this.exchange = exchange;
    }

    public String getTicker() {
        return ticker;
    }

    public String getExchange() {
        return exchange;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public double getValue() {
        return value;
    }


    @Override
    public double price(String exchange, String ticker) {
        return 0;
    }

    @Override
    public double price(String exchange, String contractCode, int month, int year) {
        return 0;
    }
}

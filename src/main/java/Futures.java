public class Futures extends Product{
    private String id;
    private double value;
    private String exchange;
    private String contractCode;
    private int contractMonth;
    private int contractYear;

    public Futures(String id, double value, String exchange, String contractCode, int contractMonth, int contractYear) {
        super(id, value);
        this.exchange = exchange;
        this.contractCode = contractCode;
        this.contractMonth = contractMonth;
        this.contractYear = contractYear;
    }

    public String getExchange() {
        return exchange;
    }

    public String getContractCode() {
        return contractCode;
    }

    public int getContractMonth() {
        return contractMonth;
    }

    public int getContractYear() {
        return contractYear;
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
    public double price(String exchange, String contractCode, int month, int year) {
        return 0;
    }

    @Override
    public double price(String exchange, String ticker) {
        return 0;
    }
}

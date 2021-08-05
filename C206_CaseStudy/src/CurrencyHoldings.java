
public class CurrencyHoldings extends CurrencyList{
	
	private Double buy_rate;
	private Double sell_rate;
	private Double Currency_holding;
	private String Company_name;
	
	public CurrencyHoldings(String Currency_ISO, String Currency_name, String Currency_country, Double buy_rate, Double sell_rate) {
		super(Currency_ISO, Currency_name, Currency_country);
		this.buy_rate = buy_rate;
		this.sell_rate = sell_rate;
	}
	
	public CurrencyHoldings(String Currency_ISO, String Currency_name, String Currency_country, Double buy_rate, Double sell_rate, Double Currency_holding) {
		super(Currency_ISO, Currency_name, Currency_country);
		this.buy_rate = buy_rate;
		this.sell_rate = sell_rate;
		this.Currency_holding = Currency_holding;
	}
	
	public CurrencyHoldings(String Currency_ISO, String Currency_name, String Currency_country, Double buy_rate, Double sell_rate, Double Currency_holding, String Company_name) {
		super(Currency_ISO, Currency_name, Currency_country);
		this.buy_rate = buy_rate;
		this.sell_rate = sell_rate;
		this.Currency_holding = Currency_holding;
		this.Company_name = Company_name;
	}
	
	public void setBuy_rate(Double buy_rate) {
		this.buy_rate = buy_rate;
	}

	public void setSell_rate(Double sell_rate) {
		this.sell_rate = sell_rate;
	}

	public Double getBuy_rate() {
		return buy_rate;
	}
	
	public Double getSell_rate() {
		return sell_rate;
	}

	public Double getCurrency_holding() {
		return Currency_holding;
	}

	public void setCurrency_holding(Double currency_holding) {
		Currency_holding = currency_holding;
	}
	
	public String getCompany_name() {
		return Company_name;
	}
	
}

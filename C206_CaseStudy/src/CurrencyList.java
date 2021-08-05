
public class CurrencyList {
	
	private String Currency_ISO;
	private String Currency_name;
	private String Currency_country;
	private Double buy_rate;
	private Double sell_rate;
	
	public CurrencyList(String Currency_ISO, String Currency_name, String Currency_country, Double buy_rate, Double sell_rate) {
		this.Currency_ISO = Currency_ISO;
		this.Currency_name = Currency_name;
		this.Currency_country = Currency_country;
		this.buy_rate = buy_rate;
		this.sell_rate = sell_rate;
	}
	
	public String getISO() {
		return Currency_ISO;
	}
	
	public String getName() {
		return Currency_name;
	}
	
	public String getCountry() {
		return Currency_country;
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
	
}

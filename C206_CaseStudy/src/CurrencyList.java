
public class CurrencyList {
	
	private String Currency_ISO;
	private String Currency_name;
	private String Currency_country;
	
	public CurrencyList(String Currency_ISO, String Currency_name, String Currency_country) {
		this.Currency_ISO = Currency_ISO;
		this.Currency_name = Currency_name;
		this.Currency_country = Currency_country;
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
	
}

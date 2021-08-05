import java.util.ArrayList;

public class OnlineMoneyExchange {

	private static final int OPTION_QUIT = 6;
	
	public static void main(String[] args) {
		
		ArrayList<CurrencyList>currencyList = new ArrayList<CurrencyList>();
		ArrayList<CurrencyHoldings>currencyHolding = new ArrayList<CurrencyHoldings>();
		
		int option = -1;
		
		while (option != OPTION_QUIT) {
			
			OnlineMoneyExchange.menu();
			
			option = Helper.readInt("Enter an option > ");
			
			// guys, make sure to create them as separate methods 
			// and then add it here so it here so it is less messy
			
			if (option == 1) {
				// add currency
				
			} else if (option == 2) {
				// delete currency
				
			} else if (option == 3) {
				// view currency
				
			} else if (option == 4) {
				// search for BUY or SELL rate
				
			} else if (option == 5) {
				// make a transaction
				
			} else if (option == OPTION_QUIT) {
				System.out.println("Thank you for using our Money Exchanger!");
				
			} else {
				System.out.println("Invalid Option!");
			}
			
		} // end of indeterminate while loop
		
	} // end of main method
	
	public static void menu() {
		Helper.line(80, "-");
		System.out.println("MONEY EXCHANGE");
		Helper.line(80, "-");
		System.out.println("1. Add a currency");
		System.out.println("2. Delete a currency");
		System.out.println("3. View list of currencies");
		System.out.println("4. Search for BUY or SELL rate");
		System.out.println("5. Make a transaction");
		System.out.println("6. Quit");
		Helper.line(80, "-");
	} // end of menu
	
	public static void addType_menu() {
		Helper.line(80, "-");
		System.out.println("ADD A CURRENCY");
		Helper.line(80, "-");
		System.out.println("1. Add Currency into List");
		System.out.println("2. Add Currency Holding");
	} // end of addType menu
	
	public static void deleteType_menu() {
		Helper.line(80, "-");
		System.out.println("DELETE A CURRENCY");
		Helper.line(80, "-");
		System.out.println("1. Delete Currency from List");
		System.out.println("2. Deduct Currency Holding");
	} // end of deleteType menu
	
	public static void viewType_menu() {
		Helper.line(80, "-");
		System.out.println("VIEW CURRENCY");
		Helper.line(80, "-");
		System.out.println("1. View All Currencies in List");
		System.out.println("2. View Currency Holding");
		System.out.println("3. View Currency Holding Per Company");
	} // end of viewType menu
	
	public static void makeTransaction_menu() {
		Helper.line(80, "-");
		System.out.println("BUY OR SELL?");
		Helper.line(80, "-");
		System.out.println("1. Buy Currency");
		System.out.println("2. Sell Currency");
	} // end of makeTransaction menu
	
	// ADD YOUR METHODS HERES

} // end of class

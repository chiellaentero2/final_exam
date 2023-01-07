public class Main {
   public static void main(String[] args) {
		Customer customer;
		RegularCustomer regularCustomer = new RegularCustomer("Chiella", 2000);
		SeniorCustomer seniorCustomer = new SeniorCustomer("Darren", 2000);

		customer = regularCustomer;
		System.out.println(customer.getName()+" " +customer.calculateBill());

		customer = seniorCustomer;
		System.out.println(customer.getName()+" "+customer.calculateBill());
	} 
}

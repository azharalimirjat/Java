public class Circuit_Power {
	public static int power(int voltage, int current) {
	
		return voltage*current; 
	}
	
	public static void main(String[] args) {
		System.out.println(power(110, 30));
	}
}
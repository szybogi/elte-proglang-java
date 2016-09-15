public class Temperature{
	public static void main(String[]args){
		System.out.println("Fahrenheit: ");
		String input =System.console().readLine();
		int f =Integer.parseInt(input);
		System.out.println("Celsius: "+ fahrenheitToCelsius(f));
	}
	public static int fahrenheitToCelsius(int f){
		return ((f-32)/9);
	}
}
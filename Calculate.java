public class Calculate{

	public static void main(String[] arg){

	System.out.println("Hello World");
	int first = Integer.valueOf(arg[0]);
	int second = Integer.valueOf(arg[1]);
	int sum = first + second;
	int div = first/second;
	int rem = first%second;
	int dif = first - second;
	System.out.println("Sum " + sum);
	System.out.println("dif " + dif);
	System.out.println("div " + div);
	System.out.println("rem " + rem);
	
}
}

public class SwapWithoutThird {

	public static void main(String[] args) {
		int num1=20;
		int num2=10;
		
		System.out.println("before swap:"+num1+" "+num2);
		
		num1=num1+num2; //30
		
		num2=num1-num2; //30-10=20
		
		num1=num1-num2; //30-20=10
		
		System.out.println("after swap:"+num1+" "+num2);
		
	}
}

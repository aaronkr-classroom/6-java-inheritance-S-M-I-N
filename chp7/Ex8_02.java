
public class Ex8_02 extends Math{


	/*
	 * public void mult(int x, int y) { result = x * y;
	 * System.out.println("두 수의 곱은 : " + result); }
	 */


	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		
		Ex8_02 obj = new Ex8_02();
		
		obj.add(a,b);
		obj.sub(a,b);
		obj.mult(a,b);
		obj.div(a,b);

	}
}

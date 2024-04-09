
public class Ex8_04 extends Math {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		double c = 2.5;
		double d = 4.5;
		
		Ex8_04 calc = new Ex8_04();
		
		System.out.println(a + " + " + b + " = " + calc.add(a,b)); // (int,int)
		System.out.println(a + " + " + c + " = " + calc.add(a,c)); // (int,double)
		System.out.println(c + " + " + d + " = " + calc.add(c,d)); // (double,double)
		
		System.out.println();
		
		System.out.println(a + " - " + b + " = " + calc.sub(a,b));
		System.out.println(a + " - " + c + " = " + calc.sub(a,c)); 
		System.out.println(c + " - " + d + " = " + calc.sub(c,d)); 
		
		System.out.println();
		
		System.out.println(a + " X " + b + " = " + calc.mult(a,b));
		System.out.println(a + " X " + c + " = " + calc.mult(a,c)); 
		System.out.println(c + " X " + d + " = " + calc.mult(c,d));
		
		System.out.println();
		
		System.out.println(a + " / " + b + " = " + calc.div(a,b));
		System.out.println(a + " / " + c + " = " + calc.div(a,c)); 
		System.out.println(c + " / " + d + " = " + calc.div(c,d));
		
		System.out.println();
		
		System.out.println(a + " ^2 " + " = " + calc.sqr(a));
		System.out.println(c + " ^2 " + " = " + calc.sqr(c));

	}

}

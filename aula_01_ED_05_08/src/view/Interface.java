package view;
import controller.Ex_01;

public class Interface {

	public static void main(String[] args) 
	{
		
		
		Ex_01 calcPotencia = new Ex_01();
		int base = 3;
		int exp = 5;
		int res = calcPotencia.potencia(base, exp);
		System.out.println(res);
		
		
		
	}

}

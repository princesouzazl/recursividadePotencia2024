package view;
import controller.DivisaoController;
public class Interface
{
	
	public static void main(String[] args)
	{
		DivisaoController calcDivisao = new DivisaoController();
		
		int dividendo = 23;
		int divisor = 4;
		int res = calcDivisao.divisao(dividendo, divisor);
		
		System.out.println(res);
	}

}

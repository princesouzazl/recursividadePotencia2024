package controller;

public class Ex_01 
{
	
	public Ex_01()
	{
		
		super();
		
	}
	
	public int potencia(int base, int exp)
	{
		
		if (exp == 0)
		{
			
			return 1;
		}
		else 
		{ 
			
			exp = exp - 1 ;
			return base * potencia(base, exp);
			
		}
	
	}
}

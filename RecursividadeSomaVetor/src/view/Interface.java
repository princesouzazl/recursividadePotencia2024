package view;
import controller.VetorController;

public class Interface
{
	public static void main(String[] args)
	{
		VetorController somaVet = new VetorController();
		
		int vetor[] = {7, 4, 1, 9, 6, 3};
		
		int tamanho = vetor.length;
		
		int res = somaVet.somaVetor(vetor, tamanho);
		
		System.out.println(res);
	}
}

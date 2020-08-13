package Mecanicas;
import java.util.Random;

public class FabricaDeMecanicas {
	
	Mecanica a = new MecanicaNormal();
	Mecanica b = new MecanicaComVida();
	Mecanica c = new MecanicaComChance();
	Mecanica d = new MecanicaComChanceVida();
	
	public Mecanica getMecanica()
	{
		Random rm = new Random();
		int indice = rm.nextInt(4);
		
		if(indice == 0)
		{
			return a;
		}
		else if(indice == 1)
		{
			return b;
		}
		else if(indice == 2)
		{
			return c;
		}
		else
		{
			return d;
		}
	}
}

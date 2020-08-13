package Embaralhadores;
import java.util.Random;

public class FabricaDeEmbaralhadores {
	
	Embaralhador a = new InverteTudo();
	Embaralhador b = new InvertePares();
	Embaralhador c = new InverteImpares();
	Embaralhador d = new InverteVogais();
	Embaralhador e = new InverteConsoantes();
	Embaralhador f = new MisturaExtremos();
	Embaralhador g = new MisturaParImpar();
	
	public Embaralhador getEmbaralhador()
	{
		Random rm = new Random();
		int indice = rm.nextInt(7);
		
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
		else if(indice == 3)
		{
			return d;
		}
		else if(indice == 4)
		{
			return e;
		}
		else if(indice == 5)
		{
			return f;
		}
		else
		{
			return g;
		}
	}
}

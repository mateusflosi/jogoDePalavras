package Embaralhadores;

public class InvertePares implements Embaralhador {

	@Override
	public String embaralha(String palavra) {
		// inverte os indices pares da string palavra
		int i=1, j = ultimoIndicePar(palavra.length() - 1);
		String invertidoPares = "";
		
		while(j>=0 || i < palavra.length())
		{
			if(j>=0)
			{
				invertidoPares += palavra.charAt(j);
				j -= 2;
			}
			
			if(i < palavra.length())
			{
				invertidoPares += palavra.charAt(i);
				i += 2;
			}
		}
		
		return invertidoPares;
	}
	
	private static int ultimoIndicePar(int tamanho)
	{
		if(tamanho%2 != 0)
		{
			tamanho--;
		}
		
		return tamanho;
	}
}

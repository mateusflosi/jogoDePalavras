package Embaralhadores;

public class InverteImpares implements Embaralhador {

	@Override
	public String embaralha(String palavra) {
		// inverte os indices impares da string palavra
		int i=0, j = ultimoIndiceImpar(palavra.length() - 1);
		String invertidoPares = "";
		
		while(j>0 || i < palavra.length())
		{
			if(i < palavra.length())
			{
				invertidoPares += palavra.charAt(i);
				i += 2;
			}
			
			if(j>=0)
			{
				invertidoPares += palavra.charAt(j);
				j -= 2;
			}
		}
		
		return invertidoPares;
	}
	
	private static int ultimoIndiceImpar(int tamanho)
	{
		if(tamanho%2 == 0)
		{
			tamanho--;
		}
		
		return tamanho;
	}

}

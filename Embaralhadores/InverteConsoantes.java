package Embaralhadores;

public class InverteConsoantes implements Embaralhador {

	@Override
	public String embaralha(String palavra) {
		// inverte as consoantes de uma palavra
		int i=0, j = palavra.length()-1;
		String invertidoVogais = "";
		
		while(i<palavra.length())
		{
			while(i<palavra.length() && !isConsoante(palavra.charAt(i)))
			{
					invertidoVogais += palavra.charAt(i);
					i++;
			}
			
			if(i<palavra.length())
			{
				while(!isConsoante(palavra.charAt(j)))
				{
					j--;
				}
				
				invertidoVogais += palavra.charAt(j);
				i++;
				j--;
			}
		}
		
		return invertidoVogais;
	}
	
	private static boolean isConsoante(char letra)
	{
		if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
		{
			return false;
		}
		
		return true;
	}

}

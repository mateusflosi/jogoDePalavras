package Embaralhadores;

public class InverteVogais implements Embaralhador {

	@Override
	public String embaralha(String palavra) {
		// inverte os as vogais de uma palavra
		int i=0, j = palavra.length()-1;
		String invertidoVogais = "";
		
		while(i<palavra.length())
		{
			while(i<palavra.length() && !isVogal(palavra.charAt(i)))
			{
					invertidoVogais += palavra.charAt(i);
					i++;
			}
			
			if(i<palavra.length())
			{
				while(!isVogal(palavra.charAt(j)))
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
	
	private static boolean isVogal(char letra)
	{
		if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
		{
			return true;
		}
		
		return false;
	}
}
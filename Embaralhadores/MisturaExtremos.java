package Embaralhadores;

public class MisturaExtremos implements Embaralhador {
	//Pega os dois extremos e coloca no misturado
	@Override
	public String embaralha(String palavra) {
		int i, j;
		String misturado = "";
		
		for(i=0, j=palavra.length() - 1; j>=i ;i++, j--)
		{
			misturado += palavra.charAt(i);
			
			if(j != i)
			{
				misturado += palavra.charAt(j);
			}
			
			
		}
		
		return misturado;
	}

}

package Embaralhadores;

public class MisturaParImpar implements Embaralhador {

	@Override
	public String embaralha(String palavra) {
		int i, j;
		String misturadoParImpar = "";
		
		for(i=0, j=1; i<palavra.length();i+=2, j+=2)
		{
			if(j<palavra.length())
			{
				misturadoParImpar += palavra.charAt(j);
			}
			
			misturadoParImpar += palavra.charAt(i);
		}
		
		return misturadoParImpar;
	}

}

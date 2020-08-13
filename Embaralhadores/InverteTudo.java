package Embaralhadores;

public class InverteTudo implements Embaralhador {

	@Override
	public String embaralha(String palavra) {
		int i;
		String invertidoTudo = "";
		
		for(i=palavra.length();i>0;i--)
		{
			invertidoTudo += palavra.charAt(i-1);
		}
		
		return invertidoTudo;
	}
}

package Mecanicas;

public class MecanicaComChance implements Mecanica {
	private int vidas = 1;
	private int pontos = 0;
	private int chance = 3;
	private boolean acertou = false;

	@Override
	public String getModo() {
		return "com chance";
	}

	@Override
	public String getExplicacao() {
		return "Este modo é infinito e você pode parar quando quiser\n"
				+ "Você tem três chance de acertar a palavra\n"
				+ "você ganha 5 pontos caso acerte de primeira, 3 pontos se acertar de segunda e 1 ponto se acertar na ultima tentativa";
	}

	@Override
	public int getVidas() {
		int retorna = vidas;
		return retorna;
	}

	@Override
	public void adicionaPontos() {
		if(chance == 3)
		{
			pontos += 5;
		}
		else if(chance == 2)
		{
			pontos += 3;
		}
		else
		{
			pontos += 1;
		}
	}

	@Override
	public int getPontos() {
		int retorna = pontos;
		return retorna;
	}
	
	@Override
	public boolean fimDeJogo(boolean desejaParar) {
		if(vidas > 0 && desejaParar == false)
		{
			acertou = false;
			chance = 3;
			return false;
		}
		else
		{
			return true;
		}
	}
	
	@Override
	public boolean acabouChance() {
		if(chance > 0 && acertou == false)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	@Override
	public boolean acertou(String palavra, String resposta) {
		if(resposta.equals(palavra))
		{
			adicionaPontos();
			acertou = true;
		}
		else
		{
			chance--;
		}
		
		return acertou;
	}

	@Override
	public boolean errou() {
		if(chance  == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
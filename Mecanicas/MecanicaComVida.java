package Mecanicas;

public class MecanicaComVida implements Mecanica {
	private int vidas = 3;
	private int pontos = 0;
	private int chance = 1;
	private boolean acertou = false;

	@Override
	public String getModo() {
		return "com vida";
	}

	@Override
	public String getExplicacao() {
		return "Para este modo você tem 3 vidas, mas pode parar antes se preferir\n"
				+ "Você tem uma chance de acertar a palavra e para cada acerto você ganha um ponto\n"
				+ "Caso você erre a palavra, você perde uma vida";
	}

	@Override
	public int getVidas() {
		int retorna = vidas;
		return retorna;
	}

	@Override
	public void adicionaPontos() {
		pontos++;
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
			chance = 1;
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
			vidas--;
			return true;
		}
		else
		{
			return false;
		}
	}
}
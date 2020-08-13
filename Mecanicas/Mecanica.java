package Mecanicas;

public interface Mecanica {
	public String getModo();
	public String getExplicacao();
	public int getVidas();
	public void adicionaPontos();
	public int getPontos();
	public boolean fimDeJogo(boolean desejaParar);
	public boolean acabouChance();
	public boolean acertou(String palavra, String resposta);
	public boolean errou();
}

import Mecanicas.*;
import Embaralhadores.*;
import java.io.IOException;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) throws IOException {
		String palavra, palavraEmbaralhada, respostaUsuario = "";
		boolean desejaParar = false, respostaValida = false;
		BancoDePalavras catalogo = new BancoDePalavras();
		FabricaDeMecanicas mecs = new FabricaDeMecanicas();
		FabricaDeEmbaralhadores embs = new FabricaDeEmbaralhadores(); 
		Mecanica mec = mecs.getMecanica();
		Embaralhador emb;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem vindo ao modo " + mec.getModo());
		System.out.println(mec.getExplicacao());
		
		while(!mec.fimDeJogo(desejaParar))
		{
			emb = embs.getEmbaralhador();
			palavra = catalogo.getPalavra();
			palavraEmbaralhada = emb.embaralha(palavra);
			
			//Garante que a palavra foi embaralhada
			while(palavra.equals(palavraEmbaralhada))
			{
				emb = embs.getEmbaralhador();
				palavraEmbaralhada = emb.embaralha(palavra);
			}
			
			System.out.println("\nProxima palavra: " + palavraEmbaralhada);
			
			while(!mec.acabouChance())
			{
				System.out.print("Sua resposta é: ");
				respostaUsuario = scan.next();
				
				if(mec.acertou(palavra, respostaUsuario))
				{
					System.out.println("Você acertou!!!!");
				}
				else
				{
					System.out.println("Você errou!!!");
				}
			}
			
			if(mec.errou())
			{
				System.out.println("A resposta correta era: " + palavra);
			}
			
			if(mec.getVidas() > 0)
			{
				while(!respostaValida)
				{
					System.out.println("\nVocê deseja parar? Responda sim ou nao");
					respostaUsuario = scan.next();
					respostaValida = validaResposta(respostaUsuario);
				}
				
				if(respostaUsuario.equals("sim"))
				{
					desejaParar = true;
				}
				else
				{
					respostaValida = false;
				}
			}
		}
		
		System.out.println("\nO jogo acabou :(");
		System.out.println("Parabens você obteve " + mec.getPontos() + " pontos!!!");
		scan.close();
	}
	
	public static boolean validaResposta(String parar)
	{
		if(parar.equals("sim") || parar.equals("nao"))
		{
			return true;
		}
		else
		{
			System.out.println("Resposta Invalida");
			return false;
		}
	}
}
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class BancoDePalavras {
	
	private String absolutePath = "C:\\Users\\Sandro\\eclipse-workspace\\JogoDePalavras\\src\\bancoDePalavras.txt";
	
	public String getPalavra() throws IOException
	{
		Random rm = new Random();
		int i;
		String linha = "";
		File arquivo = new File(absolutePath);
		
		
		if(arquivo.exists())
		{
			FileInputStream fluxo = new FileInputStream(arquivo);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			
			for(i=rm.nextInt(95) ; i>=0 ;i--)
			{
				linha = buffer.readLine();
			}
			
			buffer.close();
			leitor.close();
			fluxo.close();
		}
		else
		{
			throw new IOException ("Arquivo inválido");
		}
		
		return linha;	
	}
}

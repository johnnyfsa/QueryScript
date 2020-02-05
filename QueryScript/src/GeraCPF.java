import java.util.ArrayList;

import javax.swing.text.MaskFormatter;

public class GeraCPF {
	
	private ArrayList<Integer> listaAleatoria = new ArrayList<Integer>();
	private ArrayList<Integer> listaNumMultiplicados = null;
	
	public int geraNumAleatorio() 
	{
		int numero = (int) (Math.random()*10);
		return numero;
	}
	
	public ArrayList<Integer> geraCPFParcial() 
	{
		for(int i=0; i<9; i++) 
		{
			listaAleatoria.add(geraNumAleatorio());
		}
		return listaAleatoria;
	}
	public ArrayList<Integer> geraPrimeiroDigito() 
	{
		listaNumMultiplicados = new ArrayList<Integer>();
		int primeiroDigito;
		int totalSum = 0;
		int mod;
		int peso =10;
		//para cada item da lista multiplicamos seu valor pelo peso
		for(int item : listaAleatoria) 
		{
			listaNumMultiplicados.add(item*peso);
			peso--;
		}
		//agora soma tudo que foi multiplicado
		for(int item:listaNumMultiplicados) 
		{
			totalSum += item;
		}
		mod = totalSum % 11;
		//se o resto da divisão por 11 for menor que dois, o primeiro digito será 0 
		if(mod<2) 
		{
			primeiroDigito = 0;
		}
		else
		{
			primeiroDigito = 11-mod;
		}
		listaAleatoria.add(primeiroDigito);
		return listaAleatoria;
	}
	public ArrayList<Integer> geraSegundoDigito()
	{
		listaNumMultiplicados = new ArrayList<Integer>();
		int segundoDigito;
		int totalSum =0;
		int mod;
		int peso = 11;
		//para cada item multiplicamos seu valor pelo peso
		for(int item: listaAleatoria) 
		{
			listaNumMultiplicados.add(item * peso);
			peso--;
		}
		//soma tudo
		for(int item: listaNumMultiplicados) 
		{
			totalSum += item;
		}
		mod = totalSum%11;
		//se o resto da dvisão for menor que 0, o segundo digito será 0, senão será 11 - o resto da divisão
		if(mod <2) 
		{
			segundoDigito = 0;
		}
		else 
		{
			segundoDigito = 11- mod;
		}
		listaAleatoria.add(segundoDigito);
		return listaAleatoria;
	}
	public String geraCPF() 
	{
		geraCPFParcial();
		geraPrimeiroDigito();
		geraSegundoDigito();
		String cpf = "";
		String Texto = "";
		for(int item:listaAleatoria) 
		{
			Texto += item;
		}
		try 
		{
			MaskFormatter mf = new MaskFormatter("###########");
			mf.setValueContainsLiteralCharacters(false);
			cpf = mf.valueToString(Texto);
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		return cpf;
	}
}

import java.time.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeraCPF geraCPF = new GeraCPF();
		int cliente_id;
		int empresa_id;
		String nome_razao;
		String fantasia;
		String email;
		String tipo;
		String cpf;
		String ie ="";
		String telefone = "99999999999";
		String logradouro = "";
		int numero;
		String Bairro = "";
		String Cidade = "";
		String UF = "";
		String CEP;
		int latitude =0;
		int longetude =0;
		int usuario_id;
		String Status = "A";
		
		LocalDateTime test = LocalDateTime.now();//
		System.out.println(test);
	}
	
	static String geraCEP() 
	{
		int digit;
		String CEP = "";
		for(int i=0;i<8;i++) 
		{
			digit = (int) (Math.random()*10);
			CEP+=digit;
		}
		
		return CEP;
	}

}

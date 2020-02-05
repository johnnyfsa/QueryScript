import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GeraCliente {
	
	private DateTimeFormatter format = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss");
	private LocalDateTime agora = LocalDateTime.now();
	
	
	private int cliente_id;
	private int empresa_id =1;
	private String nome_razao;
	private String fantasia;
	private String email;
	private String tipo="'F'";
	private String cpf;
	private String ie ="null";
	private String telefone = "'99999999999'";
	private String logradouro = "null";
	private int numero;
	private String Bairro = "null";
	private String Cidade = "null";
	private String UF = "null";
	private String CEP ="'29810000'";
	private int latitude =0;
	private int longetude =0;
	private int usuario_id;
	private String Status = "'A'";
	private String data_cadastro;
	private String data_atualizacao;
	private int numero_original;
	private String consumidor_final = "'S'";
	private String status_sync = "'TR'";
	private String query = "INSERT INTO t_cliente VALUES ";
	private String aux;
	
	public String gerarQueryCliente() 
	{
		for(int i=141; i<441;i++) 
		{
			GeraCPF geraCPF = new GeraCPF();
			String virgula = ",";
			if(i==440) 
			{
				virgula ="";
			}
			cliente_id =i;
			nome_razao = "'empresa"+i+"'";
			fantasia = "'fantasia" +i+"'";
			email = "'empresa"+i+"@teste.com'";
			cpf = "'"+geraCPF.geraCPF()+"'";
			numero = (int) (Math.random()*1000) +1;
			usuario_id = (int) (Math.random()*7)+1;
			data_cadastro = "'"+agora.format(format)+"'";
			data_atualizacao = "'"+agora.format(format)+"'";
			numero_original = cliente_id;
			aux = "("+cliente_id +", "+ empresa_id +", "+ nome_razao +", "+ fantasia +", "+ email +", "
					+ tipo +", "+ cpf +", "+ ie +", "+ telefone +", "+ logradouro +", "+"'"+ numero+ "'" +", "+
					Bairro +", "+ Cidade +", "+ UF +", "+ CEP +", "+ latitude +", "+longetude+", "+
					usuario_id +", "+ Status +", "+ data_cadastro + ", "+data_atualizacao +", "+
					numero_original +", "+ consumidor_final +", "+ status_sync +")" + virgula;
			query += aux;
		}
		
		return query;
	}
	
}

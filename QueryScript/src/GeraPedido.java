
public class GeraPedido {
	
	private int empresa_id;
	private int vendedor_id;
	private int pedido_id;
	private String tipo;
	private int cliente_id;
	private int cond_pagto_id;
	private int forma_pagto_id;
	private String obs;
	private String data_cadastro;
	private String data_emissao;
	private float total_bruto;
	private float total_liquido;
	private String situacao;
	private String data_sinc_app;
	private int numero_original;
	private String feedback_app;
	private String feedback_server;
	private String data_sinc_server;
	private String data_entrega;
	private String data_atualizacao;
	private String query ="INSERT INTO t_pedido VALUES";
	private String aux;
	
	public String geraPedidoQuery() 
	{
		for(int i=20; i<420;i++) 
		{
			empresa_id =1;
			vendedor_id = i%5+3;
			pedido_id =i;
			tipo = "'PE'";
			cliente_id = geraClienteId();
			cond_pagto_id =1;
			forma_pagto_id =(int)( Math.random()*5)+1;
			obs = "''";
			data_cadastro ="";
			data_emissao = "";
			total_bruto = (float) (Math.random()*10000);
			total_liquido = total_bruto;
			situacao = "'TR'";
			data_sinc_app = "";
			numero_original = pedido_id;
			feedback_app = "NULL";
			feedback_server = "NULL";
			data_sinc_server = "NULL";
			data_entrega = "";
			data_atualizacao = "";
		}
		return query;
	}
	
	public int geraClienteId() 
	{
		int[] clientes = new int[300];
		int id;
		for(int i=0;i<300;i++) 
		{
			clientes[i] = i+141;
		}
		
		int aux =(int) (Math.random()*300);
		id = clientes[aux];
		return id;
	}

}

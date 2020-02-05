public class QueryGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	GeraCliente query = new GeraCliente();	
		
	System.out.println(query.gerarQueryCliente());	
		
		
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

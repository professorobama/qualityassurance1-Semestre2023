package exemplos;

public class ExemploVetor01 {

	public static void main(String[] args) {
		
		String [] nome= {"Jailson", "Rafael", "Carlos","Denis", "Erick", "Daniel"};
		
		int [] numeros= {12,3,5,6,7};
		
		
		
		//System.out.println(nome[0]);
		//System.out.println(nome[1]);
		//System.out.println(nome[0] + " " +  nome[4]);
		//System.out.println(numeros[3]);
		
		nome[3]="Thomaz";
		//System.out.println(nome[3]);
		//System.out.println(nome.length);
		//System.out.println(numeros.length);
		
		
	//	for (int i = 0; i < numeros.length; i++) {
		//	System.out.println(numeros[i]);
		//}
		
		
		boolean [] metas= {false,true,true,false};
		int contador=0;
		for (int i = 0; i < metas.length; i++) {
		if (metas[i] == true) {
			contador=contador+1;
		}	
		}
		System.out.println(contador);
		
	}

}

package Fatorial;

public class Fatorial {
	long total;
	
	public long contar (int n ) {
		if(n == 1) {
			return 1;
		}
		
		System.out.println("Pilha-->" +n);
		
		total = n *contar(n-1);
		
		System.out.println("Desmontagem da pilha-->" +total);
		
		return total;
	}


}

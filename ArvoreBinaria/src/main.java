
public class main {

	public static void main(String[] args) {
		ArvoreBinaria a = new ArvoreBinaria();
		
		//NoArvoreBinaria no5 = a.insere(5, null, null);
		//NoArvoreBinaria no6 = a.insere(6, null, null);
		//NoArvoreBinaria no3 = a.insere(3, no5, no6);
		
		a.insere(1, 
				a.insere(2, 
						null,
						a.insere(4,null, null) 
				),
				a.insere(3,
							a.insere(5, null, null),
							a.insere(6, null, null)
						) 
		);
		
		System.out.println(a);
	}
}

public class ArvoreBinaria {
	
	private NoArvoreBinaria raiz;
	
	public ArvoreBinaria() {
		this.raiz = null;
	}
	
	public NoArvoreBinaria insere(int valor, NoArvoreBinaria sae, NoArvoreBinaria sad) {
		NoArvoreBinaria novo = new NoArvoreBinaria(valor, sae, sad);
		this.raiz = novo;
		return novo;
	}
	
	public boolean pertence(int valor) {
		return pertenceAux(raiz, valor);
	}
	
	private boolean pertenceAux(NoArvoreBinaria no, int valor) {
		if (no==null) return false;
		return ((no.getInfo()==valor) || 
				pertenceAux(no.getSae(),valor) || 
				pertenceAux(no.getSad(), valor));
	}
	
	public String toString() {
		return toStringAux(raiz);
	}
	
	private String toStringAux(NoArvoreBinaria no) {
		String s = "<";
		if (no!=null) {
			s = s+no.getInfo()+toStringAux(no.getSae())+toStringAux(no.getSad());
		}
		s = s + ">";
		return s;
	}

}
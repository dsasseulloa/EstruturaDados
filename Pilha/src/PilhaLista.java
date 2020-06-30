
public class PilhaLista implements Pilha{
	
	private NoLista topo;
	
	public PilhaLista() {
		this.topo = null;
	}

	
	@Override
	public void push(int v) throws Exception{
		NoLista novo = new NoLista();
		
		novo.setInfo(v);
		novo.setProx(topo);
		topo = novo;
	}
	
	@Override
	public int pop() throws Exception{
		if (vazia()) throw new Exception("Erro, pilha vazia");
		else{
			int temp = topo.getInfo();
			topo = topo.getProx();
			return temp;
		}
		
	}
	
	@Override
	public boolean vazia() {
		return (topo == null);
	}
	
	@Override 
	public void reset() {
		topo = null;
	}
	
	@Override
	public String toString() {
		String s = "";
		
		if (vazia())
			return "Pilha vazia.";
		else {
			s = s + "Pilha: ";
			for (NoLista p = topo; p != null; p = p.getProx()) {
				s = s + p.getInfo()+" ";
			}
		}
		return s;
	}


	@Override
	public int top() throws Exception {
		if (vazia()) throw new Exception("Erro, pilha vazia");
		else{
			Integer temp = topo.getInfo();
			return temp;
		}
		
}
}

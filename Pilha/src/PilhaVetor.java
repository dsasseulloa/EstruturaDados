
public class PilhaVetor implements Pilha {

	private int tamanho;
	private int n;
	private int vet[];
	
	
	public PilhaVetor(int tamanho) {
		this.n = 0;
		this.tamanho = tamanho;
		this.vet = new int[tamanho];
	}
	
	@Override
	public void push(int v) throws Exception{
		if (n == tamanho) {
			throw new Exception("A pilha está cheia");
		}else{
			this.vet[n]= v;
			this.n++;
		}
	}
	@Override
	public int pop() throws Exception{
		int temp;
		if (this.n==0) throw new Exception("A pilha está vazia");
		else {
			temp = this.vet[this.n-1];
			this.n--;
		}
		return temp;
	}
	@Override
	public boolean vazia() {
		return (this.n == 0);
	}
	
	@Override
	public void reset() {
		this.n = 0;
	}
	
	public int top () throws Exception {
		if (this.n==0) throw new Exception("A pilha está vazia");
		return this.vet[n-1];
	}
	
	public String toString() {
		String s = "";
		if(vazia()){
			return "A pilha está vazia";
		}
		else {
			s = s + "Pilha: ";
			for (int i = 0; i<this.n; i++) {
				s = s + this.vet[i] + " ";
			}
		}
		return s;
	}
	
	
}

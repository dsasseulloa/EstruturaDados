public class NoArvoreBinaria {
	private int info;
	private NoArvoreBinaria sae;
	private NoArvoreBinaria sad;
	
	public NoArvoreBinaria(int info) {
		this.info = info;
		this.sae = null;
		this.sad = null;
	}
	
	

	public NoArvoreBinaria(int info, NoArvoreBinaria sae, NoArvoreBinaria sad) {
		super();
		this.info = info;
		this.sae = sae;
		this.sad = sad;
	}



	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public NoArvoreBinaria getSae() {
		return sae;
	}

	public void setSae(NoArvoreBinaria sae) {
		this.sae = sae;
	}

	public NoArvoreBinaria getSad() {
		return sad;
	}

	public void setSad(NoArvoreBinaria sad) {
		this.sad = sad;
	}
	
	public String toString() {
		return ""+this.info;
	}

}
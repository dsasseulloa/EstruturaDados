
public class PilhaMain {
	public static void main(String[] args) throws Exception {
		PilhaLista p = new PilhaLista();
		System.out.println(p);

		p.push(2);
		p.push(3);


		System.out.println(p);
		int result = p.pop();
		System.out.println(result);
		System.out.println(p);
		p.push(2);
		p.push(3);
		p.push(2);
		p.push(3);
		p.push(5);
		System.out.println(p);
		System.out.print("O numero do vetor que está no topo é: ");
		System.out.println(p.top());
		p.reset();
		System.out.println(p);	
		
	}
}

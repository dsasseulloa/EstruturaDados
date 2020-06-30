
public interface Pilha {

	void push (int v) throws Exception;
	
	int pop () throws Exception;
	
	boolean vazia();
	
	void reset();
	
	int top () throws Exception;
}

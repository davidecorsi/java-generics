
public class Bottiglia<T extends Bevanda> {
	private T contenuto;
	
	public Bottiglia(T t) {
		contenuto = t;
	}
	
	public T getContenuto() {
		return contenuto;
	}
}

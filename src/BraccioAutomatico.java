
public class BraccioAutomatico {
	public void prendiBottiglia(Bottiglia<? extends Bevanda> bottiglia) {
		System.out.println("Ho preso" + bottiglia.getContenuto());
	}
}

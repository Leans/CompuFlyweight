
public class Demo {

	public static void main(String[] args) {

		Compu compu1 = CompuFactory.crearCompu("Lenovo", "i3");
		Compu compu2 = CompuFactory.crearCompu("Dell", "i3");
		Compu compu3 = CompuFactory.crearCompu("HP", "i3");
		Compu compu4 = CompuFactory.crearCompu("Lenovo", "i5");
		Compu compu5 = CompuFactory.crearCompu("Dell", "i5");
		Compu compu6 = CompuFactory.crearCompu("HP", "i5");
		Compu compu7 = CompuFactory.crearCompu("Lenovo", "i7");
		Compu compu8 = CompuFactory.crearCompu("Dell", "i7");
		Compu compu9 = CompuFactory.crearCompu("HP", "i7");
	}
}

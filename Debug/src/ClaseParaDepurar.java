
public class ClaseParaDepurar {
	public static double echaCuentas(int[] l) {
		double suma = 0.0;
		for (int i = 0; i < l.length; i++) {
			l[i] = i;
		}

		for (int i = 0; i < l.length; i++) {
			suma = suma + l[i];
		}
		return suma;
	}
}

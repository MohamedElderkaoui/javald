
import java.util.*;
public class L {
  public static int entero(String texto) {
	  Scanner l = new Scanner(System.in);
	  int valor;
	  System.out.println(texto);
	  valor=l.nextInt();
	  return valor;
	  
}
  public static Double reeal(String texto) {
	  Scanner l = new Scanner(System.in);
	  Double valor;
	  System.out.println(texto);
	  valor=l.nextDouble();
	  return valor;
	  
}  public static float real(String texto) {
	  Scanner l = new Scanner(System.in);
	  float valor;
	  System.out.println(texto);
	  valor=l.nextFloat();
	  return valor;
	  
}
  public static String caderna(String texto) {
	  Scanner l = new Scanner(System.in);
	  String valor;
	  System.out.println(texto);
	  valor=l.nextLine();
	  return valor;
	  
}
}

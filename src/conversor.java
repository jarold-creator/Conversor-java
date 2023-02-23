import javax.swing.JOptionPane;

public class conversor {

	public static void main(String[] args) {
		
		String[] opciones = {"Conversor de moneda ", "Conversor de temperatura"};
		
		String opcionSeleccionado = (String) JOptionPane.showInputDialog(null, "seleccione una opcion", 
				"Titulo del dialogo", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		
		System.out.println(opcionSeleccionado);
		
	}
}

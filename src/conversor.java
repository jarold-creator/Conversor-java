import javax.swing.JOptionPane;

public class conversor {

	public static void main(String[] args) {
		
		String[] opciones = {"", "Conversor de moneda ", "Conversor de temperatura"};
		String[] opcionesConversion = {"", "De pesos a dolar", "De pesos a euro", "De pesos a libras",
		"De pesos a yen", "De pesos a won coreano", "De dolar a pesos", "De euro a pesos", "De libras a pesos",
		"De yen a pesos", "De won coreano a pesos"
		};
		
		String opcionSeleccionado = (String) JOptionPane.showInputDialog(null, "seleccione una opcion", 
				"Titulo del dialogo", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		
				
		String opcionesConversion1 = (String) JOptionPane.showInputDialog(null, "Opcion de conversion", 
				"Titulo del dialogo", JOptionPane.QUESTION_MESSAGE, null, opcionesConversion, opcionesConversion[0]);
		
		System.out.println(opcionSeleccionado);	
		System.out.println(opcionesConversion1);	
		
	}
}

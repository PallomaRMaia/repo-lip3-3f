import javax.swing.JOptionPane;

public class ResultadoAluno {

	public static void main(String[] args) {
		/*
		 * Se a m�dia for maior que 6.0 exibir aprovado, 
		 * sen�o exibir Reprovado*/

		double media = Double.parseDouble(JOptionPane.showInputDialog(null, "M�dia"));
		
				if(media >= 6.0) {
					JOptionPane.showMessageDialog(null, "Aprovado");
				} else if (media < 6.0){
					JOptionPane.showMessageDialog(null, "Reprovado");
					}
		
				
				
	}
	

}

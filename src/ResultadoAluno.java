import javax.swing.JOptionPane;

public class ResultadoAluno {

	public static void main(String[] args) {
		/*
		 * Se a média for maior que 6.0 exibir aprovado, 
		 * senão exibir Reprovado*/

		double media = Double.parseDouble(JOptionPane.showInputDialog(null, "Média"));
		
				if(media >= 6.0) {
					JOptionPane.showMessageDialog(null, "Aprovado");
				} else if (media < 6.0){
					JOptionPane.showMessageDialog(null, "Reprovado");
					}
		
				
				
	}
	

}

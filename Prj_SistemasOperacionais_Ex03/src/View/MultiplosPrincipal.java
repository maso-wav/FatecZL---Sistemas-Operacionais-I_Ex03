package View;

import Controller.MultiplosController;
import javax.swing.JOptionPane;

public class MultiplosPrincipal {
    
    public static void main (String args[]){
        
        MultiplosController mc = new MultiplosController();
        
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("INSIRA O TAMANHO DESEJADO PARA O VETOR."));
        int[] vetorNaturais = new int [tamanho];
        
        for(int i = 0; i < tamanho; i++){
            
            vetorNaturais[i] = Integer.parseInt(JOptionPane.showInputDialog("INSIRA O " + (i + 1) + "° VALOR DO VETOR."));
        }
        
        mc.mostraPares(vetorNaturais);
    }
    
}

package Controller;

public class MultiplosController {
    
    public MultiplosController(){
        
        super();
    }
    
    public void mostraPares(int[] vetNaturais){        
        
        for(int i: vetNaturais){
            
            if(i %2 != 0){
                
                System.out.println("O NÚMERO " + i + " É IMPAR.");
                
            } else if(i %10 == 0){
                
                System.out.println("O NÚMERO " + i + " É PAR E MÚLTIPLO DE 10.");
            }
        }
    }
}

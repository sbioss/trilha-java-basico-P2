import java.util.InputMismatchException;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args)   {
        System.out.println("Essa e uma pequena calculadora, que tem como parametro pegar dois numeros e subtrair, e informar quais sao todos os numeros exitente dentro dela.");
        retorno();
    }           
    static void retorno() {
        
        confirmacao();
        
    }                                     
        
        
        public static void confirmacao( ){
            try {
                Scanner scanner = new Scanner(System.in);
                    System.out.println("Digiti o primeiro numero ");
                        int numero1 = scanner.nextInt();
                
                    System.out.println("Digiti o segunto numero");
                        int numero2 = scanner.nextInt();         
               
                    if(numero1 < numero2){
                        int numero = numero2 - numero1;
                            impressao(numero);}
                    else if (numero1 >= numero2){
                        System.out.println("O segundo numero tem que ser maior que o segundo numero!");
                        retorno();
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Coloque somente numeros");
                 retorno();
                
            }                     
        }
        static void impressao(int numero){
             System.out.println("Imprimindo todos os numero ate chegar no numero " + numero);
            for(int x = 0; x < numero; x++){
                
                System.out.println(x+1);}
            }

        }
    
      
       
    

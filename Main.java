import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
        String CP;
        
         
        System.out.println("Digite seu texto aqui:");
        String texto = entrada.nextLine();
        System.out.println("Digite sua chave aqui:");
        int chave = entrada.nextInt();
         
        int i = args.length;
        if ( i <= 0) { 
            System.out.println("N�o foi informado uma chave" );
        }
         
        if (i == 1) {
             
            CP = criptografa ( texto, chave);
            System.out.printf("\nTexto criptografado:\n");
            System.out.printf("%s", CP);
         
        } 
         
        if (i > 1) {
            System.out.println("Voc� digitou dois numeros");
            }
	}
      			
        
        
        public static String criptografa(String texto, int chave) {
            int i, n = texto.length();
            String saux = "";
   
            for (i=0; i<n; i++) {
              saux = saux + (char)(texto.charAt(i) + chave);
            }
            return(saux);
        }

              }
	


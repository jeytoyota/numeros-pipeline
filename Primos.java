
public class Primos {
	
	public static void main(String[] args) {    
        for (int i = 2; i <= 200; i++) {
            if( ehPrimo(i) )
                System.out.println(i + " e primo.");
        }    
    }
 
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }

}

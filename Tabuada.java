public class Tabuada{
    
    public static void main (String[] args){
		for (int numeros = 1; numeros<=10; numeros++){
			for (int x = 1; x<=10; x++){
				System.out.printf ("%d x %d = %d\n", numeros, x, numeros * x);
			}
		}
    }
}
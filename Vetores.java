import java.util.Random;
import java.util.Scanner;

public class Vetores {
    public static Scanner teclado;
    public static int[] vetor;

    public static void sortear(){
        Random gerador = new Random();
        vetor = new int [20];
        for(int i =0; i < vetor.length; i++){
            vetor[i] = gerador.nextInt(100) + 1;
        }
    }
    public static int procurar(int n){
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == n){
            return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        sortear();
        teclado = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int num = teclado.nextInt();
        int pos = procurar(num);
        if(pos >= 0){
            System.out.printf("Numero encontrados na posição %d", pos); 
        } else{
            System.out.printf("Numero não encontrado");
        }
        teclado.close();
    } 
}

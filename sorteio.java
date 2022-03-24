import java.util.Random;

public class sorteio
{
    public static void main(String[] args)
    {
        Random gerador = new Random();
        int c = 1;
        int soma = 0;
        int maior = 0;
        int menor = 100;
        // float media = 0;
        
        while(c <= 1000){
            int n = 1 + gerador.nextInt(100);
            if (n < menor){
                menor = n;
            }
            if (n > maior){
                maior = n;
            }
            c++;
            System.out.println(n);

            
            soma += n;
            // media = soma / 1000;

            System.out.println("O menor numero é:" + menor);
            System.out.println("O maior numero é:" + maior);
            System.out.println("A soma dos numeor:" + soma);
            System.out.println("A media é:" + soma /1000f);  
        }
    }    

}
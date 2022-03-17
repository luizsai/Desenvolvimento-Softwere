import java.util.Scanner;

public class Calendario 
{
    //Funções e procedimentos
    public static String mostrarNomeMesIf(int mes){
        String nomeMes = "";
        if(mes==1){
            nomeMes = "Janeiro";
        } if(mes==2){
            nomeMes = "Fevereiro";
        } if(mes==3){
            nomeMes = "Março";
        } if(mes==4){
            nomeMes = "Abril";
        } if(mes==5){
            nomeMes = "Maio";
        } if(mes==6){
            nomeMes = "Junho";
        } if(mes==7){
            nomeMes = "Julho";
        } if(mes==8){
            nomeMes = "Agosto";
        } if(mes==9){
            nomeMes = "Setembro";
        } if(mes==10){
            nomeMes = "Outubro";
        } if(mes==11){
            nomeMes = "Novembro";
        } if(mes==12){
            nomeMes = "Dezembro";
        } if(mes>= 13){
            nomeMes = "Mes Inesistente";
        } if(mes<= 0){
            nomeMes = "Mes Inesistente";
        }
        return nomeMes;
    }
    
    public static String mostrarNomeMesSwitch(int mes){
        String nomeMes = "Digite um mes valido";
        switch(mes) {
            case 1:
                nomeMes = "Janeiro"; 
                break;

            case 2:
                nomeMes = "Fevereiro"; 
                break;

            case 3:
                nomeMes = "Março"; 
                break;
            case 4:
                nomeMes = "Abril"; 
                break;
            case 5:
                nomeMes = "Maio"; 
                break;
            case 6:
                nomeMes = "Junho"; 
                break;
            case 7:
                nomeMes = "Julho"; 
                break;
            case 8:
                nomeMes = "Agosto"; 
                break;
            case 9:
                nomeMes = "Setembro"; 
                break;
            case 10:
                nomeMes = "Outubro"; 
                break;
            case 11:
                nomeMes = "Novembro "; 
                break;
            case 12:
                nomeMes = "Dezembro "; 
            break;            
        }
        return nomeMes;
    }

    // Função pricipal
    public static void main(String[] args)
    {
        //mostrar uma mensagem para o usuario
        System.out.println("Digite o mes:");
        

        //ler um numero digitado 
        Scanner input = new Scanner(System.in);//contrutor da class
                
        //mostrar nome do mes   
        // usando IF 
        // usando Switch 
        int mes = input.nextInt();
        System.out.println("Numero digitado =  " + mostrarNomeMesIf(mes));
        System.out.println("Numero digitado =  " + mostrarNomeMesSwitch(mes));

        input.close();
    }
}
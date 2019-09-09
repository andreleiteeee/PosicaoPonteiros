
package posicaoponteiros;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
/*Classes utilizadas no projeto:
*Scanner - Para a entrada de dados no modo console, podendo converter textos para objetos do tipo String.
*Calendar - Utilizada para manipular data e hora.
*GregorianCalendar - Como a classe acima não pode ser instanciada, utilizamos a Gregorian para manipular datas.
*/

public class PosicaoPonteiros 
{


    public static void main(String[] args) 
    {
      
        Scanner sc = new Scanner(System.in);
        int h = 0;
        int m = 0;
        boolean erro;
        /*Variaveis utilizadas na resolução do problema, 'h' como Hora,'m' como Minuto e 'erro' para condicionar a 
        *entrada dos dados e verificar se há alguma inconsistencia.
        */         
            
        do{
            System.out.print("Digite hora e minuto no formato (HH:MM): ");
            String schedule = sc.next();
            String[] horaMinuto = schedule.split(":");
            /*Capturada a string com o 'next' e usado o 'split' como um separador, sendo utilizado a pontuação':'
            *retornando um array. 
            */
            h = Integer.parseInt(horaMinuto[0]);
            m = Integer.parseInt(horaMinuto[1]);    
            erro = false;
            /*Transforma a string dentro do array em inteiro.
            */
            if (h < 0 || h > 12 )
            {
                erro = true;
                System.out.println("Informe uma hora válida(de 0 à 12)");
            } else if(m < 0 || m >= 60)
            {
                erro = true;
                System.out.println("Informe um minuto válido(de 0 à 59)");
            }   
            /*Criado uma condiçao para verificar se o usuario informou um dado correto.
            */
        }while(erro);
        
           GregorianCalendar c = new GregorianCalendar();
           c.set(Calendar.HOUR, h);
           c.set(Calendar.MINUTE, m);   
           /* Instanciada a classe GregorianCalendar e manipulado a hora e minuto.
           */
           CalculoDeAngulo calc = new CalculoDeAngulo();
           long dif = calc.CalculoDoAngulo(c);
           
            
        System.out.println("A diferença do ponteiro entre a hora e o minuto é: "+ dif);
        /*instanciada a classe feita para realizar o calculo do angulo entre os ponteiros e
        * impresso na tela o resultado.
        */
    }
}

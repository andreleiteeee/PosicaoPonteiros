
package posicaoponteiros;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class CalculoDeAngulo 
{
    

    public long CalculoDoAngulo(GregorianCalendar hora)
    {
        double h = hora.get(Calendar.HOUR);
        double m = hora.get(Calendar.MINUTE);
        /*Atribuido valor as variáveis com o metodo calendar.
        */
        double horas = h == 12 ? 0:h;
        /* Criada um operador ternário para informar ao programa que 12 é igual a 0.
        */
        long angle = Math.round(Math.abs(((60* horas ) - (11*m)) /2)) ;
        /*Utilizado 'abs' para resgatar o valor absoluto da expressão matemática e o 'round' para arredondamento do
        *resultado dos valores.
        *A conta foi retirada de uma formula ja existente para o calculo entre os angulos dos ponteiros.
        */
        return Math.min(360 - angle, angle);
        /*Calculo feito e utilizado o 'min' para retornar o menor valor passado como parâmetro.
        */
    }
}
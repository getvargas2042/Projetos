//Dados os valores do Alcool e da Gasolina, descubra qual é o melhor, sabendo que a gasolina é 70% mais performática
/**
   Valor Gasolina * 0,7
   se menor que o Valor Alcool
        Gasolina é melhor
   se não, 
        Alcool é melhor
   **/
public class CalculoCombustivel
{
    public static void main (String[] args){
        double valorAlcool = 4.80;
        double valorGasolina = 2.40;
        double resultadoGasolina = valorGasolina * 0.7;
        double resultadoAlcool = valorAlcool * 0.7;
        
        if(resultadoGasolina > resultadoAlcool){
            System.out.println("Usar Gasolina");
        }
        else{
            System.out.println("Usar Alcool");
        }
 
    }
}   
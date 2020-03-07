
//PrimeiraAula

/*******SEGUIR EXPLICAÇÕES E EXEMPLOS ABAIXO*******
 * float >>> double
 * char >>> char(um caracter apenas) e String (usado como char em C) 
 * int >>> int
 * boolean >>> true or false
 */
public class OlaMundoJava
{
    public static void main (String[] args){
        
        double valorSalario = 1000.00; //valores decimais
        int numeroDependente = 5; // valores inteiros
        String nomeCidade = "Gotham"; // valores string
        char letra = 'B'; //valores caracte
        boolean temSaldo = true;// true or false
        
        double valor1 = 10.20;
        double valor2 = 30.20;
        double soma = valor1 + valor2;
         
         if(soma>100){
             System.out.println("A soma é: " +valor1+ "mais" +valor2+ "é maior que 100");
         }
         else{
         System.out.println("A soma é: " +valor1+ " mais " +valor2+ " é menor que 100");
         }
         
         for(int i=0; i<0; i++){
             System.out.println(i);
         }
         
    }
}       
/** 
 * Link utilizado p/ orientação na Lógica 
 * https://dicasdeprogramacao.com.br/algoritmo-para-validar-cpf/ **/

public class ValidarCPF{
    int n1;     int n7;     int soma2;
    int n2;     int n8;     int resto1;
    int n3;     int n9;     int resto2;
    int n4;     int n10;    int conta1;
    int n5;     int n11;    int conta2;
    int n6;     int soma1;  
    public static void main (String[] args){
    ValidarCPF cpf = new ValidarCPF();
    //exemplo valido "529.982.247-25"
    //exemplo invalda "777.777.777-77"
    cpf.n1 = 2; cpf.n7 = 3;
    cpf.n2 = 0; cpf.n8 = 0;
    cpf.n3 = 4; cpf.n9 = 8;
    cpf.n4 = 1; cpf.n10 = 0;
    cpf.n5 = 7; cpf.n11 = 3;
    cpf.n6 = 5;
    
    cpf.soma1 = (cpf.n1*10)+(cpf.n2*9)+(cpf.n3*8)+(cpf.n4*7)+(cpf.n5*6)+(cpf.n6*5)+(cpf.n7*4)+(cpf.n8*3)+(cpf.n9*2);
    System.out.println("Resultado Soma1: " +cpf.soma1);
    
    cpf.resto1 = cpf.soma1 * 10 % 11;
    System.out.println("Resultado Resto1: " +cpf.resto1);
    
    cpf.soma2 = (cpf.n1*11)+(cpf.n2*10)+(cpf.n3*9)+(cpf.n4*8)+(cpf.n5*7)+(cpf.n6*6)+(cpf.n7*5)+(cpf.n8*4)+(cpf.n9*3)+(cpf.n10*2);
    System.out.println("Resultado Soma2: " +cpf.soma2);
    
    cpf.resto2 = cpf.soma2 * 10 %11;
    System.out.println("Resultado Resto2: " +cpf.resto2);
    
    if(cpf.resto1 == cpf.n10 && cpf.resto2 == cpf.n11){
        System.out.print("CPF: "+cpf.n1+cpf.n2+cpf.n3+"."+cpf.n4+cpf.n5+cpf.n6+"."+cpf.n7+cpf.n8+cpf.n9+"-"+cpf.n10+cpf.n11);
        System.out.print("\nCPF Válido");
    } else if(cpf.resto1 != cpf.n10 && cpf.resto2 != cpf.n11){
        System.out.print("CPF: "+cpf.n1+cpf.n2+cpf.n3+"."+cpf.n4+cpf.n5+cpf.n6+"."+cpf.n7+cpf.n8+cpf.n9+"-"+cpf.n10+cpf.n11);
        System.out.println("\nCPF Inválido");
    }
}
}
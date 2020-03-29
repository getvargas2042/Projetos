public class CalculoIMC{
    double valorResultado;
    double peso;
    double altura;
public static void main (String[] args){
    CalculoIMC pessoa = new CalculoIMC(); //instancia
    
    pessoa.peso = 55.600;
    pessoa.altura = 1.70;
    pessoa.valorResultado = pessoa.peso / (pessoa.altura * pessoa.altura);
    pessoa.valorResultado = pessoa.valorResultado;
    
        if(pessoa.valorResultado < 18.5){
        System.out.println("Deficit de massa Corporal && Baixo(com risco de outras doenças) ");
} 

    else if(pessoa.valorResultado > 18.5 && pessoa.valorResultado < 24.9){
        System.out.println("Massa Corporal Normal && Normal ");
} 

    else if(pessoa.valorResultado > 24.9 && pessoa.valorResultado < 29.9){
        System.out.println("Sobrepeso && Elevado ");
} 

    else if(pessoa.valorResultado > 29.9 && pessoa.valorResultado < 34.9){
        System.out.println("Obesidade Leve && Alto ");
} 

    else if(pessoa.valorResultado > 34.9 && pessoa.valorResultado < 39.9){
        System.out.println("Obesidade Media && Muito Alto ");
} 

    else if(pessoa.valorResultado >= 40){
        System.out.println("Obesidade Morbida && Iminente ");
}
}
}
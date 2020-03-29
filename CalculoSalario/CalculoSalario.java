public class CalculoSalario{
    double salarioBruto;
    double descontoINSS;
    double descontoIR;
    double salarioLiquido;
    double IR;
    double INSS;
    int numeroDependentes;
    double salarioHora;
    int horasTrabalhadas;
    
public static void main (String[] args){
    CalculoSalario func = new CalculoSalario();
    
    func.horasTrabalhadas = 100;
    func.numeroDependentes = 0;
    func.salarioHora = 10.00;
    func.salarioBruto = ((func.horasTrabalhadas * func.salarioHora) + (50 * func.numeroDependentes));
    
    System.out.println("Salario Bruto: " + func.salarioBruto);
    
    if(func.salarioBruto <= 1000){
        func.INSS = func.salarioBruto * 8.5/100;
        System.out.println("Valor do INSS: " + func.INSS);
    } 
    else if(func.salarioBruto > 1000){
        func.INSS = func.salarioBruto * 9/100;
        System.out.println("Valor do INSS: " + func.INSS);
    }
    
    if(func.salarioBruto <= 500){
        func.IR = func.salarioBruto;
        System.out.println("Valor do IR: " + func.IR);
    }
    else if(func.salarioBruto > 500 && func.salarioBruto <= 1000){
        func.IR = func.salarioBruto * 5/100;
        System.out.println("Valor do IR: " + func.IR);
    }
    else if(func.salarioBruto > 1000){
        func.IR = func.salarioBruto * 7/100;
        System.out.println("Valor do IR: " + func.IR);
    }
   
    func.salarioLiquido = func.salarioBruto - func.INSS - func.IR;
    System.out.println("Salario Liquido: " + func.salarioLiquido);
}
}
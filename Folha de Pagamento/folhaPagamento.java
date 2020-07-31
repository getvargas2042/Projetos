public class folhaPagamento{
    String nome;
    double horasTrabalhadas;
    int numDependentes;
    double salarioHora;
    double descontoINSS;
    double descontoIR;
    
    public folhaPagamento(String nome, double horasTrabalhadas, int numDependentes, int salarioHora){
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.numDependentes = numDependentes;
        this.salarioHora = salarioHora;
    }
    
    public double calculoBruto(){
        return this.horasTrabalhadas * this.salarioHora + (50 * this.numDependentes);
    }
    
    public double calculoINSS(){
        if(calculoBruto() <= 1000){
            this.descontoINSS = this.calculoBruto() * 8.5/100;
        }
        else if(calculoBruto() > 1000){
            this.descontoINSS = this.calculoBruto() * 9/100;   
        }
        return this.descontoINSS;
    }
    
    public double calculoIR(){
        if(calculoBruto() <= 500){
            this.descontoIR = 0;
        }
        else if(calculoBruto() > 500 && calculoBruto() <= 1000){
            this.descontoIR = this.calculoBruto() * 5/100;
        }
        else if(calculoBruto() > 1000){
            this.descontoIR = this.calculoBruto() * 7/100;
        }
        return this.descontoIR;
    }
    
    public double calculoLiquido(){
        return calculoBruto() - calculoINSS() - calculoIR();
    }
}
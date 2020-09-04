public class Conta{
    double saldo;
    double saque;
    Cliente cliente;
    public Conta(){
        this.saldo = 20000.0;
    }
    
    public void saque(double valorSaque){
        if(this.saldo >= valorSaque){
            this.saldo = this.saldo - valorSaque;
        }
    }
    
    public void deposito(double valorDeposito){
        this.saldo = this.saldo + valorDeposito;
    }
    
    public double pegaSaldo(){
        return this.saldo;
    }
    
    public void exibirSaldo(){
        System.out.println("R$" + this.saldo);
    }
    
    public void transferencia(Conta c, double v){
        this.saque(v);
        c.deposito(v);
    }
}
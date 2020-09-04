public class Banco{
    Conta[] contas = new Conta[10];
    
    public double totalSaldoContas(){
        double saldoTotal = 0.0;
        for(int i=0; i<10; i++){
            if(contas[i] != null){
                saldoTotal += contas[i].pegaSaldo();
            }
        }
        return saldoTotal;
    }
    
    public int totalContasCadastradas(){
        int totContas = 0;
        for(int i=0; i < 10; i++){
            if(contas[i] != null){
                totContas++;
            }
        }
        return totContas;
    }
}

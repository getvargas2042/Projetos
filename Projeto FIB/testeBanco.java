public class testeBanco{
    public static void main(String[] args){   
        // Cria banco
        Banco banco1 = new Banco();
       
        // Cria cliente
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Lucas";
        Cliente cliente2 = new Cliente();
        cliente2.nome = "Alves";
        
        // Cria conta
        Conta c = new Conta();
        c.deposito(1000);
        Conta c2 = new Conta();
        c2.deposito(1000);
        
        // Atribui conta ao banco
        banco1.contas[0] = c;
        banco1.contas[1] = c2;
       
        // Teste métodos
        int totconta = 0;
        totconta = banco1.totalContasCadastradas();
        System.out.println("Total Conta: " + totconta);
       
        double totsaldo = 0.0;
        totsaldo = banco1.totalSaldoContas();
        System.out.println("Total Saldo: " + totsaldo);
    }
}

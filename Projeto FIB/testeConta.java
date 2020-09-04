public class testeConta{
    public static void main(String[] args){
        Cliente cliente1 = new Cliente();
        cliente1.numeroConta = 1001;
        cliente1.nome = "Lucas";
        cliente1.endereco = "Bauru";
        cliente1.cpf = "555.166.479-16";
        
        Conta c = new Conta();
        c.exibirSaldo();
    }
}
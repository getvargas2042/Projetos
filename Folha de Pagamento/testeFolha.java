public class testeFolha{
    public static void main(String[] args){
        //Criar Funcionario
        
        folhaPagamento funcionario = new folhaPagamento("Lucas",30,1,80);
        
        System.out.println("Salario Bruto: "+funcionario.calculoBruto());
        System.out.println("Desconto do INSS: "+funcionario.calculoINSS());
        System.out.println("Desconto do IR:"+funcionario.calculoIR());
        System.out.println("Salario Liquido: "+funcionario.calculoLiquido());
    }
}
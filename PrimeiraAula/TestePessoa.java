public class TestePessoa{
    public static void main(String[] args){
        
        //int x=10;
        //System.out.println(x);
        
        Pessoa p1 = new Pessoa();
        p1.nome = "Lucas";
        p1.idade = 19;
        System.out.println(p1.nome);
        System.out.println(p1.idade);
        
        //Pessoa p = new Pessoa();
        //System.out.println(p);
        
        Pessoa p2 = new Pessoa();
        p2.nome = "Alves";
        p2.idade = 19;
        System.out.println(p2.nome);
        System.out.println(p2.idade);
        
        //Perde a referência
        p1 = p2;
        
        System.out.println(p1.nome + ":" + p1.idade);
        System.out.println(p2.nome + ":" + p2.idade);
    }
}

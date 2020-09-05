public class Pessoa
{
    private String nome;
    private String email;
    private String telefone;
    
    Pessoa(String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
    public String Nome(){
        return nome;
    }
    public String Email(){
        return email;
    }
    public String Telefone(){
        return telefone;
    }
}
public class Agenda
{
    private String pessoa;
    
    Agenda(){
        Pessoa[] pessoa = new Pessoa[10];
    }
    
    public void guardarPessoa(Pessoa pessoa){
        for(int i=1; x <=10;i++){
                pessoa[i] = this.pessoa;    
        }
    }

    public void removerPessoa(){

    }

    public double buscarPessoa(String nome){
        for(int i=1; i<=10; i++){
            if(pessoa[i] != null && pessoa[i].Nome() = this.nome){
                return this.Nome();
            }
        }   
    }
    public void imprimirAgenda(){
        for(int i=1; i<=10; i++){
            if(pessoa[x] != null){
                System.out.println("Nome: " + pessoa[i].Nome());
                System.out.println("Email: " + pessoa[i].Email());
                System.out.println("Telefone: " + pessoa[i].Telefone());
            }
        }

    }
}
public class Elevador
{
    private int atual;
    private int totalAndar;
    private int maxElevador;
    private int maxPessoa;
        
    
    Elevador(){
        this.atual = 0;
        this.totalAndar = 20;
        this.maxElevador = 8;
        this.maxPessoa = 0;
       
    }
    public void acrescentarPessoa(int maxPessoa){
            if(maxPessoa <= maxElevador){
                this.maxPessoa = this.maxPessoa +1;
            }
        
    }
    public int removerPessoa(int maxPessoa){
            if(maxPessoa <= maxElevador){
                maxPessoa = maxPessoa - 1;
            }
        
        return this.maxPessoa;
    }
    public void subirAndar(int atual){
            if(atual < totalAndar && atual >= 0){
                atual = atual + 1;
            }
        
    }
    public void descerAndar(int atual){
            if(atual <= totalAndar && atual > 0){
                atual = atual -1;
            }
        
    }
}

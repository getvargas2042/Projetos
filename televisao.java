public class Televisao
{
   boolean ligado;
   
   public Televisao(){}
   
   public void ligarTelevisao(){
       ligado = true;
    }
   public void desligarTelevisao(){
       ligado = false;
    } 
}

public class Controle
{
    int canal=0;
    int volume=0;
    Televisao televisao;
    int televisao;
    public Controle(Televisao televisao){
    	this.televisao = new Televisao();
    }
    
    public int aumentarVolume(){
        if(volume >= 0 && volume <= 100){
        return this.volume+1;
    }
    return this.volume;
    }
    public int diminuirVolume(){
        if(volume > 0 && volume <= 100){
        return volume-1;
    }
    return volume;
    }
    public int aumentarCanal(){
        return canal+1;
    }
    public int diminuirCanal(){
        return canal-1;
    }
    public int consultarSom(){
        return volume;
    }
    public int consultarCanal(){
        return canal;
    }
}
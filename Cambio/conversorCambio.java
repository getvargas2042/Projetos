public class conversorCambio{
    double valorReal;
    
    public conversorCambio(double real){
        this.valorReal = real;
    }
    
    public double converterDolar(){
        return this.valorReal * 5.22;
    }
    
    public double converterEuro(){
        return this.valorReal * 6.15;
    }
    
    public double converterLibra(){
        return this.valorReal * 6.83;
    }
    
    public static void main(String[] args){
        conversorCambio cambio1 = new conversorCambio(1);
        System.out.println("R$1 para Dolar: "+cambio1.converterDolar());
        
        conversorCambio cambio2 = new conversorCambio(1);
        System.out.println("R$1 para Euro: "+cambio1.converterEuro());
        
        conversorCambio cambio3 = new conversorCambio(1);
        System.out.println("R$1 para Libra: "+cambio1.converterLibra());
    }
}



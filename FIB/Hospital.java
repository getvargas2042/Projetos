public class Hospital
{
    String[] medicos = new String[10];
    String[] pacientes = new String[10];
    String endereco;
    int leitos;
    
    public double taxaOcupacao() {
        int lo = 0;
        for(int i=0; i < pacientes.length; i++) {
            if(pacientes[i] != null) {
                lo = lo + 1;
            }
        }
        return 100 * lo /this.leitos;
    }
}

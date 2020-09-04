public class testeCovid
{
       public static void main(String[] args){
           Hospital hospital1 = new Hospital();
           hospital1.endereco = "Hospital Estadual";
           hospital1.leitos = 10;
           hospital1.pacientes[0] = new Paciente();
           hospital1.pacientes[0] = "Brasília";
           
           hospital1.pacientes[1] = new Paciente();
           hospital1.pacientes[1] = "Bruce";
           
           System.out.println(hospital1.taxaOcupacao());
           
           // divisor de hospitais
           
           Hospital hospital2 = new Hospital();
           hospital2.endereco = "Beneficiencia Portuguesa";
           hospital2.leitos = 10;
           hospital1.pacientes[0] = new Paciente();
           hospital2.pacientes[0] = "Alves";
           
           hospital1.pacientes[1] = new Paciente();
           hospital2.pacientes[1] = "Damian";
           
           System.out.println(hospital2.taxaOcupacao());
}
}
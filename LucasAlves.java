/*
* Classe Pessoa
*/

public class Pessoa {

    private String nome;
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {   
        return this.nome;   }
    
    public void setNome(String nome) {
        this.nome = nome;   }
    
    public String getDados() {   
        return this.nome;   }
}

/*
* Classe Eleitor
*/

public class Eleitor extends Pessoa implements Votacao {
    private String titulo;
    private boolean votou;

    public Eleitor(String nome, String titulo) {
        super(nome);
        this.titulo = titulo;
        this.votou = false;
    }
    
    public String getTitulo() {   
        return titulo; 
    }

    public void setTitulo(String titulo) {   
        this.titulo = titulo;   
    }
    
    public String getNome() {   
        return super.getNome();   
    }

    public void setNome(String nome) {   
        super.setNome(nome);   
    }

    public boolean votou() {   
        return this.votou;  
    }

    public boolean votar() {
        this.votou = true;
        return votou;
    }
    
    public String getDados() {
        String dados = "Nome: "+super.getDados() +"\n"
                     + "Titulo: "+this.getTitulo() +"\n";
        return dados;
    }
}

/*
* Classe Candidato
*/

import interfaces.VotacaoCandidato;
public class Candidato implements VotacaoCandidato {

    private int numero;
    private int votos;
    private String cargo;
    private Eleitor eleitor; 

    
    public Candidato(String nome, String titulo, String cargo, int numero, int votos) {
        this.eleitor = new Eleitor(nome,titulo);
        this.cargo = cargo;
        this.numero = numero;
        this.votos = votos;
    }
    
    public Candidato(String nome, String titulo, String cargo, int numero, int votos) {
        this(nome, titulo, cargo, numero, votos);
    }
    
    public int getNumero() {   
        return numero;  
    }

    public void setNumero(int numero) {   
        this.numero = numero;   
    }

    public String getCargo() {   
        return cargo;   
    }

    public void setCargo(String cargo) {   
        this.cargo = cargo; 
    }
    
    public Eleitor getEleitor() {   
        return eleitor; }

    public int getVotos() {   
        return votos;  
    }

    public boolean receberVoto() {   
        boolean votou = false;
        int aux = votos;
        this.votos++;
        votou = votos > aux;
        return votou;
    }
}

/*
* Classe Votação Candidato
*/

public interface VotacaoCandidato {
    
    public boolean receberVoto();
    public int getVotos();
}

/*
* Classe Votação
*/

public interface Votacao {

    public boolean votar();   
    public boolean votou();
}

/*
* Classe TesteUrna
*/


package bim1;
public class Medico {
    protected int CRM;
    protected String nome;
    protected double vlrConsulta;
    protected String Medico[] = new String[10];

    public Medico(int CRM, String nome, double vlrConsulta) {
        this.CRM = CRM;
        this.nome = nome;
        this.vlrConsulta = vlrConsulta;
        
    }
    
    public double totalConsulta(int tempo){
        return vlrConsulta*tempo;
        
    }

    public int getCRM() {
        return CRM;
    }

   

    public String getNome() {
        return nome;
    }

    
    

    public double getVlrConsulta() {
        return vlrConsulta;
    }

    public void setVlrConsulta(double vlrConsulta) {
        this.vlrConsulta = vlrConsulta;
    }

 
    
}

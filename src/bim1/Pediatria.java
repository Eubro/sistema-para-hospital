package bim1;
public class Pediatria extends Medico {
    private int anosExperiencia;

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    public Pediatria(int CRM, String nome, double vlrConsulta) {
        super(CRM, nome, vlrConsulta);
        this.anosExperiencia = anosExperiencia;
        
    }
    public double totalConsulta(int tempo){
        if(this.anosExperiencia>=10)
            return super.vlrConsulta*tempo*2;
        else
            return vlrConsulta*tempo;
    }    

    
    
    
    

    
    
    
}

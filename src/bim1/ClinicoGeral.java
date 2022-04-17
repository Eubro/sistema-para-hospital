package bim1;
public class ClinicoGeral extends Medico {
    private boolean realizaCirurgia;

    public boolean isRealizaCirurgia() {
        return realizaCirurgia;
    }

    public void setRealizaCirurgia(boolean realizaCirurgia) {
        this.realizaCirurgia = realizaCirurgia;
    }
    
    
    public ClinicoGeral(int CRM, String nome, double vlrConsulta,boolean realizaCirurgia) {
        super(CRM, nome, vlrConsulta);
        this.realizaCirurgia= realizaCirurgia;
    }
    
     public double totalConsulta(int tempo){
         if(this.realizaCirurgia)
             return (super.vlrConsulta*tempo)+10000;
         else
             return super.totalConsulta(tempo);
     } 
    
    
    
}

package bim1;
public class Consulta {
    
    private int codConsulta;
    private Medico medicoResponsável;

    public Consulta(int codConsulta, Medico medicoResponsável) {
        this.codConsulta = codConsulta;
        this.medicoResponsável = medicoResponsável;
    }

    public int getCodConsulta() {
        return codConsulta;
    }

    public void setCodConsulta(int codConsulta) {
        this.codConsulta = codConsulta;
    }

    public Medico getMedicoResponsável() {
        return medicoResponsável;
    }

    public void setMedicoResponsável(Medico medicoResponsável) {
        this.medicoResponsável = medicoResponsável;
    }
    
    
}

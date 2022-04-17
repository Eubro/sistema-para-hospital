package bim1;
import java.util.Scanner;
public class Clinica {
    public String nomeClinica;
    public String endereco;
    public Medico listaMedicos[];
    public Consulta listaConsultas[];
    
    public Clinica(String nomeClinica, String endereco){
        this.nomeClinica = nomeClinica;
        this.endereco = endereco;
        listaMedicos =new Medico[5];
        listaConsultas= new Consulta[20];
        
    }

    public String getNomeClinica() {
        return nomeClinica;
    }

    public void setNomeClinica(String nomeClinica) {
        this.nomeClinica = nomeClinica;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Medico[] getListaMedicos() {
        return listaMedicos;
    }

    public void setListaMedicos(Medico[] listaMedicos) {
        this.listaMedicos = listaMedicos;
    }

    public Consulta[] getListaConsultas() {
        return listaConsultas;
    }

    public void setListaConsultas(Consulta[] listaConsultas) {
        this.listaConsultas = listaConsultas;
    }
    
    public boolean contratarMedico(Medico listaMedico){
        
        for(int i=0; i<listaMedicos.length;i++){
            if(listaMedicos[i]==null){
                listaMedicos[i]=listaMedico;
                return true;
            }
            
        }
    return false;    
        
    }
    public Medico BuscarMedico(int CRM ){
        for(int i =0;i<listaMedicos.length;i++){
            if(listaMedicos[i]!= null && listaMedicos[i].getCRM()==CRM){
                return listaMedicos[i];
            }
        }
        return null;
    }
    public int MarcarConsulta(Medico listaMedico){
        
        for(int i=0;i<listaConsultas.length;i++){
            if(listaConsultas[i]==null){
                listaConsultas[i] = new Consulta((i+1), listaMedico);
                return i+1;
            }
        }
        
        System.out.println("Não foi possível marcar a consulta");
        return 0;
        
    }
    public double Pagar(int codConsulta){
        Scanner dados = new Scanner(System.in);
        System.out.println("Qual a duração da consulta:");
        cons = dados.nextInt();
       
        
        }
    }
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jonatan
 */
public class Materia {
    
    private String codMat;
    private String nomMat;
    private int numGrupos;
    private GrupoClas[] grupos;
    private int indice;

   
    public Materia(String codMat, String nomMat, int numGrupos) {
        this.codMat = codMat;
        this.nomMat = nomMat;
        this.numGrupos = numGrupos;
        this.grupos = new GrupoClas[numGrupos];
        this.indice = 0;
    }

    
    public String getCodMat() { return codMat; }
    public String getNomMat() { return nomMat; }
    public int getNumGrupos() { return numGrupos; }

   
    public void setCodMat(String codMat) { this.codMat = codMat; }
    public void setNomMat(String nomMat) { this.nomMat = nomMat; }

     
    public void agregarGrupo(GrupoClas grupo) {
        if (indice < numGrupos) {
            grupos[indice++] = grupo;
        } else {
            System.out.println("No se pueden agregar mas grupos :< ");
        }
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Materia: ").append(nomMat)
          .append(" (").append(codMat).append(")\n")
          .append("Número de grupos: ").append(numGrupos).append("\n");
        for (int i = 0; i < indice; i++) {
            sb.append(grupos[i].toString()).append("\n");
        }
        return sb.toString();
    }

     
    public String buscarGrupo(int codGrupo) {
        for (int i = 0; i < indice; i++) {
            if (grupos[i].getCodGrupo() == codGrupo) {
                return grupos[i].toString();
            }
        }
        return "No existe un grupo con este codigo ";
    }

     
    public double mayorPromedioDeGrupo() {
        double mayor = 0.0;
        for (int i = 0; i < indice; i++) {
            if (grupos[i].getPromGrupo() > mayor) {
                mayor = grupos[i].getPromGrupo();
            }
        }
        return mayor;
    }

     
    public void modificarProfesor(int codGrupo, String nuevoProfesor) {
        for (int i = 0; i < indice; i++) {
            if (grupos[i].getCodGrupo() == codGrupo) {
                grupos[i].setProfesor(nuevoProfesor);
                return;
            }
        }
        System.out.println("No se encontro el grupo con el codigo " + codGrupo);
    }
    
}

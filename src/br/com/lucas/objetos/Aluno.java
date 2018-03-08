/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas.objetos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author lucas.149917
 */
public class Aluno {
   private Integer matricula;
   private Date dataMatricula;
   private ArrayList disciplinas;

    public Aluno(Integer matricula, Date dataMatricula, ArrayList disciplinas) {
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", dataMatricula=" + dataMatricula + ", disciplinas=" + disciplinas + '}';
    }
   
   

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public ArrayList getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList disciplinas) {
        this.disciplinas = disciplinas;
    }
   
   
}

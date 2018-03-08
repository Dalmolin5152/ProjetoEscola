/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas.objetos;

import java.util.ArrayList;

/**
 *
 * @author lucas.149917
 */
public class Professor {
   private ArrayList disciplinas;
   private Integer cargaHoraria;
   private float valorHora;
   private Integer idade;

    public Professor(ArrayList disciplinas, Integer cargaHoraria, float valorHora, Integer idade) {
        this.disciplinas = disciplinas;
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
        this.idade = idade;
    }
    
    public float caucularHorario(float cargaHoraria, float valorHora){
        return cargaHoraria + valorHora;
    }

    @Override
    public String toString() {
        return "Professor{" + "disciplinas=" + disciplinas + ", cargaHoraria=" + cargaHoraria + ", valorHora=" + valorHora + ", idade=" + idade + '}';
    }
   
   

    public ArrayList getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
  
   
}

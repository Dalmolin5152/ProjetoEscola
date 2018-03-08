/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucas;

import br.com.lucas.objetos.Disciplina;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas.149917
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
       String Nome = JOptionPane.showInputDialog("Qual o nome? ");
       String Depart = JOptionPane.showInputDialog("Qual o seu departamento? ");
       char Status = JOptionPane.showInputDialog("Qual o seu status? ").charAt(0);
       
       Disciplina dis = new Disciplina(Nome, Depart, Status);
       
       Integer cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horaria: "));
       float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor de horas: "));
       
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       Date dataN = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento: "));
       
       
       
       
       
       
            
            
       
    }
    
}

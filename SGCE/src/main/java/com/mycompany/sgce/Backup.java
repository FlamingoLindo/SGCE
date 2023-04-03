/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sgce;

/**
 *
 * @author flamingo_lindo
 */
public class Backup  {
    
    String horario, tipoBackup;

    public String getTipoBackup() {
        return tipoBackup;
    }

    public void setTipoBackup(String tipoBackup) {
        this.tipoBackup = tipoBackup;
    }
    
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Backup(String horario, String tipoBackup) {
        this.horario = horario;
        this.tipoBackup = tipoBackup;
    }

    

    
    
    
}

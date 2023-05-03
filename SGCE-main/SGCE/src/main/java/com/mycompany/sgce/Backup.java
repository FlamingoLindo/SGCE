/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sgce;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author flamingo_lindo
 */
public class Backup implements Serializable{
    
    String horario, tipoBackup, nomeBackup;

    public String getNomeBackup() {
        return nomeBackup;
    }

    public void setNomeBackup(String nomeBackup) {
        this.nomeBackup = nomeBackup;
    }
    
    

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTipoBackup() {
        return tipoBackup;
    }

    public void setTipoBackup(String tipoBackup) {
        this.tipoBackup = tipoBackup;
    }
    
    public void cadastrar() throws SQLException{
       Connection con = getConexao();
       PreparedStatement comando = con.prepareStatement("insert into backups (horario,tipoBackup,nomeBackup) values (?,?,?)");
       comando.setString(1, horario);
       comando.setString(2, tipoBackup);
       comando.setString(3,nomeBackup);
       comando.execute();
       con.close();
   } 
    
    
    
    public static Connection getConexao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://127.0.0.1:3306/sgce";
            String USER = "root";
            String PASSWORD = "diamante9";
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            return null;
        }
    }
}
    


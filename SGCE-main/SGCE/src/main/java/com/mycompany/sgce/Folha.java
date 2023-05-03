/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sgce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author flamingo_lindo
 */
public class Folha {
   String nomeFolha, departamento;
   double salarioBruto, valeTransporte,INSS,IRPF,totalDescontos,salarioLiquido, aux;

    public String getNomeFolha() {
        return nomeFolha;
    }

    public void setNomeFolha(String nomeFolha) {
        this.nomeFolha = nomeFolha;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte(double valeTransporte) {
        this.valeTransporte = valeTransporte;
    }

    public double getINSS() {
        return INSS;
    }

    public void setINSS(double INSS) {
        this.INSS = INSS;
    }

    public double getIRPF() {
        return IRPF;
    }

    public void setIRPF(double IRPF) {
        this.IRPF = IRPF;
    }

    public double getTotalDescontos() {
        return totalDescontos;
    }

    public void setTotalDescontos(double otalDescontos) {
        this.totalDescontos = otalDescontos;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getAux() {
        return aux;
    }

    public void setAux(double aux) {
        this.aux = aux;
    }
    
    
  
    public void gerar() throws SQLException {
       Connection con = getConexao();
       PreparedStatement comando = con.prepareStatement("insert into folha "
               + "(nomeFolha,departamento,salarioBruto,valeTransporte,INSS,"
               + "salarioLiquido) values (?,?,?,?,?,?)");
       comando.setString(1, nomeFolha);
       comando.setString(2, departamento);
       comando.setDouble(3, salarioBruto);
       comando.setDouble(4,valeTransporte);
       comando.setDouble(5,INSS);
       comando.setDouble(6,salarioLiquido);
       
       comando.execute();
       con.close();
    }
    
    
    public double calcularInss(){
        double aux =0;
        if(salarioBruto >= 2000){
            aux = salarioBruto * 0.075;
        }else if(salarioBruto >= 4000){
            aux = salarioBruto * 0.09;
        }else{
            aux = salarioBruto * 0.14;
        }
        return aux;
    }
    
    public double calcularSalLiquido(){
        salarioLiquido = salarioBruto - (aux + valeTransporte);
        return salarioLiquido;
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

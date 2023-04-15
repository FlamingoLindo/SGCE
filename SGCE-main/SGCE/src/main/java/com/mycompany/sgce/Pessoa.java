/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sgce;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author flamingo_lindo
 */
public class Pessoa implements Serializable{
    private String nome, sobrenome, senha, email, telefone, dataNasc, cpf, cnpj;

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void cadastrar() throws SQLException{
       Connection con = getConexao();
       PreparedStatement comando = con.prepareStatement("insert into pessoa (nome,sobrenome,senha,email,telefone,cpf,cnpj,dataNasc) values (?,?,?,?,?,?,?,?)");
       comando.setString(1, nome);
       comando.setString(2, sobrenome);
       comando.setString(3, senha);
       comando.setString(4, email);
       comando.setString(5, telefone);
       comando.setString(6, cpf);
       comando.setString(7, cnpj);
       comando.setString(8, dataNasc);
       
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



    
    


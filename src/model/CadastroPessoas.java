/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author xtremebass
 */
//Objeto
public class CadastroPessoas {
    private int idcad;
    private String nomecad;
    private String cpf;
    private int idsexo;
    private String email;
    private String nomesexo;
    
//Construtor    
    public CadastroPessoas() {
    }
    
    public CadastroPessoas(String nomecad, String cpf, int idsexo, String email) {
        this.nomecad = nomecad;
        this.cpf = cpf;
        this.idsexo = idsexo;
        this.email = email;
    }

    public CadastroPessoas(int idcad, String nomecad, String cpf, int idsexo, String email, String nomesexo) {
        this.idcad = idcad;     
        this.nomecad = nomecad;
        this.cpf = cpf;
        this.idsexo = idsexo;
        this.email = email;
        this.nomesexo = nomesexo;    
    }
   //Metodos GETs e SETs 
   // Metodo com retorno e sem parâmentro 
    public int getIdCad() {
        return idcad;
    }
   //Metodo com parâmetro e sem retorno
    public void setIdCad(int idcad) {
        this.idcad = idcad;
    }

    public String getNomeCad() {
        return nomecad;
    }

    public void setNomeCad(String nomecad) {
        this.nomecad = nomecad;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdSexo() {
        return idsexo;
    }

    public void setIdSexo(int idsexo) {
        this.idsexo = idsexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeSexo() {
        return nomesexo;
    }

    public void SetNomeSexo(String nomesexo) {
        this.nomesexo = nomesexo;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author Igor
 */
public class usuarios {

    private int usu_id;
    private String usu_senha;
    private String usu_nome;
    private char usu_perUsuarios;
    private char usu_perVendas;
    private char usu_perProdutos;
    private char usu_perPessoas;
    private char usu_perEstoque;
    private char usu_perRltVendas;
    private char usu_perEmpresa;
    private char usu_perDespesas;
    private Date usu_data;

    public usuarios() {

    }

    public usuarios(int usu_id, String usu_senha, String usu_nome, char usu_perUsuarios, char usu_perVendas, char usu_perProdutos, char usu_perPessoas, char usu_perEstoque, char usu_perRltVendas, char usu_perEmpresa, char usu_perDespesas, Date usu_data) {
        this.usu_id = usu_id;
        this.usu_senha = usu_senha;
        this.usu_nome = usu_nome;
        this.usu_perUsuarios = usu_perUsuarios;
        this.usu_perVendas = usu_perVendas;
        this.usu_perProdutos = usu_perProdutos;
        this.usu_perPessoas = usu_perPessoas;
        this.usu_perEstoque = usu_perEstoque;
        this.usu_perRltVendas = usu_perRltVendas;
        this.usu_perEmpresa = usu_perEmpresa;
        this.usu_perDespesas = usu_perDespesas;
        this.usu_data = usu_data;
    }

    /**
     * @return the usu_id
     */
    public int getUsu_id() {
        return usu_id;
    }

    /**
     * @param usu_id the usu_id to set
     */
    public void setUsu_id(int usu_id) {
        this.usu_id = usu_id;
    }

    /**
     * @return the usu_senha
     */
    public String getUsu_senha() {
        return usu_senha;
    }

    /**
     * @param usu_senha the usu_senha to set
     */
    public void setUsu_senha(String usu_senha) {
        this.usu_senha = usu_senha;
    }

    /**
     * @return the usu_nome
     */
    public String getUsu_nome() {
        return usu_nome;
    }

    /**
     * @param usu_nome the usu_nome to set
     */
    public void setUsu_nome(String usu_nome) {
        this.usu_nome = usu_nome;
    }

    /**
     * @return the usu_perUsuarios
     */
    public char getUsu_perUsuarios() {
        return usu_perUsuarios;
    }

    /**
     * @param usu_perUsuarios the usu_perUsuarios to set
     */
    public void setUsu_perUsuarios(char usu_perUsuarios) {
        this.usu_perUsuarios = usu_perUsuarios;
    }

    /**
     * @return the usu_perVendas
     */
    public char getUsu_perVendas() {
        return usu_perVendas;
    }

    /**
     * @param usu_perVendas the usu_perVendas to set
     */
    public void setUsu_perVendas(char usu_perVendas) {
        this.usu_perVendas = usu_perVendas;
    }

    /**
     * @return the usu_perProdutos
     */
    public char getUsu_perProdutos() {
        return usu_perProdutos;
    }

    /**
     * @param usu_perProdutos the usu_perProdutos to set
     */
    public void setUsu_perProdutos(char usu_perProdutos) {
        this.usu_perProdutos = usu_perProdutos;
    }

    /**
     * @return the usu_perPessoas
     */
    public char getUsu_perPessoas() {
        return usu_perPessoas;
    }

    /**
     * @param usu_perPessoas the usu_perPessoas to set
     */
    public void setUsu_perPessoas(char usu_perPessoas) {
        this.usu_perPessoas = usu_perPessoas;
    }

    /**
     * @return the usu_perEstoque
     */
    public char getUsu_perEstoque() {
        return usu_perEstoque;
    }

    /**
     * @param usu_perEstoque the usu_perEstoque to set
     */
    public void setUsu_perEstoque(char usu_perEstoque) {
        this.usu_perEstoque = usu_perEstoque;
    }

    /**
     * @return the usu_perRltVendas
     */
    public char getUsu_perRltVendas() {
        return usu_perRltVendas;
    }

    /**
     * @param usu_perRltVendas the usu_perRltVendas to set
     */
    public void setUsu_perRltVendas(char usu_perRltVendas) {
        this.usu_perRltVendas = usu_perRltVendas;
    }

    /**
     * @return the usu_perEmpresa
     */
    public char getUsu_perEmpresa() {
        return usu_perEmpresa;
    }

    /**
     * @param usu_perEmpresa the usu_perEmpresa to set
     */
    public void setUsu_perEmpresa(char usu_perEmpresa) {
        this.usu_perEmpresa = usu_perEmpresa;
    }

    /**
     * @return the usu_perDespesas
     */
    public char getUsu_perDespesas() {
        return usu_perDespesas;
    }

    /**
     * @param usu_perDespesas the usu_perDespesas to set
     */
    public void setUsu_perDespesas(char usu_perDespesas) {
        this.usu_perDespesas = usu_perDespesas;
    }

    /**
     * @return the usu_data
     */
    public Date getUsu_data() {
        return usu_data;
    }

    /**
     * @param usu_data the usu_data to set
     */
    public void setUsu_data(Date usu_data) {
        this.usu_data = usu_data;
    }

}

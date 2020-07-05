/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JTextField;

/**
 *
 * @author Igor
 */
public class produtos {

    private int pro_id;
    private String pro_nome;
    private String pro_descricao;
    private float pro_valor;
    private int pro_quantidade;
    private int pro_status;
    private int pro_fornecedor;

    public produtos() {

    }

    public produtos(int pro_id, String pro_nome, String pro_dercricao, float pro_valor, int pro_quantidade, int pro_status, int pro_fornecedor) {
        this.pro_id = pro_id;
        this.pro_nome = pro_nome;
        this.pro_descricao = pro_dercricao;
        this.pro_valor = pro_valor;
        this.pro_quantidade = pro_quantidade;
        this.pro_status = pro_status;
        this.pro_fornecedor = pro_fornecedor;
    }

    /**
     * @return the pro_id
     */
    public int getPro_id() {
        return pro_id;
    }

    /**
     * @param pro_id the pro_id to set
     */
    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    /**
     * @return the pro_nome
     */
    public String getPro_nome() {
        return pro_nome;
    }

    /**
     * @param pro_nome the pro_nome to set
     */
    public void setPro_nome(String pro_nome) {
        this.pro_nome = pro_nome;
    }

    /**
     * @return the pro_dercricao
     */
    public String getPro_dercricao() {
        return pro_descricao;
    }

    /**
     * @param pro_dercricao the pro_dercricao to set
     */
    public void setPro_dercricao(String pro_dercricao) {
        this.pro_descricao = pro_dercricao;
    }

    /**
     * @return the pro_valor
     */
    public float getPro_valor() {
        return pro_valor;
    }

    /**
     * @param pro_valor the pro_valor to set
     */
    public void setPro_valor(float pro_valor) {
        this.pro_valor = pro_valor;
    }

    /**
     * @return the pro_quantidade
     */
    public int getPro_quantidade() {
        return pro_quantidade;
    }

    /**
     * @param pro_quantidade the pro_quantidade to set
     */
    public void setPro_quantidade(int pro_quantidade) {
        this.pro_quantidade = pro_quantidade;
    }

    /**
     * @return the pro_status
     */
    public int getPro_status() {
        return pro_status;
    }

    /**
     * @param pro_status the pro_status to set
     */
    public void setPro_status(int pro_status) {
        this.pro_status = pro_status;
    }

    /**
     * @return the pro_fornecedor
     */
    public int getPro_fornecedor() {
        return pro_fornecedor;
    }

    /**
     * @param pro_fornecedor the pro_fornecedor to set
     */
    public void setPro_fornecedor(int pro_fornecedor) {
        this.pro_fornecedor = pro_fornecedor;
    }

}

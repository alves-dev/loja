/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import com.toedter.calendar.JDateChooser;
import java.util.Date;

/**
 *
 * @author Igor
 */
public class vendas {

    private int ven_id;
    private int ven_pes_id;
    private String ven_pes_nome;
    private float ven_valor;
    private Date ven_data;

    // tabela itemsVendas
    private int iv_id;
    private int iv_ven_id;
    private int iv_pro_id;
    private String iv_pro_nome;
    private float iv_valor;
    private int iv_quantidade;
    private float iv_totaValor;
    private Date iv_data;

    public vendas() {

    }

    public vendas(int ven_id, int ven_pes_id, String ven_pes_nome, float ven_valor, Date ven_data, int iv_id, int iv_ven_id, int iv_pro_id, String iv_pro_nome, float iv_valor, int iv_quantidade, float iv_totaValor, Date iv_data) {
        this.ven_id = ven_id;
        this.ven_pes_id = ven_pes_id;
        this.ven_pes_nome = ven_pes_nome;
        this.ven_valor = ven_valor;
        this.ven_data = ven_data;
        this.iv_id = iv_id;
        this.iv_ven_id = iv_ven_id;
        this.iv_pro_id = iv_pro_id;
        this.iv_pro_nome = iv_pro_nome;
        this.iv_valor = iv_valor;
        this.iv_quantidade = iv_quantidade;
        this.iv_totaValor = iv_totaValor;
        this.iv_data = iv_data;
    }

    /**
     * @return the ven_id
     */
    public int getVen_id() {
        return ven_id;
    }

    /**
     * @param ven_id the ven_id to set
     */
    public void setVen_id(int ven_id) {
        this.ven_id = ven_id;
    }

    /**
     * @return the ven_pes_id
     */
    public int getVen_pes_id() {
        return ven_pes_id;
    }

    /**
     * @param ven_pes_id the ven_pes_id to set
     */
    public void setVen_pes_id(int ven_pes_id) {
        this.ven_pes_id = ven_pes_id;
    }

    /**
     * @return the ven_pes_nome
     */
    public String getVen_pes_nome() {
        return ven_pes_nome;
    }

    /**
     * @param ven_pes_nome the ven_pes_nome to set
     */
    public void setVen_pes_nome(String ven_pes_nome) {
        this.ven_pes_nome = ven_pes_nome;
    }

    /**
     * @return the ven_valor
     */
    public float getVen_valor() {
        return ven_valor;
    }

    /**
     * @param ven_valor the ven_valor to set
     */
    public void setVen_valor(float ven_valor) {
        this.ven_valor = ven_valor;
    }

    /**
     * @return the ven_data
     */
    public Date getVen_data() {
        return ven_data;
    }

    /**
     * @param ven_data the ven_data to set
     */
    public void setVen_data(Date ven_data) {
        this.ven_data = ven_data;
    }

    /**
     * @return the iv_id
     */
    public int getIv_id() {
        return iv_id;
    }

    /**
     * @param iv_id the iv_id to set
     */
    public void setIv_id(int iv_id) {
        this.iv_id = iv_id;
    }

    /**
     * @return the iv_ven_id
     */
    public int getIv_ven_id() {
        return iv_ven_id;
    }

    /**
     * @param iv_ven_id the iv_ven_id to set
     */
    public void setIv_ven_id(int iv_ven_id) {
        this.iv_ven_id = iv_ven_id;
    }

    /**
     * @return the iv_pro_id
     */
    public int getIv_pro_id() {
        return iv_pro_id;
    }

    /**
     * @param iv_pro_id the iv_pro_id to set
     */
    public void setIv_pro_id(int iv_pro_id) {
        this.iv_pro_id = iv_pro_id;
    }

    /**
     * @return the iv_pro_nome
     */
    public String getIv_pro_nome() {
        return iv_pro_nome;
    }

    /**
     * @param iv_pro_nome the iv_pro_nome to set
     */
    public void setIv_pro_nome(String iv_pro_nome) {
        this.iv_pro_nome = iv_pro_nome;
    }

    /**
     * @return the iv_valor
     */
    public float getIv_valor() {
        return iv_valor;
    }

    /**
     * @param iv_valor the iv_valor to set
     */
    public void setIv_valor(float iv_valor) {
        this.iv_valor = iv_valor;
    }

    /**
     * @return the iv_quantidade
     */
    public int getIv_quantidade() {
        return iv_quantidade;
    }

    /**
     * @param iv_quantidade the iv_quantidade to set
     */
    public void setIv_quantidade(int iv_quantidade) {
        this.iv_quantidade = iv_quantidade;
    }

    /**
     * @return the iv_totaValor
     */
    public float getIv_totaValor() {
        return iv_totaValor;
    }

    /**
     * @param iv_totaValor the iv_totaValor to set
     */
    public void setIv_totaValor(float iv_totaValor) {
        this.iv_totaValor = iv_totaValor;
    }

    /**
     * @return the iv_data
     */
    public Date getIv_data() {
        return iv_data;
    }

    /**
     * @param iv_data the iv_data to set
     */
    public void setIv_data(Date iv_data) {
        this.iv_data = iv_data;
    }

    public void setIv_data(JDateChooser vendaData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVen_data(JDateChooser vendaData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

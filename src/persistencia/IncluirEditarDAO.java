/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import classes.pessoas;
import classes.produtos;
import classes.vendas;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;
import tela.RealizarVendas;

/**
 *
 * @author Igor
 */
public class IncluirEditarDAO {

    pessoas pessoas = new pessoas();
    produtos produtos = new produtos();
    vendas vendas = new vendas();

    public int IncluirPessoas(pessoas pessoas) throws SQLException {

        conexao conexao = new conexao();
        int registros;

        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement("INSERT INTO pessoas (pes_nome, pes_rg, pes_cpf, pes_end, pes_tel, pes_dtcadastro, pes_status)"
                + "VALUES (?,?,?,?,?,?,?)")) {

            pstmt.setString(1, pessoas.getPes_nome().toUpperCase().trim());
            pstmt.setString(2, pessoas.getPes_rg().trim());
            pstmt.setString(3, pessoas.getPes_cpf().trim());
            pstmt.setString(4, pessoas.getPes_end().trim());
            pstmt.setString(5, pessoas.getPes_tel().trim());
            pstmt.setTimestamp(6, new java.sql.Timestamp(pessoas.getPes_dtcadastro().getTime()));
            pstmt.setInt(7, pessoas.getPes_status());

            registros = pstmt.executeUpdate();
        }

        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

        if ((registros == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        } else {
            return codigo;

        }
    }

    public int IncluirProdutos(produtos produtos) throws SQLException {

        conexao conexao = new conexao();
        int registros;

        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement("INSERT INTO produtos (pro_nome, pro_descricao, pro_valor, pro_quantidade, pro_status, pro_fornecedor)"
                + "VALUES (?,?,?,?,?,?)")) {

            pstmt.setString(1, produtos.getPro_nome().toUpperCase().trim());
            pstmt.setString(2, produtos.getPro_dercricao().trim());
            pstmt.setFloat(3, produtos.getPro_valor());
            pstmt.setInt(4, produtos.getPro_quantidade());
            pstmt.setInt(5, produtos.getPro_status());
            pstmt.setInt(6, produtos.getPro_fornecedor());

            registros = pstmt.executeUpdate();
        }

        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

        if ((registros == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        } else {
            return codigo;

        }
    }

    public int IncluirVendas(vendas vendas) throws SQLException {

        conexao conexao = new conexao();
        int registros;

        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement("INSERT INTO vendas (ven_pes_id, ven_pes_nome, ven_valor, ven_data)"
                + "VALUES (?,?,?,?)")) {

            pstmt.setInt(1, vendas.getVen_pes_id());
            pstmt.setString(2, vendas.getVen_pes_nome().trim());
            pstmt.setFloat(3, vendas.getVen_valor());
            pstmt.setTimestamp(4, new java.sql.Timestamp(vendas.getVen_data().getTime()));

            registros = pstmt.executeUpdate();
        }

        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

        if ((registros == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        } else {
            return codigo;

        }
    }

    public int IncluirItemsVendas(vendas vendas) throws SQLException {

        conexao conexao = new conexao();
        int registros;

        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement("INSERT INTO itemsVendas "
                + "(iv_ven_id, iv_pro_id, iv_pro_nome, iv_valor, iv_quantidade, iv_totaValor, iv_data) "
                + "VALUES (?,?,?,?,?,?,?)")) {

            pstmt.setInt(1, vendas.getIv_ven_id());
            pstmt.setInt(2, vendas.getIv_pro_id());
            pstmt.setString(3, vendas.getIv_pro_nome().trim());
            pstmt.setFloat(4, vendas.getIv_valor());
            pstmt.setInt(5, vendas.getIv_quantidade());
            pstmt.setFloat(6, vendas.getIv_totaValor());
            pstmt.setTimestamp(7, new java.sql.Timestamp(vendas.getVen_data().getTime()));

            registros = pstmt.executeUpdate();
        }

        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

        if ((registros == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        } else {
            return codigo;

        }
    }

}

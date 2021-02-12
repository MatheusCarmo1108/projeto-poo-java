/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author mathe
 */
public class Produto {

    private String codigo;
    private String descricao;
    private double qtdeEstoque;
    private String unidadeMedida;
    private double preco;
    private double estoqueMinimo;
    private double qtdeDisp;///

    public double getQtdeDisp() {
        return qtdeDisp;
    }

    public void setQtdeDisp(double qtdeDisp) {
        this.qtdeDisp = qtdeDisp;
    }

    public Produto(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        qtdeDisp = ( qtdeEstoque - estoqueMinimo);///
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQtdeEstoque(double qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoqueMinimo(double estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getQtdeEstoque() {
        return qtdeEstoque;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public double getPreco() {
        return preco;
    }

    public double getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public static boolean validarProduto(String texto) {
           String tex = texto;
       
        if (texto.length()>0){
        for (int i = 0; i < tex.length(); i++) {
            Character caractere = tex.charAt(i);
            if (!Character.isDigit(caractere)) {
                return false;
                }
            }
        return  true;
        }
        return false;
    }
    
    
    
    
}

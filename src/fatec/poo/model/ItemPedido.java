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
public class ItemPedido {
    private int sequencia;
    private double qtdeVendida;
    private Produto produto;
    private Pedido pedido;
    //private double qtdeDisp;


    


    public ItemPedido(int sequencia, double qtdeVendida, Produto produto) {
        this.sequencia = sequencia;
        this.qtdeVendida = qtdeVendida;
        this.produto = produto;
        //qtdeDisp = ( produto.getQtdeEstoque() - produto.getEstoqueMinimo());
    }


    public int getSequencia() {
        return sequencia;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
    }

    public void setQtdeVendida(double qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
    }

    public Produto getProduto() {
        return produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

   /* public void setQtdeDisp(double qtdeDisp) {
        this.qtdeDisp = qtdeDisp;
    }
    
    public double getQtdeDisp() {
        return qtdeDisp;
    }*/
    
    public void tirarEstoque(){
        produto.setQtdeEstoque((produto.getQtdeEstoque()) - qtdeVendida);
        produto.setQtdeDisp((produto.getQtdeEstoque()) - (produto.getEstoqueMinimo()));
    }
    
    public void addEstoque(double quantidadeRemovida){
        produto.setQtdeEstoque((produto.getQtdeEstoque()) + quantidadeRemovida);
        produto.setQtdeDisp((produto.getQtdeEstoque()) - (produto.getEstoqueMinimo()));
    }
    
    
    
    
    
    
    
}
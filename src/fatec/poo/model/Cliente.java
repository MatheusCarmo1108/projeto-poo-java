/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class Cliente extends Pessoa{
    private double limiteCred;
    private double limiteDisp;
    //A multiplicidade 1..* com Pedido deve ser 
    //implementada utilizando a classe ArrayList. 
    //Utilize o this para simplificar associação binária bidirecional.
    private ArrayList<Pedido> pedidos;
    
    public Cliente(String cpf, String nome,double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        limiteDisp = limiteCred;
        pedidos = new ArrayList<Pedido>();
    }

    public void setLimiteCred(double limiteCred) {
        setLimiteDisp(getLimiteCred() - limiteCred + getLimiteDisp());
        this.limiteCred = limiteCred;
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }

    public void addPedido(Pedido p){
        pedidos.add(p) ;
        p.setCliente(this);
        
    }

    public void setLimiteDisp(double limiteDisp) {
        this.limiteDisp = limiteDisp;
    }    

    
    
}

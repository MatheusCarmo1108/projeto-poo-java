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
public class Pessoa {    
    private String cpf;
    private String nome;
    private String endereco;
    private String cidade;
    private String uf;
    private String cep;
    private String ddd;
    private String telefone;
    ///private Cliente cliente;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

   /* public Cliente getCliente() {
        return cliente;
    }*/

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }

    public String getDdd() {
        return ddd;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public static boolean validarCPF(String cpf){
        double al1,al2,al3,al4,al5,al6,al7,al8,al9, v1, v2;
        double total1, totalpt1, total2,totalpt2;
        
        if (cpf.equals("000.000.000-00") || cpf.equals("111.111.111-11") ||
            cpf.equals("222.222.222-22") || cpf.equals("333.333.333-33") ||
            cpf.equals("444.444.444-44") || cpf.equals("555.555.555-55") ||
            cpf.equals("666.666.666-66") || cpf.equals("777.777.777-77") ||
            cpf.equals("888.888.888-88") || cpf.equals("999.999.999-99") ||
            (cpf.length() != 14) ){
            
             return(false);
                    }
        al1 = Double.parseDouble(cpf.substring(0, 1));
        al2 = Double.parseDouble(cpf.substring(1, 2));
        al3 = Double.parseDouble(cpf.substring(2, 3));
        al4 = Double.parseDouble(cpf.substring(4, 5));
        al5 = Double.parseDouble(cpf.substring(5, 6));
        al6 = Double.parseDouble(cpf.substring(6, 7));
        al7 = Double.parseDouble(cpf.substring(8, 9));
        al8 = Double.parseDouble(cpf.substring(9, 10));
        al9 = Double.parseDouble(cpf.substring(10, 11));
        v1 = Double.parseDouble(cpf.substring(12, 13));
        v2 = Double.parseDouble(cpf.substring(13, 14));
        
        totalpt1 = (al1*1) + (al2*2) + (al3*3) + (al4*4) + (al5*5) + (al6*6) + (al7*7) + (al8*8) + (al9*9);
        totalpt1 = totalpt1 %11;
        if(totalpt1 == 10 ){
            totalpt1 = 0; 
        }
        if(totalpt1 == v1){
            totalpt2 = (al1*11) + (al2*10) + (al3*9) + (al4*8) + (al5*7) + (al6*6) + (al7*5) + (al8*4) + (al9 *3) + (totalpt1 * 2);
            totalpt2 = (totalpt2*10)%11;
            
            if(totalpt2 == 10 ){
                totalpt2 = 0; 
            }
            if(totalpt2 == v2){
                return(true);
            }
        }
        
        return (false);
    }

   
}

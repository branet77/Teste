/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 *
 * @author brane
 */
public class Conta {
    private String nome;
    private double saldo;

    public Conta(String nome, double depositoInicial) {
        this.nome = nome;
        this.saldo = depositoInicial;
    }
    
    public void deposita(double deposita)
    {
        this.saldo = this.saldo + deposita;
    }

    public boolean retira(double retira)
    {
        if (this.saldo - retira < 0)
        {
            return false;
        }
        this.saldo = this.saldo - retira;
        return true;
    }
}

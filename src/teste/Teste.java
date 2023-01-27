/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

/**
 *
 * @author brane
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String resposta;
        Conta conta1 = new Conta("nome", 0);
        // ler resposta pelo scanner
        // converter o valor se necessário
        conta1.deposita(10);
        boolean retorno2 = conta1.retira(10);
        if (retorno2 == true ) {
            System.out.println("Retirada efetuada com sucesso");
        }
        else {
            System.out.println("Não foi possível efetuar retirada!!!\nSaldo insuficiente para a operação!!!");
        }
        retorno2 = conta1.retira(10);
        if (retorno2 == true ) {
            System.out.println("Retirada efetuada com sucesso");
        }
        else {
            System.out.println("Não foi possível efetuar retirada!!!\nSaldo insuficiente para a operação!!!");
        }
        
        
    }
    
}

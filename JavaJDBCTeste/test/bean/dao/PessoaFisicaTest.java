/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.dao;

import bean.Pessoa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Familia
 */
public class PessoaFisicaTest {
    
    public PessoaFisicaTest() {
    }

    @Test
    public void inserir(){
        
       Pessoa pesso = new Pessoa("01234", "wanessa", "BH", "Raul nin");
       PessoaFisica dao = new PessoaFisica();
       
       if (dao.salvar(pesso)){
        System.out.println("Salvo com sucesso!");
    } else {
            
            fail("Erro ao salvar.");
            }
       
       
    }
    
}

package ifpr.pgua.eic.listatelefonica;

import java.util.List;

import ifpr.pgua.eic.listatelefonica.models.Contato;
import ifpr.pgua.eic.listatelefonica.models.FabricaConexoes;
import ifpr.pgua.eic.listatelefonica.models.daos.ContatoDAO;
import ifpr.pgua.eic.listatelefonica.models.daos.JDBCContatoDAO;

public class Teste {
    public static void main(String[] args) {
        FabricaConexoes fabrica = FabricaConexoes.getInstance();

        ContatoDAO contatoDAO = new JDBCContatoDAO(fabrica);

        // Contato contato = new Contato("Zé", "ze@teste.com","1234");

        // Result resultado = contatoDAO.inserir(contato);

        // System.out.println(resultado.getMsg());

        List<Contato> lista = contatoDAO.buscarTodos();

       for(Contato c:lista){
        System.out.println(c.getNome());
       }
    }
}

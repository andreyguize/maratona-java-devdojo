package maratonajava.javacore.enumeracao.test;

import maratonajava.javacore.enumeracao.dominio.Cliente;
import maratonajava.javacore.enumeracao.dominio.TipoCliente;
import maratonajava.javacore.enumeracao.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Roberta", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Renan",TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        //TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        //System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}

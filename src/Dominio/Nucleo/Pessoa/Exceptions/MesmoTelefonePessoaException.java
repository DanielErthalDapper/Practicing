package Dominio.Nucleo.Pessoa.Exceptions;

public class MesmoTelefonePessoaException extends MesmoDadoPessoaException {
    public MesmoTelefonePessoaException() {
        super("O TELEFONE DEVE SER DIFERENTE DO ATUAL");
    }
}

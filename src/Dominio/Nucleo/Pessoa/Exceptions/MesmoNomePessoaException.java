package Dominio.Nucleo.Pessoa.Exceptions;

public class MesmoNomePessoaException extends MesmoDadoPessoaException {
    public MesmoNomePessoaException() {
        super("O NOME DEVE SER DIFERENTE DO ATUAL");
    }
}

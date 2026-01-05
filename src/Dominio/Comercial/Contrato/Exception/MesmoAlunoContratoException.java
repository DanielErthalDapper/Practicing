package Dominio.Comercial.Contrato.Exception;

public class MesmoAlunoContratoException extends RuntimeException {
    public MesmoAlunoContratoException() {
        super("O ALUNO DEVE SER DIFERENTE DO ATUAL");
    }
}

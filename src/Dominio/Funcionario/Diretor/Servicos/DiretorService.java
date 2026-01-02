package Dominio.Funcionario.Diretor.Servicos;

import Dominio.Funcionario.Nucleo.Funcionario;
import Util.FerramentasValidator;

public class DiretorService
{
    public void suspenderMatriculas(Funcionario modificador, Funcionario modificado)
    {
        FerramentasValidator.validarSeEhDiretor(modificador);
    }
    public void assinarDocumentos(Funcionario modificador, Funcionario modificado)
    {
        FerramentasValidator.validarSeEhDiretor(modificador);
    }
    public void aprovarHorasExtras(Funcionario modificador, Funcionario modificado)
    {
        FerramentasValidator.validarSeEhDiretor(modificador);
    }
}

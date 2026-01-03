package Dominio.Funcionario.Secretario.Servicos;

import Dominio.Funcionario.Nucleo.Funcionario;
import Util.FerramentasValidator;

public class SecretarioService
{
    public void agendamentos(Funcionario secretario)
    {
        FerramentasValidator.validarSeEhSecretario(secretario);

    }

    public void prospeccaoDeClientes(Funcionario secretario) //QUANDO A PROSPECÇÃO FOR LANÇADA A VISITA É CONFIRMADA NO SISTEMA
    {
        FerramentasValidator.validarSeEhSecretario(secretario);
    }
}

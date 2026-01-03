package Dominio.Aluno;

import Dominio.Nucleo.Usuario.Exceptions.UsuarioException;
import Dominio.Pedagogico.Nota.Nota;
import Dominio.Pedagogico.Presenca.Presenca;

public class Aluno
{
    public static boolean podeFormar;

    public static boolean podeFormar()
    {
        //AQUI VAI FICAR A REGRA ESPECÍFICA PARA UM ALUNO SE FORMAR... - PRECISA TER ALUNO E TODO O RESTO PRONTINHO PARA FINALIZAR AQUI DIRETO
        if(!Presenca.aprovacaoPossivel)
        {
            throw new UsuarioException("O ALUNO NÃO POSSUI TODOS OS CRITÉRIOS NECESSÁRIOS PARA A APROVAÇÃO");
        }
        if(!Nota.aprovacaoPossivel)
        {
            throw new UsuarioException("O ALUNO NÃO POSSUI TODOS OS CRITÉRIOS NECESSÁRIOS PARA A APROVAÇÃO");
        }

        return true;
    }
}

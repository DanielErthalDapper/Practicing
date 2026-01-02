package Dominio.Aluno;

import Dominio.Nucleo.Usuario.Exceptions.UsuarioException;
import Dominio.Pedagogico.Presenca.Presenca;

public class Aluno
{
    public static boolean podeFormar;

    public static boolean podeFormar()
    {
        //AQUI VAI FICAR A REGRA ESPECÍFICA PARA UM ALUNO SE FORMAR... - PRECISA TER ALUNO E TODO O RESTO PRONTINHO PARA FINALIZAR AQUI DIRETO
        if(!Presenca.aprovacaoPossivel)
        {
            throw new UsuarioException("");
        }
        // if() -- Aqui terá a validação de notas

        return true;
    }
}

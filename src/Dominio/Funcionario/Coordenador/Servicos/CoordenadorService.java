package Dominio.Funcionario.Coordenador.Servicos;

import Dominio.Aluno.Aluno;
import Dominio.Funcionario.Nucleo.Funcionario;
import Dominio.Nucleo.Usuario.Exceptions.UsuarioException;
import Dominio.Nucleo.Usuario.Usuario;
import Dominio.Pedagogico.Presenca.Presenca;
import Util.FerramentasValidator;

public class CoordenadorService
{
    public void cadastrarBolsas(Funcionario coordenador)
    {
        FerramentasValidator.validarSeEhCoordenador(coordenador);

        //Pode ter a validação de limite de bolsas cadastradas no sistema, por enquanto não é necessário
    }
    public void removerBolsas(Funcionario coordenador)
    {
        FerramentasValidator.validarSeEhCoordenador(coordenador);
    }
    public void formarAlunos(Funcionario coordenador, Usuario aluno)
    {
        FerramentasValidator.validarSeEhCoordenador(coordenador);
        FerramentasValidator.validarSeEhAluno(aluno);
        if(!Aluno.podeFormar)
        {
            //throw new
        }
    }
    public void agendarReuniao()
    {

    }
}

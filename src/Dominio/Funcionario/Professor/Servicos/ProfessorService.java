package Dominio.Funcionario.Professor.Servicos;

import Dominio.Funcionario.Nucleo.Funcionario;
import Util.FerramentasValidator;

public class ProfessorService
{
    public void registrarAula(Funcionario professor)
    {
        FerramentasValidator.validarSeEhProfessor(professor);
    }

    public void registrarPresenca(Funcionario professor)
    {
        FerramentasValidator.validarSeEhProfessor(professor);
    }

    public void registrarFeedbackPedagogico(Funcionario professor)
    {
        FerramentasValidator.validarSeEhProfessor(professor);
    }

    public void registrarObservacaoInterna(Funcionario professor, Funcionario coordenador) //visualização somente pela o coordenador
    {
        FerramentasValidator.validarSeEhProfessor(professor);
        FerramentasValidator.validarSeEhCoordenador(coordenador);
    }
}

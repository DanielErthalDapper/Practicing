package Dominio.Funcionario.Nucleo.Servicos;

import Dominio.Funcionario.Nucleo.Enumeracao.TipoContrato;
import Dominio.Funcionario.Nucleo.Exceptions.FuncionarioException;
import Dominio.Funcionario.Nucleo.Exceptions.RegraContratoException;
import Dominio.Funcionario.Nucleo.Funcionario;
import Dominio.Funcionario.Nucleo.ObjetoDeValor.CargaHoraria;
import Dominio.Funcionario.Nucleo.ObjetoDeValor.Salario;
import Dominio.Nucleo.Usuario.Enumeracao.NivelAcesso;
import Util.FerramentasValidator;

public class FuncionarioService
{
    public void validarContrato(Funcionario funcionario)
    {
        TipoContrato contrato = funcionario.getTipoContrato();
        CargaHoraria cargaHoraria = funcionario.getCargaHoraria();
        Salario salario = funcionario.getSalario();

        if(contrato == TipoContrato.ESTAGIO)
        {
            if(cargaHoraria.getHorasSemanais() > 30)
            {
                throw new RegraContratoException("OPPS... PARECE QUE A CARGA HORÁRIA NÃO CONDIZ COM O TIPO DE CONTRATO ATUAL");
            }
        }

        if(contrato == TipoContrato.CLT)
        {
            if(cargaHoraria.getHorasSemanais() < 40 || cargaHoraria.getHorasSemanais() > 44)
            {
                throw new RegraContratoException("OPPS... PARECE QUE A CARGA HORÁRIA NÃO CONDIZ COM O TIPO DE CONTRATO ATUAL");
            }
        }

        if(contrato == TipoContrato.APRENDIZ)
        {
            if(cargaHoraria.getHorasSemanais() < 20 || cargaHoraria.getHorasSemanais() > 30)
            {
                throw new RegraContratoException("OPPS... PARECE QUE A CARGA HORÁRIA NÃO CONDIZ COM O TIPO DE CONTRATO ATUAL");
            }
        }
    }

    public void validarContratacao(Funcionario modificador, Funcionario modificado)
    {
        FerramentasValidator.validarSeEhDiretor(modificador);
        FerramentasValidator.validarSeNaoEhDiretor(modificado);
    }
    public void validarDesligamento(Funcionario modificador, Funcionario modificado)
    {
        FerramentasValidator.validarSeEhDiretor(modificador);
        FerramentasValidator.validarSeNaoEhDiretor(modificado);
    }
    public void validarAlteracao(Funcionario modificador, Funcionario modificado)
    {
        FerramentasValidator.validarSeEhDiretor(modificador);
        FerramentasValidator.validarSeNaoEhDiretor(modificado);
    }
}
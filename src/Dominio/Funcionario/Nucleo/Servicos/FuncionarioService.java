package Dominio.Funcionario.Nucleo.Servicos;

import Dominio.Funcionario.Nucleo.Enumeracao.TipoContrato;
import Dominio.Funcionario.Nucleo.Exceptions.RegraContratoException;
import Dominio.Funcionario.Nucleo.Funcionario;
import Dominio.Funcionario.Nucleo.ObjetoDeValor.CargaHoraria;
import Dominio.Funcionario.Nucleo.ObjetoDeValor.Salario;

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
                throw new RegraContratoException("");
            }
        }

        if(contrato == TipoContrato.CLT)
        {
            if(cargaHoraria.getHorasSemanais() < 40 || cargaHoraria.getHorasSemanais() > 44)
            {

            }
        }

        if(contrato == TipoContrato.APRENDIZ)
        {

        }

        if(contrato == TipoContrato.PJ)
        {

        }
    }
}
package Dominio.Funcionario.Nucleo.ObjetoDeValor;

import Dominio.Funcionario.Nucleo.Exceptions.CargaHorariaInvalidaException;

public class CargaHoraria
{
    private int horasSemanais;

    public CargaHoraria(int horasSemanais)
    {
        validarCargaHoraria(horasSemanais);
    }

    private void validarCargaHoraria(int horasSemanais)
    {
        if(horasSemanais <= 0 || horasSemanais > 60) //45 horas obrigatórias + 15 horas extras
        {
            throw new CargaHorariaInvalidaException("ERRO! A CARGA HORÁRIA DEVE ESTAR ENTRE 2H E 60H");
        }

        this.horasSemanais = horasSemanais;
    }

    public int getHorasSemanais()
    {
        return horasSemanais;
    }
}

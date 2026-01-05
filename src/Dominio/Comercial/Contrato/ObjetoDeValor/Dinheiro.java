package Dominio.Comercial.Contrato.ObjetoDeValor;

import Dominio.Comercial.Bolsa.ObjetoDeValor.Percentual;
import Dominio.Comercial.Contrato.Exception.ContratoException;

import java.math.BigDecimal;

public class Dinheiro
{
    private BigDecimal valor;

    public Dinheiro(BigDecimal valor)
    {
        validarValor(valor);
    }

    public void validarValor(BigDecimal valor)
    {
        if (valor == null || valor.compareTo(BigDecimal.ZERO) < 0)
        {
            throw new ContratoException("ERRO! O VALOR DE UM CONTRATO DEVE SER BEM DEFINIDO");
        }

        this.valor = valor;
    }

    public Dinheiro aplicarPercentual(Percentual percentual)
    {
        BigDecimal desconto = valor.multiply(BigDecimal.valueOf(percentual.getValor())).divide(BigDecimal.valueOf(100));
        return new Dinheiro(valor.subtract(desconto));
    }

    public BigDecimal getValor() {
        return valor;
    }
}

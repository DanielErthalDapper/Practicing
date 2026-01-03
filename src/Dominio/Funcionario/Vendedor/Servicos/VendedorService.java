package Dominio.Funcionario.Vendedor.Servicos;

import Dominio.Funcionario.Nucleo.Funcionario;
import Util.FerramentasValidator;

public class VendedorService
{
    public void cadastrarAgendamento(Funcionario vendedor)
    {
        FerramentasValidator.validarSeEhVendedor(vendedor);
    }

    public void criarContrato(Funcionario vendedor)
    {
        FerramentasValidator.validarSeEhVendedor(vendedor);
    }

    public void cadastrarParceria(Funcionario vendedor)
    {
        FerramentasValidator.validarSeEhVendedor(vendedor);
    }
}

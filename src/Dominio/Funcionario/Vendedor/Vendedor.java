package Dominio.Funcionario.Vendedor;

import Dominio.Funcionario.Nucleo.Enumeracao.TipoContrato;
import Dominio.Funcionario.Nucleo.Funcionario;
import Dominio.Funcionario.Nucleo.ObjetoDeValor.CargaHoraria;
import Dominio.Funcionario.Nucleo.ObjetoDeValor.Salario;
import Dominio.Funcionario.Vendedor.Exceptions.MetaMensalException;
import Dominio.Funcionario.Vendedor.ObjetoDeValor.MetaMensal;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.CPF;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.DataDeNascimento;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.Nome;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.Telefone;
import Dominio.Nucleo.Usuario.Enumeracao.NivelAcesso;
import Dominio.Nucleo.Usuario.ObjetoDeValor.Email;
import Dominio.Nucleo.Usuario.ObjetoDeValor.Login;
import Dominio.Nucleo.Usuario.ObjetoDeValor.Senha;

public class Vendedor extends Funcionario
{
    private MetaMensal metaMensal;

    public Vendedor(Long id, Nome nome, CPF cpf, Telefone telefone, DataDeNascimento dataDeNascimento, Senha senha, Email email, Login login, Salario salario, CargaHoraria cargaHoraria, TipoContrato tipoContrato, MetaMensal metaMensal)
    {
        super(id, nome, cpf, telefone, dataDeNascimento, senha, email, login, salario, cargaHoraria, tipoContrato, NivelAcesso.VENDEDOR);
        alteraMetaMensal(metaMensal);
    }

    public void alteraMetaMensal(MetaMensal metaMensal)
    {
        if(metaMensal == null)
        {
            throw new MetaMensalException("ERRO! A META MENSAL NÃO PODE SER NULA");
        }
    }

    public MetaMensal getMetaMensal()
    {
        return metaMensal;
    }
}

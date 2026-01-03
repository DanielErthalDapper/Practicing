package Dominio.Funcionario.Secretario;

import Dominio.Funcionario.Nucleo.Enumeracao.TipoContrato;
import Dominio.Funcionario.Nucleo.Funcionario;
import Dominio.Funcionario.Nucleo.ObjetoDeValor.CargaHoraria;
import Dominio.Funcionario.Nucleo.ObjetoDeValor.Salario;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.CPF;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.DataDeNascimento;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.Nome;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.Telefone;
import Dominio.Nucleo.Usuario.Enumeracao.NivelAcesso;
import Dominio.Nucleo.Usuario.ObjetoDeValor.Email;
import Dominio.Nucleo.Usuario.ObjetoDeValor.Login;
import Dominio.Nucleo.Usuario.ObjetoDeValor.Senha;

public class Secretario extends Funcionario
{
    public Secretario(Long id, Nome nome, CPF cpf, Telefone telefone, DataDeNascimento dataDeNascimento, Senha senha, Email email, Login login, Salario salario, CargaHoraria cargaHoraria, TipoContrato tipoContrato)
    {
        super(id, nome, cpf, telefone, dataDeNascimento, senha, email, login, salario, cargaHoraria, tipoContrato, NivelAcesso.SECRETARIO);
    }
}

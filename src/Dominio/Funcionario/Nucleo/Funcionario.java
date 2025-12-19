package Dominio.Funcionario.Nucleo;

import Dominio.Funcionario.Nucleo.Enumeracao.TipoContrato;
import Dominio.Funcionario.Nucleo.Exceptions.*;
import Dominio.Funcionario.Nucleo.ObjetoDeValor.CargaHoraria;
import Dominio.Funcionario.Nucleo.ObjetoDeValor.Salario;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.CPF;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.DataDeNascimento;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.Nome;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.Telefone;
import Dominio.Nucleo.Usuario.ObjetoDeValor.Email;
import Dominio.Nucleo.Usuario.ObjetoDeValor.Login;
import Dominio.Nucleo.Usuario.ObjetoDeValor.Senha;
import Dominio.Nucleo.Usuario.Usuario;

public class Funcionario extends Usuario
{
    private Salario salario;
    private CargaHoraria cargaHoraria;
    private TipoContrato tipoContrato;

    public Funcionario(Long id, Nome nome, CPF cpf, Telefone telefone, DataDeNascimento dataDeNascimento, Senha senha, Email email, Login login, Salario salario, CargaHoraria cargaHoraria, TipoContrato tipoContrato)
    {
        super(id, nome, cpf, telefone, dataDeNascimento, senha, email, login);
        alteraSalario(salario);
        alteraCargaHoraria(cargaHoraria);
        alteraTipoContrato(tipoContrato);
    }

    public void alteraSalario(Salario salario)
    {
        if(salario == null)
        {
            throw new SalarioinvalidoException("UM FUNCIONARIO DEVE TER SEU SALÁRIO BEM DEFINIDO");
        }

        if(this.salario != null)
        {
            if(igualMeuSalario(salario))
            {
                throw new MesmoSalarioException();
            }
        }

        this.salario = salario;
    }
    public void alteraCargaHoraria(CargaHoraria cargaHoraria)
    {
        if(cargaHoraria == null)
        {
            throw new CargaHorariaInvalidaException("UM FUNCIONARIO DEVE TER SUA CARGA HORÁRIA BEM DEFINIDA");
        }

        if(this.cargaHoraria != null)
        {
            if(igualMinhaCargaHoraria(cargaHoraria))
            {
                throw new MesmaCargaHorariaException();
            }
        }

        this.cargaHoraria = cargaHoraria;
    }
    public void alteraTipoContrato(TipoContrato tipoContrato)
    {
        if(tipoContrato == null)
        {
            throw new TipoContratoInvalidoException("UM FUNCIONARIO DEVE TER SEU TIPO DE CONTRATO BEM DEFINIDO");
        }

        if(this.tipoContrato != null)
        {
            if(igualMeuTipoContrato(tipoContrato))
            {
                throw new MesmoTipoContratoException();
            }
        }
    }

    private boolean igualMeuSalario(Salario salario)
    {
        return this.salario.getValor().equals(salario.getValor());
    }
    private boolean igualMinhaCargaHoraria(CargaHoraria cargaHoraria)
    {
        return this.cargaHoraria.getHorasSemanais() == cargaHoraria.getHorasSemanais();
    }
    private boolean igualMeuTipoContrato(TipoContrato tipoContrato)
    {
        return this.tipoContrato.getDeclaringClass().equals(tipoContrato.getDeclaringClass());
    }

    public Salario getSalario()
    {
        return salario;
    }

    public CargaHoraria getCargaHoraria()
    {
        return cargaHoraria;
    }

    public TipoContrato getTipoContrato()
    {
        return tipoContrato;
    }
}

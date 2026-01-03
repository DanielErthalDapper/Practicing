package Dominio.Funcionario.Professor;

import Dominio.Funcionario.Nucleo.Enumeracao.TipoContrato;
import Dominio.Funcionario.Nucleo.Funcionario;
import Dominio.Funcionario.Nucleo.ObjetoDeValor.CargaHoraria;
import Dominio.Funcionario.Nucleo.ObjetoDeValor.Salario;
import Dominio.Funcionario.Professor.Exceptions.EspecialidadeException;
import Dominio.Funcionario.Professor.Exceptions.MesmoIdiomaException;
import Dominio.Funcionario.Professor.Exceptions.MesmoNivelException;
import Dominio.Funcionario.Professor.Exceptions.ProfessorException;
import Dominio.Funcionario.Professor.ObjetoDeValor.Especialidade;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.CPF;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.DataDeNascimento;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.Nome;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.Telefone;
import Dominio.Nucleo.Usuario.Enumeracao.NivelAcesso;
import Dominio.Nucleo.Usuario.ObjetoDeValor.Email;
import Dominio.Nucleo.Usuario.ObjetoDeValor.Login;
import Dominio.Nucleo.Usuario.ObjetoDeValor.Senha;

public class Professor extends Funcionario
{
    private Especialidade especialidade;

    public Professor(Long id, Nome nome, CPF cpf, Telefone telefone, DataDeNascimento dataDeNascimento, Senha senha, Email email, Login login, Salario salario, CargaHoraria cargaHoraria, TipoContrato tipoContrato, Especialidade especialidade)
    {
        super(id, nome, cpf, telefone, dataDeNascimento, senha, email, login, salario, cargaHoraria, tipoContrato, NivelAcesso.DIRETOR);
        alteraEspecialidade(especialidade);
    }

    public void alteraEspecialidade(Especialidade especialidade)
    {
        if(especialidade == null)
        {
            throw new EspecialidadeException("");
        }

        if(igualMeuIdioma(especialidade))
        {
            throw new MesmoIdiomaException();
        }

        if(igualMeuNivel(especialidade))
        {
            throw new MesmoNivelException();
        }
    }

    public boolean igualMeuNivel(Especialidade especialidade)
    {
        return this.especialidade.getNivel().equals(especialidade.getNivel());
    }

    public boolean igualMeuIdioma(Especialidade especialidade)
    {
        return this.especialidade.getIdioma().equals(especialidade.getIdioma());
    }

    public Especialidade getEspecialidade()
    {
        return especialidade;
    }
}

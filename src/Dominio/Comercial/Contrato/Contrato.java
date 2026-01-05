package Dominio.Comercial.Contrato;

import Dominio.Aluno.Aluno;
import Dominio.Comercial.Bolsa.Bolsa;
import Dominio.Comercial.Contrato.Enumeracoes.StatusContrato;
import Dominio.Comercial.Contrato.Exception.*;
import Dominio.Comercial.Contrato.ObjetoDeValor.Dinheiro;
import Dominio.Funcionario.Nucleo.Funcionario;
import Dominio.Nucleo.Curso.Curso;

import java.time.LocalDate;

public class Contrato
{
    private Long idContrato;

    private Curso curso;
    private Funcionario funcionario;
    private Aluno aluno;

    private Dinheiro dinheiro;
    private Bolsa bolsa;

    private LocalDate dataContrato;
    private StatusContrato statusContrato;

    public Contrato(Long idContrato, Curso curso, Funcionario funcionario, Aluno aluno, Dinheiro dinheiro, Bolsa bolsa, LocalDate dataContrato, StatusContrato statusContrato)
    {
        alteraIdContrato(idContrato);
        alteraCurso(curso);
        alteraFuncionario(funcionario);
        alteraAluno(aluno);
        alteraDinheiro(dinheiro);
        alteraBolsa(bolsa);
        alteraDataContrato(dataContrato);
        alteraStatusContrato(statusContrato);
    }

    public void alteraIdContrato(Long idContrato)
    {
        if(idContrato == null)
        {
            throw new IdContratoException("");
        }

        if(this.idContrato != null)
        {
            if(igualMeuId(idContrato))
            {
                throw new MesmoIdContratoException();
            }
        }

        this.idContrato = idContrato;
    }
    public void alteraCurso(Curso curso)
    {
        if(curso == null)
        {
            throw new CursoContratoException("");
        }

        if(this.curso != null)
        {
            if(igualMeuCurso(curso))
            {
                throw new MesmoCursoException();
            }
        }

        this.curso = curso;
    }
    public void alteraFuncionario(Funcionario funcionario)
    {
        if(funcionario == null)
        {
            throw new FuncionarioContratoException("");
        }

        if(this.funcionario != null)
        {
            if(igualMeuFuncionario(funcionario))
            {
                throw new MesmoFuncionarioContratoException();
            }
        }

        this.funcionario = funcionario;
    }
    public void alteraAluno(Aluno aluno)
    {
        if(aluno == null)
        {
            throw new AlunoContratoException("");
        }

        if(this.aluno != null)
        {
            if(igualMeuAluno(aluno))
            {
                throw new MesmoAlunoContratoException();
            }
        }

        this.aluno = aluno;
    }
    public void alteraDinheiro(Dinheiro dinheiro)
    {
        if(dinheiro == null)
        {
            throw new DinheiroContratoException("");
        }

        if(this.dinheiro != null)
        {
            if(igualMeuDinheiro(dinheiro))
            {
                throw new MesmoDinheiroContratoException();
            }
        }

        this.dinheiro = dinheiro;
    }
    public void alteraBolsa(Bolsa bolsa)
    {
        if(bolsa == null)
        {
            throw new BolsaContratoException("");
        }

        if(this.bolsa != null)
        {
            if(igualMinhaBolsa(bolsa))
            {
                throw new MesmaBolsaContratoException();
            }
        }

        this.bolsa = bolsa;
    }
    public void alteraDataContrato(LocalDate dataContrato)
    {
        if(dataContrato == null)
        {
            throw new DataContratoException("");
        }

        if(this.dataContrato != null)
        {
            if(igualMinhaData(dataContrato))
            {
                throw new MesmaDataContratoException();
            }
        }

        this.dataContrato = dataContrato;
    }
    public void alteraStatusContrato(StatusContrato statusContrato)
    {
        if(statusContrato == null)
        {
            throw new StatusContratoException("");
        }

        if(this.statusContrato != null)
        {
            if (igualMeuStatus(statusContrato))
            {
                throw new MesmoStatusContratoException();
            }
        }

        this.statusContrato = statusContrato;
    }

    // ----  VERIFICAÇÃO DE IGUAL
    public boolean igualMeuId(Long id)
    {
        return this.idContrato.equals(id);
    }
    public boolean igualMeuCurso(Curso curso)
    {
        return this.curso.getNivel().equals(curso.getNivel());
    }
    public boolean igualMeuFuncionario(Funcionario funcionario)
    {
        return this.funcionario.getCpf().equals(funcionario.getCpf());
    }
    public boolean igualMeuAluno(Aluno aluno)
    {
        return this.aluno.getCpf().equals(aluno.getCpf());
    }
    public boolean igualMeuDinheiro(Dinheiro dinheiro)
    {
        return this.dinheiro.getValor().equals(dinheiro.getValor());
    }
    public boolean igualMinhaBolsa(Bolsa bolsa)
    {
        return this.bolsa.getPercentual().equals(bolsa.getPercentual());
    }
    public boolean igualMinhaData(LocalDate dataContrato)
    {
        return this.dataContrato.isEqual(dataContrato);
    }
    public boolean igualMeuStatus(StatusContrato statusContrato)
    {
        return this.statusContrato.equals(statusContrato);
    }

    public Long getIdContrato() {
        return idContrato;
    }

    public Curso getCurso() {
        return curso;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Dinheiro getDinheiro() {
        return dinheiro;
    }

    public Bolsa getBolsa() {
        return bolsa;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public StatusContrato getStatusContrato() {
        return statusContrato;
    }
}

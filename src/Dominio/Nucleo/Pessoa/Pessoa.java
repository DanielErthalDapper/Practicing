package Dominio.Nucleo.Pessoa;

import Dominio.Nucleo.Pessoa.Exceptions.*;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.CPF;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.DataDeNascimento;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.Nome;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.Telefone;

public class Pessoa
{
    private Nome nome;
    private CPF cpf;
    private Telefone telefone;
    private DataDeNascimento dataDeNascimento;
    private Long id;

    public Pessoa(Long id, Nome nome, CPF cpf, Telefone telefone, DataDeNascimento dataDeNascimento)
    {
        alteraIdPessoa(id);
        alteraCpf(cpf);
        alteraNome(nome);
        alteraTelefone(telefone);
    }

    // ---------------------------------------------- ALTERADORES ------------------------------------------- //

    public void alteraIdPessoa(long id) {
        if(id < 0) {
            throw new IdPessoaException("O ID DO FUNCIONARIO INFORMADO ESTÁ INVÁLIDO");
        }

        this.id = id;
    }

    public void alteraCpf(CPF cpf)
    {
        if(cpf == null)
        {
            throw new CpfInvalidoException("UMA PESSOA DEVE POSSUIR SEU CPF BEM DEFINIDO");
        }

        if(this.cpf != null)
        {
            if(igualMeuCpf(cpf))
            {
                throw new MesmoCpfPessoaException();
            }
        }

        this.cpf = cpf;
    }

    public void alteraNome(Nome nome)
    {
        if(nome == null)
        {
            throw new NomeInvalidoException("UMA PESSOA DEVE POSSUIR SEU NOME BEM DEFINIDO");
        }

        if(this.nome != null)
        {
            if(igualMeuNome(nome))
            {
                throw new MesmoNomePessoaException();
            }
        }

        this.nome = nome;
    }

    public void alteraTelefone(Telefone telefone)
    {
        if(telefone == null)
        {
            throw new TelefoneInvalidoException("UMA PESSOA DEVE POSSUIR SEU TELEFONE BEM DEFINIDO");
        }

        if(this.telefone != null)
        {
            if(igualMeuTelefone(telefone))
            {
                throw new MesmoTelefonePessoaException();
            }
        }

        this.telefone = telefone;
    }

    public void alteraDataNascimento(DataDeNascimento data)
    {
        if(data == null)
        {
            throw new DataDeNascimentoInvalidoException("UMA PESSOA DEVE POSSUIR UMA DATA DE NASCIMENTO BEM DEFINIDA");
        }

        if(this.dataDeNascimento != null)
        {
            if(igualMinhaData(data))
            {
                throw new MesmaDataNascimentoException();
            }
        }
    }

    // ------------------------------------------------------------------------------------------------------ //

    private boolean igualMeuNome(Nome nome) {
        return this.nome.getPrimeiroNome().equalsIgnoreCase(nome.getPrimeiroNome());
    }

    private boolean igualMeuCpf(CPF cpf) {
        return this.cpf.getCpf().equals(cpf.getCpf());
    }

    private boolean igualMeuTelefone(Telefone telefone)
    {
        return this.telefone.getNumeroTelefone().equals(telefone.getNumeroTelefone());
    }

    private boolean igualMinhaData(DataDeNascimento data)
    {
        return this.dataDeNascimento.getDataDeNascimento().equals(data.getDataDeNascimento());
    }
}

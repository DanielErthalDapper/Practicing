package Dominio.Nucleo.Usuario.Servicos;

import Dominio.Nucleo.Pessoa.Exceptions.CpfInvalidoException;
import Dominio.Nucleo.Pessoa.Exceptions.IdPessoaException;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.CPF;
import Dominio.Nucleo.Usuario.Repositorios.RepositorioUsuario;

public class UsuarioService
{
    private RepositorioUsuario repositorioUsuario;

    public UsuarioService(RepositorioUsuario repositorioUsuario)
    {
        this.repositorioUsuario = repositorioUsuario;
    }

    public void cpfUtilizado(CPF cpf)
    {
        if(repositorioUsuario.existeCpf(cpf))
        {
            throw new CpfInvalidoException("O CPF INFORMADO JÁ ESTÁ SENDO UTILIZADO");
        }
    }

    public void idUtilizado(Long id)
    {
        if(repositorioUsuario.existeId(id))
        {
            throw new IdPessoaException("O ID INFORMADO JÁ ESTÁ SENDO UTILIZADO");
        }
    }
}

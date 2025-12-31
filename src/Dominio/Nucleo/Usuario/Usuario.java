package Dominio.Nucleo.Usuario;

import Dominio.Nucleo.Pessoa.ObjetoDeValor.CPF;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.DataDeNascimento;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.Nome;
import Dominio.Nucleo.Pessoa.ObjetoDeValor.Telefone;
import Dominio.Nucleo.Pessoa.Pessoa;
import Dominio.Nucleo.Usuario.Enumeracao.NivelAcesso;
import Dominio.Nucleo.Usuario.Exceptions.*;
import Dominio.Nucleo.Usuario.ObjetoDeValor.Email;
import Dominio.Nucleo.Usuario.ObjetoDeValor.Login;
import Dominio.Nucleo.Usuario.ObjetoDeValor.Senha;

public class Usuario extends Pessoa
{
    private Senha senha;
    private Email email;
    private Login login;
    private NivelAcesso nivelAcesso;

    public Usuario(Long id, Nome nome, CPF cpf, Telefone telefone, DataDeNascimento dataDeNascimento, Senha senha, Email email, Login login, NivelAcesso nivelAcesso)
    {
        super(id, nome, cpf, telefone, dataDeNascimento);
        alteraSenha(senha);
        alteraEmail(email);
        alteraLogin(login);
        alteraNivelAcesso(nivelAcesso);
    }

    public void alteraSenha(Senha senha)
    {
        if(senha == null)
        {
            throw new SenhaInvalidaException("UM USUÁRIO DEVE POSSUIR SUA SENHA BEM DIFINIDA");
        }

        if(this.senha != null)
        {
            if(igualMinhaSenha(senha))
            {
                throw new MesmaSenhaUsuarioException();
            }
        }

        this.senha = senha;
    }

    public void alteraEmail(Email email)
    {
        if(email == null)
        {
            throw new EmailInvalidoException("UM USUÁRIO DEVE POSSUIR SEU EMAIL BEM DEFINIDO");
        }

        if(this.email != null)
        {
            if(igualMeuEmail(email))
            {
                throw new MesmoEmailUsuarioException();
            }
        }

        this.email = email;
    }

    public void alteraLogin(Login login)
    {
        if(login == null)
        {
            throw new LoginInvalidoException("UM USUÁRIO DEVE POSSUIR SEU LOGIN BEM DEFINIDO");
        }

        if(this.login != null)
        {
            if(igualMeuLogin(login))
            {
                throw new MesmoLoginUsuarioException();
            }
        }

        this.login = login;
    }

    public void alteraNivelAcesso(NivelAcesso nivelAcesso)
    {
        if(nivelAcesso == null)
        {
            throw new NivelAcessoInvalido("UM USUÁRIO DEVE POSSUIR SEU NÍVEL DE ACESSO BEM DEFINIDO");
        }
    }



    // ------------------------------------------------------------------------------------------- //

    private boolean igualMinhaSenha(Senha senha)
    {
        return this.senha.getSenha().equals(senha.getSenha());
    }

    private boolean igualMeuEmail(Email email)
    {
        return this.email.getEmail().equals(email.getEmail());
    }

    private boolean igualMeuLogin(Login login)
    {
        return this.login.getValor().equals(login.getValor());
    }

    public NivelAcesso getNivelAcesso()
    {
        return nivelAcesso;
    }
}

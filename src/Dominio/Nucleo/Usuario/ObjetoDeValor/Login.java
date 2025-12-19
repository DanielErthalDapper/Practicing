package Dominio.Nucleo.Usuario.ObjetoDeValor;

import Dominio.Nucleo.Usuario.Enumeração.TipoLogin;
import Dominio.Nucleo.Usuario.Exceptions.LoginInvalidoException;

public class Login
{
    private String valor;
    private TipoLogin tipo;

    public Login(String valor, TipoLogin tipo)
    {
        validarLogin();
    }

    private void validarLogin()
    {
        if (valor == null || valor.isBlank()) {
            throw new LoginInvalidoException("Login não pode ser vazio");
        }

        String normalizado = valor.trim();

        if (ehCpf(normalizado)) {
            this.tipo = TipoLogin.CPF;
            this.valor = normalizado;
        }
        else if (ehEmail(normalizado)) {
            this.tipo = TipoLogin.EMAIL;
            this.valor = normalizado.toLowerCase();
        }
        else if (ehTelefone(normalizado)) {
            this.tipo = TipoLogin.TELEFONE;
            this.valor = normalizado;
        }
        else {
            throw new LoginInvalidoException("Login deve ser CPF, e-mail ou telefone");
        }
    }

    public TipoLogin getTipo()
    {
        return tipo;
    }
    public String getValor()
    {
        return valor;
    }

    private boolean ehCpf(String valor) {
        return valor.matches("\\d{11}");
    }

    private boolean ehEmail(String valor) {
        return valor.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    private boolean ehTelefone(String valor) {
        return valor.matches("\\d{10,11}");
    }
}

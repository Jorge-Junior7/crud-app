package CLASSESPESSOAA;

import java.util.Date;

public class Pessoa {

    //Atributos / Caracteres
    private String nome_completo;
    private Date data_nascimento;
    private int idade;
    private String cpf;
    private String email;
    private String senha;
    private boolean tipo_pessoa;

    //Métodos / funçoes
    

    //Gets e Sets
    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isTipo_pessoa() {
        return tipo_pessoa;
    }

    public void setTipo_pessoa(boolean tipo_pessoa) {
        this.tipo_pessoa = tipo_pessoa;
    }

}

package DTO;

public class Registro {

    private String nome_completo;
    private String dia;
    private String mes;
    private String ano;
    private String cpf;
    private String email;
    private String senha;
    private String tipo_conta;

    

    // Getters e setters dos campos
    public String getNome_completo() {
        return nome_completo;
    }

    public void setNomeCompleto(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String Cpf) {
        this.cpf = Cpf;
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

    public String getTipo_conta() {
        return tipo_conta;
    }

    public void setTipo_conta(String tipo_Conta) {
        this.tipo_conta = tipo_conta;
    }

}

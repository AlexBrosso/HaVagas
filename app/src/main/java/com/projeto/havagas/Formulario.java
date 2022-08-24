package com.projeto.havagas;

public class Formulario {

    private String nome;
    private String email;
    private String emailCb;
    private String telefone;
    private String tipoSp;
    private String celular;
    private String sexo;
    private String data;
    private String anoFundamental;
    private String anoMedio;
    private String anoGraduacao;
    private String instGraduacao;
    private String anoEspecializacao;
    private String instEspecializacao;
    private String anoMestrado;
    private String instMestrado;
    private String monoMestrado;
    private String orientMestrado;
    private String anoDoutorado;
    private String instDoutorado;
    private String monoDoutorado;
    private String orientDoutorado;
    private String vaga;

    public Formulario(String nome, String email, String emailCb, String telefone, String tipoSp, String celular,
                      String sexo, String data, String anoFundamental, String anoMedio,
                      String anoGraduacao, String instGraduacao, String anoEspecializacao, String instEspecializacao,
                      String anoMestrado, String instMestrado, String monoMestrado, String orientMestrado,
                      String anoDoutorado, String instDoutorado, String monoDoutorado, String orientDoutorado,
                      String vaga)
    {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.emailCb = emailCb;
        this.tipoSp = tipoSp;
        this.celular = celular;
        this.data = data;
        this.anoFundamental = anoFundamental;
        this.anoMedio = anoMedio;
        this.anoGraduacao = anoGraduacao;
        this.instGraduacao = instGraduacao;
        this.anoEspecializacao = anoEspecializacao;
        this.instEspecializacao = instEspecializacao;
        this.anoMestrado = anoMestrado;
        this.instMestrado = instMestrado;
        this.monoMestrado = monoMestrado;
        this.orientMestrado = orientMestrado;
        this.anoDoutorado = anoDoutorado;
        this.instDoutorado = instDoutorado;
        this.monoDoutorado = monoDoutorado;
        this.orientDoutorado = orientDoutorado;
        this.vaga = vaga;

    }

    public String getNome() {
        return nome;
    }

    public String getCheckEmail() {
        return emailCb;
    }

    public String getCheckTipo() {
        return tipoSp;
    }

    public String getCelular() {
        return celular;
    }

    public String getData() {
        return data;
    }

    public String getAnoFundamental() {
        return anoFundamental;
    }

    public String getAnoMedio() {
        return anoMedio;
    }

    public String getAnoGraduacao() {
        return anoGraduacao;
    }

    public String getInstGraduacao() {
        return instGraduacao;
    }

    public String getAnoEspecializacao() {
        return anoEspecializacao;
    }

    public String getInstEspecializacao() {
        return instEspecializacao;
    }

    public String getAnoMestrado() {
        return anoMestrado;
    }

    public String getInstMestrado() {
        return instMestrado;
    }

    public String getMonoMestrado() {
        return monoMestrado;
    }

    public String getOrientMestrado() {
        return orientMestrado;
    }

    public String getAnoDoutorado() {
        return anoDoutorado;
    }

    public String getInstDoutorado() {
        return instDoutorado;
    }

    public String getMonoDoutorado() {
        return monoDoutorado;
    }

    public String getOrientDoutorado() {
        return orientDoutorado;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getSexo() {
        return sexo;
    }

    public String getVaga() {
        return vaga;
    }

    public String toString(){
        return "Nome: " + getNome() + "\n"
                + "Email: " + getEmail() + "\n"
                + getCheckEmail() + "\n"
                + "Telefone: " + getTelefone() + "\n"
                + getCheckTipo() + "\n"
                + "Celular: " + getCelular() + "\n"
                + getSexo() + "\n"
                + "Data De Nascimento: " + getData() + "\n"
                + "- Fundamental - " + "\n"
                + "Ano de Conclusão: " + getAnoFundamental() + "\n"
                + "- Médio -" + "\n"
                + "Ano de Conclusão: " + getAnoMedio() + "\n"
                + "- Graduação -" + "\n"
                + "Ano de Conclusão: " + getAnoGraduacao() + "\n"
                + "Instituição: " + getInstGraduacao() + "\n"
                + "- Especialização -" + "\n"
                + "Ano de Conclusão: " + getAnoEspecializacao() + "\n"
                + "Instituição: " + getInstEspecializacao() + "\n"
                + "- Mestrado -" + "\n"
                + "Ano de Conclusão: " + getAnoMestrado() + "\n"
                + "Instituição: " + getInstMestrado() + "\n"
                + "Título da Monografia: " + getMonoMestrado() + "\n"
                + "Orientador: " + getOrientMestrado() + "\n"
                + "- Doutorado -" + "\n"
                + "Ano de Conclusão: " + getAnoDoutorado() + "\n"
                + "Instituição: " + getInstDoutorado() + "\n"
                + "Título da Monografia: " + getMonoDoutorado() + "\n"
                + "Orientador: " + getOrientDoutorado() + "\n"
                + "Vaga: " + getVaga() + "\n";
    }

}

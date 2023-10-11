package br.com.faculdade.model;

public class Estudante {
    private long matriculaEstudante;
    private String nomeEstudante;
    private String emailEstudante;
    private long telefoneEstudante;
    private String enderecoCompletoEstudante;

    public Estudante(long matriculaEstudante, String nomeEstudante, String emailEstudante, long telefoneEstudante, String enderecoCompletoEstudante) {
        this.matriculaEstudante = matriculaEstudante;
        this.nomeEstudante = nomeEstudante;
        this.emailEstudante = emailEstudante;
        this.telefoneEstudante = telefoneEstudante;
        this.enderecoCompletoEstudante = enderecoCompletoEstudante;
    }

    @Override
    public String toString() {
        return "Matricula do estudante: " + matriculaEstudante + "\n " + "nome do estudante: " + nomeEstudante + "\n " + "email do estudante: " + emailEstudante + "\n " + "telefone do estudante: " + telefoneEstudante + "\n " + "endereco do estudante: " + enderecoCompletoEstudante + "\n ";

    }

    public long getMatriculaEstudante() {
        return matriculaEstudante;
    }

    public void setMatriculaEstudante(long matriculaEstudante) {
        this.matriculaEstudante = matriculaEstudante;
    }

    public String getNomeEstudante() {
        return nomeEstudante;
    }

    public void setNomeEstudante(String nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }

    public String getEmailEstudante() {
        return emailEstudante;
    }

    public void setEmailEstudante(String emailEstudante) {
        this.emailEstudante = emailEstudante;
    }

    public long getTelefoneEstudante() {
        return telefoneEstudante;
    }

    public void setTelefoneEstudante(long telefoneEstudante) {
        this.telefoneEstudante = telefoneEstudante;
    }

    public String getEnderecoCompletoEstudante() {
        return enderecoCompletoEstudante;
    }

    public void setEnderecoCompletoEstudante(String enderecoCompletoEstudante) {
        this.enderecoCompletoEstudante = enderecoCompletoEstudante;
    }
}

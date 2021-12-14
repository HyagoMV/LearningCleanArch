package domain;

import java.util.StringJoiner;

public class Participante {
    private String nome;
    private String email;
    private Integer pontuacao;

    public Participante(String nome, String email, Integer pontuacao) {
        setNome(nome);
        setEmail(email);
        setPontuacao(pontuacao);
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        if (pontuacao < 0)
            throw new IllegalArgumentException("Pontuação negativa");
        this.pontuacao = pontuacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@"))
            throw new IllegalArgumentException("Email inválido");
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() < 20)
            throw new IllegalArgumentException("Nome inferior a 20 caracteres");
        this.nome = nome;
    }
   
    @Override
    public String toString() {
        return "Participante" + 
            new StringJoiner(", ", "[", "]")
            .add(nome).add(email).add(pontuacao.toString());
    }
}
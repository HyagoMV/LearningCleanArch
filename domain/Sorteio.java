package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteio {
    private List<Participante> participantes;
    private int pontuacao;
    private Random random;

    public Sorteio(int pontucaoSorteio) {
        setPontuacao(pontucaoSorteio);
        participantes = new ArrayList<>();
        random = new Random();
    }

    public boolean adicionaParticipante(Participante participante) {
        if (participante.getPontuacao() < pontuacao)
            return false; 
        return participantes.add(participante);
    }

    public Participante sorteia() {
        var indexSotiado = random.nextInt(participantes.size());
        var ganhador = participantes.get(indexSotiado);
        participantes.remove(indexSotiado);
        return ganhador;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        if (pontuacao < 0)
            throw new IllegalArgumentException("Pontuação negativa");
            System.out.println(pontuacao);
        this.pontuacao = pontuacao;
    }
}

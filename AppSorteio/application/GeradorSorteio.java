package application;

import java.util.ArrayList;
import java.util.List;

import domain.Participante;
import domain.Sorteio;

public class GeradorSorteio {
    
    private Sorteio sorteio;
    private ParticipanteRepositorio repositorio;

    public GeradorSorteio(int pontuacaoSoteio, ParticipanteRepositorio repositorio) {
        sorteio = new Sorteio(pontuacaoSoteio);
        this.repositorio = repositorio;
        init();
    }

    private void init() {
        var participantes = repositorio.bucaPorTodos();
        participantes.forEach(sorteio::adicionaParticipante);
    }

    public List<Participante> sortea(Integer numGanhadores) {
        var ganhadores = new ArrayList<Participante>(numGanhadores);
        for (var i = 0; i < numGanhadores; i++) {
            ganhadores.add(sorteio.sorteia());
        }
        return ganhadores;
    }
}

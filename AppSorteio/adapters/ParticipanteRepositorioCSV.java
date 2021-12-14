package adapters;

import java.util.List;

import application.ParticipanteRepositorio;
import domain.Participante;

public class ParticipanteRepositorioCSV implements ParticipanteRepositorio {

    @Override
    public List<Participante> bucaPorTodos() {
        return List.of(
            new Participante("Aaaaaaaaaa Aaaaaaaaaa", "A@", 100),
            new Participante("Bbbbbbbbbb Bbbbbbbbbb", "B@", 150),
            new Participante("Cccccccccc Cccccccccc", "C@", 200),
            new Participante("Dddddddddd Dddddddddd", "D@", 120),
            new Participante("Eeeeeeeeee Eeeeeeeeee", "E@", 300),
            new Participante("Ffffffffff Ffffffffff", "F@", 50)
        );
    }
    
}

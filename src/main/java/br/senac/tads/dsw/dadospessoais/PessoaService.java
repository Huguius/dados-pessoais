package br.senac.tads.dsw.dadospessoais;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PessoaService {

    private Map<String, PessoaDto> mapPessoas;

    public PessoaService() {
        mapPessoas = new HashMap<>();
        mapPessoas.put("fulano",
                new PessoaDto("fulano", "Fulano Da Silva", LocalDate.parse("2000-10-20"), "fulano@email.com",
                        "11 99454-4762", List.of("Java", "Srping Boot", "Bleach Brave Souls", "Anime"), "Abcd1234"));
        mapPessoas.put("Hugo",
                new PessoaDto("hugojo", "Hugojo Toji Fushiguro", LocalDate.parse("1988-10-11"), "hugojo@email.com",
                        "11 99454-4762", List.of("Bleach Brave Souls", "Anime"), "TojiHugo"));
        mapPessoas.put("Gabriel",
                new PessoaDto("gayzao", "Gabriel Gay Shiquedoni", LocalDate.parse("2424-24-24"), "gay@email.com",
                        "11 99454-4762", List.of("aquelescara", "yaoi"), "shiquedoni"));
    }

    public List<PessoaDto> findAll() {
        return new ArrayList<>(mapPessoas.values());
    }

    public PessoaDto findByUsername(String username) {
        return mapPessoas.get(username);
    }

    public PessoaDto addNew(PessoaDto dto) {
        return null;
    }

    public PessoaDto update(String username, PessoaDto dto) {
        return null;
    }

    public void delete(String username) {

    }
}

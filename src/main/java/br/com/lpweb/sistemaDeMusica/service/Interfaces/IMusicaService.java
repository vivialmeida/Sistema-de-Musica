package br.com.lpweb.sistemaDeMusica.service.Interfaces;

import br.com.lpweb.sistemaDeMusica.model.Musica;

import java.util.List;

public interface IMusicaService {

       List<Musica> recuperaMusicas();

       Musica recuperaMusicaPor(Integer id);

       void insereMusica(Musica musica);

       void excluiMusicaPor(Integer id);

       Musica atualizaMusica(Musica musica , Integer id);

//       Page<Musica> busca(MusicaFiltro filtro, Pageable pageable);
}

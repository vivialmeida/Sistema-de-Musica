package br.com.lpweb.sistemaDeMusica.controller;

import br.com.lpweb.sistemaDeMusica.model.Artista;
import br.com.lpweb.sistemaDeMusica.service.Interfaces.IArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/artista")
public class ArtistaController {

      @Autowired
      private IArtistaService artistaService;


      @GetMapping
      public ResponseEntity buscaArtista(){
            return ResponseEntity.ok().body(artistaService.recuperaArtistas());
      }

      @GetMapping("/{id}")
      public ResponseEntity buscaArtistaPor(@PathVariable Integer id){
            return ResponseEntity.ok().body(artistaService.recuperaArtistaPor(id));
      }

      @PostMapping
      public ResponseEntity InsereArtista(@RequestBody Artista artista){
            artistaService.insereArtista(artista);
            return ResponseEntity.ok().body(artistaService.recuperaArtistas());
      }


      @DeleteMapping("/{id}")
      public ResponseEntity excluiArtistaPor(@PathVariable Integer id){
            artistaService.excluiArtistaPor(id);
            return ResponseEntity.status(HttpStatus.OK).build();
      }

      @PutMapping("/{id}")
      public ResponseEntity atualizaAlbum(@PathVariable Integer id){
            return ResponseEntity.ok().body(artistaService.atualizaArtista(id));
      }



}

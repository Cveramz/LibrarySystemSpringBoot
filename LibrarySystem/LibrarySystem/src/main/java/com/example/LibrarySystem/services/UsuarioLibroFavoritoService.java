package com.example.LibrarySystem.services;

import com.example.LibrarySystem.models.Libro;
import com.example.LibrarySystem.models.Usuario;
import com.example.LibrarySystem.models.UsuarioLibroFavorito;
import com.example.LibrarySystem.repositories.UsuarioLibroFavoritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class UsuarioLibroFavoritoService implements UsuarioLibroFavoritoRepository{
    @Autowired
    private UsuarioLibroFavoritoRepository usuarioLibroFavoritoRepository;

    /*--------------------------------------------------------------------------------------------------------
         * addUserLibFav: metodo que guarda un nuevo UserLibFav en la base de datos;
         *
         * @param neoUserLibFav - un objeto de tipo UsuarioLibroFavorito que contiene los datos del UsuarioLibroFavorito a guardar;
         * * @return - el UserLibFav creado y registrado;
         *
          --------------------------------------------------------------------------------------------------------*/
    public UsuarioLibroFavorito addUserLibFav(UsuarioLibroFavorito neoUserLibFav){
        return usuarioLibroFavoritoRepository.save(neoUserLibFav);

    }

    public List<UsuarioLibroFavorito> listUserLibFav() {
        return usuarioLibroFavoritoRepository.findAll();
    }

    /*--------------------------------------------------------------------------------------------------------
     * geByIdUserLibFav: metodo que obtiene un Usuario libro favorito según su id;
     *
     * @param id - el id del usuario libro favorito en la base de datos;
     * @return - el usuarioLibroFavorito correspondiente al id especificado;
     --------------------------------------------------------------------------------------------------------*/

    public UsuarioLibroFavorito getByIdUserLibFav(long id) {
        return usuarioLibroFavoritoRepository.findById(id).get();
    }
    /*--------------------------------------------------------------------------------------------------------
     * updateUserLibFav: metodo que actualiza los datos de un userLibFav del mismo id;
     *
     * @param ulf- el objeto con el id y los datos nuevos del usuario libro favorito;
     * @return - el usuario libro favorito actualizado;
     --------------------------------------------------------------------------------------------------------*/
    public UsuarioLibroFavorito updateUserLibFav( UsuarioLibroFavorito ulf){
        UsuarioLibroFavorito userLibFav= usuarioLibroFavoritoRepository.findById(ulf.getId()).orElse(null);
        if(userLibFav!=null){
            userLibFav.setLibro(ulf.getLibro());
            userLibFav.setUsuario(ulf.getUsuario());
            return usuarioLibroFavoritoRepository.save(ulf);
        }
        else{
            return null;
        }

    }

    /*--------------------------------------------------------------------------------------------------------
         * deleteByIdUserLibFav: metodo que elimina un usuario libro favorito por su id;
         *
         * @param id - id del usuario libro favorito a eliminar;
         *
         --------------------------------------------------------------------------------------------------------*/
    public void deleteByIdUserLibFav(long id) {
        usuarioLibroFavoritoRepository.deleteById(id);

    }
    @Override
    public void flush() {

    }

    @Override
    public <S extends UsuarioLibroFavorito> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends UsuarioLibroFavorito> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<UsuarioLibroFavorito> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public UsuarioLibroFavorito getOne(Long aLong) {
        return null;
    }

    @Override
    public UsuarioLibroFavorito getById(Long aLong) {
        return null;
    }


    @Override
    public UsuarioLibroFavorito getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends UsuarioLibroFavorito> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends UsuarioLibroFavorito> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends UsuarioLibroFavorito> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends UsuarioLibroFavorito> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends UsuarioLibroFavorito> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends UsuarioLibroFavorito> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends UsuarioLibroFavorito, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends UsuarioLibroFavorito> S save(S entity) {
        return null;
    }

    @Override
    public <S extends UsuarioLibroFavorito> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public List<UsuarioLibroFavorito> findAll() {
        return null;
    }

    @Override
    public Optional<UsuarioLibroFavorito> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }



    @Override
    public List<UsuarioLibroFavorito> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }


    @Override
    public void delete(UsuarioLibroFavorito entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends UsuarioLibroFavorito> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<UsuarioLibroFavorito> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<UsuarioLibroFavorito> findAll(Pageable pageable) {
        return null;
    }
}

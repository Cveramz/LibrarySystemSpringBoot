package com.example.LibrarySystem.services;

import com.example.LibrarySystem.models.Usuario;
import com.example.LibrarySystem.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class UsuarioService implements UsuarioRepository{
    @Autowired
    private UsuarioRepository usuarioRepository;


    /*--------------------------------------------------------------------------------------------------------
     * createUser: metodo que guarda un nuevo usuario en la base de datos;
     *
     * @param user - un objeto de tipo Usuario que contiene los datos del usuario a guardar;
     * * @return - el suario creado y registrado;
     *
      --------------------------------------------------------------------------------------------------------*/
    public Usuario createUser(Usuario user){
        return usuarioRepository.save(user);
    }

    /*--------------------------------------------------------------------------------------------------------
     * getUsuarioByid: metodo que obtiene un usuario según su id;
     *
     * @param id_usuario - el id del usuario en la base de datos;
     * @return - el usuario correspondiente al id especificado;
     --------------------------------------------------------------------------------------------------------*/
    @Override
    public Usuario getUsuarioByid(long id_usuario){
        return usuarioRepository.getUsuarioByid(id_usuario);
    }


    /*--------------------------------------------------------------------------------------------------------
     * updateUser: metodo que actualiza los datos de un user del mismo id;
     *
     * @param usuarioUpdate - el objeto con el id y los datos nuevos del usuario;
     * @return - el usuario actualizado;
     --------------------------------------------------------------------------------------------------------*/
    public Usuario updateUser(Usuario usuarioUpdate) {
        Usuario existente = usuarioRepository.findById(usuarioUpdate.getId()).orElse(null);
        if (existente != null) {
            existente.setFecha_nacimiento(usuarioUpdate.getFecha_nacimiento());
            existente.setNombre(usuarioUpdate.getNombre());
            existente.setApellido(usuarioUpdate.getApellido());
            existente.setContraseña(usuarioUpdate.getContraseña());
            existente.setEmail(usuarioUpdate.getEmail());
            return usuarioRepository.save(existente);
        } else {
            return null;
        }
    }

    /*--------------------------------------------------------------------------------------------------------
     * deleteByIdUsuario: metodo que elimina un usuario por su id;
     *
     * @param id - id del usuario a eliminar;
     *
     --------------------------------------------------------------------------------------------------------*/
    public void deleteByIdUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }



    @Override
    public void flush() {

    }
    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }
    @Override
    public <S extends Usuario> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Usuario> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Usuario> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {}


    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Usuario getOne(Long aLong) {
        return null;
    }

    @Override
    public Usuario getById(Long aLong){return null;}


    @Override
    public Usuario getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Usuario> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Usuario> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Usuario> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Usuario> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Usuario> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Usuario> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Usuario, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Usuario> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Usuario> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Usuario> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }



    @Override
    public List<Usuario> findAllById(Iterable<Long> longs) {
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
    public void delete(Usuario entity) {
    usuarioRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Usuario> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Usuario> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Usuario> findAll(Pageable pageable) {
        return null;
    }
}

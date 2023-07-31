package com.example.LibrarySystem.services;

import com.example.LibrarySystem.models.Carro;
import com.example.LibrarySystem.models.Libro;
import com.example.LibrarySystem.repositories.LibroRepository;
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
public class LibroService implements LibroRepository{
    @Autowired
    private LibroRepository libroRepository;
    /*--------------------------------------------------------------------------------------------------------
     * createLibro: metodo que guarda un libro en la base de datos;
     *
     * @param libro - un objeto de tipo Libro que contiene los datos del libro a registrar;
     * @return - el libro registrado;
      --------------------------------------------------------------------------------------------------------*/
    public Libro createLibro(Libro libro){
        return libroRepository.save(libro);
    }


    /*--------------------------------------------------------------------------------------------------------
     * getLibroById: metodo que obtiene un libro según su id;
     *
     * @param id_libro - el id del libro en la base de datos;
     * @return - el libro correspondiente al id especificado;
      --------------------------------------------------------------------------------------------------------*/
    @Override
    public Libro getLibroById(long isbn){

        return libroRepository.getLibroById(isbn);
    }

    @Override
    public Libro updateLibro(Libro libroUpdate) {
        return null;
    }

    /*--------------------------------------------------------------------------------------------------------
  * updateLibro: metodo que actualiza los datos de un libro del mismo id;
  *
  * @param  - el objeto con el id y los datos nuevos del libro;
  * @return - el libro actualizado;
   --------------------------------------------------------------------------------------------------------*/
    public Libro updateCarro(Libro libroUpdate) {
        Libro existente = libroRepository.getLibroById(libroUpdate.getIdLibro());
        if (existente != null) {
            existente.setUsuario(libroUpdate.getUsuario());
            existente.setNombre(libroUpdate.getNombre());
            existente.setVisualizaciones(libroUpdate.getVisualizaciones());
            existente.setValoracionPromedio(libroUpdate.getValoracionPromedio());
            existente.setLinkReferencia(libroUpdate.getLinkReferencia());
            existente.setPrecio(libroUpdate.getPrecio());
            existente.setStock(libroUpdate.getStock());
            return libroRepository.save(existente);
        } else {
            return null;
        }
    }
    /*--------------------------------------------------------------------------------------------------------
 * deleteByIdCarro: metodo que elimina un carro por su id;
 *
 * @param id - id del libro a eliminar;
 *
  --------------------------------------------------------------------------------------------------------*/
    public void deleteByIdLibro(Long isbn) {
        libroRepository.deleteById(isbn);
    }
    @Override
    public void flush() {

    }
    @Override
    public List<Libro> findAll() {
        return libroRepository.findAll();
    }

    @Override
    public <S extends Libro> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Libro> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Libro> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Libro getOne(Long aLong) {
        return null;
    }

    @Override
    public Libro getById(Long aLong) {
        return null;
    }

    @Override
    public Libro getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Libro> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Libro> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Libro> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Libro> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Libro> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Libro> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Libro, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Libro> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Libro> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Libro> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }



    @Override
    public List<Libro> findAllById(Iterable<Long> longs) {
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
    public void delete(Libro entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Libro> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Libro> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Libro> findAll(Pageable pageable) {
        return null;
    }
}

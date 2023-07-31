package com.example.LibrarySystem.services;

import com.example.LibrarySystem.models.Restriccion;
import com.example.LibrarySystem.repositories.RestriccionRepository;
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
public class RestriccionService implements RestriccionRepository{
    @Autowired
    private RestriccionRepository restriccionRepository;

    @Override
    public void flush() {

    }
    /*--------------------------------------------------------------------------------------------------------
     * findAll: Obtiene todas las restricciones de los libros de la base de datos
     *
     * @param
     * @return - List<Restriccion>: Lista de restricciones de los libros
      --------------------------------------------------------------------------------------------------------*/
    @Override
    public List<Restriccion> findAll() {
        return restriccionRepository.findAll();
    }

    /*--------------------------------------------------------------------------------------------------------
     * findByIdRestriccion: Obtiene una restriccion de un libro de la base de datos
     *
     * @param id - int: Id de la restriccion a buscar
     * @return - Optional<Restriccion>: Restriccion del libro
      --------------------------------------------------------------------------------------------------------*/

    /*--------------------------------------------------------------------------------------------------------
     * findByEdad: Obtiene una restriccion de un libro de la base de datos
     *
     * @param edad - String: Edad de la restriccion a buscar
     * @return - List<Restriccion>: Restriccion del libro
      --------------------------------------------------------------------------------------------------------*/
    @Override
    public Optional<Restriccion> findByIdRestriccion(int idRestriccion) {
        return restriccionRepository.findByIdRestriccion(idRestriccion);
    }



    /*--------------------------------------------------------------------------------------------------------
     * getRestriccionesByEdad: Obtiene una restriccion de un libro de la base de datos
     *
     * @param edad - String: Edad de la restriccion a buscar
     * @return - List<Restriccion>: Restriccion del libro
     *
      --------------------------------------------------------------------------------------------------------*/
    @Override
    public List<Restriccion> findByEdad(String edad) {
        return restriccionRepository.findByEdad(edad);
    }

    /*--------------------------------------------------------------------------------------------------------
     * getRestriccionesByLibroIsbn: Obtiene una restriccion de un libro de la base de datos
     *
     * @param isbn - Long: Isbn del libro a buscar
     * @return - List<Restriccion>: Restriccion del libro
     *
      --------------------------------------------------------------------------------------------------------*/
    @Override
    public List<Restriccion> findByLibroIsbn(Long isbn) {
        return restriccionRepository.findByLibroIsbn(isbn);
    }

    /*--------------------------------------------------------------------------------------------------------
        * saveRestriccion: Guarda una restriccion de un libro en la base de datos
        *
        * @param restriccion - Restriccion: Restriccion del libro a guardar
        * @return - Restriccion: Restriccion del libro guardada
        *
      --------------------------------------------------------------------------------------------------------*/
    public Restriccion saveRestriccion(Restriccion restriccion) {
        return restriccionRepository.save(restriccion);
    }



    /*--------------------------------------------------------------------------------------------------------
        * updateRestriccion: Actualiza una restriccion de un libro en la base de datos
        * @param restriccion - Restriccion: Restriccion del libro a actualizar
        * @return - Restriccion: Restriccion del libro actualizada
      --------------------------------------------------------------------------------------------------------*/
    public Restriccion updateRestriccion(Restriccion restriccion) {
        return restriccionRepository.save(restriccion);
    }

    /*--------------------------------------------------------------------------------------------------------
        * deleteById: Elimina una restriccion de un libro en la base de datos
        * @param idRestriccion - Integer: Id de la restriccion del libro a eliminar
        * @return - void: No retorna nada
      --------------------------------------------------------------------------------------------------------*/
    @Override
    public void deleteByRestriccionId(Integer idRestriccion) {
        restriccionRepository.deleteByRestriccionId(idRestriccion);
    }
    @Override
    public void deleteById(Long id) {
        restriccionRepository.deleteById(id);
    }


    @Override
    public <S extends Restriccion> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Restriccion> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Restriccion> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Restriccion getOne(Long aLong) {
        return null;
    }

    @Override
    public Restriccion getById(Long aLong) {
        return null;
    }

    @Override
    public Restriccion getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Restriccion> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Restriccion> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Restriccion> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Restriccion> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Restriccion> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Restriccion> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Restriccion, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Restriccion> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Restriccion> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Restriccion> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }



    @Override
    public List<Restriccion> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }


    @Override
    public void delete(Restriccion entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Restriccion> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Restriccion> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Restriccion> findAll(Pageable pageable) {
        return null;
    }
}

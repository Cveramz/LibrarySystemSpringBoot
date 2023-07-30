package com.example.LibrarySystem.services;

import com.example.LibrarySystem.models.LibroCategoria;
import com.example.LibrarySystem.repositories.LibroCategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Function;

@Service
public class LibroCategoriaService implements LibroCategoriaRepository{
    @Autowired
    private LibroCategoriaRepository libroCategoriaRepository;

    /*--------------------------------------------------------------------------------------------------------
        * findByIdLibroCategoria: Busca una tupla de LibroCategoria por su id_libro_categoria;
        *
        * @param id_libro_categoria - id de la tupla de LibroCategoria;
        * @return - Tupla de LibroCategoria;
     */
    @Override
    public List<LibroCategoria> findByIdLibroCategoria(Long id_libro_categoria) {
        return libroCategoriaRepository.findByIdLibroCategoria(id_libro_categoria);
    }

    /*--------------------------------------------------------------------------------------------------------
        * findByIdCategoria: Busca una tupla de LibroCategoria por su id_categoria;
        *
        * @param id_categoria - id de la tupla de LibroCategoria;
        * @return - Tupla de LibroCategoria;
     */
    @Override
    public List<LibroCategoria> findByIdCategoria(Long id_categoria) {
        return libroCategoriaRepository.findByIdCategoria(id_categoria);
    }

    /*--------------------------------------------------------------------------------------------------------
        * findByIsbn: Busca una tupla de LibroCategoria por su isbn;
        *
        * @param isbn - isbn de la tupla de LibroCategoria;
        * @return - Tupla de LibroCategoria;
     */
    @Override
    public List<LibroCategoria> findByIsbn(String isbn) {
        return libroCategoriaRepository.findByIsbn(isbn);
    }

    /*--------------------------------------------------------------------------------------------------------
        * findByNombreCategoria: Busca una tupla de LibroCategoria por su nombre_categoria;
        *
        * @param nombre_categoria - nombre_categoria de la tupla de LibroCategoria;
        * @return - Tupla de LibroCategoria;
     */
    @Override
    public LibroCategoria agregarLibroCategoria(LibroCategoria libroCategoria) {
        return libroCategoriaRepository.save(libroCategoria);
    }


    @Override
    public void flush() {

    }
    @Override
    public List<LibroCategoria> findAll() {
        return libroCategoriaRepository.findAll();
    }
    @Override
    public <S extends LibroCategoria> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends LibroCategoria> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<LibroCategoria> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public LibroCategoria getOne(Long aLong) {
        return null;
    }

    @Override
    public LibroCategoria getById(Long aLong) {
        return null;
    }

    @Override
    public LibroCategoria getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends LibroCategoria> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends LibroCategoria> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends LibroCategoria> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends LibroCategoria> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends LibroCategoria> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends LibroCategoria> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends LibroCategoria, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends LibroCategoria> S save(S entity) {
        return null;
    }

    @Override
    public <S extends LibroCategoria> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<LibroCategoria> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }



    @Override
    public List<LibroCategoria> findAllById(Iterable<Long> longs) {
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
    public void delete(LibroCategoria entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends LibroCategoria> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<LibroCategoria> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<LibroCategoria> findAll(Pageable pageable) {
        return null;
    }


}

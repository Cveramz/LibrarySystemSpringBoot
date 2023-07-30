package com.example.LibrarySystem.services;

import com.example.LibrarySystem.models.Ubicacion;
import com.example.LibrarySystem.repositories.UbicacionRepository;
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
public class UbicacionService implements UbicacionRepository{
    @Autowired
    private UbicacionRepository ubicacionRepository;

    @Override
    public void flush() {

    }
    @Override
    public List<Ubicacion> findAll() {
        return ubicacionRepository.findAll();
    }

    @Override
    public <S extends Ubicacion> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Ubicacion> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Ubicacion> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Ubicacion getOne(Long aLong) {
        return null;
    }

    @Override
    public Ubicacion getById(Long aLong) {
        return null;
    }

    @Override
    public Ubicacion getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Ubicacion> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Ubicacion> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Ubicacion> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Ubicacion> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Ubicacion> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Ubicacion> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Ubicacion, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Ubicacion> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Ubicacion> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Ubicacion> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }



    @Override
    public List<Ubicacion> findAllById(Iterable<Long> longs) {
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
    public void delete(Ubicacion entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Ubicacion> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Ubicacion> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Ubicacion> findAll(Pageable pageable) {
        return null;
    }
}

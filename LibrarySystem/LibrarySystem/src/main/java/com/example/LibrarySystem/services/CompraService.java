package com.example.LibrarySystem.services;

import com.example.LibrarySystem.models.Compra;
import com.example.LibrarySystem.repositories.CompraRepository;
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
public class CompraService implements CompraRepository{
    @Autowired
    private CompraRepository compraRepository;

    @Override
    public void flush() {

    }
    @Override
    public List<Compra> findAll() {
        return compraRepository.findAll();
    }

    @Override
    public <S extends Compra> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Compra> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Compra> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Compra getOne(Long aLong) {
        return null;
    }

    @Override
    public Compra getById(Long aLong) {
        return null;
    }

    @Override
    public Compra getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Compra> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Compra> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Compra> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Compra> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Compra> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Compra> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Compra, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Compra> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Compra> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Compra> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }



    @Override
    public List<Compra> findAllById(Iterable<Long> longs) {
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
    public void delete(Compra entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Compra> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Compra> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Compra> findAll(Pageable pageable) {
        return null;
    }
}

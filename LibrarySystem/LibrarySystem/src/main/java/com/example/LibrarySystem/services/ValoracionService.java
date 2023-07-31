package com.example.LibrarySystem.services;

import com.example.LibrarySystem.models.UsuarioLibroFavorito;
import com.example.LibrarySystem.models.Valoracion;
import com.example.LibrarySystem.repositories.ValoracionRepository;
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
public class ValoracionService implements ValoracionRepository {
    @Autowired
    private ValoracionRepository valoracionRepository;


    public List<Valoracion> listValoracion() {
        return valoracionRepository.findAll();
    }
    public Valoracion getByIdVal(long id) {
        return valoracionRepository.findById(id).get();
    }
    public void deleteValoracion(long id) {
        valoracionRepository.deleteById(id);


    }
    public Valoracion createValoracion(Valoracion neoValoracion){
        return valoracionRepository.save(neoValoracion);
    }

    public Valoracion updateValoracion( Valoracion valoracionMod){
        Valoracion valoracion= valoracionRepository.findById(valoracionMod.getIdValoracion()).orElse(null);
        if(valoracion!=null){
            valoracion.setValor(valoracionMod.getValor());
            valoracion.setUsuario(valoracionMod.getUsuario());
            valoracion.setLibro(valoracionMod.getLibro());
            return valoracionRepository.save(valoracionMod);
        }
        else{
            return null;
        }
    }
    @Override
    public void flush() {

    }
    @Override
    public <S extends Valoracion> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Valoracion> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Valoracion> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Valoracion getOne(Long aLong) {
        return null;
    }

    @Override
    public Valoracion getById(Long aLong) {
        return null;
    }


    @Override
    public Valoracion getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Valoracion> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Valoracion> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Valoracion> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Valoracion> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Valoracion> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Valoracion> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Valoracion, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Valoracion> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Valoracion> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public List<Valoracion> findAll() {
        return null;
    }

    @Override
    public Optional<Valoracion> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }



    @Override
    public List<Valoracion> findAllById(Iterable<Long> longs) {
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
    public void delete(Valoracion entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Valoracion> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Valoracion> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Valoracion> findAll(Pageable pageable) {
        return null;
    }
}

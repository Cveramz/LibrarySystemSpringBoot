package com.example.LibrarySystem.services;

import com.example.LibrarySystem.models.MedioPago;
import com.example.LibrarySystem.models.Valoracion;
import com.example.LibrarySystem.repositories.MedioPagoRepository;
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
public class MedioPagoService implements MedioPagoRepository{
    @Autowired
    private MedioPagoRepository medioPagoRepository;

    public List<MedioPago> listMedioPago() {
        return medioPagoRepository.findAll();
    }
    public MedioPago getByIdMedPago(long id) {
        return medioPagoRepository.findById(id).get();
    }
    public void deleteMedioPago(long id) {
        medioPagoRepository.deleteById(id);


    }
    public MedioPago createMedPago(MedioPago neoMedPago){
        return medioPagoRepository.save(neoMedPago);
    }

    public MedioPago updateMedioPago( MedioPago medioPagoMod){
        MedioPago medioPago= medioPagoRepository.findById(medioPagoMod.getIdMedioPago()).orElse(null);
        if(medioPago!=null){
            medioPago.setMedioPago(medioPagoMod.getMedioPago());
            return medioPagoRepository.save(medioPagoMod);
        }
        else{
            return null;
        }
    }

    @Override
    public void flush() {

    }
    @Override
    public List<MedioPago> findAll() {
        return medioPagoRepository.findAll();
    }
    @Override
    public <S extends MedioPago> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends MedioPago> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<MedioPago> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public MedioPago getOne(Long aLong) {
        return null;
    }

    @Override
    public MedioPago getById(Long aLong) {
        return null;
    }

    @Override
    public MedioPago getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends MedioPago> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends MedioPago> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends MedioPago> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends MedioPago> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends MedioPago> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends MedioPago> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends MedioPago, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends MedioPago> S save(S entity) {
        return null;
    }

    @Override
    public <S extends MedioPago> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<MedioPago> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }



    @Override
    public List<MedioPago> findAllById(Iterable<Long> longs) {
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
    public void delete(MedioPago entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends MedioPago> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<MedioPago> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<MedioPago> findAll(Pageable pageable) {
        return null;
    }
}

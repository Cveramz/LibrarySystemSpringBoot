package com.example.LibrarySystem.services;

import com.example.LibrarySystem.models.Carro;
import com.example.LibrarySystem.models.Libro;
import com.example.LibrarySystem.models.Usuario;
import com.example.LibrarySystem.repositories.CarroRepository;
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
public class CarroService implements CarroRepository {
    @Autowired
    private CarroRepository carroRepository;


    /*--------------------------------------------------------------------------------------------------------
     * createCarro: metodo que guarda un nuevo carro en la base de datos;
     *
     * @param carro - un objeto de tipo Carro que contiene los datos del carro a guardar;
     * @return - el carro creado y registrado;
      --------------------------------------------------------------------------------------------------------*/
    public Carro createCarro(Carro carro){
        return carroRepository.save(carro);
    }


    /*--------------------------------------------------------------------------------------------------------
     * getCarroById: metodo que obtiene un carro según su id;
     *
     * @param id_carro - el id del carro en la base de datos;
     * @return - el carro correspondiente al id especificado;
      --------------------------------------------------------------------------------------------------------*/
    @Override
    public Carro getCarroById(long id_carro){

        return carroRepository.getCarroById(id_carro);
    }


    /*--------------------------------------------------------------------------------------------------------
     * updateCarro: metodo que actualiza los datos de un carro del mismo id;
     *
     * @param carroUpdate - el objeto con el id y los datos nuevos del carro;
     * @return - el carro actualizado;
      --------------------------------------------------------------------------------------------------------*/
    public Carro updateCarro(Carro carroUpdate) {
        Carro existente = carroRepository.getCarroById(carroUpdate.getIdCarro());
        if (existente != null) {
            existente.setN_transaccion(carroUpdate.getN_transaccion());
            existente.setUsuario(carroUpdate.getUsuario());
            existente.setPrecioTotal(carroUpdate.getPrecioTotal());
            existente.setCantidad(carroUpdate.getCantidad());
            existente.setBoolStock(carroUpdate.getBoolStock());
            return carroRepository.save(existente);
        } else {
            return null;
        }
    }


    /*--------------------------------------------------------------------------------------------------------
     * deleteByIdCarro: metodo que elimina un carro por su id;
     *
     * @param id - id del carro a eliminar;
     *
      --------------------------------------------------------------------------------------------------------*/
    public void deleteByIdCarro(Long id) {
        carroRepository.deleteById(id);
    }


    @Override
    public void flush() {

    }

    @Override
    public <S extends Carro> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Carro> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Carro> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Carro getOne(Long aLong) {
        return null;
    }

    @Override
    public Carro getById(Long aLong) {
        return null;
    }

    @Override
    public Carro getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Carro> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Carro> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Carro> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Carro> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Carro> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Carro> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Carro, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Carro> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Carro> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Carro> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Carro> findAll() {
        return null;
    }

    @Override
    public List<Carro> findAllById(Iterable<Long> longs) {
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
    public void delete(Carro entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Carro> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Carro> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Carro> findAll(Pageable pageable) {
        return null;
    }
}

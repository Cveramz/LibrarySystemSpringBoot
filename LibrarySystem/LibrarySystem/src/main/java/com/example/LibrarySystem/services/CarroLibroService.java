package com.example.LibrarySystem.services;

import com.example.LibrarySystem.models.CarroLibro;
import com.example.LibrarySystem.repositories.CarroLibroRepository;
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
public class CarroLibroService implements CarroLibroRepository{

    @Autowired
    private CarroLibroRepository carroLibroRepository;

    /*
     * createCarroLibro: Método que guarda un nuevo CarroLibro en la base de datos.
     *
     * @param carroLibro - Un objeto de tipo CarroLibro que contiene los datos del CarroLibro a guardar.
     * @return - El CarroLibro creado y registrado.
     */
    public CarroLibro createCarroLibro(CarroLibro carroLibro) {
        return carroLibroRepository.save(carroLibro);
    }

    /*
     * getCarroLibroById: Método que obtiene un CarroLibro según su id.
     *
     * @param id_carro_libro - El id del CarroLibro en la base de datos.
     * @return - El CarroLibro correspondiente al id especificado.
     */
    public CarroLibro getCarroLibroById(long id) {
        return carroLibroRepository.getCarroLibroById(id);
    }

    /*
     * updateCarroLibro: Método que actualiza los datos de un CarroLibro con el mismo id.
     *
     * @param carroLibroUpdate - El objeto con el id y los datos nuevos del CarroLibro.
     * @return - El CarroLibro actualizado.
     */
    public CarroLibro updateCarroLibro(CarroLibro carroLibroUpdate) {
        CarroLibro existente = carroLibroRepository.findById(carroLibroUpdate.getId()).orElse(null);
        if (existente != null) {
            existente.setIsbn(carroLibroUpdate.getIsbn());
            existente.setCarro(carroLibroUpdate.getCarro());
            return carroLibroRepository.save(existente);
        } else {
            return null;
        }
    }

    /*
     * deleteByIdCarroLibro: Método que elimina un CarroLibro por su id.
     *
     * @param id - El id del CarroLibro a eliminar.
     */
    public void deleteByIdCarroLibro(long id) {
        carroLibroRepository.deleteById(id);
    }





    @Override
    public void flush() {

    }
    @Override
    public List<CarroLibro> findAll() {
        return carroLibroRepository.findAll();
    }
    @Override
    public <S extends CarroLibro> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends CarroLibro> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<CarroLibro> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public CarroLibro getOne(Long aLong) {
        return null;
    }

    @Override
    public CarroLibro getById(Long aLong) {
        return null;
    }

    @Override
    public CarroLibro getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends CarroLibro> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends CarroLibro> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends CarroLibro> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends CarroLibro> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends CarroLibro> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends CarroLibro> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends CarroLibro, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends CarroLibro> S save(S entity) {
        return null;
    }

    @Override
    public <S extends CarroLibro> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<CarroLibro> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }


    @Override
    public List<CarroLibro> findAllById(Iterable<Long> longs) {
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
    public void delete(CarroLibro entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends CarroLibro> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<CarroLibro> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<CarroLibro> findAll(Pageable pageable) {
        return null;
    }
}

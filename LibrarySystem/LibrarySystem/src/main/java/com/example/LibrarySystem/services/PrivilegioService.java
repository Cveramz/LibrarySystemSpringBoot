package com.example.LibrarySystem.services;

import com.example.LibrarySystem.models.Privilegio;
import com.example.LibrarySystem.models.Rol;
import com.example.LibrarySystem.repositories.PrivilegioRepository;
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
public class PrivilegioService implements PrivilegioRepository{
    @Autowired
    private PrivilegioRepository privilegioRepository;
    /**
     * Obtiene todos los privilegios disponibles.
     *
     * @return Una lista de objetos de tipo Privilegio que contiene todos los privilegios disponibles en la base de datos.
     */
    @Override
    public List<Privilegio> findAll() {
        return privilegioRepository.findAll();
    }
    /**
     * Obtiene un privilegio por su identificador (ID).
     *
     * @param idPrivilegio El identificador del privilegio que se desea obtener.
     * @return Un objeto de tipo Privilegio si se encuentra el privilegio con el ID proporcionado, o null si no existe un privilegio con ese ID.
     */
    public Privilegio obtenerPrivilegioPorId(Long idPrivilegio) {
        return privilegioRepository.findById(idPrivilegio).orElse(null);
    }
    /**
     * Agrega un nuevo privilegio con el nombre especificado.
     *
     * @param nombrePrivilegio El nombre del nuevo privilegio que se desea agregar.
     * @return Un objeto de tipo Privilegio que representa el nuevo privilegio creado y almacenado en la base de datos.
     */
    public Privilegio agregarPrivilegio(String nombrePrivilegio) {
        Privilegio nuevoPrivilegio = new Privilegio(nombrePrivilegio);
        return privilegioRepository.save(nuevoPrivilegio);
    }
    /**
     * Edita el nombre de un privilegio específico por su identificador (ID).
     *
     * @param id El identificador del privilegio que se desea editar.
     * @param nuevoPrivilegio El nuevo nombre que se asignará al privilegio.
     */
    public void editarPrivilegio(Long id, String nuevoPrivilegio) {
        Privilegio privilegio = privilegioRepository.findById(id).orElse(null);
        if (privilegio != null) {
            privilegio.setNombre_privilegio(nuevoPrivilegio);
            privilegioRepository.save(privilegio);
        }
    }
    /**
     * Elimina un privilegio por su identificador (ID).
     *
     * @param idPrivilegio El identificador del privilegio que se desea eliminar.
     */
    public void eliminarPrivilegio(Long idPrivilegio) {
        Privilegio privilegio = privilegioRepository.findById(idPrivilegio).orElse(null);
        if (privilegio != null) {
            privilegioRepository.delete(privilegio);
        }
    }
    @Override
    public void flush() {
    }
    @Override
    public <S extends Privilegio> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Privilegio> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Privilegio> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Privilegio getOne(Long aLong) {
        return null;
    }

    @Override
    public Privilegio getById(Long aLong) {
        return null;
    }

    @Override
    public Privilegio getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Privilegio> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Privilegio> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Privilegio> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Privilegio> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Privilegio> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Privilegio> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Privilegio, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Privilegio> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Privilegio> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Privilegio> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }


    @Override
    public List<Privilegio> findAllById(Iterable<Long> longs) {
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
    public void delete(Privilegio entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Privilegio> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Privilegio> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Privilegio> findAll(Pageable pageable) {
        return null;
    }
}

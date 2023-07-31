package com.example.LibrarySystem.services;

import com.example.LibrarySystem.models.Privilegio;
import com.example.LibrarySystem.models.Rol;
import com.example.LibrarySystem.models.RolPrivilegio;
import com.example.LibrarySystem.repositories.PrivilegioRepository;
import com.example.LibrarySystem.repositories.RolPrivilegioRepository;
import com.example.LibrarySystem.repositories.RolRepository;
import jakarta.transaction.Transactional;
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
public class RolPrivilegioService implements RolPrivilegioRepository{
    @Autowired
    private RolPrivilegioRepository rolPrivilegioRepository;
    @Autowired
    private RolRepository rolRepository;
    @Autowired
    private PrivilegioRepository privilegioRepository;
    /**
     * Obtiene todos los objetos de tipo RolPrivilegio disponibles.
     *
     * @return Una lista de objetos de tipo RolPrivilegio que contiene todos los registros disponibles en la base de datos.
     */
    @Override
    public List<RolPrivilegio> findAll() {
        return rolPrivilegioRepository.findAll();
    }
    /**
     * Obtiene un objeto de tipo RolPrivilegio por su identificador (ID).
     *
     * @param idRolPrivilegio El identificador del objeto RolPrivilegio que se desea obtener.
     * @return Un objeto de tipo RolPrivilegio si se encuentra el registro con el ID proporcionado, o null si no existe un registro con ese ID.
     */
    public RolPrivilegio obtenerRolPrivilegioPorId(Long idRolPrivilegio) {
        return rolPrivilegioRepository.findById(idRolPrivilegio).orElse(null);
    }
    /**
     * Agrega un nuevo objeto de tipo RolPrivilegio asociado a un Rol y un Privilegio específicos.
     *
     * @param rol El objeto de tipo Rol al que se asociará el nuevo RolPrivilegio.
     * @param privilegio El objeto de tipo Privilegio al que se asociará el nuevo RolPrivilegio.
     */
    public void agregarRolPrivilegio(Rol rol, Privilegio privilegio) {
        RolPrivilegio rolPrivilegio = new RolPrivilegio(rol, privilegio);
        rolPrivilegioRepository.save(rolPrivilegio);
    }
    /**
     * Edita el Privilegio asociado a un objeto de tipo RolPrivilegio por su identificador (ID) de Rol.
     *
     * @param idRol El identificador del RolPrivilegio cuyo Privilegio se desea editar.
     * @param idPrivilegioNuevo El nuevo identificador del Privilegio que se asignará al RolPrivilegio.
     */
    public void editarRolPrivilegio(Long idRol, Integer idPrivilegioNuevo) {
        RolPrivilegio rolPrivilegio = rolPrivilegioRepository.findById(idRol).orElse(null);
        if (rolPrivilegio != null) {
            Privilegio privilegioNuevo = new Privilegio();
            privilegioNuevo.setId_privilegio(idPrivilegioNuevo);
            rolPrivilegio.setId_privilegio(privilegioNuevo);
            rolPrivilegioRepository.save(rolPrivilegio);
        }
    }
    /**
     * Elimina un objeto de tipo RolPrivilegio por su identificador (ID).
     *
     * @param id El identificador del objeto RolPrivilegio que se desea eliminar.
     */
    public void eliminarRolPrivilegio(Long id) {
        RolPrivilegio rolPrivilegio = rolPrivilegioRepository.findById(id).orElse(null);
        if (rolPrivilegio != null) {
            rolPrivilegioRepository.delete(rolPrivilegio);
        }
    }
    @Override
    public void flush() {
    }
    @Override
    public <S extends RolPrivilegio> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends RolPrivilegio> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<RolPrivilegio> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public RolPrivilegio getOne(Long aLong) {
        return null;
    }

    @Override
    public RolPrivilegio getById(Long aLong) {
        return null;
    }

    @Override
    public RolPrivilegio getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends RolPrivilegio> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends RolPrivilegio> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends RolPrivilegio> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends RolPrivilegio> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends RolPrivilegio> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends RolPrivilegio> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends RolPrivilegio, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends RolPrivilegio> S save(S entity) {
        return null;
    }

    @Override
    public <S extends RolPrivilegio> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<RolPrivilegio> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }



    @Override
    public List<RolPrivilegio> findAllById(Iterable<Long> longs) {
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
    public void delete(RolPrivilegio entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends RolPrivilegio> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<RolPrivilegio> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<RolPrivilegio> findAll(Pageable pageable) {
        return null;
    }
}

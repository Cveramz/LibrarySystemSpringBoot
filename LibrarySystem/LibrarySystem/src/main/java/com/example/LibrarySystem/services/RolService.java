package com.example.LibrarySystem.services;

import com.example.LibrarySystem.models.Rol;
import com.example.LibrarySystem.models.Usuario;
import com.example.LibrarySystem.repositories.RolRepository;
import com.example.LibrarySystem.repositories.UsuarioRepository;
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
public class RolService implements RolRepository{
    @Autowired
    private RolRepository rolRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    /**
     * Obtiene todos los objetos de tipo Rol disponibles.
     *
     * @return Una lista de objetos de tipo Rol que contiene todos los registros disponibles en la base de datos.
     */
    @Override
    public List<Rol> findAll() {
        return rolRepository.findAll();
    }
    /**
     * Encuentra un objeto de tipo Rol por su identificador (ID).
     *
     * @param idRol El identificador del objeto Rol que se desea obtener.
     * @return Un objeto de tipo Optional que contiene el Rol si se encuentra con el ID proporcionado, o un Optional vacío si no existe un registro con ese ID.
     */
    public Optional<Rol> findRolById(Long idRol) {
        return rolRepository.findById(idRol);
    }
    /**
     * Asigna un nuevo rol a un usuario específico.
     *
     * @param usuario El objeto de tipo Usuario al que se asignará el nuevo Rol.
     * @param nombreRol El nombre del nuevo rol que se asignará al usuario.
     */
    public void asignarRolAUsuario(Usuario usuario, String nombreRol) {
        Rol rol = new Rol(usuario, nombreRol);
        rolRepository.save(rol);
    }
    /**
     * Edita el nombre del rol de un usuario específico por su identificador (ID) de rol.
     *
     * @param usuarioId El identificador del Rol cuyo nombre se desea editar.
     * @param nuevoRol El nuevo nombre que se asignará al rol del usuario.
     */
    public void editarRolDeUsuario(Long usuarioId, String nuevoRol) {
        Rol rol = rolRepository.findById(usuarioId).orElse(null);
        if (rol != null) {
            rol.setNombreRol(nuevoRol);
            rolRepository.save(rol);
        }
    }
    /**
     * Elimina un objeto de tipo Rol por su identificador (ID).
     *
     * @param rolId El identificador del objeto Rol que se desea eliminar.
     */
    public void eliminarRolPorId(Long rolId) {
        rolRepository.deleteById(rolId);
    }
    @Override
    public void flush() {
    }
    @Override
    public <S extends Rol> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Rol> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Rol> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Rol getOne(Long aLong) {
        return null;
    }

    @Override
    public Rol getById(Long aLong) {
        return null;
    }

    @Override
    public Rol getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Rol> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Rol> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Rol> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Rol> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Rol> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Rol> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Rol, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Rol> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Rol> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Rol> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }



    @Override
    public List<Rol> findAllById(Iterable<Long> longs) {
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
    public void delete(Rol entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Rol> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Rol> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Rol> findAll(Pageable pageable) {
        return null;
    }
}

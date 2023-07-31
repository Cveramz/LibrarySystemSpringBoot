package com.example.LibrarySystem.repositories;

import com.example.LibrarySystem.models.Restriccion;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RestriccionRepository extends JpaRepository<Restriccion,Long> {
    public List<Restriccion> findAll();
    Optional<Restriccion> findByIdRestriccion(int idRestriccion);
    List<Restriccion> findByEdad(String edad);
    List<Restriccion> findByLibroIsbn(Long isbn);

    @Modifying
    @Query("DELETE FROM Restriccion r WHERE r.idRestriccion = :idRestriccion")
    void deleteByRestriccionId(@Param("idRestriccion") Integer idRestriccion);


}

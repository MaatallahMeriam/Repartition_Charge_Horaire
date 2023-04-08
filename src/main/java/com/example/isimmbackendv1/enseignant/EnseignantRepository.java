package com.example.isimmbackendv1.enseignant;

import com.example.isimmbackendv1.enseignant.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EnseignantRepository extends JpaRepository<Enseignant,Long> {
    @Query("SELECT s FROM Enseignant s where  s.nom=?1")
    Optional<Enseignant> chargeFindEnseignantByName(String nom);
}
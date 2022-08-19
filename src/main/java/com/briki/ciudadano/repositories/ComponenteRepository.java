package com.briki.ciudadano.repositories;

import com.briki.ciudadano.models.Componente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponenteRepository extends JpaRepository<Componente, Integer> {
}

package io.github.VictorDuart.model.repository;

import io.github.VictorDuart.model.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
}

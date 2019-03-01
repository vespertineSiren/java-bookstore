package dev.vespertine.javabookstore.Repository;

import dev.vespertine.javabookstore.Models.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {
}

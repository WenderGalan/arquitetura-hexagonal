package br.com.wendergalan.arquitetura_hexagonal.infrastructure.persistence.jpa;

import br.com.wendergalan.arquitetura_hexagonal.infrastructure.persistence.entity.TransferEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataTransferRepository extends JpaRepository<TransferEntity, Long> {
}

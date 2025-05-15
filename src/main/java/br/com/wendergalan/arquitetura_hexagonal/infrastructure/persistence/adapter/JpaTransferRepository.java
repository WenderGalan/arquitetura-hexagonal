package br.com.wendergalan.arquitetura_hexagonal.infrastructure.persistence.adapter;

import br.com.wendergalan.arquitetura_hexagonal.application.repository.TransferRepository;
import br.com.wendergalan.arquitetura_hexagonal.domain.Transfer;
import br.com.wendergalan.arquitetura_hexagonal.infrastructure.persistence.entity.TransferEntity;
import br.com.wendergalan.arquitetura_hexagonal.infrastructure.persistence.jpa.SpringDataTransferRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JpaTransferRepository implements TransferRepository {
    private final SpringDataTransferRepository springDataTransferRepository;

    @Override
    public void save(Transfer transfer) {
        springDataTransferRepository.save(TransferEntity.fromDomain(transfer));
    }
}

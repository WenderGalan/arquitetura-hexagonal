package br.com.wendergalan.arquitetura_hexagonal.application.repository;

import br.com.wendergalan.arquitetura_hexagonal.domain.Transfer;

public interface TransferRepository {
    void save(Transfer transfer);
}

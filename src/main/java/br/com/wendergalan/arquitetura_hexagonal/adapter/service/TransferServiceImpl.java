package br.com.wendergalan.arquitetura_hexagonal.adapter.service;

import br.com.wendergalan.arquitetura_hexagonal.application.repository.TransferRepository;
import br.com.wendergalan.arquitetura_hexagonal.application.service.TransferService;
import br.com.wendergalan.arquitetura_hexagonal.domain.Transfer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class TransferServiceImpl implements TransferService {
    private final TransferRepository transferRepository;

    @Override
    public void transfer(String fromAccount, String toAccount, BigDecimal amount) {
        Transfer transfer = new Transfer(fromAccount, toAccount, amount);
        transfer.execute();
        transferRepository.save(transfer);
    }
}

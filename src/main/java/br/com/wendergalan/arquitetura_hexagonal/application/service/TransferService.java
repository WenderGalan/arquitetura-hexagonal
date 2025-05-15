package br.com.wendergalan.arquitetura_hexagonal.application.service;

import java.math.BigDecimal;

public interface TransferService {
    void transfer(String fromAccount, String toAccount, BigDecimal amount);
}

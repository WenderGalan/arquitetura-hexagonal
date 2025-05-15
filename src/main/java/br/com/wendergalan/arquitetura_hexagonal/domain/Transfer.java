package br.com.wendergalan.arquitetura_hexagonal.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class Transfer {
    private String fromAccount;
    private String toAccount;
    private BigDecimal amount;

    public Transfer(String fromAccount, String toAccount, BigDecimal amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    public void execute() {
        // Aqui vai a lógica de negócio pura
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Transfer amount must be positive");
        }
        // outras regras... ex: validar contas, saldo, etc
    }
}

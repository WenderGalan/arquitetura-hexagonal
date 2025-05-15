package br.com.wendergalan.arquitetura_hexagonal.infrastructure.persistence.entity;


import br.com.wendergalan.arquitetura_hexagonal.domain.Transfer;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class TransferEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fromAccount;
    private String toAccount;
    private BigDecimal amount;

    public static TransferEntity fromDomain(Transfer transfer) {
        TransferEntity entity = new TransferEntity();
        entity.fromAccount = transfer.getFromAccount();
        entity.toAccount = transfer.getToAccount();
        entity.amount = transfer.getAmount();
        return entity;
    }
}

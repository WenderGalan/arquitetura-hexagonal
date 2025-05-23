package br.com.wendergalan.arquitetura_hexagonal.infrastructure.controller;

import br.com.wendergalan.arquitetura_hexagonal.application.service.TransferService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/transfer")
@RequiredArgsConstructor
public class TransferController {
    private final TransferService transferService;

    @PostMapping
    public ResponseEntity<Void> transfer(@RequestBody TransferRequest request) {
        transferService.transfer(request.from, request.to, request.amount);
        return ResponseEntity.ok().build();
    }

    public static class TransferRequest {
        public String from;
        public String to;
        public BigDecimal amount;
    }
}

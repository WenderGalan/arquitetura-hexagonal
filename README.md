# Projeto: Arquitetura Hexagonal com Spring Boot

Este projeto é um exemplo básico de como aplicar a **arquitetura hexagonal (Ports and Adapters)** usando **Spring Boot** com banco H2 em memória.

## 🧱 Estrutura do Projeto

```
src/
├── application/ # Portas (interfaces) de entrada e saída
│ ├── TransferService.java
│ └── TransferRepository.java
│
├── domain/ # Entidades e regras de negócio
│ └── Transfer.java
│
├── adapter/ # Implementações dos casos de uso
│ └── service/
│ └── TransferServiceImpl.java
│
├── infrastructure/ # Adaptadores externos (Web, Banco, etc)
│ ├── controller/
│ │ └── TransferController.java
│ └── persistence/
│ ├── entity/ # Entidades JPA
│ ├── jpa/ # Interfaces Spring Data JPA
│ └── adapter/ # Implementação do TransferRepository
│
└── br.com.wendergalan.ArquiteturaHexagonalApplication.java
```

## 📌 Conceitos

| Pacote         | Descrição                                                                 |
|----------------|---------------------------------------------------------------------------|
| `domain`       | Lógica de negócio pura. Não conhece nenhum framework.                     |
| `application`  | Define os casos de uso e interfaces de repositórios.                      |
| `adapter`      | Implementações dos casos de uso (serviços).                               |
| `infrastructure` | Integração com mundo externo: controllers REST, repositórios JPA, etc.  |

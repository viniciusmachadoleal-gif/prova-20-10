# Questão 1 — Emissão de passagens

## Padrão utilizado
**Factory Method (Método de Fábrica)**: `EmissorPassagem` define o procedimento comum `emitir()` e declara o método de fábrica `criarPassagem()`. Cada emissor concreto implementa a criação do tipo específico de passagem.

## Estrutura
- `src/`: implementação Java (sem declaração de package).
- `diagrama/diagrama_classes.puml`: diagrama UML em PlantUML.

## Como compilar e executar
No Terminal, entre na pasta `questao1` e execute:

```bash
javac src/*.java
java -cp src Main
```

O programa imprime os três resumos. Requer Java 11 ou superior (`String.isBlank` e `List.of`).

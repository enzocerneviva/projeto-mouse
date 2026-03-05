# Projeto Mouse 🖱️

Este projeto é uma simulação simples em Java que modela o comportamento e as características de um **Mouse** de computador no mundo real.

## O que o objeto representa?
A classe `Mouse` respresenta as características e funcionalidades de um mouse, permitindo configurar propriedades técnicas (como sensibilidade e estética) e simular ações comuns de navegação em uma interface digital, como movimentar o cursor e utilizar a roda de rolagem (*scroll*).

## Funcionalidades e Métodos

A classe possui comportamentos principais que refletem o uso cotidiano do periférico:

### 1. Movimentação (`deslocarPonteiro`)
Simula o movimento do mouse entre coordenadas X e Y. 
- **Lógica:** O método calcula a distância percorrida em pixels e converte esse valor para **centímetros**, baseando-se no DPI (pontos por polegada) configurado.
- **Uso:** `mouse.deslocarPonteiro(x, y);`

### 2. Rolagem (`scrollar`)
Simula o uso do *scroll* do mouse.
- **Lógica:** Recebe um número inteiro de "passos". Valores positivos indicam rolagem para cima e negativos para baixo.
- **Uso:** `mouse.scrollar(3);` // Sobe 300 pixels (considerando o padrão de 100px por passo).

### 3. Configurações de Estado (Setters)
O modelo possui regras de negócio para proteger os dados do objeto:
* **DPI:** Só aceita valores maiores que zero (ajustável múltiplas vezes).
* **Cor:** Pode ser definida apenas uma vez (imutável após a primeira atribuição).
* **Peso:** Deve ser no mínimo 30g e só pode ser definido uma vez.

---

## 💻 Exemplo de Uso

No arquivo `Main.java`, o fluxo de execução segue este exemplo:

```java
// Instanciação
Mouse meuMouse = new Mouse();

// Configuração de atributos
meuMouse.setDPI(800);
meuMouse.setCor("Preto");
meuMouse.setPesoEmGramas(85.5);

// Simulação de ações
meuMouse.deslocarPonteiro(1920, 1080);
meuMouse.scrollar(-2); // Rola para baixo
```

### Criado por: Enzo Cerneviva | Rm: 563480

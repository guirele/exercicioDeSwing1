# Exercício de Swing

Projeto simples desenvolvido em **Java Swing** com o objetivo de praticar e ir dominando:

- POO 
- Uso de `JFrame` e `JPanel`
- Navegação entre telas usando `setVisible`
- ActionListener com lambda
- Organização de código com métodos privados

## 🖥️ Funcionalidades

- Tela principal com menu
- Tela de cadastro
- Validação básica de campos
- Uso de `JOptionPane`
- Limpeza dos campos ao retornar ao menu

## 🛠️ Tecnologias

- Java
- Swing
- IntelliJ

---
## 📂 Estrutura do Projeto

O projeto está organizado em **três classes principais**, para manter o código limpo e modular:

1. **Classe `TelaPrincipal`**  
   - Responsável pela tela principal do sistema.  
   - Contém botões que permitem navegar para outras telas (como cadastro).  
   - Controla a visibilidade das telas usando `setVisible(true/false)`.
   - Tela de cadastro de usuários. 
   - Faz validação básica dos campos (não permite campos vazios).
   - Mostra mensagens de sucesso ou erro usando `JOptionPane`.

2. **Classe `Tabela`**  
   - Armazena os dados em um **`ArrayList`** que funciona como banco de dados improvisado.  


3. **Classe `Main`**  
   - Classe principal que **inicia a aplicação**.  
   - Cria a instância do menu e define sua visibilidade.

> Essa organização separa a lógica de interface (telas) da lógica de inicialização do programa, facilitando manutenção e evolução do projeto.

---

## 📚 Observações

Este projeto foi criado para **aprender mais sobre SWINGS e organização**.  
O código está escrito em **(PT-BR)**.

---

Desenvolvido por guirele

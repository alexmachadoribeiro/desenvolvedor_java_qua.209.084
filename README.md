# Atividade assíncrona do dia 02/06/2026

**TODO:** Faça com que a tela de cadastro de clientes cadastre o cliente no banco de dados.
**NOTE:**
- O cliente deve ser cadastrado na tabela cliente.
- O endereço do cliente deve ser cadastrado na tabela endereço.
- O endereço cadastrado deve estar relacionado com o cliente cadastrado.
- Consulte o código no repositório.
    - Arquivos novos:
        - repository
            - ClienteRepository.java
            - EnderecoRepository.java
        - templates
            - cliente_sucesso.html
    - Arquivos alterados (confira os comentários TODO e FIXME):
        - controllers
            - JavalanchesController.java (ver 3 TODO e 1 REVIEW)
        - models
            - Cliente.java (ver 1 FIXME e 1 REVIEW)
        - fragments
            - header.html (ver 1 TODO)
        - templates
            - novo_cliente.html (ver 1 TODO)
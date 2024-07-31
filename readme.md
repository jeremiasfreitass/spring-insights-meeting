```markdown
# Insights Meeting

Este é um projeto simples desenvolvido em Java utilizando Spring Boot, com o objetivo de gerar insights a partir de transcrições de reuniões de refinamento técnico ou funcional. O projeto utiliza a API do ChatGPT para processar o texto da transcrição e extrair informações valiosas, como decisões tomadas, próximos passos e riscos identificados.

## Funcionalidades

- Receber uma transcrição de reunião via API REST.
- Processar a transcrição utilizando um prompt inteligente.
- Retornar insights úteis extraídos do texto.

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação utilizada no projeto.
- **Spring Boot 3.x**: Framework para criação de aplicações Java.
- **Spring Web**: Para a criação de endpoints RESTful.
- **WebClient**: Para integração com a API do ChatGPT.
- **Thymeleaf**: Para a criação de uma interface web.

## Como Executar o Projeto

1. **Clonar o Repositório**:
   ```bash
   git clone https://github.com/seu-usuario/insights-meeting.git
   cd insights-meeting
   ```

2. **Configurar a Chave de API da OpenAI**:
    - Adicione a chave da API da OpenAI no arquivo `application.properties`:
   ```properties
   openai.api.key=YOUR_API_KEY_HERE
   ```

3. **Compilar e Executar o Projeto**:
    - Compile o projeto usando Maven:
   ```bash
   ./mvn clean install
   ```
    - Execute a aplicação:
   ```bash
   ./mvn spring-boot:run
   ```

4. **Testar o Endpoint**:
    - Envie uma requisição POST para `http://localhost:8080/api/v1/insights` com o corpo da requisição contendo a transcrição da reunião.
    - O servidor retornará os insights gerados.

## Contribuindo

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nome-da-feature`).
3. Faça o commit das suas alterações (`git commit -m 'Adiciona nova feature'`).
4. Faça o push para a branch (`git push origin feature/nome-da-feature`).
5. Abra um Pull Request.

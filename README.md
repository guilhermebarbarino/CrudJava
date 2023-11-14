# Tarefas API

Este é um exemplo de documentação para um controlador em Java que implementa operações básicas (CRUD) para manipulação de tarefas.

## Endpoints

### 1. Criar Tarefa

**Endpoint:** `POST /tarefas`

Cria uma nova tarefa com base nos dados fornecidos.

**Request:**
```json
{
  "titulo":"video",
  "descricao":"teste"
}
```

**Response:**
```json
{
  "id":1,
  "titulo":"video",
  "descricao":"teste"
}
```

### 2. Atualizar Tarefa

**Endpoint:** `PUT /tarefas/{tarefaId}`

Atualiza uma tarefa existente com base no ID fornecido.

**Request:**
```json
{
  "id":1,
  "titulo":"video editando",
  "descricao":"teste"
}
```

**Response:**
```json
{
  "id":1,
  "titulo":"video editando",
  "descricao":"teste"
}
```

### 3. Obter Todas as Tarefas

**Endpoint:** `GET /tarefas`

Obtém todas as tarefas cadastradas.

**Response:**
```json
[
  {
     "id":1,
     "titulo":"video",
     "descricao":"teste"
  }
]
```

### 4. Deletar Tarefa

**Endpoint:** `DELETE /tarefas/{tarefaId}`

Exclui a tarefa com base no ID fornecido.

**Response:**
```json
"DELETADO"
```

## Como Executar

Para executar este projeto, siga as instruções abaixo:

1. Clone o repositório.
2. Configure o ambiente de desenvolvimento.
3. Execute o aplicativo.

```bash
git clone https://github.com/guilhermebarbarino/CrudJava.git
cd seu-projeto
./mvnw spring-boot:run

tecnologia : JAVA 11 , apache maven , IDE STS
```

**Observação:** Certifique-se de ter o Maven instalado.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas ou enviar solicitações de pull.

# API REST - Aplicativo de Música

## Descrição
Esta API REST simula um serviço de música, semelhante ao Spotify. Ela possui dois recursos principais:

- **Usuários**: Usuários do serviço que podem salvar playlists e seguir outros artistas.
- **Playlists**: Coleções de músicas organizadas pelos usuários.

## Estrutura da API REST
Cada recurso possui um conjunto de operações CRUD (Create, Read, Update, Delete).

---

## Recurso 1: Usuário
**URI base:** `/api/usuarios`

| **Operação**       | **URI**                 | **Método HTTP** | **Requisição Esperada**                                         | **Erros Esperados**           | **Status Codes**         |
|--------------------|-------------------------|----------------|------------------------------------------------------------------|-------------------------------|--------------------------|
| **Criar Usuário**  | `/api/usuarios`         | POST           | JSON com `{ "nome": "Tiago", "email": "tiago@exemplo.com" }`     | 400 (Campos inválidos)        | 201 (Criado)             |
| **Obter Usuário por ID** | `/api/usuarios/{id}` | GET            | -                                                                | 404 (Usuário não encontrado)  | 200 (OK)                 |
| **Atualizar Usuário** | `/api/usuarios/{id}` | PUT            | JSON com `{ "nome": "Novo Nome" }`                               | 404 (Usuário não encontrado)  | 200 (OK)                 |
| **Excluir Usuário** | `/api/usuarios/{id}`   | DELETE         | -                                                                | 404 (Usuário não encontrado)  | 204 (Sem conteúdo)       |

---

## Recurso 2: Playlist
**URI base:** `/api/playlists`

| **Operação**         | **URI**                 | **Método HTTP** | **Requisição Esperada**                                          | **Erros Esperados**           | **Status Codes**         |
|----------------------|-------------------------|----------------|------------------------------------------------------------------|-------------------------------|--------------------------|
| **Criar Playlist**   | `/api/playlists`        | POST           | JSON com `{ "nome": "Minha Playlist", "usuarioId": 1 }`           | 400 (Campos inválidos)        | 201 (Criado)             |
| **Obter Playlist por ID** | `/api/playlists/{id}` | GET           | -                                                                | 404 (Playlist não encontrada) | 200 (OK)                 |
| **Atualizar Playlist** | `/api/playlists/{id}` | PUT            | JSON com `{ "nome": "Nova Playlist" }`                           | 404 (Playlist não encontrada) | 200 (OK)                 |
| **Excluir Playlist** | `/api/playlists/{id}`   | DELETE         | -                                                                | 404 (Playlist não encontrada) | 204 (Sem conteúdo)       |

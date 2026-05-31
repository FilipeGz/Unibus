# Unibus - Projeto Android Kotlin

Projeto reconstruído em Kotlin/XML para o trabalho de Dispositivos Móveis.

## O que está implementado

- Login por perfil com banco fake em Kotlin.
- Recuperação de senha em 3 etapas: matrícula/e-mail, código e nova senha.
- Fluxo do aluno: mapa, seleção de rotas, QR Code e suporte.
- Fluxo do motorista: avisos, iniciar rota, origem, rota em andamento, lotação e leitura de QR Code simulada.
- Fluxo do administrador: dashboard, chamados, estatísticas, rotas, usuários e relatórios.
- Estrutura com camada de dados simulada para substituir por Firebase/API real futuramente.

## Usuários de teste

| Perfil | Login | Senha |
|---|---|---|
| Aluno | 2026001 | 123456 |
| Motorista | 2026002 | 123456 |
| Admin | 2026003 | 123456 |

Também é possível usar `aluno`, `motorista` ou `admin` como login, com senha `123456`.

## Recuperação de senha

Use a matrícula do usuário. O código simulado é: `123456`.

## Como abrir

1. Abra o Android Studio.
2. Escolha **Open**.
3. Selecione a pasta raiz deste projeto.
4. Espere o Gradle sincronizar.
5. Rode o app pelo módulo `app`.

## Observação

Este projeto não depende de Firebase para rodar. A lógica de back/API foi simulada em Kotlin nos arquivos `data/FakeDatabase.kt`, `data/Repositories.kt` e `core/SessionManager.kt` para facilitar testes e apresentação.

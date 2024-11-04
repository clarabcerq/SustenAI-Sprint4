# SustentAI - Sprint4

<h2>Grupo Avant</h2>

> Objetivo:

Previsão de demanda por produtos sustentáveis de forma precisa e personalizada, identificando tendências de consumo em tempo real e ajustar as ofertas para atender melhor os consumidores, minimizando desperdícios e maximizando a eficiência nas vendas.

> Instruções:

Após clonar o aplicativo siga os seguintes passos.
Vá na estrutura do projeto e selecione a SDK 'graalvm-ce-17' com a versão 17. Após isso faça o build. 

Para realizar os testes da API no Postman, ou qualquer outra ferramenta que desejar, utilize os seguintes endpoints:
/api/produto
/api/usuario
/api/arquivos
/api/registroAcesso

Ao testar o CRUD no Postman em Produto:
No campo 'categoria' pode se utilizar: TECNOLOGIA_VERDE, MODA_SUSTENTAVEL, ALIMENTOS_ORGANICOS ou BELEZA_E_CUIDADOS_PESSOAIS

Ao testar o CRUD no Postman em Usuario:
Adicione o campo 'senha' e no campo 'cnpj' é obrigatorio exatos 11 digitos.

Para subir a aplicação na AZURE você deve baixar o plugin do Azure Tools:
Caso esteja no Eclipse basta ir no marketplace
Caso esteja com IntelliJ vá em Settings e Plugins.

Para realizar os testes do MVC no navegador, ou qualquer outra ferramenta que desejar, é necessário efetuar um login antes:
use o endpoint /login
Feito o login, utilize os seguintes endpoints:
/produto/lista
/usuario/lista
/arquivo/lista
/acesso/listaAcessos

> Vídeo da Aplicação no YouTube:

-

> Integrantes:
1. Clara Barreto Cerqueira
2. Guilherme Magalhães
3. Ming Nut Tan
4. Pedro Batista
5. Rafaela Rodrigues Luz

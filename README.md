# Jogo De Palavras

É dado uma palavra embaralhada para o jogador e ele deve acertar qual a palavra correta

## Introdução

O jogo foi produzido e entregue como projeto final para o curso de Programação Orientada a Objetos do ITA, feito através da plataforma Coursera. Entretanto, curti o seu desenvolvimento e pretendo fazer algumas alterações para praticar outras habilidades.

## Código

### Package "Embaralhadores"

As classes que pertecem a esse pacote são responsáveis por embaralhar as palavras. O que é feito em cada código esta descrito no nome da classe.

Além disso, também é encontrado nesse pacote a classe "FabricaDeEmbaralhadores" que tem uma instância para cada embaralhador e "escolhe" qual método será utilizado para embaralhar as palavras.

### Package "Mecanicas"

São as classes responsáveis por dar o ritmo do jogo, se acertou a palavra, se perdeu o jogo e etc. A mecanica de cada classe está descrita logo no começo do arquivo na função "getExplicacao()".

Foi pedido no enunciado do projeto que houvesse uma classe "FabricaDeMecanicas", que tem o mesmo propósito da Fabrica do package anteriror, entretanto pretendo fazer um menu em que o usuário ira escolher qual modo ele deseja jogar.


### BancoDePalavra

Essa classe é responsável por pegar uma palavra aleatoriamente do arquivo "bancoDePalavras.txt", é essa palavra que será embaralhada.

### Jogo

Classe que lê todas as respostas do usuário.

## Alterações futuras

### Reescrita do "FabricaDeMecanicas"

Como disse anteriormente, pretendo fazer uma leve alteração no código para que o usuário escolha a mecânica que deseja jogas.

Estudo também fazer um método com que o jogador configure seu próprio modo de jogo, escolhendo se terá vidas no jogo ou chances de acertar as palavras.

### Outra forma de verificar se o jogador deseja parar de jogar

É deveras chato ser pergutado a cada tentativa se você deseja parar de jogar, portanto farei uma lógica que caso o jogador escreva "DESEJO PARE" o jogo pare imediatamente (caso ele não perca antes)

### Leitura do bancoDePalavras

Procuro uma forma de ler o arquivo sem precisar mandar o caminho completo do arquivo

### Criação de um menu

Desejo pesquisar formas de fazer um menu interativo para que a experiência fique mais prazerosa para o jogador.

# ACEITO SUGESTÕES E AJUDAS

Caso você tenha alguma ideia ou deseja ajudar no desenvolvimento do projeto, por favor me mande um email: mateusflosimolero@hotmail.com

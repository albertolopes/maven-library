# maven-library
Este é um exemplo de como criar uma biblioteca maven e importa-la em um projeto Spring Boot.

### Nexus
O [Nexus](https://www.sonatype.com/products/nexus-repository) é um dos melhores e mais confiáveis repositórios de artefatos Maven disponível. Além de ser Open Source, o Nexus possui uma boa documentação, apresenta um bom nível de segurança e controle de acesso, e armazena os artefatos no sistema de arquivos, o que elimina muitas dores de cabeça. A configuração de um novo repositório Nexus é relativamente simples e mantendo as configurações default, já se consegue ter um repositório bastante eficiente por um bom tempo.
Será possivel ter uma instancia do nexus disponivel em um container docker, executando o arquivo run.sh na diretorio assets do projeto. Após isto a senha para primeiro acesso estará dentro de volume, também no diretorio assets.
Após o login, será preciso criar um novo repositorio e então irmos aos proximos passos.

### Maven 
Para executar ambos os comandos corretamente, precisaremos realizar antes algumas configurações básicas para habilitar o acesso ao repositório interno, assumindo a necessidade de autenticação (no nosso caso é necessária).
Para isso na pasta assets há um exemplo de como deverá estar o arquivo de configuração settings.xml na pasta .m2.

### Ação 
Após criar o projeto Maven e fazer as configurações e imports necessarios no arquivo pom.xml, basta execultar o "mvn deploy ". 

# Como rodar os projetos (Maven)

**Pré‑requisitos**
- Java 17+ (`java -version`)
- Maven 3.9+ (`mvn -version`)

Cada pasta possui um `pom.xml` com `exec-maven-plugin` já configurado.
Para compilar e executar, entre na pasta e rode:

### 01 - antipattern Strategy
```
cd "01 - antipattern Strategy"
mvn -q clean package
mvn -q exec:java
```
### 02 - pattern Strategy
```
cd "02 - pattern Strategy"
mvn -q clean package
mvn -q exec:java
```
### 03 - anti Observer
```
cd "03 - anti Observer"
mvn -q clean package
mvn -q exec:java
```
### 04 - pattern Observer
```
cd "04 - pattern Observer"
mvn -q clean package
mvn -q exec:java
```
### 05 - anti Composite
```
cd "05 - anti Composite"
mvn -q clean package
mvn -q exec:java
```
### 06 - pattern Composite
```
cd "06 - pattern Composite"
mvn -q clean package
mvn -q exec:java
```
### 07 - Strategy + Observer + Composite
```
cd "07 - Strategy + Observer + Composite"
mvn -q clean package
mvn -q exec:java
```

> Dica: se preferir gerar um JAR executável "fat", posso adicionar o `maven-shade-plugin`.

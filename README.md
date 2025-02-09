# Sample Graphql SpringBoot with Wookies

Build the graphql.wookies project

`mvn clean`

`mvn package`

`mvn spring-boot:run`


You can run the graphql query using your browser by visiting:

`http://localhost:8080/graphiql`

Add this to test the query:

```graphql
query bookDetails {
  bookById(id: "book-1") {
    id
    name
    pageCount
    author {
      firstName
      lastName
    }
  }
}
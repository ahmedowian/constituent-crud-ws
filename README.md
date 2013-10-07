constituent-crud-ws
===================

Rest web service for storing constituent data.

Even though this is not finished, here is the approach I was taking.

Immediately, the first thing I did after reading the requirements was to think of Entity-Relationships. I created an ER Diagram on paper and created the tables. See https://github.com/ahmedowian/constituent-crud-ws/blob/master/SimpleSpringWebMavenProject/src/main/resources/db/dbSchema.sql

I went online to find the "best" way to accomplish creating a RESTful JSON webservice. I found Spring Boot and some tutorials, so I got the tutorials to work.
I took the tutorial https://github.com/nebhale/spring-one-2012 and began to add my web service to it for the CRUD app. I got Java DB (Derby) running on my box and Apache Tomcat running embedded in my package. I spent so much time learning how to do what I wanted that I passed the deadline for completion. I got to the entity generation, and I began to use Hibernate tools to generate them when I encountered an error. I was going to generate the entities from my schema, and then create mapping objects that would map the entities to resources and vice versa.
I am using Spring HATEOAS which supports returning links for REST webservices. I was planning on having a hierarchical URI structure such as

.../constituents/{id}/financialProfiles/{id}/transactionHistory/{id}

.../constituents/{id}/transactionHistory/{id}

.../constituents/{id}/interactionHistory/{id}

So, you can get a list of transactions per financial profile or per constituent. Links would be provided for further information about related entities.

As for the client code, I was just going to use jQuery and demonstrate a PUT, POST, GET, and DELETE.

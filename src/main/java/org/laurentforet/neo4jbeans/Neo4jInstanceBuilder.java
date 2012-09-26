package org.laurentforet.neo4jbeans;


public class Neo4jInstanceBuilder {

    private String connectionString;

    public Neo4jInstanceBuilder() {
    }

    public Neo4jInstanceBuilder setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    public Neo4jInstance toNeo4jInstance() {
        return new Neo4jInstance(connectionString);
    }
    
}

package org.laurentforet.neo4jbeans;

//import org.neo4j.graphdb.GraphDatabaseService;
//import org.neo4j.graphdb.factory.GraphDatabaseFactory;

/**
 *
 * @author lforet
 */
public class Neo4jInstance {

    private String connectionString;
//    private GraphDatabaseService graphDb;

    public Neo4jInstance(String connectionString) {
        this.connectionString = connectionString;
//        graphDb = new GraphDatabaseFactory().newEmbeddedDatabase(connectionString);
//        registerShutdownHook(graphDb);
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

//    private static void registerShutdownHook(final GraphDatabaseService graphDb) {
//        Runtime.getRuntime().addShutdownHook(new Thread() {
//            @Override
//            public void run() {
//                graphDb.shutdown();
//            }
//        });
//    }
}

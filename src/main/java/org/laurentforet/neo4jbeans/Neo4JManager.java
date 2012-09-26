package org.laurentforet.neo4jbeans;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author lforet
 */
public enum Neo4JManager {

    DEFAULT;
    
    public List<Neo4jInstance> getInstances() {
        return Arrays.asList(
//                new Neo4jInstanceBuilder().setConnectionString("test1").toNeo4jInstance(),
//                new Neo4jInstanceBuilder().setConnectionString("test2").toNeo4jInstance(),
                new Neo4jInstanceBuilder().setConnectionString("c:/tmp/testneo4jbeans").toNeo4jInstance()
                );
    }
    
}

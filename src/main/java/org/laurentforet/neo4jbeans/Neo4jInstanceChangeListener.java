package org.laurentforet.neo4jbeans;

import java.util.EventListener;

/**
 *
 * @author lforet
 */
public interface Neo4jInstanceChangeListener extends EventListener {
    
    public void hasChanged();
    
}

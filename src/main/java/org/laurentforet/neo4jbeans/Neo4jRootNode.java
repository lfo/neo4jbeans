package org.laurentforet.neo4jbeans;

import org.laurentforet.neo4jbeans.actions.AddEmbeddedAction;
import java.util.List;
import javax.swing.Action;

import org.netbeans.api.core.ide.ServicesTabNodeRegistration;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.NbBundle.Messages;

@Messages("CTL_Neo4jNode=Neo4J")
public class Neo4jRootNode extends AbstractNode {

    public static final String NODE_NAME = "Neo4j"; // NOI18N
    private static final String ICON_BASE = "org/laurentforet/neo4jbeans/neo4j-16x16.png"; // NOI18N

    @ServicesTabNodeRegistration( name = NODE_NAME,
    iconResource = ICON_BASE,
    displayName = "#CTL_Neo4jNode")
    public static Neo4jRootNode getDefault() {
        return new Neo4jRootNode();
    }

    public Neo4jRootNode() {
        super(Children.create(new Neo4jChildrenFactory(), true));
        setName(NODE_NAME);
        setDisplayName(Bundle.CTL_Neo4jNode());
        setIconBaseWithExtension(ICON_BASE);
    }

    @Override
    public Action[] getActions(boolean context) {
        return new Action[]{new AddEmbeddedAction()};
    }

    private static class Neo4jChildrenFactory extends ChildFactory<Neo4jInstance> implements Neo4jInstanceChangeListener {

        public Neo4jChildrenFactory() {
        }

        @Override
        protected Node createNodeForKey(Neo4jInstance key) {
            return new Neo4jInstanceNode(key);
        }

        @Override
        protected boolean createKeys(List<Neo4jInstance> toPopulate) {
            toPopulate.addAll(Neo4JManager.DEFAULT.getInstances());
            return true;
        }

        @Override
        public void hasChanged() {
            refresh(false);
        }
    }

    private static class Neo4jInstanceNode extends AbstractNode {

        public Neo4jInstanceNode(Neo4jInstance instance) {
            super(new Children.Array());
            setDisplayName(instance.getConnectionString());
        }
    }
}
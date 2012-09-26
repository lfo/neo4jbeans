package org.laurentforet.neo4jbeans.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import org.openide.awt.ActionID;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
    category = "Neo4j",
    id = "org.laurentforet.neo4jbeans.actions.AddEmbeddedAction")
@ActionRegistration(
    displayName = "#CTL_AddEmbeddedAction")
@Messages("CTL_AddEmbeddedAction=add New embedded ...")
public final class AddEmbeddedAction extends AbstractAction implements ActionListener {

    public AddEmbeddedAction() {
        super(Bundle.CTL_AddEmbeddedAction());
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("TODO");
    }
}

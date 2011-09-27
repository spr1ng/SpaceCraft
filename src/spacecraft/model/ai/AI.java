/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacecraft.model.ai;

import spacecraft.model.Action;
import spacecraft.model.field.FieldMap;

/**
 * @version $Id$
 * @author rsen
 */
public interface AI {
    
    Action getAction(FieldMap fieldMap);
    
}

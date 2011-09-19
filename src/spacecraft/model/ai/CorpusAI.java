/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spacecraft.model.ai;

import spacecraft.model.Action;
import spacecraft.model.FieldMap;

/**
 * @version $Id$
 * @author rsen
 */
public abstract class CorpusAI {
    
    public abstract Action getAction(FieldMap fieldMap);
    
}

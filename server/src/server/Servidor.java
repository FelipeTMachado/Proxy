package server;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lucas campestrini <lucas.campestrini@gmail.com>
 */
interface Servidor {

    HashMap<String, Pessoa> requisitar();
    
}

package server;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author lucas campestrini <lucas.campestrini@gmail.com>
 */
public class ProxyCacheServidor implements Servidor, Observavel{
    
    private Servidor servidor;
    private Map<String, String> cache;
    private Boolean estaAtualizado;
    private LocalDateTime ultimaAtualizacao;

    public ProxyCacheServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    @Override
    public Map<String, String> requisitar() {
        if (!estaAtualizado) {
            cache = servidor.requisitar();
            ultimaAtualizacao = LocalDateTime.now();
            estaAtualizado = true;
        }
        return cache;
    }

    @Override
    public void notificar() {
        estaAtualizado = false;
    }
    
}

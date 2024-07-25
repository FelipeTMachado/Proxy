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
    private Map<String, Pessoa> cache;
    private Boolean estaAtualizado;
    private LocalDateTime ultimaAtualizacao;

    public ProxyCacheServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    @Override
    public Map<String, Pessoa> requisitar(String id) {
        if (!estaAtualizado) {
            cache = servidor.requisitar(id);
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

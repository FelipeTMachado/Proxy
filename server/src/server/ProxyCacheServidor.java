package server;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lucas campestrini <lucas.campestrini@gmail.com>
 */
public class ProxyCacheServidor implements Servidor, Observavel{
    
    private Servidor servidor;
    private HashMap<String, Pessoa> cache;
    private Boolean primeiraRequisicao = true;
    private LocalDateTime ultimaAtualizacao = LocalDateTime.now();

    public ProxyCacheServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    @Override
    public HashMap<String, Pessoa> requisitar() {
        if (primeiraRequisicao || LocalDateTime.now().isAfter(ultimaAtualizacao.plusSeconds(5))) {
            cache = servidor.requisitar();
            ultimaAtualizacao = LocalDateTime.now();
            primeiraRequisicao = false;
            System.out.println("Dados vieram direto do Banco de Dados");
        } else {
            System.out.println("Dados vieram do cache");
            System.out.println("ultima atualização: " + ultimaAtualizacao.toString());
        }
        return cache;
    }

    @Override
    public void notificar() {
        primeiraRequisicao = false;
    }

    public Servidor getServidor() {
        return servidor;
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    public HashMap<String, Pessoa> getCache() {
        return cache;
    }

    public void setCache(HashMap<String, Pessoa> cache) {
        this.cache = cache;
    }

    public Boolean getPrimeiraRequisicao() {
        return primeiraRequisicao;
    }

    public void setPrimeiraRequisicao(Boolean primeiraRequisicao) {
        this.primeiraRequisicao = primeiraRequisicao;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
    
    
    
}

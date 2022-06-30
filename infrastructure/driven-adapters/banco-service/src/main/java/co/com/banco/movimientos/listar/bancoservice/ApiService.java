package co.com.banco.movimientos.listar.bancoservice;

import co.com.banco.movimientos.listar.model.movimiento.Movimiento;
import co.com.banco.movimientos.listar.model.movimiento.gateways.MovimientoService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ApiService implements MovimientoService {
    @Override
    public Flux<Movimiento> getMovimientos(Mono<Movimiento> id) {
        return Flux.just(Movimiento.builder().movimientoId(1).build());
    }
}

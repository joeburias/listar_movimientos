package co.com.banco.movimientos.listar.model.movimiento.gateways;

import co.com.banco.movimientos.listar.model.movimiento.Movimiento;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovimientoService {
    Flux<Movimiento> getMovimientos(Mono<Movimiento> id);
}

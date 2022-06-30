package co.com.banco.movimientos.listar.usecase.listarmovimientos;

import co.com.banco.movimientos.listar.model.movimiento.Movimiento;
import co.com.banco.movimientos.listar.model.movimiento.gateways.MovimientoService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class ListarMovimientosUseCase {
    private MovimientoService serviceGateway;
    public Flux<Movimiento> getMovimientos(Mono<Movimiento> movimientoId) {
        /* logic */
        return serviceGateway.getMovimientos(movimientoId);
    }
}

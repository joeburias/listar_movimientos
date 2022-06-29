package co.com.banco.movimientos.listar.usecase.listarmovimientos;

import co.com.banco.movimientos.listar.model.movimiento.Movimiento;
import co.com.banco.movimientos.listar.model.movimiento.gateways.MovimientoService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class ListarMovimientosUseCase {
    private MovimientoService serviceGateway;
    public Flux<Movimiento> getMovimientos(Integer movimientoId) {
        /* logic */
        return serviceGateway.getMovimientos(movimientoId);
    }
}

package co.com.banco.movimientos.listar.model.movimiento.gateways;

import co.com.banco.movimientos.listar.model.movimiento.Movimiento;
import reactor.core.publisher.Flux;

public interface MovimientoService {
    Flux<Movimiento> getMovimientos(Integer id);
}

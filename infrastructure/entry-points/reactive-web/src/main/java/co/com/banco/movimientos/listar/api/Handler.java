package co.com.banco.movimientos.listar.api;

import co.com.banco.movimientos.listar.model.movimiento.Movimiento;
import co.com.banco.movimientos.listar.usecase.listarmovimientos.ListarMovimientosUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.Disposable;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyExtractors.toMono;

@Component
@RequiredArgsConstructor
public class Handler {
    private  final ListarMovimientosUseCase useCase;
    public Mono<ServerResponse> listenPOSTUseCase(ServerRequest serverRequest) {
        Mono<Movimiento> movimientoMono = serverRequest.body(toMono(Movimiento.class));
        return ServerResponse.ok().body(useCase.getMovimientos(movimientoMono), Movimiento.class);
    }
}

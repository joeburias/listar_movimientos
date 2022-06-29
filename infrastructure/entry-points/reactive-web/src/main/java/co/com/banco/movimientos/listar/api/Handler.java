package co.com.banco.movimientos.listar.api;

import co.com.banco.movimientos.listar.model.movimiento.Movimiento;
import co.com.banco.movimientos.listar.usecase.listarmovimientos.ListarMovimientosUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {
    private  final ListarMovimientosUseCase useCase;
    public Mono<ServerResponse> listenPOSTUseCase(ServerRequest serverRequest) {
        // usecase.logic();
        Integer bodyId = serverRequest.bodyToMono()
        return ServerResponse.ok().bodyValue(useCase.getMovimientos(serverRequest.body()));
    } // !!
}

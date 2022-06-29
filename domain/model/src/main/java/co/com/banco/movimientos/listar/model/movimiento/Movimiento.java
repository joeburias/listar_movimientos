package co.com.banco.movimientos.listar.model.movimiento;
import lombok.Builder;
import lombok.Data;

import java.math.BigInteger;

@Data
@Builder(toBuilder = true)
public class Movimiento {
    private Integer movimientoId;
    private String fecha;
    private String oficina;
    private String referencia;
    private BigInteger monto;
    private String tipo;
}

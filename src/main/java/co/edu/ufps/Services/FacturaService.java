package co.edu.ufps.Services;



import co.edu.ufps.DTO.*;
import co.edu.ufps.Entities.*;
import co.edu.ufps.Repositories.*;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FacturaService {
	@Autowired

    private final ClienteRepository clienteRepository;
    private final ProductoRepository productoRepository;
    private final CajeroRepository cajeroRepository;
    private final VendedorRepository vendedorRepository;

    /**
     * Procesar y guardar una factura.
     */
    public FacturaResponseDTO processFactura(FacturaRequestDTO request) {
        Cliente cliente = clienteRepository.findById(request.getCliente().getId())
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        Cajero cajero = cajeroRepository.findById(request.getCajero().getId())
                .orElseThrow(() -> new RuntimeException("Cajero no encontrado"));

        Vendedor vendedor = vendedorRepository.findById(request.getVendedor().getId())
                .orElseThrow(() -> new RuntimeException("Vendedor no encontrado"));

        // Obtener los productos
        var productos = request.getProductos().stream()
                .map(p -> productoRepository.findById(p.getId())
                        .orElseThrow(() -> new RuntimeException("Producto no encontrado: " + p.getId())))
                .collect(Collectors.toList());

        // Calcular total
        BigDecimal total = productos.stream()
                .map(Producto::getPrecio)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .add(request.getImpuesto());

        // Crear FacturaResponseDTO
        FacturaDataDTO data = new FacturaDataDTO();
        data.setNumero("FACT-" + Math.random()); // Generar número de factura
        data.setTotal(total);
        data.setFecha(java.time.LocalDate.now());

        FacturaResponseDTO response = new FacturaResponseDTO();
        response.setStatus("SUCCESS");
        response.setMessage("Factura procesada correctamente");
        response.setData(data);

        return response;
    }
}


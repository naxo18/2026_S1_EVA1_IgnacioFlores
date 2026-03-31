package repository;


import model.Solicitud;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository

public class SolicitudRepository {
    private List<Solicitud> solicitudes = new ArrayList<>();

    public List<Solicitud> obtenerTodas() {
        return solicitudes;
    }

    public void guardar(Solicitud solicitud) {
        solicitudes.add(solicitud);
    }

    public Optional<Solicitud> buscarPorId(int id) {
        return solicitudes.stream().filter(s -> s.getId() == id).findFirst();
    }

    public void eliminar(int id) {
        solicitudes.removeIf(s -> s.getId() == id);
    }

    public void actualizar(Solicitud solicitud) {
        eliminar(solicitud.getId());
        guardar(solicitud);
    }
    public List<Solicitud> filtrarPorPrioridad(String prioridad) {
        return solicitudes.stream()
                .filter(s -> s.getPrioridad().equalsIgnoreCase(prioridad))
                .toList();
    }
}

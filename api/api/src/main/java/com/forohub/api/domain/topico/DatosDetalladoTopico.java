package com.forohub.api.domain.topico;

import java.time.LocalDateTime;

public record DatosDetalladoTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        String status,
        String autor,
        String curso
) {
    public DatosDetalladoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(),
                topico.getFechaCreacion(), topico.getStatus(),
                topico.getAutor(), topico.getCurso());
    }
}
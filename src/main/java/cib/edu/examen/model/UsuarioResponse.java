package cib.edu.examen.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UsuarioResponse {

    private Integer idusuario;
    private String nomusuario;
    private String token;

}

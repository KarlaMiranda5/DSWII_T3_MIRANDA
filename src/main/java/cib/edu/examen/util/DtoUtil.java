package cib.edu.examen.util;


import org.springframework.stereotype.Component;

@Component
public class DtoUtil {

    public DtoEntity convertirADto(Object obj, DtoEntity mapper){
        return new ModelMapper().map(obj, mapper.getClass());
    }

    public Object convertirAEntidad(Object obj, DtoEntity mapper){
        return new ModelMapper().map(mapper, obj.getClass());
    }



}

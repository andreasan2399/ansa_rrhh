package com.prueba.ansa_rrhh.mapper.principal;

import java.util.List;

public interface EntityMapper <D, E>{
    D toDto(E entity);
    E toEntity(D dto);
    List<E> toEntity(List<D> dto);
    List<D> toDto(List<E> entityList);

}

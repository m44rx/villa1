package ves.com.villa1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import ves.com.villa1.dto.PersonaDto;
import ves.com.villa1.entity.Persona;

@Mapper(componentModel = "spring")
public interface PersonaMapper {

    PersonaMapper MAPPER = Mappers.getMapper(PersonaMapper.class);

    PersonaDto toPersonDto(Persona persona);

    Persona toPersona(PersonaDto dto);

}

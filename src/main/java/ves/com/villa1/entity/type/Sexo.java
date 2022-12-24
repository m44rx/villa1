package ves.com.villa1.entity.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Sexo {
    MASCULINO("2"),
    FEMENINO("1"),
    INDEFINIDO("0");

    private final String codSExo;

}

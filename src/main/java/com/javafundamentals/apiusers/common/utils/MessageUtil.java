package com.javafundamentals.apiusers.common.utils;

public enum MessageUtil {
    OK("Proceso exitoso.", 200),
    CREATED("Creación exitosa.", 201),
    UPDATE("Actualización exitosa.", 200),
    DELETED("Eliminación exitosa.", 200),
    BADREQUEST("Hubo un error en su petición.", 400),
    NOTFOUND("No existen registros.", 404),
    INTERNALERROR("Error en el servidor.", 500),
    CONFLICT("Hubo un conflicto en su petición.", 409),
    ;

    private String key;
    private int code;

    private MessageUtil(String key, int code){
        this.key = key;
        this.code = code;
    }

    public String getKey() {
        return key;
    }

    public int getCode() {
        return code;
    }
}

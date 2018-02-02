package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QContacto is a Querydsl query type for Contacto
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QContacto extends EntityPathBase<Contacto> {

    private static final long serialVersionUID = 1032974269L;

    public static final QContacto contacto = new QContacto("contacto");

    public final StringPath correo = createString("correo");

    public final NumberPath<Integer> estado = createNumber("estado", Integer.class);

    public final DateTimePath<java.util.Date> fecha = createDateTime("fecha", java.util.Date.class);

    public final NumberPath<Integer> idContacto = createNumber("idContacto", Integer.class);

    public final StringPath mensaje = createString("mensaje");

    public final StringPath motivo = createString("motivo");

    public final StringPath nombre = createString("nombre");

    public QContacto(String variable) {
        super(Contacto.class, forVariable(variable));
    }

    public QContacto(Path<? extends Contacto> path) {
        super(path.getType(), path.getMetadata());
    }

    public QContacto(PathMetadata<?> metadata) {
        super(Contacto.class, metadata);
    }

}


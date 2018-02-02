package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAuditorias is a Querydsl query type for Auditorias
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAuditorias extends EntityPathBase<Auditorias> {

    private static final long serialVersionUID = 2118163083L;

    public static final QAuditorias auditorias = new QAuditorias("auditorias");

    public final StringPath accion = createString("accion");

    public final DatePath<java.util.Date> fecha = createDate("fecha", java.util.Date.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath sesion = createString("sesion");

    public final StringPath tabla = createString("tabla");

    public QAuditorias(String variable) {
        super(Auditorias.class, forVariable(variable));
    }

    public QAuditorias(Path<? extends Auditorias> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditorias(PathMetadata<?> metadata) {
        super(Auditorias.class, metadata);
    }

}


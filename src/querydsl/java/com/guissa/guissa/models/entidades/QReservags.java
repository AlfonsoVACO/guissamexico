package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QReservags is a Querydsl query type for Reservags
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QReservags extends EntityPathBase<Reservags> {

    private static final long serialVersionUID = 96545270L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReservags reservags = new QReservags("reservags");

    public final NumberPath<Integer> contador = createNumber("contador", Integer.class);

    public final DatePath<java.util.Date> fecha = createDate("fecha", java.util.Date.class);

    public final QNegocios idNegocio;

    public final NumberPath<Long> idVentas = createNumber("idVentas", Long.class);

    public QReservags(String variable) {
        this(Reservags.class, forVariable(variable), INITS);
    }

    public QReservags(Path<? extends Reservags> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QReservags(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QReservags(PathMetadata<?> metadata, PathInits inits) {
        this(Reservags.class, metadata, inits);
    }

    public QReservags(Class<? extends Reservags> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idNegocio = inits.isInitialized("idNegocio") ? new QNegocios(forProperty("idNegocio"), inits.get("idNegocio")) : null;
    }

}


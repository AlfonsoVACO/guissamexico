package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QReservacion is a Querydsl query type for Reservacion
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QReservacion extends EntityPathBase<Reservacion> {

    private static final long serialVersionUID = -1709401265L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReservacion reservacion = new QReservacion("reservacion");

    public final NumberPath<Short> activo = createNumber("activo", Short.class);

    public final DateTimePath<java.util.Date> fechaI = createDateTime("fechaI", java.util.Date.class);

    public final DateTimePath<java.util.Date> fechaT = createDateTime("fechaT", java.util.Date.class);

    public final QNegocios idNegocio;

    public final NumberPath<Integer> idReservacion = createNumber("idReservacion", Integer.class);

    public final QUserc idUserC;

    public final StringPath pedido = createString("pedido");

    public QReservacion(String variable) {
        this(Reservacion.class, forVariable(variable), INITS);
    }

    public QReservacion(Path<? extends Reservacion> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QReservacion(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QReservacion(PathMetadata<?> metadata, PathInits inits) {
        this(Reservacion.class, metadata, inits);
    }

    public QReservacion(Class<? extends Reservacion> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idNegocio = inits.isInitialized("idNegocio") ? new QNegocios(forProperty("idNegocio"), inits.get("idNegocio")) : null;
        this.idUserC = inits.isInitialized("idUserC") ? new QUserc(forProperty("idUserC"), inits.get("idUserC")) : null;
    }

}


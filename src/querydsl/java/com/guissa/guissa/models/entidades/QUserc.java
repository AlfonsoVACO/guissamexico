package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QUserc is a Querydsl query type for Userc
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUserc extends EntityPathBase<Userc> {

    private static final long serialVersionUID = 601089354L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserc userc = new QUserc("userc");

    public final StringPath apellidos = createString("apellidos");

    public final StringPath correo = createString("correo");

    public final StringPath direccion = createString("direccion");

    public final QNegocios idNegocio;

    public final NumberPath<Integer> idUserC = createNumber("idUserC", Integer.class);

    public final StringPath nombre = createString("nombre");

    public final ListPath<Reservacion, QReservacion> reservacionList = this.<Reservacion, QReservacion>createList("reservacionList", Reservacion.class, QReservacion.class, PathInits.DIRECT2);

    public final StringPath telefono = createString("telefono");

    public QUserc(String variable) {
        this(Userc.class, forVariable(variable), INITS);
    }

    public QUserc(Path<? extends Userc> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUserc(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUserc(PathMetadata<?> metadata, PathInits inits) {
        this(Userc.class, metadata, inits);
    }

    public QUserc(Class<? extends Userc> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idNegocio = inits.isInitialized("idNegocio") ? new QNegocios(forProperty("idNegocio"), inits.get("idNegocio")) : null;
    }

}


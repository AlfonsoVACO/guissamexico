package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QComun is a Querydsl query type for Comun
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QComun extends EntityPathBase<Comun> {

    private static final long serialVersionUID = 584354604L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QComun comun = new QComun("comun");

    public final StringPath descripcion = createString("descripcion");

    public final NumberPath<Integer> idComun = createNumber("idComun", Integer.class);

    public final QNegocios idNegocio;

    public QComun(String variable) {
        this(Comun.class, forVariable(variable), INITS);
    }

    public QComun(Path<? extends Comun> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QComun(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QComun(PathMetadata<?> metadata, PathInits inits) {
        this(Comun.class, metadata, inits);
    }

    public QComun(Class<? extends Comun> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idNegocio = inits.isInitialized("idNegocio") ? new QNegocios(forProperty("idNegocio"), inits.get("idNegocio")) : null;
    }

}


package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QReplicap is a Querydsl query type for Replicap
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QReplicap extends EntityPathBase<Replicap> {

    private static final long serialVersionUID = 1170331174L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReplicap replicap = new QReplicap("replicap");

    public final DateTimePath<java.util.Date> fecha = createDateTime("fecha", java.util.Date.class);

    public final QComentariosp idComentariosp;

    public final NumberPath<Integer> idReplica = createNumber("idReplica", Integer.class);

    public final StringPath nombre = createString("nombre");

    public final StringPath replica = createString("replica");

    public QReplicap(String variable) {
        this(Replicap.class, forVariable(variable), INITS);
    }

    public QReplicap(Path<? extends Replicap> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QReplicap(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QReplicap(PathMetadata<?> metadata, PathInits inits) {
        this(Replicap.class, metadata, inits);
    }

    public QReplicap(Class<? extends Replicap> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idComentariosp = inits.isInitialized("idComentariosp") ? new QComentariosp(forProperty("idComentariosp"), inits.get("idComentariosp")) : null;
    }

}


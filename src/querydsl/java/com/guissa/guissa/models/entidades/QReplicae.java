package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QReplicae is a Querydsl query type for Replicae
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QReplicae extends EntityPathBase<Replicae> {

    private static final long serialVersionUID = 1170331163L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReplicae replicae = new QReplicae("replicae");

    public final DateTimePath<java.util.Date> fecha = createDateTime("fecha", java.util.Date.class);

    public final QComentariose idComentario;

    public final NumberPath<Integer> idReplica = createNumber("idReplica", Integer.class);

    public final StringPath nombre = createString("nombre");

    public final StringPath replica = createString("replica");

    public QReplicae(String variable) {
        this(Replicae.class, forVariable(variable), INITS);
    }

    public QReplicae(Path<? extends Replicae> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QReplicae(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QReplicae(PathMetadata<?> metadata, PathInits inits) {
        this(Replicae.class, metadata, inits);
    }

    public QReplicae(Class<? extends Replicae> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idComentario = inits.isInitialized("idComentario") ? new QComentariose(forProperty("idComentario"), inits.get("idComentario")) : null;
    }

}


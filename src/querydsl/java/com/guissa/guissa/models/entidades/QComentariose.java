package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QComentariose is a Querydsl query type for Comentariose
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QComentariose extends EntityPathBase<Comentariose> {

    private static final long serialVersionUID = 1153870433L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QComentariose comentariose = new QComentariose("comentariose");

    public final StringPath comentario = createString("comentario");

    public final DateTimePath<java.util.Date> fecha = createDateTime("fecha", java.util.Date.class);

    public final NumberPath<Integer> idComentario = createNumber("idComentario", Integer.class);

    public final QEvento idEvento;

    public final StringPath nombre = createString("nombre");

    public final ListPath<Replicae, QReplicae> replicaeList = this.<Replicae, QReplicae>createList("replicaeList", Replicae.class, QReplicae.class, PathInits.DIRECT2);

    public QComentariose(String variable) {
        this(Comentariose.class, forVariable(variable), INITS);
    }

    public QComentariose(Path<? extends Comentariose> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QComentariose(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QComentariose(PathMetadata<?> metadata, PathInits inits) {
        this(Comentariose.class, metadata, inits);
    }

    public QComentariose(Class<? extends Comentariose> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idEvento = inits.isInitialized("idEvento") ? new QEvento(forProperty("idEvento"), inits.get("idEvento")) : null;
    }

}


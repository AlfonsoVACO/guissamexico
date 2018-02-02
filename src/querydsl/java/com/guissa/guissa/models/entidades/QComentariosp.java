package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QComentariosp is a Querydsl query type for Comentariosp
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QComentariosp extends EntityPathBase<Comentariosp> {

    private static final long serialVersionUID = 1153870444L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QComentariosp comentariosp = new QComentariosp("comentariosp");

    public final StringPath comentario = createString("comentario");

    public final DateTimePath<java.util.Date> fecha = createDateTime("fecha", java.util.Date.class);

    public final NumberPath<Integer> idComentario = createNumber("idComentario", Integer.class);

    public final QProducto idProducto;

    public final StringPath nombre = createString("nombre");

    public final ListPath<Replicap, QReplicap> replicapList = this.<Replicap, QReplicap>createList("replicapList", Replicap.class, QReplicap.class, PathInits.DIRECT2);

    public QComentariosp(String variable) {
        this(Comentariosp.class, forVariable(variable), INITS);
    }

    public QComentariosp(Path<? extends Comentariosp> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QComentariosp(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QComentariosp(PathMetadata<?> metadata, PathInits inits) {
        this(Comentariosp.class, metadata, inits);
    }

    public QComentariosp(Class<? extends Comentariosp> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idProducto = inits.isInitialized("idProducto") ? new QProducto(forProperty("idProducto"), inits.get("idProducto")) : null;
    }

}


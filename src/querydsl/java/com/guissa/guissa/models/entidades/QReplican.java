package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QReplican is a Querydsl query type for Replican
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QReplican extends EntityPathBase<Replican> {

    private static final long serialVersionUID = 1170331172L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReplican replican = new QReplican("replican");

    public final NumberPath<Integer> estado = createNumber("estado", Integer.class);

    public final DateTimePath<java.util.Date> fecha = createDateTime("fecha", java.util.Date.class);

    public final QComentariosn idComentario;

    public final NumberPath<Integer> idReplica = createNumber("idReplica", Integer.class);

    public final StringPath nombre = createString("nombre");

    public final StringPath replica = createString("replica");

    public QReplican(String variable) {
        this(Replican.class, forVariable(variable), INITS);
    }

    public QReplican(Path<? extends Replican> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QReplican(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QReplican(PathMetadata<?> metadata, PathInits inits) {
        this(Replican.class, metadata, inits);
    }

    public QReplican(Class<? extends Replican> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idComentario = inits.isInitialized("idComentario") ? new QComentariosn(forProperty("idComentario"), inits.get("idComentario")) : null;
    }

}


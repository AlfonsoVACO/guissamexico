package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QComentariosn is a Querydsl query type for Comentariosn
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QComentariosn extends EntityPathBase<Comentariosn> {

    private static final long serialVersionUID = 1153870442L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QComentariosn comentariosn = new QComentariosn("comentariosn");

    public final StringPath comentario = createString("comentario");

    public final NumberPath<Integer> estado = createNumber("estado", Integer.class);

    public final DateTimePath<java.util.Date> fecha = createDateTime("fecha", java.util.Date.class);

    public final NumberPath<Integer> idComentario = createNumber("idComentario", Integer.class);

    public final QNegocios idNegocio;

    public final StringPath nombre = createString("nombre");

    public final ListPath<Replican, QReplican> replicanList = this.<Replican, QReplican>createList("replicanList", Replican.class, QReplican.class, PathInits.DIRECT2);

    public QComentariosn(String variable) {
        this(Comentariosn.class, forVariable(variable), INITS);
    }

    public QComentariosn(Path<? extends Comentariosn> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QComentariosn(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QComentariosn(PathMetadata<?> metadata, PathInits inits) {
        this(Comentariosn.class, metadata, inits);
    }

    public QComentariosn(Class<? extends Comentariosn> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idNegocio = inits.isInitialized("idNegocio") ? new QNegocios(forProperty("idNegocio"), inits.get("idNegocio")) : null;
    }

}


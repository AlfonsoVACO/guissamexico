package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QContactNegocios is a Querydsl query type for ContactNegocios
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QContactNegocios extends EntityPathBase<ContactNegocios> {

    private static final long serialVersionUID = -1471292613L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QContactNegocios contactNegocios = new QContactNegocios("contactNegocios");

    public final StringPath comentario = createString("comentario");

    public final DateTimePath<java.util.Date> fecha = createDateTime("fecha", java.util.Date.class);

    public final NumberPath<Integer> idComentario = createNumber("idComentario", Integer.class);

    public final QNegocios idNegocio;

    public QContactNegocios(String variable) {
        this(ContactNegocios.class, forVariable(variable), INITS);
    }

    public QContactNegocios(Path<? extends ContactNegocios> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QContactNegocios(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QContactNegocios(PathMetadata<?> metadata, PathInits inits) {
        this(ContactNegocios.class, metadata, inits);
    }

    public QContactNegocios(Class<? extends ContactNegocios> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idNegocio = inits.isInitialized("idNegocio") ? new QNegocios(forProperty("idNegocio"), inits.get("idNegocio")) : null;
    }

}


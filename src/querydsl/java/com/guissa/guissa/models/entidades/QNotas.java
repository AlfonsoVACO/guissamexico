package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QNotas is a Querydsl query type for Notas
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QNotas extends EntityPathBase<Notas> {

    private static final long serialVersionUID = 594519447L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNotas notas = new QNotas("notas");

    public final DateTimePath<java.util.Date> fecha = createDateTime("fecha", java.util.Date.class);

    public final NumberPath<Integer> idNota = createNumber("idNota", Integer.class);

    public final QUser idUser;

    public final StringPath nota = createString("nota");

    public QNotas(String variable) {
        this(Notas.class, forVariable(variable), INITS);
    }

    public QNotas(Path<? extends Notas> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QNotas(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QNotas(PathMetadata<?> metadata, PathInits inits) {
        this(Notas.class, metadata, inits);
    }

    public QNotas(Class<? extends Notas> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idUser = inits.isInitialized("idUser") ? new QUser(forProperty("idUser"), inits.get("idUser")) : null;
    }

}


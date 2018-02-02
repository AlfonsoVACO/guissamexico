package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QResetopass is a Querydsl query type for Resetopass
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QResetopass extends EntityPathBase<Resetopass> {

    private static final long serialVersionUID = -1250829057L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QResetopass resetopass = new QResetopass("resetopass");

    public final DateTimePath<java.util.Date> creado = createDateTime("creado", java.util.Date.class);

    public final NumberPath<Integer> idResetoPass = createNumber("idResetoPass", Integer.class);

    public final QUser idUser;

    public final StringPath nick = createString("nick");

    public final StringPath token = createString("token");

    public QResetopass(String variable) {
        this(Resetopass.class, forVariable(variable), INITS);
    }

    public QResetopass(Path<? extends Resetopass> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QResetopass(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QResetopass(PathMetadata<?> metadata, PathInits inits) {
        this(Resetopass.class, metadata, inits);
    }

    public QResetopass(Class<? extends Resetopass> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idUser = inits.isInitialized("idUser") ? new QUser(forProperty("idUser"), inits.get("idUser")) : null;
    }

}


package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QPatrocinador is a Querydsl query type for Patrocinador
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPatrocinador extends EntityPathBase<Patrocinador> {

    private static final long serialVersionUID = -1412965284L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPatrocinador patrocinador = new QPatrocinador("patrocinador");

    public final NumberPath<Integer> idPatrocinador = createNumber("idPatrocinador", Integer.class);

    public final QUser idUser;

    public final ArrayPath<byte[], Byte> imagen = createArray("imagen", byte[].class);

    public final StringPath localizacion = createString("localizacion");

    public final StringPath nombre = createString("nombre");

    public final StringPath web = createString("web");

    public QPatrocinador(String variable) {
        this(Patrocinador.class, forVariable(variable), INITS);
    }

    public QPatrocinador(Path<? extends Patrocinador> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPatrocinador(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPatrocinador(PathMetadata<?> metadata, PathInits inits) {
        this(Patrocinador.class, metadata, inits);
    }

    public QPatrocinador(Class<? extends Patrocinador> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idUser = inits.isInitialized("idUser") ? new QUser(forProperty("idUser"), inits.get("idUser")) : null;
    }

}


package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QGaleriaNs is a Querydsl query type for GaleriaNs
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QGaleriaNs extends EntityPathBase<GaleriaNs> {

    private static final long serialVersionUID = -1795545394L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGaleriaNs galeriaNs = new QGaleriaNs("galeriaNs");

    public final NumberPath<Integer> idImagen = createNumber("idImagen", Integer.class);

    public final QNegocios idNegocio;

    public final ArrayPath<byte[], Byte> imagen = createArray("imagen", byte[].class);

    public final StringPath nombre = createString("nombre");

    public final StringPath nombreimg = createString("nombreimg");

    public final StringPath tipo = createString("tipo");

    public QGaleriaNs(String variable) {
        this(GaleriaNs.class, forVariable(variable), INITS);
    }

    public QGaleriaNs(Path<? extends GaleriaNs> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QGaleriaNs(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QGaleriaNs(PathMetadata<?> metadata, PathInits inits) {
        this(GaleriaNs.class, metadata, inits);
    }

    public QGaleriaNs(Class<? extends GaleriaNs> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idNegocio = inits.isInitialized("idNegocio") ? new QNegocios(forProperty("idNegocio"), inits.get("idNegocio")) : null;
    }

}


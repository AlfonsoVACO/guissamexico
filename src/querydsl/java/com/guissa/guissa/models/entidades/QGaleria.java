package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QGaleria is a Querydsl query type for Galeria
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QGaleria extends EntityPathBase<Galeria> {

    private static final long serialVersionUID = 2071872297L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGaleria galeria = new QGaleria("galeria");

    public final NumberPath<Integer> idImagen = createNumber("idImagen", Integer.class);

    public final QProducto idProducto;

    public final ArrayPath<byte[], Byte> imagen = createArray("imagen", byte[].class);

    public final StringPath nombre = createString("nombre");

    public QGaleria(String variable) {
        this(Galeria.class, forVariable(variable), INITS);
    }

    public QGaleria(Path<? extends Galeria> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QGaleria(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QGaleria(PathMetadata<?> metadata, PathInits inits) {
        this(Galeria.class, metadata, inits);
    }

    public QGaleria(Class<? extends Galeria> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idProducto = inits.isInitialized("idProducto") ? new QProducto(forProperty("idProducto"), inits.get("idProducto")) : null;
    }

}


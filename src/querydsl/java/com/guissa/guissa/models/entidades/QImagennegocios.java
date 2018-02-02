package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QImagennegocios is a Querydsl query type for Imagennegocios
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QImagennegocios extends EntityPathBase<Imagennegocios> {

    private static final long serialVersionUID = -326779254L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QImagennegocios imagennegocios = new QImagennegocios("imagennegocios");

    public final NumberPath<Integer> idImagen = createNumber("idImagen", Integer.class);

    public final QNegocios idNegocio;

    public final ArrayPath<byte[], Byte> imagen = createArray("imagen", byte[].class);

    public final StringPath nombre = createString("nombre");

    public QImagennegocios(String variable) {
        this(Imagennegocios.class, forVariable(variable), INITS);
    }

    public QImagennegocios(Path<? extends Imagennegocios> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QImagennegocios(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QImagennegocios(PathMetadata<?> metadata, PathInits inits) {
        this(Imagennegocios.class, metadata, inits);
    }

    public QImagennegocios(Class<? extends Imagennegocios> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idNegocio = inits.isInitialized("idNegocio") ? new QNegocios(forProperty("idNegocio"), inits.get("idNegocio")) : null;
    }

}


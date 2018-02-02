package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QImagenmenurestaurante is a Querydsl query type for Imagenmenurestaurante
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QImagenmenurestaurante extends EntityPathBase<Imagenmenurestaurante> {

    private static final long serialVersionUID = -688283000L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QImagenmenurestaurante imagenmenurestaurante = new QImagenmenurestaurante("imagenmenurestaurante");

    public final NumberPath<Integer> idImagen = createNumber("idImagen", Integer.class);

    public final QMenurestaurante idItem;

    public final ArrayPath<byte[], Byte> imagen = createArray("imagen", byte[].class);

    public QImagenmenurestaurante(String variable) {
        this(Imagenmenurestaurante.class, forVariable(variable), INITS);
    }

    public QImagenmenurestaurante(Path<? extends Imagenmenurestaurante> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QImagenmenurestaurante(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QImagenmenurestaurante(PathMetadata<?> metadata, PathInits inits) {
        this(Imagenmenurestaurante.class, metadata, inits);
    }

    public QImagenmenurestaurante(Class<? extends Imagenmenurestaurante> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idItem = inits.isInitialized("idItem") ? new QMenurestaurante(forProperty("idItem"), inits.get("idItem")) : null;
    }

}


package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QReceta is a Querydsl query type for Receta
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QReceta extends EntityPathBase<Receta> {

    private static final long serialVersionUID = 1355012592L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReceta receta = new QReceta("receta");

    public final StringPath descripcionreceta = createString("descripcionreceta");

    public final QProducto idProducto;

    public final NumberPath<Integer> idReceta = createNumber("idReceta", Integer.class);

    public final QUser idUser;

    public final StringPath nombre = createString("nombre");

    public QReceta(String variable) {
        this(Receta.class, forVariable(variable), INITS);
    }

    public QReceta(Path<? extends Receta> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QReceta(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QReceta(PathMetadata<?> metadata, PathInits inits) {
        this(Receta.class, metadata, inits);
    }

    public QReceta(Class<? extends Receta> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idProducto = inits.isInitialized("idProducto") ? new QProducto(forProperty("idProducto"), inits.get("idProducto")) : null;
        this.idUser = inits.isInitialized("idUser") ? new QUser(forProperty("idUser"), inits.get("idUser")) : null;
    }

}


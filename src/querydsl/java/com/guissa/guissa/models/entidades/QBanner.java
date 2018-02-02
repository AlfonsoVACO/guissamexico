package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QBanner is a Querydsl query type for Banner
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QBanner extends EntityPathBase<Banner> {

    private static final long serialVersionUID = 893587994L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBanner banner = new QBanner("banner");

    public final NumberPath<Integer> idBanner = createNumber("idBanner", Integer.class);

    public final QUser idUser;

    public final ArrayPath<byte[], Byte> imagen = createArray("imagen", byte[].class);

    public final StringPath nombre = createString("nombre");

    public final StringPath subTitle = createString("subTitle");

    public QBanner(String variable) {
        this(Banner.class, forVariable(variable), INITS);
    }

    public QBanner(Path<? extends Banner> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QBanner(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QBanner(PathMetadata<?> metadata, PathInits inits) {
        this(Banner.class, metadata, inits);
    }

    public QBanner(Class<? extends Banner> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idUser = inits.isInitialized("idUser") ? new QUser(forProperty("idUser"), inits.get("idUser")) : null;
    }

}


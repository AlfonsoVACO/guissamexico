package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QHistorys is a Querydsl query type for Historys
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QHistorys extends EntityPathBase<Historys> {

    private static final long serialVersionUID = 270613965L;

    public static final QHistorys historys = new QHistorys("historys");

    public final StringPath descripcion = createString("descripcion");

    public final NumberPath<Integer> estado = createNumber("estado", Integer.class);

    public final NumberPath<Integer> idHistory = createNumber("idHistory", Integer.class);

    public final StringPath municipio = createString("municipio");

    public final StringPath nombre = createString("nombre");

    public final StringPath nombreH = createString("nombreH");

    public final StringPath temporada = createString("temporada");

    public final StringPath tipo = createString("tipo");

    public QHistorys(String variable) {
        super(Historys.class, forVariable(variable));
    }

    public QHistorys(Path<? extends Historys> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHistorys(PathMetadata<?> metadata) {
        super(Historys.class, metadata);
    }

}


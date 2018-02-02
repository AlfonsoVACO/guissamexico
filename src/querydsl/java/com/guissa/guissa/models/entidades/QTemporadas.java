package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QTemporadas is a Querydsl query type for Temporadas
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTemporadas extends EntityPathBase<Temporadas> {

    private static final long serialVersionUID = 1815969978L;

    public static final QTemporadas temporadas = new QTemporadas("temporadas");

    public final StringPath descripcionT = createString("descripcionT");

    public final NumberPath<Integer> idTemporada = createNumber("idTemporada", Integer.class);

    public final ListPath<Producto, QProducto> productoList = this.<Producto, QProducto>createList("productoList", Producto.class, QProducto.class, PathInits.DIRECT2);

    public QTemporadas(String variable) {
        super(Temporadas.class, forVariable(variable));
    }

    public QTemporadas(Path<? extends Temporadas> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTemporadas(PathMetadata<?> metadata) {
        super(Temporadas.class, metadata);
    }

}


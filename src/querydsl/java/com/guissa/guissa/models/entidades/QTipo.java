package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QTipo is a Querydsl query type for Tipo
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTipo extends EntityPathBase<Tipo> {

    private static final long serialVersionUID = 1127729570L;

    public static final QTipo tipo1 = new QTipo("tipo1");

    public final NumberPath<Integer> idTipo = createNumber("idTipo", Integer.class);

    public final ArrayPath<byte[], Byte> imagen = createArray("imagen", byte[].class);

    public final ListPath<Producto, QProducto> productoList = this.<Producto, QProducto>createList("productoList", Producto.class, QProducto.class, PathInits.DIRECT2);

    public final StringPath tipo = createString("tipo");

    public QTipo(String variable) {
        super(Tipo.class, forVariable(variable));
    }

    public QTipo(Path<? extends Tipo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTipo(PathMetadata<?> metadata) {
        super(Tipo.class, metadata);
    }

}


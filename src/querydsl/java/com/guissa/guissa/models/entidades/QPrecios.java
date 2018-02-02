package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QPrecios is a Querydsl query type for Precios
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPrecios extends EntityPathBase<Precios> {

    private static final long serialVersionUID = 1949633727L;

    public static final QPrecios precios = new QPrecios("precios");

    public final NumberPath<Integer> idPrecio = createNumber("idPrecio", Integer.class);

    public final ListPath<NegocioEs, QNegocioEs> negocioEsList = this.<NegocioEs, QNegocioEs>createList("negocioEsList", NegocioEs.class, QNegocioEs.class, PathInits.DIRECT2);

    public final NumberPath<Double> precio = createNumber("precio", Double.class);

    public final NumberPath<Integer> tipo = createNumber("tipo", Integer.class);

    public QPrecios(String variable) {
        super(Precios.class, forVariable(variable));
    }

    public QPrecios(Path<? extends Precios> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPrecios(PathMetadata<?> metadata) {
        super(Precios.class, metadata);
    }

}


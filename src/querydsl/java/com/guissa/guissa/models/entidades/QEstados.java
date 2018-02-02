package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QEstados is a Querydsl query type for Estados
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QEstados extends EntityPathBase<Estados> {

    private static final long serialVersionUID = 819445407L;

    public static final QEstados estados = new QEstados("estados");

    public final ListPath<Evento, QEvento> eventoList = this.<Evento, QEvento>createList("eventoList", Evento.class, QEvento.class, PathInits.DIRECT2);

    public final NumberPath<Integer> idEstado = createNumber("idEstado", Integer.class);

    public final ListPath<NegocioEs, QNegocioEs> negocioEsList = this.<NegocioEs, QNegocioEs>createList("negocioEsList", NegocioEs.class, QNegocioEs.class, PathInits.DIRECT2);

    public final ListPath<Negocios, QNegocios> negociosList = this.<Negocios, QNegocios>createList("negociosList", Negocios.class, QNegocios.class, PathInits.DIRECT2);

    public final StringPath nombre = createString("nombre");

    public final ListPath<Producto, QProducto> productoList = this.<Producto, QProducto>createList("productoList", Producto.class, QProducto.class, PathInits.DIRECT2);

    public QEstados(String variable) {
        super(Estados.class, forVariable(variable));
    }

    public QEstados(Path<? extends Estados> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEstados(PathMetadata<?> metadata) {
        super(Estados.class, metadata);
    }

}


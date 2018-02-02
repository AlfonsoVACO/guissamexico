package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QMenurestaurante is a Querydsl query type for Menurestaurante
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMenurestaurante extends EntityPathBase<Menurestaurante> {

    private static final long serialVersionUID = 1195843291L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMenurestaurante menurestaurante = new QMenurestaurante("menurestaurante");

    public final StringPath categoria = createString("categoria");

    public final NumberPath<Integer> idItem = createNumber("idItem", Integer.class);

    public final QNegocios idNegocio;

    public final ListPath<Imagenmenurestaurante, QImagenmenurestaurante> imagenmenurestauranteList = this.<Imagenmenurestaurante, QImagenmenurestaurante>createList("imagenmenurestauranteList", Imagenmenurestaurante.class, QImagenmenurestaurante.class, PathInits.DIRECT2);

    public final StringPath menu = createString("menu");

    public final StringPath nombre = createString("nombre");

    public final NumberPath<Double> precio = createNumber("precio", Double.class);

    public QMenurestaurante(String variable) {
        this(Menurestaurante.class, forVariable(variable), INITS);
    }

    public QMenurestaurante(Path<? extends Menurestaurante> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMenurestaurante(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMenurestaurante(PathMetadata<?> metadata, PathInits inits) {
        this(Menurestaurante.class, metadata, inits);
    }

    public QMenurestaurante(Class<? extends Menurestaurante> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idNegocio = inits.isInitialized("idNegocio") ? new QNegocios(forProperty("idNegocio"), inits.get("idNegocio")) : null;
    }

}


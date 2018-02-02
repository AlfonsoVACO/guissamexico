package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QMunicipios is a Querydsl query type for Municipios
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMunicipios extends EntityPathBase<Municipios> {

    private static final long serialVersionUID = -484060652L;

    public static final QMunicipios municipios = new QMunicipios("municipios");

    public final ListPath<Evento, QEvento> eventoList = this.<Evento, QEvento>createList("eventoList", Evento.class, QEvento.class, PathInits.DIRECT2);

    public final NumberPath<Integer> idMunicipio = createNumber("idMunicipio", Integer.class);

    public final ListPath<NegocioEs, QNegocioEs> negocioEsList = this.<NegocioEs, QNegocioEs>createList("negocioEsList", NegocioEs.class, QNegocioEs.class, PathInits.DIRECT2);

    public final ListPath<Negocios, QNegocios> negociosList = this.<Negocios, QNegocios>createList("negociosList", Negocios.class, QNegocios.class, PathInits.DIRECT2);

    public final StringPath nombreMun = createString("nombreMun");

    public final ListPath<Producto, QProducto> productoList = this.<Producto, QProducto>createList("productoList", Producto.class, QProducto.class, PathInits.DIRECT2);

    public QMunicipios(String variable) {
        super(Municipios.class, forVariable(variable));
    }

    public QMunicipios(Path<? extends Municipios> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMunicipios(PathMetadata<?> metadata) {
        super(Municipios.class, metadata);
    }

}


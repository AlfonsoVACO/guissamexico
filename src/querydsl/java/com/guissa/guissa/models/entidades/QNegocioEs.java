package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QNegocioEs is a Querydsl query type for NegocioEs
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QNegocioEs extends EntityPathBase<NegocioEs> {

    private static final long serialVersionUID = 1243350058L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNegocioEs negocioEs = new QNegocioEs("negocioEs");

    public final StringPath correo = createString("correo");

    public final StringPath descripcion = createString("descripcion");

    public final StringPath direccion = createString("direccion");

    public final QEstados idEstado;

    public final QMunicipios idMunicipio;

    public final NumberPath<Integer> idNegocio = createNumber("idNegocio", Integer.class);

    public final QPrecios idPrecio;

    public final StringPath nombre = createString("nombre");

    public final StringPath oTelefono = createString("oTelefono");

    public final StringPath telefono = createString("telefono");

    public final NumberPath<Integer> visualizacion = createNumber("visualizacion", Integer.class);

    public QNegocioEs(String variable) {
        this(NegocioEs.class, forVariable(variable), INITS);
    }

    public QNegocioEs(Path<? extends NegocioEs> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QNegocioEs(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QNegocioEs(PathMetadata<?> metadata, PathInits inits) {
        this(NegocioEs.class, metadata, inits);
    }

    public QNegocioEs(Class<? extends NegocioEs> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idEstado = inits.isInitialized("idEstado") ? new QEstados(forProperty("idEstado")) : null;
        this.idMunicipio = inits.isInitialized("idMunicipio") ? new QMunicipios(forProperty("idMunicipio")) : null;
        this.idPrecio = inits.isInitialized("idPrecio") ? new QPrecios(forProperty("idPrecio")) : null;
    }

}


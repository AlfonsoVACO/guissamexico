package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QProducto is a Querydsl query type for Producto
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QProducto extends EntityPathBase<Producto> {

    private static final long serialVersionUID = 596664526L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProducto producto = new QProducto("producto");

    public final ListPath<Comentariosp, QComentariosp> comentariospList = this.<Comentariosp, QComentariosp>createList("comentariospList", Comentariosp.class, QComentariosp.class, PathInits.DIRECT2);

    public final StringPath descripcion = createString("descripcion");

    public final DateTimePath<java.util.Date> fechaH = createDateTime("fechaH", java.util.Date.class);

    public final ListPath<Galeria, QGaleria> galeriaList = this.<Galeria, QGaleria>createList("galeriaList", Galeria.class, QGaleria.class, PathInits.DIRECT2);

    public final QEstados idEstado;

    public final QMunicipios idMunicipio;

    public final NumberPath<Integer> idProducto = createNumber("idProducto", Integer.class);

    public final QTemporadas idTemporada;

    public final QTipo idTipo;

    public final QUser idUser;

    public final StringPath nombre = createString("nombre");

    public final ListPath<Receta, QReceta> recetaList = this.<Receta, QReceta>createList("recetaList", Receta.class, QReceta.class, PathInits.DIRECT2);

    public QProducto(String variable) {
        this(Producto.class, forVariable(variable), INITS);
    }

    public QProducto(Path<? extends Producto> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProducto(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProducto(PathMetadata<?> metadata, PathInits inits) {
        this(Producto.class, metadata, inits);
    }

    public QProducto(Class<? extends Producto> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idEstado = inits.isInitialized("idEstado") ? new QEstados(forProperty("idEstado")) : null;
        this.idMunicipio = inits.isInitialized("idMunicipio") ? new QMunicipios(forProperty("idMunicipio")) : null;
        this.idTemporada = inits.isInitialized("idTemporada") ? new QTemporadas(forProperty("idTemporada")) : null;
        this.idTipo = inits.isInitialized("idTipo") ? new QTipo(forProperty("idTipo")) : null;
        this.idUser = inits.isInitialized("idUser") ? new QUser(forProperty("idUser"), inits.get("idUser")) : null;
    }

}


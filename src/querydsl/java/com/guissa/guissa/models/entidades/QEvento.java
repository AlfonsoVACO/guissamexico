package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QEvento is a Querydsl query type for Evento
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QEvento extends EntityPathBase<Evento> {

    private static final long serialVersionUID = 998601731L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEvento evento = new QEvento("evento");

    public final ListPath<Comentariose, QComentariose> comentarioseList = this.<Comentariose, QComentariose>createList("comentarioseList", Comentariose.class, QComentariose.class, PathInits.DIRECT2);

    public final StringPath descripcion = createString("descripcion");

    public final DatePath<java.util.Date> fechaF = createDate("fechaF", java.util.Date.class);

    public final DatePath<java.util.Date> fechaI = createDate("fechaI", java.util.Date.class);

    public final QEstados idEstado;

    public final NumberPath<Integer> idEvento = createNumber("idEvento", Integer.class);

    public final QImagenev idImagen;

    public final QMunicipios idMunicipio;

    public final QUser idUser;

    public final StringPath nombre = createString("nombre");

    public QEvento(String variable) {
        this(Evento.class, forVariable(variable), INITS);
    }

    public QEvento(Path<? extends Evento> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QEvento(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QEvento(PathMetadata<?> metadata, PathInits inits) {
        this(Evento.class, metadata, inits);
    }

    public QEvento(Class<? extends Evento> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idEstado = inits.isInitialized("idEstado") ? new QEstados(forProperty("idEstado")) : null;
        this.idImagen = inits.isInitialized("idImagen") ? new QImagenev(forProperty("idImagen")) : null;
        this.idMunicipio = inits.isInitialized("idMunicipio") ? new QMunicipios(forProperty("idMunicipio")) : null;
        this.idUser = inits.isInitialized("idUser") ? new QUser(forProperty("idUser"), inits.get("idUser")) : null;
    }

}


package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QImagenev is a Querydsl query type for Imagenev
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QImagenev extends EntityPathBase<Imagenev> {

    private static final long serialVersionUID = 740838866L;

    public static final QImagenev imagenev = new QImagenev("imagenev");

    public final ListPath<Evento, QEvento> eventoList = this.<Evento, QEvento>createList("eventoList", Evento.class, QEvento.class, PathInits.DIRECT2);

    public final NumberPath<Integer> idImagen = createNumber("idImagen", Integer.class);

    public final ArrayPath<byte[], Byte> imagen = createArray("imagen", byte[].class);

    public final StringPath nombre = createString("nombre");

    public QImagenev(String variable) {
        super(Imagenev.class, forVariable(variable));
    }

    public QImagenev(Path<? extends Imagenev> path) {
        super(path.getType(), path.getMetadata());
    }

    public QImagenev(PathMetadata<?> metadata) {
        super(Imagenev.class, metadata);
    }

}


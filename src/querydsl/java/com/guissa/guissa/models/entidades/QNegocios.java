package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QNegocios is a Querydsl query type for Negocios
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QNegocios extends EntityPathBase<Negocios> {

    private static final long serialVersionUID = -1761007209L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNegocios negocios = new QNegocios("negocios");

    public final ListPath<Comentariosn, QComentariosn> comentariosnList = this.<Comentariosn, QComentariosn>createList("comentariosnList", Comentariosn.class, QComentariosn.class, PathInits.DIRECT2);

    public final ListPath<Comun, QComun> comunList = this.<Comun, QComun>createList("comunList", Comun.class, QComun.class, PathInits.DIRECT2);

    public final ListPath<ContactNegocios, QContactNegocios> contactNegociosList = this.<ContactNegocios, QContactNegocios>createList("contactNegociosList", ContactNegocios.class, QContactNegocios.class, PathInits.DIRECT2);

    public final StringPath descripcion = createString("descripcion");

    public final StringPath direccion = createString("direccion");

    public final NumberPath<Integer> estado = createNumber("estado", Integer.class);

    public final DateTimePath<java.util.Date> fecha = createDateTime("fecha", java.util.Date.class);

    public final ListPath<GaleriaNs, QGaleriaNs> galeriaNsList = this.<GaleriaNs, QGaleriaNs>createList("galeriaNsList", GaleriaNs.class, QGaleriaNs.class, PathInits.DIRECT2);

    public final QEstados idEstado;

    public final QMunicipios idMunicipio;

    public final NumberPath<Integer> idNegocio = createNumber("idNegocio", Integer.class);

    public final QUser idUser;

    public final ListPath<Imagennegocios, QImagennegocios> imagennegociosList = this.<Imagennegocios, QImagennegocios>createList("imagennegociosList", Imagennegocios.class, QImagennegocios.class, PathInits.DIRECT2);

    public final ListPath<Menurestaurante, QMenurestaurante> menurestauranteList = this.<Menurestaurante, QMenurestaurante>createList("menurestauranteList", Menurestaurante.class, QMenurestaurante.class, PathInits.DIRECT2);

    public final StringPath nombre = createString("nombre");

    public final ListPath<Reservacion, QReservacion> reservacionList = this.<Reservacion, QReservacion>createList("reservacionList", Reservacion.class, QReservacion.class, PathInits.DIRECT2);

    public final ListPath<Reservags, QReservags> reservagsList = this.<Reservags, QReservags>createList("reservagsList", Reservags.class, QReservags.class, PathInits.DIRECT2);

    public final StringPath telefono = createString("telefono");

    public final StringPath telefono2 = createString("telefono2");

    public final ListPath<Userc, QUserc> usercList = this.<Userc, QUserc>createList("usercList", Userc.class, QUserc.class, PathInits.DIRECT2);

    public final NumberPath<Integer> visualizacion = createNumber("visualizacion", Integer.class);

    public QNegocios(String variable) {
        this(Negocios.class, forVariable(variable), INITS);
    }

    public QNegocios(Path<? extends Negocios> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QNegocios(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QNegocios(PathMetadata<?> metadata, PathInits inits) {
        this(Negocios.class, metadata, inits);
    }

    public QNegocios(Class<? extends Negocios> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idEstado = inits.isInitialized("idEstado") ? new QEstados(forProperty("idEstado")) : null;
        this.idMunicipio = inits.isInitialized("idMunicipio") ? new QMunicipios(forProperty("idMunicipio")) : null;
        this.idUser = inits.isInitialized("idUser") ? new QUser(forProperty("idUser"), inits.get("idUser")) : null;
    }

}


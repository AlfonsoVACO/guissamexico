package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 1127768633L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUser user = new QUser("user");

    public final StringPath apellidos = createString("apellidos");

    public final ArrayPath<byte[], Byte> avatar = createArray("avatar", byte[].class);

    public final ListPath<Banner, QBanner> bannerList = this.<Banner, QBanner>createList("bannerList", Banner.class, QBanner.class, PathInits.DIRECT2);

    public final StringPath correo = createString("correo");

    public final ListPath<Evento, QEvento> eventoList = this.<Evento, QEvento>createList("eventoList", Evento.class, QEvento.class, PathInits.DIRECT2);

    public final QTipoUsuario idTipousuario;

    public final NumberPath<Integer> idUser = createNumber("idUser", Integer.class);

    public final ListPath<Negocios, QNegocios> negociosList = this.<Negocios, QNegocios>createList("negociosList", Negocios.class, QNegocios.class, PathInits.DIRECT2);

    public final StringPath nic = createString("nic");

    public final StringPath nombre = createString("nombre");

    public final ListPath<Notas, QNotas> notasList = this.<Notas, QNotas>createList("notasList", Notas.class, QNotas.class, PathInits.DIRECT2);

    public final StringPath pass = createString("pass");

    public final ListPath<Patrocinador, QPatrocinador> patrocinadorList = this.<Patrocinador, QPatrocinador>createList("patrocinadorList", Patrocinador.class, QPatrocinador.class, PathInits.DIRECT2);

    public final ListPath<Producto, QProducto> productoList = this.<Producto, QProducto>createList("productoList", Producto.class, QProducto.class, PathInits.DIRECT2);

    public final ListPath<Receta, QReceta> recetaList = this.<Receta, QReceta>createList("recetaList", Receta.class, QReceta.class, PathInits.DIRECT2);

    public final ListPath<Resetopass, QResetopass> resetopassList = this.<Resetopass, QResetopass>createList("resetopassList", Resetopass.class, QResetopass.class, PathInits.DIRECT2);

    public QUser(String variable) {
        this(User.class, forVariable(variable), INITS);
    }

    public QUser(Path<? extends User> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUser(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUser(PathMetadata<?> metadata, PathInits inits) {
        this(User.class, metadata, inits);
    }

    public QUser(Class<? extends User> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idTipousuario = inits.isInitialized("idTipousuario") ? new QTipoUsuario(forProperty("idTipousuario")) : null;
    }

}


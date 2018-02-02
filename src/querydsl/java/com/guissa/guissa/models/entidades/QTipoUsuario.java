package com.guissa.guissa.models.entidades;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QTipoUsuario is a Querydsl query type for TipoUsuario
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTipoUsuario extends EntityPathBase<TipoUsuario> {

    private static final long serialVersionUID = -454031572L;

    public static final QTipoUsuario tipoUsuario = new QTipoUsuario("tipoUsuario");

    public final StringPath descripcion = createString("descripcion");

    public final NumberPath<Integer> idTipoUsuario = createNumber("idTipoUsuario", Integer.class);

    public final ListPath<User, QUser> userList = this.<User, QUser>createList("userList", User.class, QUser.class, PathInits.DIRECT2);

    public QTipoUsuario(String variable) {
        super(TipoUsuario.class, forVariable(variable));
    }

    public QTipoUsuario(Path<? extends TipoUsuario> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTipoUsuario(PathMetadata<?> metadata) {
        super(TipoUsuario.class, metadata);
    }

}


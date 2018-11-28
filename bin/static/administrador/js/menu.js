function getItem(item) {
    var tipomenu = "/admins/" + item+"/";
    $.ajax({
        type: "get",
        url: tipomenu,
        cache: false,
        beforeSend: function () {
            $("#menuResult").html("<img src='/administrador/img/lorde.gif'>");
        },
        success: function (dato) {
            $("#menuResult").fadeOut("fast", function () {
                $(this).html(dato).slideDown(10);
            });
        },
        error: function (XMLHttpRequest, textStatus, errorthrows) {
            alert("Ocurrió un error: " + errorthrows);
        }
    });
}

$("input[data-search]").on("keypress",function( e ){
	if(e.which === 13){
	var url = $(this).attr("data-search");
		$.ajax({
	        type: "get",
	        url: "/admins/" + url +"/search",
	        data: $(this).val(),
	        cache: false,
	        beforeSend: function () {
	            $("#lstMuestra").html("<img src='/administrador/img/lorde.gif'>");
	        },
	        success: function (dato) {
	            $("#lstMuestra").fadeOut("fast", function () {
	                $(this).html(dato).slideDown(10);
	            });
	        },
	        error: function (XMLHttpRequest, textStatus, errorthrows) {
	            alert("Ocurrió un error: " + errorthrows);
	        }
	    });
	}
});

function crudHistorys(crud, id) {
    if ($.trim(crud) === "mar") {
        ajaxHistorys("cnadminhistorias?enter=marcaHistory&id=" + id, "marcada");
    } else if ($.trim(crud) === "del") {
        ajaxHistorys("cnadminhistorias?enter=deleteHistory&id=" + id, "eliminada");
    }
}

function ajaxHistorys(ruta, caden) {
    $.ajax({
        type: "post",
        url: ruta,
        cache: false,
        success: function (dato) {
            if ($.trim(dato) === "1") {
                alertify.alert('Guissa', 'Historia ' + caden + ' correctamente');
            } else if ($.trim(dato) === "0") {
                alertify.alert('Guissa', 'Error al eliminar');
            }
        },
        error: function (XMLHttpRequest, textStatus, errorthrows) {
            alertify.alert('Guissa', 'error' + errorthrows);
        }
    });
}


function eliminaContact(id) {
    ajaxMensajes("bandeja?accion=4&id=" + id, "cargaProcesoMens");
}

function marcaContact(id) {
    ajaxMensajes("bandeja?accion=3&id=" + id, "cargaProcesoMens");
}


function ajaxMensajes(ruta, carga) {
    $.ajax({
        type: "post",
        url: ruta,
        cache: false,
        beforeSend: function () {
            $("#" + carga).html("<img src='/administrador/img/lorde.gif'>");
        },
        success: function (dato) {
            reacarga();
            $("#" + carga).html("");
            if (dato === "1") {
                alertify.alert('Guissa', 'Mensaje eliminado correctamente');
            } else if (dato === "0") {
                alertify.alert('Guissa', 'Error al eliminar');
            }

        },
        error: function (XMLHttpRequest, textStatus, errorthrows) {
            alertify.alert('Guissa', 'error' + errorthrows);
        }
    });
}

function reacarga() {
    $.ajax({
        type: "post",
        url: "bandeja?accion=1",
        cache: false,
        beforeSend: function () {
            $("#lstMuestra").html("<img src='/administrador/img/lorde.gif'>");
        },
        success: function (dato) {
            $("#lstMuestra").fadeOut("fast", function () {
                $(this).html(dato).slideDown(10);
            });
        },
        error: function (XMLHttpRequest, textStatus, errorthrows) {
            alert("Ocurrió un error: " + errorthrows);
        }
    });
}

function getModal(clave) {
    $(".gettamodal").each(function () {
        if ($(this).attr("id") === clave) {
            var toto = $("#" + clave).html();
            $("#datosmuestraM").html(toto);
        }
    });
}

function setDelibery(id) {
    var datos = {
        accion:"delibery",
        idnegocio: id
    };
    $.ajax({
        type: "post",
        url: "cnadminnegocios",
        data: datos,
        cache: false,
        success: function(dato){
            if($.trim(dato) === "1"){
                alertify.alert("Guissa","Negocio agregado correctamente");
            }else if($.trim(dato) === "2"){
                alertify.alert("Guissa","Ese correo ya se encuentra registrado");
            }else if($.trim(dato) === "3"){
                alertify.alert("Guissa","Hubo un error con el negocio, no se encontró registro");
            }else{
                alertify.alert("Guissa","Se agregó correctamente pero no se envió un correo");
            }
        },
        error: function(XMLHttpRequest,textStatus,errorthrows){
            alert("Ocurrió un error: "+ errorthrows);
        }
    });
}

function ajaxCeroUno(ruta, carga, datos) {
    $.ajax({
        type: "post",
        url: ruta,
        data: datos,
        cache: false,
        beforeSend: function () {
            $("#" + carga).html("<img src='/administrador/img/lorde.gif'>");
        },
        success: function (dato) {
            $("#" + carga).fadeOut("fast", function () {
                $(this).html(dato).slideDown(10);
            });
        },
        error: function (XMLHttpRequest, textStatus, errorthrows) {
            alertify.alert('Guissa', 'Error: ' + errorthrows + " Tipo err: " + textStatus.toString());
        }
    });
}

function cambiaventanaacciones(tipo, accion, vista, servlet, id, idcrud) {
    var tipomenu = servlet + "/" + accion + "?idaccion=" + id + "&idcrud=" + idcrud;
    $.ajax({
        type: tipo,
        url: tipomenu,
        cache: false,
        beforeSend: function () {
            $("#" + vista).html("<img src='/administrador/img/lorde.gif'>");
        },
        success: function (dato) {

            $("#" + vista).fadeOut("fast", function () {
                $(this).html(dato).slideDown(10);
            });
        },
        error: function (XMLHttpRequest, textStatus, errorthrows) {
            alert("Ocurrió un error: " + errorthrows);
        }
    });
}
function eliminaacciones(tipo, accion, vista, servlet, id, idcrud) {
    var tipomenu = servlet + "?accion=" + accion + "&catalogaccion=" + tipo + "&idaccion=" + id + "&idcrud=" + idcrud;
    $.ajax({
        type: "post",
        url: tipomenu,
        cache: false,
        beforeSend: function () {
            $("#" + vista).html("<img src='/administrador/img/lorde.gif'>");
        },
        success: function (dato) {
            $("#" + vista).fadeOut("fast", function () {
                $(this).html(dato).slideDown(10);
            });
        },
        error: function (XMLHttpRequest, textStatus, errorthrows) {
            alert("Ocurrió un error: " + errorthrows);
        }
    });
}

function controlcomentp(accion, idDOM, id) {
    var url = "accion=comp" + accion + "&idcrud_com=" + id;
    getAjaxComentp(url, idDOM, accion);
}

function getAjaxComentp(url, idDOM, accion) {
    $.ajax({
        type: "POST",
        url: "cnadmincomentariosp?" + url,
        cache: false,
        success: function (dato) {
            if ($.trim(accion) === "eliminarR") {
                if ($.trim(dato) === "1") {
                    $("#" + idDOM).hide("slow");
                    alertify.alert("Guissa", "Eliminación completa");
                } else {
                    alertify.alert("Guissa", "Error al eliminar");
                }
            }
            if ($.trim(accion) === "eliminarO") {
                if ($.trim(dato) === "1") {
                    $("#" + idDOM).hide("slow");
                    alertify.alert("Guissa", "Eliminación completa");
                } else {
                    alertify.alert("Guissa", "Error al eliminar");
                }
            }
        },
        error: function (XMLHttpRequest, textStatus, errorthrows) {
            alert("Ocurrió un error: " + errorthrows);
        }
    });
}

function controlcomente(accion, idDOM, id) {
    var url = "accion=come" + accion + "&idcrud_com=" + id;
    getAjaxComente(url, idDOM, accion);
}

function getAjaxComente(url, idDOM, accion) {
    $.ajax({
        type: "POST",
        url: "cnadmincomentariose?" + url,
        cache: false,
        success: function (dato) {
            if ($.trim(accion) === "eliminarR") {
                if ($.trim(dato) === "1") {
                    $("#" + idDOM).hide("slow");
                    alertify.alert("Guissa", "Eliminación completa");
                } else {
                    alertify.alert("Guissa", "Error al eliminar");
                }
            }
            if ($.trim(accion) === "eliminarO") {
                if ($.trim(dato) === "1") {
                    $("#" + idDOM).hide("slow");
                    alertify.alert("Guissa", "Eliminación completa");
                } else {
                    alertify.alert("Guissa", "Error al eliminar");
                }
            }
        },
        error: function (XMLHttpRequest, textStatus, errorthrows) {
            alert("Ocurrió un error: " + errorthrows);
        }
    });
}

function controlresopi(accion, idDOM, id) {
    var url = "enter=imgEven" + accion + "&idcrud_com=" + id;
    getAjaxRecursos(url, idDOM, accion);
}

function getAjaxRecursos(url, idDOM, accion) {
    $.ajax({
        type: "POST",
        url: "cnadminrecursos?" + url,
        cache: false,
        success: function (dato) {
            if ($.trim(accion) === "eliminar") {
                if ($.trim(dato) === "1") {
                    $("#" + idDOM).hide("slow");
                    alertify.alert("Guissa", "Eliminación completa");
                } else {
                    alertify.alert("Guissa", "Error al eliminar");
                }
            }
        },
        error: function (XMLHttpRequest, textStatus, errorthrows) {
            alert("Ocurrió un error: " + errorthrows);
        }
    });
}

function controlpatrocina(accion, idDOM, id) {
    var url = "accion=imgPatro" + accion + "&idcrud_com=" + id;
    getAjaxPatrocinadores(url, idDOM, accion);
}

function getAjaxPatrocinadores(url, idDOM, accion) {
    $.ajax({
        type: "POST",
        url: "cnadminpatrocinadores?" + url,
        cache: false,
        success: function (dato) {
            if ($.trim(accion) === "eliminar") {
                if ($.trim(dato) === "1") {
                    $("#" + idDOM).hide("slow");
                    alertify.alert("Guissa", "Eliminación completa");
                } else {
                    alertify.alert("Guissa", "Error al eliminar");
                }
            }
        },
        error: function (XMLHttpRequest, textStatus, errorthrows) {
            alert("Ocurrió un error: " + errorthrows);
        }
    });
}

function eliminaUser(accion, idDOM, id) {
    var url = "enter=users" + accion + "&idcrud_com=" + id;
    getAjaxUsuarios(url, idDOM, accion);
}

function getAjaxUsuarios(url, idDOM, accion) {
    $.ajax({
        type: "POST",
        url: "cnadminusuarios?" + url,
        cache: false,
        success: function (dato) {
            if ($.trim(accion) === "eliminar") {
                if ($.trim(dato) === "1") {
                    $("#" + idDOM).hide("slow");
                    alertify.alert("Guissa", "Eliminación completa");
                } else {
                    alertify.alert("Guissa", "Error al eliminar");
                }
            }
        },
        error: function (XMLHttpRequest, textStatus, errorthrows) {
            alert("Ocurrió un error: " + errorthrows);
        }
    });
}

function eliminaPedido(accion, idDOM, id) {
    var url = "accion=" + accion + "&idcrud_com=" + id;
    getAjaxPedido(url, idDOM, accion);
}

function getAjaxPedido(url, idDOM, accion) {
    $.ajax({
        type: "POST",
        url: "cnadminpedidos?" + url,
        cache: false,
        success: function (dato) {
            if ($.trim(accion) === "eliminar") {
                if ($.trim(dato) === "1") {
                    $("#" + idDOM).hide("slow");
                    alertify.alert("Guissa", "Eliminación completa");
                } else {
                    alertify.alert("Guissa", "Error al eliminar");
                }
            }
        },
        error: function (XMLHttpRequest, textStatus, errorthrows) {
            alert("Ocurrió un error: " + errorthrows);
        }
    });
}
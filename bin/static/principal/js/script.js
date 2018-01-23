$(document).ready(function(){
    $('#boxBuscarNegocio').keypress(function(e) {
        if (window.event){        
            if (window.event.keyCode === 13) {
                var datos = new Array();
                datos[0] = "boxBuscarNegocio";
                if(validardatos(datos,"",false)){
                    var abuscar = "negocios?accion=buscar&datos=" + $('#boxBuscarNegocio').val();
                    getDatosResult(abuscar,"resultanego");
                }
            }
        }else{
            if (e){
                if(e.which===13){
                    var datos = new Array();
                    datos[0] = "boxBuscarNegocio";
                    if(validardatos(datos,"",false)){
                        var abuscar = "negocios?accion=buscar&datos=" + $('#boxBuscarNegocio').val();
                        getDatosResult(abuscar,"resultanego");
                    }
                }
            }
        }
    });
    
    function getDatosResult(url,lugar){
        $.ajax({
            type: "post" ,
            url: url,
            cache:false,
            success: function(dato){
                //alert(dato);
                //$("#"+lugar).html("").slideDown(10);
                $("#"+lugar).fadeOut("fast",function(){
                    $(this).html(dato).slideDown(10);
                });
            },
            error: function(XMLHttpRequest,textStatus,errorthrows){
                alertify.alert('Guissa','error' + errorthrows);
            }
        });
    }
        
    function validardatos(datostext,avisoserr,mensajes){
        var valid = true;
        if(mensajes)
            for(var i = 0; i<avisoserr.length; i++) // esconder todos los avisos de error
                $("#"+avisoserr[i]).hide("slow");
        
        for(var i = 0; i<datostext.length; i++){ // esconder todos los avisos de error
            document.getElementById(datostext[i]).style.border='1px solid #EEEEEE';
        }
        //alert(datostext[1]);
        for(var i = 0; i<datostext.length; i++){
            if (document.getElementById(datostext[i]).value === ""){
                if(mensajes)
                    $("#"+avisoserr[i]).show("slow");
                
                document.getElementById(datostext[i]).style.border='1px solid red';
                valid = false;
            }
        }
        return valid;
    }
    
    
    $('#boxBuscarNoticProd').keypress(function(e) {
        if (window.event){        
            if (window.event.keyCode === 13) {
                var datos = new Array();
                datos[0] = "boxBuscarNoticProd";
                if(validardatos(datos,"",false)){
                    var abuscar = "noticias?accion=buscar&datos=" + $('#boxBuscarNoticProd').val();
                    getDatosResult(abuscar,"busquedamuestraprod");
                }
            }
        }else{
            if (e){
                if(e.which===13){
                    var datos = new Array();
                    datos[0] = "boxBuscarNoticProd";
                    if(validardatos(datos,"",false)){
                        var abuscar = "noticias?accion=buscar&datos=" + $('#boxBuscarNoticProd').val();
                        getDatosResult(abuscar,"busquedamuestraprod");
                    }
                }
            }
        }
    });
    
    
    
});
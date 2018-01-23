function replica(errornom,error,exito,noenv,nombre,respuesta,idcom) {
    var contenido = document.getElementById(respuesta).value;
    var nombre = document.getElementById(nombre).value;
    $("#"+errornom).hide("slow");
    $("#"+error).hide("slow");
    $("#"+noenv).hide("slow");
    $("#"+exito).hide("slow");
    if(nombre===""){
        $("#"+errornom).show("slow");
    }else{
        if(contenido===""){
            $("#"+error).show("slow");
        }else{
            var verificador=false;
            var gross2 = ['Pendejo','pendejo','Idiota','idiota','puto','puta','Puto','Puta','imbecil','Imbecil','imbécil','Imbécil','Tonto','Tonta','tonto','tonta','hijo de puta','Hijo de puta','hijo de perra','Hijo de perra','Pito','pito','Culo','culo','Desgraciado','desgraciado'];
            for (var i = gross2.length - 1; i >= 0; i--) {
                if(contenido.search(gross2[i])>1){
                    verificador=true;
                }
            }
            if(verificador){
                alertify.alert('Guissa','Tu comentario contiene palabras antisonantes, por favor reemplazalas');
            }else{
                $.ajax({
                    type: "POST",
                    url: "cnadmincomentariosp?accion=setReplica",
                    data: "usuario="+nombre+"&comentp="+idcom+"&replica="+contenido,
                    success: function(resp){  
                        if($.trim(resp) === "1"){
                            $("#"+exito).show("slow");
                            document.getElementById(respuesta).value="";
                            document.getElementById(nombre).value="";
                            location.reload(true);
                        }else{
                            alertify.alert('Guissa','No se pudo comentar');
                        }
                    }
                });
            }
        }
    }
}
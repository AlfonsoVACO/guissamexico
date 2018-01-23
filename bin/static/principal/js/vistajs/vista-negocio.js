$(window).load(function(){
    function valuacomentP() {
        valid = true;
        $("#avisocp").hide("slow");
        $("#avisono").hide("slow");
        document.formcomentp.strComentp.style.border='1px solid #EEEEEE';
        document.formcomentp.strNombre.style.border='1px solid #EEEEEE';
        if (document.formcomentp.strComentp.value === ""){
            $("#avisocp").show("slow");
            document.formcomentp.strComentp.style.border='1px solid red';
            valid = false;
        }
        if (document.formcomentp.strNombre.value === ""){
            $("#avisono").show("slow");
            document.formcomentp.strNombre.style.border='1px solid red';
            valid = false;
        }
        return valid;
    }
    function valCaracterE(argument) {
        if( (/^\d{3}-\d{3}-\d{4}$/.test(argument)) ) {
            return false;
        }else{
            return true;
        }
    }
    function validaFormReserva() 
    {
        var value= true;

        $("#errorNR").hide("slow");
        $("#errorAR").hide("slow");
        $("#errorTR").hide("slow");
        $("#errorTVR").hide("slow");
        $("#errorPR").hide("slow");
        $("#errorFR").hide("slow");

        document.fromReserva.txtCorreo.style.border = '1px solid #EEEEEE';
        document.fromReserva.txtPeidido.style.border = '1px solid #EEEEEE';
        document.fromReserva.txtFecha.style.border = '1px solid #EEEEEE';

        if(document.fromReserva.txtCorreo.value === ""){
            $("#errorNR").show("slow");
            document.fromReserva.txtCorreo.style.border = '1px solid red';
            value=false;
        }
        if(document.fromReserva.txtPeidido.value===""){
            $("#errorPR").show("slow");
            document.fromReserva.txtPeidido.style.border = '1px solid red';
            value=false;
        }
        if(document.fromReserva.txtFecha.value===""){
            $("#errorPR").show("slow");
            document.fromReserva.txtFecha.style.border = '1px solid red';
            value=false;
        }
        return value;
    }

    $("#AgregaPedido").click(function (){
        $("#exitoENN").hide("slow");
        $("#errorNE").hide("slow");
        if(validaFormReserva()){
            $("#exitoENN").show("slow");
            $("#errorNE").show("slow");
            var cor = document.fromReserva.txtCorreo.value;
            var ped = document.fromReserva.txtPeidido.value;
            var fec = document.fromReserva.txtFecha.value;
            var neg = document.fromReserva.txtid_neg.value;
            $.ajax({
                type: "POST",
                url:"cnClientesReservaciones?accion=setReservacion",
                data: 'cor='+cor+'&pedido='+ped+'&fech='+fec+'&neg='+neg,
                success: function(resp){  
                    if($.trim(resp) === "1"){
                        $("#exitoENN").show("slow");
                        document.fromReserva.txtCorreo.value="";
                        document.fromReserva.txtPeidido.value="";
                        document.fromReserva.txtFecha.value="";
                        alertify.alert('Guissa','¡Muchas gracias!, la reservación está hecha, para cancelar, favor de llamar a las instalaciones de la reservación.');
                    }else if($.trim(resp) === "2"){
                        alertify.alert('Guissa','El correo no existe<br /><p>Para hacer una reservación, tienes que estar registrado en éste negocio, de no ser así, contactar al negocio.</p>');
                    }else{
                        $("#errorNE").show("slow");
                        alertify.alert('Guissa','Revisa tu conexión a internet');
                    }
                }
            });
        }
    });
    
    $("#comentp").click(function (){            
        $("#comentP").hide("slow");
        if(valuacomentP()){
            var idprod= document.formcomentp.idprcoment.value;
            var nombre= document.formcomentp.strNombre.value;
            var comente = document.formcomentp.strComentp.value;
            var verificadorc = false;
            var gross = ['Pendejo','pendejo','Idiota','idiota','puto','puta','Puto','Puta','imbecil','Imbecil','imbécil','Imbécil','Tonto','Tonta','tonto','tonta','hijo de puta','Hijo de puta','hijo de perra','Hijo de perra','Pito','pito','Culo','culo','Desgraciado','desgraciado'];
            for (var i = gross.length - 1; i >= 0; i--) {
                if(comente.search(gross[i])>1){
                    verificadorc = true;
                }
            }
            if(verificadorc){
                alertify.alert('Guissa','Tu comentario contiene palabras antisonantes, por favor reemplazalas');
            }else{
                $.ajax({
                    type: "POST",
                    url:"cnClientesComentarios?accion=setComantario",
                    data: 'coment='+comente+'&nombre='+nombre+'&ide='+idprod,
                    success: function(resp){  
                        if($.trim(resp) === "1"){
                            $("#comentP").show("slow");
                            document.formcomentp.strComentp.value="";
                            document.formcomentp.strNombre.value="";
                            //location.reload(true);
                        }else{
                            alertify.alert('Guissa','No se pudo comentar');
                        }
                    }
                });
            }
        }
    });
});
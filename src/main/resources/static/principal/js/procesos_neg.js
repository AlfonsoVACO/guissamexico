$(window).load(function () {

    function valEmail(valor){ 
        re=/^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,3})$/
        if(!re.exec(valor))    {
            return false;
        }else{
            return true;
        }
    }

    function valCaracter(argument) {
        car=/^[a-zA-Z0-9-]+(.[_!@#$%/()=?¡¿+,.-;:]+)$/
        if(!car.exec(argument)){
            return false;
        }else{
            return true;
        }

    }

    function validateformNUP(){
        valid = true;
        $("#avisoOlNo").hide("slow");
        $("#avisoOlAp").hide("slow");
        $("#avisoOlAo").hide("slow");
        $("#avisoOlCI").hide("slow");
        $("#avisoOlNIC").hide("slow");
        $("#avisoOlCon").hide("slow");
        $("#avisoOlRCon").hide("slow");
        $("#avisoOlConNC").hide("slow");
        $("#avisoCaracter").hide("slow");

        document.formNUP.txtNombreUP.style.border='1px solid #EEEEEE';
        document.formNUP.txtApellidosUP.style.border='1px solid #EEEEEE';
        document.formNUP.txtCorreoUP.style.border='1px solid #EEEEEE';
        document.formNUP.txtUsuarioUP.style.border='1px solid #EEEEEE';
        document.formNUP.txtContraUP.style.border='1px solid #EEEEEE';
        document.formNUP.txtRContraUP.style.border='1px solid #EEEEEE';
                                                        
        if (document.formNUP.txtNombreUP.value == ""){
            $("#avisoOlNo").show("slow");
            document.formNUP.txtNombreUP.style.border='1px solid red';
            valid = false;
        }
        if (document.formNUP.txtApellidosUP.value == ""){
            $("#avisoOlAp").show("slow");
            document.formNUP.txtApellidosUP.style.border='1px solid red';
            valid = false;
        }
        if (document.formNUP.txtCorreoUP.value == ""){
            $("#avisoOlAo").show("slow");
            document.formNUP.txtCorreoUP.style.border='1px solid red';
            valid = false;
        }
        if (!valEmail(document.formNUP.txtCorreoUP.value)){
            $("#avisoOlCI").show("slow");
            document.formNUP.txtCorreoUP.style.border='1px solid red';
            valid = false;
        }

        if (valCaracter(document.formNUP.txtContraUP.value)){
            $("#avisoCaracter").show("slow");
            document.formNUP.txtContraUP.style.border='1px solid red';
            valid = false;
        }

        if (document.formNUP.txtUsuarioUP.value == ""){
            $("#avisoOlNIC").show("slow");
            document.formNUP.txtUsuarioUP.style.border='1px solid red';
            valid = false;
        }
        if (document.formNUP.txtContraUP.value == ""){
            $("#avisoOlCon").show("slow");
            document.formNUP.txtContraUP.style.border='1px solid red';
            valid = false;
        }
        if (document.formNUP.txtRContraUP.value == ""){
            $("#avisoOlRCon").show("slow");
            document.formNUP.txtRContraUP.style.border='1px solid red';
            valid = false;
        }
        if (document.formNUP.txtRContraUP.value != document.formNUP.txtContraUP.value){
            $("#avisoOlConNC").show("slow");
            document.formNUP.txtRContraUP.style.border='1px solid red';
            document.formNUP.txtContraUP.style.border='1px solid red';
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

        document.fromReserva.txtNombre.style.border = '1px solid #EEEEEE';
        document.fromReserva.txtApellidos.style.border = '1px solid #EEEEEE';
        document.fromReserva.txtTelefono.style.border = '1px solid #EEEEEE';
        document.fromReserva.txtPeidido.style.border = '1px solid #EEEEEE';
        document.fromReserva.txtFecha.style.border = '1px solid #EEEEEE';

        if(document.fromReserva.txtNombre.value == ""){
            $("#errorNR").show("slow");
            document.fromReserva.txtNombre.style.border = '1px solid red';
            value=false;
        }
        if(document.fromReserva.txtApellidos.value==""){
            $("#errorAR").show("slow");
            document.fromReserva.txtApellidos.style.border = '1px solid red';
            value=false;
        }
        if(document.fromReserva.txtTelefono.value==""){
            $("#errorTR").show("slow");
            document.fromReserva.txtTelefono.style.border = '1px solid red';
            value=false;
        }
        if(valCaracterE(document.fromReserva.txtTelefono.value)){
            $("#errorTVR").show("slow");
            document.fromReserva.txtTelefono.style.border = '1px solid red';
            value=false;
        }
        if(document.fromReserva.txtPeidido.value==""){
            $("#errorPR").show("slow");
            document.fromReserva.txtPeidido.style.border = '1px solid red';
            value=false;
        }
        if(document.fromReserva.txtFecha.value==""){
            $("#errorPR").show("slow");
            document.fromReserva.txtFecha.style.border = '1px solid red';
            value=false;
        }
        return value;
    }

    $("#AddUSUP").click(function (){
        $("#exitoURP").hide("slow");
        $("#errorURP").hide("slow");
        $("#avisoCorrOc").hide("slow");
        if(validateformNUP()){
            var nom = document.formNUP.txtNombreUP.value;
            var ape = document.formNUP.txtApellidosUP.value;
            var cor = document.formNUP.txtCorreoUP.value;
            var nic = document.formNUP.txtUsuarioUP.value;
            var pas = document.formNUP.txtContraUP.value;
            var ava = document.formNUP.sexop.value;
            $.ajax({
                type: "POST",
                url:"modelo/add_user.php",
                data: 'nombre='+nom+'&apellidos='+ape+'&correo='+cor+'&nic='+nic+'&pass='+pas+'&ava='+ava,
                success: function(resp){  
                    if(resp==3){
                        $("#avisoCorrOc").show("slow");
                    }else{
                        if(resp==1){
                            $("#exitoURP").show("slow");
                            location.reload(true);
                        }else{
                            if(resp==0){
                                $("#errorURP").show("slow");
                            }else{
                                location.reload(true);
                            }
                        }
                    }
                }
            });
            
        }
    });

    

    $("#AgregaPedido").click(function (){
        $("#exitoENN").hide("slow");
        $("#errorNE").hide("slow");
        if(validaFormReserva()){
            $("#exitoENN").show("slow");
            $("#errorNE").show("slow");
            var nom = document.fromReserva.txtNombre.value;
            var ape = document.fromReserva.txtApellidos.value;
            var tel = document.fromReserva.txtTelefono.value;
            var ped = document.fromReserva.txtPeidido.value;
            var fec = document.fromReserva.txtFecha.value;
            var neg = document.fromReserva.txtid_neg.value;
            $.ajax({
                type: "POST",
                url:"../modelo/add_reserva.php",
                data: 'nombre='+nom+'&apellidos='+ape+'&telefono='+tel+'&pedido='+ped+'&fech='+fec+'&neg='+neg,
                success: function(resp){  
                    if(resp==1){
                        $("#exitoENN").show("slow");
                        //location.reload(true);
                        document.fromReserva.txtNombre.value="";
                        document.fromReserva.txtApellidos.value="";
                        document.fromReserva.txtTelefono.value="";
                        document.fromReserva.txtPeidido.value="";
                        document.fromReserva.txtFecha.value="";
                        alertify.alert('Guissa','¡Muchas gracias!, la reservación está hecha, para cancelar, favor de llamar a las instalaciones de la reservación.');
                    }else{
                        if(resp==0){
                            $("#errorNE").show("slow");
                            alertify.alert('Guissa','Revisa tu conexión a internet');
                        }
                    }
                }
            });
            
        }
    });

    $("#btnRef").click(function () {
        $("#restOk").hide("slow");
        $("#errorEx").hide("slow");
        $("#restNO").hide("slow");
        var cor = document.getElementById('correoO').value;
        $.ajax({
            type: "POST",
            url:"modelo/olvida_contra.php",
            data: 'correo='+cor,
            success: function(resp){  
                if(resp==1){
                    $("#restOk").show("slow");
                    document.getElementById('correoO').value="";
                }
                if(resp==0)
                    $("#errorEx").show("slow");
                if(resp==2)
                    $("#restNO").show("slow");
                
                //alert(resp);
            }
        });
    });



});
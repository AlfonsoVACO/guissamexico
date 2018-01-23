$(window).load(function (){

    function valEmail(valor){ 
        re=/^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,3})$/
        if(!re.exec(valor))    {
            return false;
        }else{
            return true;
        }
    }
    function ValidarAddNegocio() {
        valid = true;

        $("#EmailICont").hide("slow");

        document.getElementById("txtNombre_N").style.border='1px solid #EEEEEE';
        document.getElementById("txtEstado_N").style.border='1px solid #EEEEEE';
        document.getElementById("txtMunicipio_N").style.border='1px solid #EEEEEE';
        document.getElementById("txtDireccion_N").style.border='1px solid #EEEEEE';
        document.getElementById("strTelefonoNeg").style.border='1px solid #EEEEEE';
        document.getElementById("strCuenta").style.border='1px solid #EEEEEE';
        document.getElementById("strDescripcionNeg").style.border='1px solid #EEEEEE';

        if (document.getElementById("txtNombre_N").value === ""){
            document.getElementById("txtNombre_N").style.border='1px solid red';
            valid = false;
        }
        if (document.getElementById("txtEstado_N").value === ""){
            document.getElementById("txtEstado_N").style.border='1px solid red';
            valid = false;
        }
        if (document.getElementById("txtMunicipio_N").value === ""){
            document.getElementById("txtMunicipio_N").style.border='1px solid red';
            valid = false;
        }
        if (document.getElementById("txtDireccion_N").value === ""){
            document.getElementById("txtDireccion_N").style.border='1px solid red';
            valid = false;
        }
        if (document.getElementById("strTelefonoNeg").value === ""){
            document.getElementById("strTelefonoNeg").style.border='1px solid red';
            valid = false;
        }
        if (document.getElementById("strCuenta").value === ""){
            document.getElementById("strCuenta").style.border='1px solid red';
            valid = false;
        }
        if (!valEmail(document.getElementById("strCuenta").value)){
            $("#EmailICont").show("slow");
            document.getElementById("strCuenta").style.border='1px solid red';
            valid = false;
        }
        if(CKEDITOR.instances['strDescripcionNeg'].getData() === ""){
            document.getElementById('strDescripcionNeg').style.border = '1px solid red';
            value=false;
        }
        return valid;
    }

    $('#AgregaNegocio').click(function (){
            if(ValidarAddNegocio())
            {
                var nombre = document.fromNegocio.txtNombre_N.value;

                //var indeEst = document.getElementById('txtEstado_N').selectedIndex;
                //var estado = document.getElementById('txtEstado_N').options[indeMun].text;
                var estado = document.fromNegocio.txtEstado_N.value;

                //var indeMun = document.getElementById('txtMunicipio_N').selectedIndex;
                //document.fromNegocio.txtMunicipio_N.selectedIndex;
                //var munic = document.getElementById('txtMunicipio_N').options[indeMun].text;
                var munic = document.fromNegocio.txtMunicipio_N.value;

                var direc = document.fromNegocio.txtDireccion_N.value;
                var telef = document.fromNegocio.strTelefonoNeg.value;
                var otelef = document.fromNegocio.strOtherTel.value;
                var cuenta = document.fromNegocio.strCuenta.value;
                var visual = document.fromNegocio.type.value;
                var precio = document.fromNegocio.prec.value;
                var from = document.fromNegocio.from.value;
                var descri = CKEDITOR.instances['strDescripcionNeg'].getData();
                //alert('nombre='+nombre+'&estado='+estado+'&munic='+munic+'&direc='+direc+'&telef='+telef+'&otelef='+otelef+'&cuenta='+cuenta+'&visual='+visual+'&descri='+descri+'&precio='+precio);
                $.ajax({
                    type: "POST",
                    url: "solicitud",
                    data: 'type=5&from='+from+'&dataroaming='+precio+'&nombre='+nombre+'&estado='+estado+'&munic='+munic+'&direc='+direc+'&telef='+telef+'&otelef='+otelef+'&cuenta='+cuenta+'&visual='+visual+'&descri='+descri+'&precio='+precio,
                    success: function(resp){  
                        if(resp==="1"){
                            alertify.alert("Guissa","Negocio agregado con éxito");                            
                        }else if(resp==="0"){
                            alertify.alert('Guissa','El Negocio no se pudo agregar');
                        }
                    }
                });
            }
        });
  
})
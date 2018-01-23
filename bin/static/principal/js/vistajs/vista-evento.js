$(window).load(function () {

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
	$("#comentp").click(function (){            
        $("#comentP").hide("slow");
        if(valuacomentP()){
            var idprod= document.formcomentp.idprcoment.value;
            var nombre= document.formcomentp.strNombre.value;
            var comente = document.formcomentp.strComentp.value;
            var verificadorc=false;
            var gross = ['Pendejo','pendejo','Idiota','idiota','puto','puta','Puto','Puta','imbecil','Imbecil','imbécil','Imbécil','Tonto','Tonta','tonto','tonta','hijo de puta','Hijo de puta','hijo de perra','Hijo de perra','Pito','pito','Culo','culo','Desgraciado','desgraciado'];
            for (var i = gross.length - 1; i >= 0; i--) {
                if(comente.search(gross[i])>1){
                    verificadorc=true;
                }
            }
            if(verificadorc){
                alertify.alert('Guissa','Tu comentario contiene palabras antisonantes, por favor reemplazalas');
            }else{
                $.ajax({
                    type: "POST",
                    url:"cnadmincomentariose?accion=setComantario",
                    data: 'coment='+comente+'&nombre='+nombre+'&ide='+idprod,
                    success: function(resp){  
                        if($.trim(resp) ==="1"){
                            $("#comentP").show("slow");
                            document.formcomentp.strComentp.value="";
                            document.formcomentp.strNombre.value="";
                            location.reload(true);
                        }else{
                            alertify.alert('Guissa','No se pudo comentar');
                        }
                    }
                });
            }
        }
    });

    

});
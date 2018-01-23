$(window).load(function () {
	function valEmail(valor){ 
		re=/^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,3})$/
		if(!re.exec(valor))    {
			return false;
		}else{
			return true;
		}
	}

	function ValuaContact() {
		value=true;
		$("#NombCont").hide("slow");
		$("#EmailCont").hide("slow");
		$("#MotivCont").hide("slow");
		$("#MensCont").hide("slow");
		$("#EmailICont").hide("slow");
		document.formContact.strNombCont.style.border = "1px solid #EEEEEE";
		document.formContact.strEmaiCont.style.border = "1px solid #EEEEEE";
		document.formContact.strMotiCont.style.border = "1px solid #EEEEEE";
		document.formContact.strMensCont.style.border = "1px solid #EEEEEE";
		if(document.formContact.strNombCont.value === ""){
			$("#NombCont").show("slow");
			document.formContact.strNombCont.style.border = '1px solid red';
			value=false;
		}
		if(document.formContact.strEmaiCont.value === ""){
			$("#EmailCont").show("slow");
			document.formContact.strEmaiCont.style.border = '1px solid red';
			value=false;
		}
		if(!valEmail(document.formContact.strEmaiCont.value)){
			$("#EmailICont").show("slow");
			document.formContact.strEmaiCont.style.border = '1px solid red';
			value=false;
		}
		if(document.formContact.strMotiCont.value === ""){
			$("#MotivCont").show("slow");
			document.formContact.strMotiCont.style.border = '1px solid red';
			value=false;
		}
		if(document.formContact.strMensCont.value === ""){
			$("#MensCont").show("slow");
			document.formContact.strMensCont.style.border = '1px solid red';
			value=false;
		}
		return value;
	}

    $("#submitContac").click(function () {
	$("#ErrCont").hide("slow");
	$("#ExiCont").hide("slow");
	if(ValuaContact()){
            var nomb = document.formContact.strNombCont.value;
            var emai = document.formContact.strEmaiCont.value;
            var moti = document.formContact.strMotiCont.value;
            var mens = document.formContact.strMensCont.value;
            $.ajax({
		type: "POST",
		url: "/guissa/contacto",
		data: "nombreC="+nomb+"&email="+emai+"&motiv="+moti+"&mensa="+mens+"&accion=Enviar",
		success : function (resp) {
                    if(resp==="1"){
                        $("#ExiCont").show("slow");
                        document.formContact.strNombCont.value="";
                        document.formContact.strEmaiCont.value="";
                        document.formContact.strMotiCont.value="";
                        document.formContact.strMensCont.value="";
                    }else {
                        $("#ErrCont").show("slow");
                        $("#ErrCont").html(resp);
                    }
                }
            });
        }
    });
});
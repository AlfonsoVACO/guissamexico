$(window).load(function () {
    function ValuaContact() {
	value=true;
	$("#NombACont").hide("slow");
	$("#NombCont").hide("slow");
	$("#TipoCont").hide("slow");
	$("#TempoCont").hide("slow");
	$("#MunicipCont").hide("slow");
	$("#DescripCont").hide("slow");

	document.nhistoria.strNombreAN.style.border = "1px solid #EEEEEE";
	document.nhistoria.strNombreN.style.border = "1px solid #EEEEEE";
	document.nhistoria.strTipoN.style.border = "1px solid #EEEEEE";
	document.nhistoria.strTemporadaN.style.border = "1px solid #EEEEEE";
	document.nhistoria.strMunicipioN.style.border = "1px solid #EEEEEE";
	document.nhistoria.strDescripcionN.style.border = "1px solid #EEEEEE";
		
	if(document.nhistoria.strNombreAN.value === ""){
            $("#NombACont").show("slow");
            document.nhistoria.strNombreAN.style.border = '1px solid red';
            value=false;
	}
	if(document.nhistoria.strNombreN.value === ""){
            $("#NombCont").show("slow");
            document.nhistoria.strNombreN.style.border = '1px solid red';
            value=false;
	}
	if(document.nhistoria.strTipoN.value === ""){
            $("#TipoCont").show("slow");
            document.nhistoria.strTipoN.style.border = '1px solid red';
            value=false;
	}
	if(document.nhistoria.strTemporadaN.value === ""){
            $("#TempoCont").show("slow");
            document.nhistoria.strTemporadaN.style.border = '1px solid red';
            value=false;
	}
	if(document.nhistoria.strMunicipioN.value === ""){
            $("#MunicipCont").show("slow");
            document.nhistoria.strMunicipioN.style.border = '1px solid red';
            value=false;
	}
	if(CKEDITOR.instances['strDescripcionN'].getData() === ""){
            $("#DescripCont").show("slow");
            document.getElementById('strDescripcionN').style.border = '1px solid red';
            value=false;
	}
	return value;
    }

    $("#NevaA").click(function () {
	$("#ErrCont").hide("slow");
	$("#ExiCont").hide("slow");
	if(ValuaContact()){
            var noA = document.nhistoria.strNombreAN.value;
            var nom = document.nhistoria.strNombreN.value;
            var tip = document.nhistoria.strTipoN.value;
            var tem = document.nhistoria.strTemporadaN.value;
            var mun = document.nhistoria.strMunicipioN.value;
            var des = CKEDITOR.instances['strDescripcionN'].getData();
            $.ajax({
                type: "POST",
                url: "/guissa/nueva-historia",
                data: "noA="+noA+"&nom="+nom+"&tip="+tip+"&tem="+tem+"&mun="+mun+"&des="+des+"&accion=add",
                success : function (resp) {
                    if(resp==="1"){
                        $("#ExiCont").show("slow");
                        document.nhistoria.strNombreAN.value="";
                        document.nhistoria.strNombreN.value="";
                        document.nhistoria.strTipoN.value="";
                        document.nhistoria.strTemporadaN.value="";
                        document.nhistoria.strMunicipioN.value="";
                        //CKEDITOR.instances['strDescripcionN'].getData()="";
                    }else{
                        $("#ErrCont").html(resp);
                    }
                }
            });
	}
    });
});
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


(function(){
    function getRecientes(tipo,lugar){
        $.ajax({
            type: "post" ,
            url: tipo + "?accion=recientes",
            cache:false,
            success: function(dato){
                alert(dato);
                $("#"+lugar).html("").slideDown(10);
                $("#"+lugar).fadeOut("fast",function(){
                    $(lugar).html(dato).slideDown(10);
                });
            },
            error: function(XMLHttpRequest,textStatus,errorthrows){
                alertify.alert('Guissa','error' + errorthrows);
            }
        });
    }
    
})();
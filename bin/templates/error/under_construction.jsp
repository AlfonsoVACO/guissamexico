<%-- 
    Document   : under_construction
    Created on : 20/11/2017, 02:04:51 PM
    Author     : Alfonso
--%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Guissa   |   En Construcción</title>
        <link rel="shortcut icon" href="<%= request.getContextPath() %>/images/favicon.ico" />
        <meta name="msapplication-TileColor" content="#5bc0de" />
        <link href="<%= request.getContextPath() %>/cliente/css/bootstrap.min.css" rel="stylesheet" />
        <link href="<%= request.getContextPath() %>/cliente/css/animate.min.css" rel="stylesheet"/>
        <link href="<%= request.getContextPath() %>/administrador/font-awesome/css/font-awesome.css" rel="stylesheet" />


        <!-- Metis core stylesheet -->
        <link rel="stylesheet" href="assets/css/main.css">

        <!-- metisMenu stylesheet -->
        <link rel="stylesheet" href="assets/lib/metismenu/metisMenu.css">

        <!-- onoffcanvas stylesheet -->
        <link rel="stylesheet" href="assets/lib/onoffcanvas/onoffcanvas.css">

        <style>
            body {
                padding-top: 40px;
            }
            .orange {
                color: orange;
            }
            .logo {
                position: relative;
                -moz-box-shadow: rgba(255, 255, 255, 0.1) 0 1px 0, rgba(0, 0, 0, 0.8) 0 1px 7px 0px inset;
                -webkit-box-shadow: rgba(255, 255, 255, 0.1) 0 1px 0, rgba(0, 0, 0, 0.8) 0 1px 7px 0px inset;
                -o-box-shadow: rgba(255, 255, 255, 0.1) 0 1px 0, rgba(0, 0, 0, 0.8) 0 1px 7px 0px inset;
                box-shadow: rgba(255, 255, 255, 0.1) 0 1px 0, rgba(0, 0, 0, 0.8) 0 1px 7px 0px inset;
                padding: 16px;
                text-align: center;

            }
            .logo h1 {
                color: #000;
                font-size: 90px;
                text-shadow: #202020 1px 1px 0px;
            }
            .title {
                text-align: center;
                color: #ffffff;
                text-shadow: 1px 1px 1px #111111;
            }
            .contact {
                text-shadow: 1px 1px 1px #111111;
            }
            .contact a {
                color: orange;
                display: inline-block;
                font-size: 16px;
                margin-right: 12px;
                padding: 0 3px;
                text-decoration: none;
            }
            .contact a:hover {
                background-color: #444;
            }
            hr {
                border-bottom: 1px solid #121212;
                border-top: medium none;
                box-shadow: 0 1px 0 rgba(255, 255, 255, 0.07);
                margin-bottom: 40px;
            }
            .progress {
                color: #000;
                -webkit-border-radius: 0;
                -moz-border-radius: 0;
                border-radius: 0;
                margin-bottom: 0;
            }
            .progress.mini {
                height: 6px;
            }
            #counter {
               display: none;
            }
            #counter-default {
                margin: 20px auto;
            }
            #counter-default .inner {
                font-size: large;
                text-align: center;
                color: #8c8c8c;
                border: none;
                background-color: #202020;
                background-color: rgba(0, 0, 0, 0.3);
                -moz-box-shadow: rgba(255, 255, 255, 0.1) 0 1px 0, rgba(0, 0, 0, 0.8) 0 1px 7px 0px inset;
                -webkit-box-shadow: rgba(255, 255, 255, 0.1) 0 1px 0, rgba(0, 0, 0, 0.8) 0 1px 7px 0px inset;
                -o-box-shadow: rgba(255, 255, 255, 0.1) 0 1px 0, rgba(0, 0, 0, 0.8) 0 1px 7px 0px inset;
                box-shadow: rgba(255, 255, 255, 0.1) 0 1px 0, rgba(0, 0, 0, 0.8) 0 1px 7px 0px inset;
                margin: 15px 0;
                padding: 15px;
                text-shadow: 0px 1px 2px #000;
            }
            #counter-default .timer-number {
                font-size: 36px;
                margin-bottom: 12px;
                color: #EFEFF0;
                font-weight: bold;
            }
            #counter-default  .timer-text {
                padding: 12px;
                color: #8c8c8c;
            }

            .well {
                background-color: #202020;
                background-color: rgba(0, 0, 0, 0.3);
                border: none;
                color: #999;
                -moz-box-shadow: rgba(255, 255, 255, 0.1) 0 1px 0, rgba(0, 0, 0, 0.8) 0 1px 7px 0px inset;
                -webkit-box-shadow: rgba(255, 255, 255, 0.1) 0 1px 0, rgba(0, 0, 0, 0.8) 0 1px 7px 0px inset;
                -o-box-shadow: rgba(255, 255, 255, 0.1) 0 1px 0, rgba(0, 0, 0, 0.8) 0 1px 7px 0px inset;
                box-shadow: rgba(255, 255, 255, 0.1) 0 1px 0, rgba(0, 0, 0, 0.8) 0 1px 7px 0px inset;
            }
            legend {
                color: #999;
                border-color: #333333;
            }
            .page-header {
                border-bottom: 1px solid #333333;
            }

            @media (max-width: 767px) {
                body {padding-top: 10px;}
                #main {width:auto;}
            }
            .bg-dark {
                background-color: #444;
                color: #fff !important;
            }
            .bg-dark.dker,
            .bg-dark > .dker {
                background-color: #303030 !important;
            }
            .bg-dark.dk,
            .bg-dark > .dk {
                background-color: #3a3a3a !important;
            }
            .bg-dark.lt,
            .bg-dark > .lt {
                background-color: #4e4e4e !important;
            }
            .bg-dark.lter,
            .bg-dark > .lter {
                background-color: #585858 !important;
            }
        </style>

        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
            <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
        <script src="http://maps.google.com/maps/api/js"></script>
        <script src="<%= request.getContextPath() %>/js/gmaps.min.js"></script>
    </head>
    <body class="bg-dark lter">
        <style>
            #map_canvas {
                width: 400px !important;
                height: 400px !important;
            }
        </style>
        <div class="container">
            <div class="clearfix">
                <div class="logo">
                    <h1><span class="text-warning">EC</span></h1>
                </div>
            </div>
            <div class="clearfix">
                <div class="col-lg-12 title">
                    <h2>Nuestro sitio está <span class="orange">E</span>n <span class="orange">C</span>onstrucción</h2>
                    <small>We are done with the backend just front end to go. The site will launch in:</small>
                </div>
            </div>
            <div id="counter"></div>
            <div id="counter-default" class="row">
                <div class="col-lg-3 col-sm-6">
                    <div class="inner">
                        <div id="day-number" class="timer-number"></div>
                        <div class="timer-text">DÍAS</div>
                        <div class="progress mini progress-striped active">
                            <div id="day-bar" class="progress-bar progress-bar-warning"></div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-6">
                    <div class="inner">
                        <div id="hour-number" class="timer-number"></div>
                        <div class="timer-text">HORAS</div>
                        <div class="progress mini progress-striped active">
                            <div id="hour-bar" class="progress-bar progress-bar-warning"></div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-6">
                    <div class="inner">
                        <div id="minute-number" class="timer-number"></div>
                        <div class="timer-text">MINUTOS</div>
                        <div class="progress mini progress-striped active">
                            <div id="minute-bar" class="progress-bar progress-bar-warning"></div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-6">
                    <div class="inner">
                        <div id="second-number" class="timer-number"></div>
                        <div class="timer-text">SEGUNDOS</div>

                        <div class="progress mini progress-striped active">
                            <div id="second-bar" class="progress-bar progress-bar-warning"></div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <div class="progress progress-striped active" rel="tooltip" data-placement="bottom"
                         data-original-title="Total Progress">
                        <div id="total-bar" class="progress-bar progress-bar-warning"></div>
                    </div>
                </div>
            </div>
            <hr/>
            <div class="row">
                <div class="col-lg-6 contact">
                    <dl class="dl-horizontal">
                        <dt>Contáctanos :</dt>
                        <dd>
                            <a href="#contact-area" class="accordion-toggle" data-toggle="collapse" rel="tooltip"
                               data-placement="top" data-original-title="Fill the form">
                                <i class="fa fa-envelope"></i>
                            </a>
                        </dd>
                        <dt>Encuentranos :</dt>
                        <dd>
                            <a href="#" rel="tooltip" data-placement="bottom" data-original-title="facebook"><i class="fa fa-facebook"></i></a>
                            <a href="#" rel="tooltip" data-placement="bottom" data-original-title="Twitter"><i class="fa fa-twitter"></i></a>
                            <a href="#" rel="tooltip" data-placement="bottom" data-original-title="pinterest"><i class="fa fa-pinterest"></i></a>
                            <a href="#" rel="tooltip" data-placement="bottom" data-original-title="google"><i class="fa fa-google-plus"></i></a>
                            <a href="#" rel="tooltip" data-placement="bottom" data-original-title="github"><i class="fa fa-github"></i></a>
                        </dd>
                    </dl>
                </div>
            </div>
            <div id="contact-area" class="row">
                <div class="col-lg-7">
                    <div class="well">
                        <form action="#" method="post" accept-charset="utf-8" id="messageForm">
                            <fieldset>
                                <legend>Contacto</legend>
                                <div class="form-group">
                                    <label class="control-label" for="name">Nombre</label>
                                    <input class="form-control" type="text" name="name" id="name"
                                           placeholder="Ingresa tu nombre" required="required">
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="email">Correo</label>
                                    <input class="form-control" type="email" name="email" id="email"
                                           placeholder="Ingresa tu correo" required="required">
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="subject">Motivo</label>
                                    <input class="form-control" type="text" name="subject" id="subject"
                                           placeholder="Ingresa tu motivo" required="required">
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="message">Mensaje</label>
                                    <textarea class="form-control" name="messsage" id="message"
                                              placeholder="Ingresa tu mensaje" required="required"></textarea>
                                </div>
                                <div class="row">
                                    <div class="form-group col-lg-6 col-sm-6 col-6">
                                        <button class="btn btn-warning btn-block" type="submit">Enviar</button>
                                    </div>
                                </div>
                            </fieldset>
                        </form>
                    </div>
                </div>
                <div class="col-lg-5">
                    <div class="page-header">
                        <h4>Información de contacto</h4>
                    </div>
                    <address>
                        <dl class="dl-horizontal">
                            <dt>Dirección :</dt>
                            <dd>
                                123 Home Street NY US
                            </dd>
                            <dt>Telephone :</dt>
                            <dd>+0 123 456 78</dd>
                            <dt>E-mail :</dt>
                            <dd>contacto@guissa.com</dd>
                            <dt>Web :</dt>
                            <dd>https://guissa.com</dd>
                        </dl>
                    </address>
                <div id="map_canvas"></div>
                </div>
            </div>
        </div>
        <script src="<%= request.getContextPath() %>/administrador/js/jquery.js" type="text/javascript"></script>
        <script src="<%= request.getContextPath() %>/cliente/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery-countdown/2.0.1/jquery.plugin.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery-countdown/2.0.1/jquery.countdown.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.13.1/jquery.validate.min.js"></script>
        <script>
            var startDate = new Date("01/01/2016"),
                endDate = new Date("04/06/2017"),
                dif = endDate.getTime() - startDate.getTime(),
                difToSecond = dif / 1000,
                defaultPercent = 0;


            $(function () {
                $('#counter').countdown({
                    until: endDate,
                    layout: '<div></div>',
                    onTick: updateBar
                });

                $('a[rel=tooltip]').tooltip();
                $('div[rel=tooltip]').tooltip();
            });


            function updateBar(periods) {

                fillSecondBar(periods[6]);
                fillMinuteBar(periods[5]);
                fillHourBar(periods[4]);
                fillDayBar(periods[3]);

                fillTotalbar(periods[6] + periods[5] * 60 + periods[4] * 60 * 60 + periods[3] * 60 * 60 * 24);
            }

            function fillSecondBar(percent) {
                $('#second-number').html(percent);
                $('#second-bar').css('width', percent * 100 / 60 + '%');
            }

            function fillMinuteBar(percent) {
                $('#minute-number').html(percent);
                $('#minute-bar').css('width', percent * 100 / 60 + '%');
            }

            function fillHourBar(percent) {
                $('#hour-number').html(percent);
                $('#hour-bar').css('width', percent * 100 / 24 + '%');
            }

            function fillDayBar(percent) {
                $('#day-number').html(percent);
                $('#day-bar').css('width', percent * 100 / 365 + '%');
            }

            function fillTotalbar(percent) {
                defaultPercent = 100 - 100 * percent / difToSecond;

                if (defaultPercent >= 10) {
                    currentPercent = defaultPercent.toString().substr(0, 5);
                } else {
                    currentPercent = defaultPercent.toString().substr(0, 4);
                }

                $('#total-bar').css('width', defaultPercent + '%').html(currentPercent + '%');
            }


            /* Start Google Map*/



            var map = new GMaps({
                    el: '#map_canvas',
                        lat: -12.043333,
                        lng: -77.028333,
                        zoomControl: true,
                        zoomControlOpt: {
                            style: 'SMALL',
                            position: 'TOP_LEFT'
                        },
                        panControl: false,
                        streetViewControl: false,
                        mapTypeControl: false,
                        overviewMapControl: false
                    });


            /* Start Form validation*/

            $(function () {

                $('#emailForm').validate({
                    rules: {
                        email1: {
                            required: true,
                            email: true
                        }
                    },
                    errorClass: 'help-block',
                    errorElement: 'span',
                    highlight: function (element, errorClass, validClass) {
                        $(element).parents('.form-group').removeClass('has-success').addClass('has-error');
                    },
                    unhighlight: function (element, errorClass, validClass) {
                        $(element).parents('.form-group').removeClass('has-error').addClass('has-success');
                    }
                });
                $('#messageForm').validate({
                    rules: {
                        name: {
                            required: true
                        },
                        email: {
                            required: true,
                            email: true
                        },
                        subject: {
                            required: true
                        },
                        message: {
                            required: true
                        }
                    },
                    errorClass: 'help-block',
                    errorElement: 'span',
                    highlight: function (element, errorClass, validClass) {
                        $(element).parents('.form-group').removeClass('has-success').addClass('has-error');
                    },
                    unhighlight: function (element, errorClass, validClass) {
                        $(element).parents('.form-group').removeClass('has-error').addClass('has-success');
                    }
                });
            });
        </script>
    </body>
</html>

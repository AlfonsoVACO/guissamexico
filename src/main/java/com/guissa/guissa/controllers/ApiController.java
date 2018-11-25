package com.guissa.guissa.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.guissa.guissa.models.entidades.*;
import com.guissa.guissa.services.*;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	@Autowired
	@Qualifier("servicioBanner")
	private BannerService servicioBanner;
	
	@Autowired
	@Qualifier("servicioComentariose")
	private ComentarioseService servicioComentariose;
	
	@Autowired
	@Qualifier("servicioComentariosn")
	private ComentariosnService servicioComentariosn;
	
	@Autowired
	@Qualifier("servicioComentariosp")
	private ComentariospService servicioComentariosp;
	
	@Autowired
	@Qualifier("servicioComun")
	private ComunService servicioComun;
	
	@Autowired
	@Qualifier("servicioContactNegocios")
	private ContactNegociosService servicioContactNegocios;
	
	@Autowired
	@Qualifier("servicioContacto")
	private ContactoService servicioContacto;
		
	@Autowired
	@Qualifier("servicioEstados")
	private EstadosService servicioEstados;
	
	@Autowired
	@Qualifier("servicioEvento")
	private EventoService servicioEvento;
	
	@Autowired
	@Qualifier("servicioGaleriaNs")
	private GaleriaNsService servicioGaleriaNs;
	
	@Autowired
	@Qualifier("servicioGaleria")
	private GaleriaService servicioGaleria;
	
	@Autowired
	@Qualifier("servicioHistorys")
	private HistorysService servicioHistorys;
		
	@Autowired
	@Qualifier("servicioImagenev")
	private ImagenEvService servicioImagenev;
	
	@Autowired
	@Qualifier("servicioImagenmenurestaurante")
	private ImagenmenurestauranteService servicioImagenmenurestaurante;
	
	@Autowired
	@Qualifier("servicioImagennegocios")
	private ImagennegociosService servicioImagennegocios;
	
	@Autowired
	@Qualifier("servicioMenurestaurante")
	private MenuRestauranteService servicioMenurestaurante;
	
	@Autowired
	@Qualifier("servicioMunicipios")
	private MunicipiosService servicioMunicipios;
	
	@Autowired
	@Qualifier("servicioNegocioEs")
	private NegocioEsService servicioNegocioEs;
	
	@Autowired
	@Qualifier("servicioNegocios")
	private NegociosService servicioNegocios;
	
	@Autowired
	@Qualifier("servicioNotas")
	private NotasService servicioNotas;
	
	@Autowired
	@Qualifier("servicioPatrocinador")
	private PatrocinadorService servicioPatrocinador;
	
	@Autowired
	@Qualifier("servicioPrecios")
	private PreciosService servicioPrecios;
	
	@Autowired
	@Qualifier("servicioProducto")
	private ProductoService servicioProducto;
	
	@Autowired
	@Qualifier("servicioReceta")
	private RecetaService servicioReceta;
	
	@Autowired
	@Qualifier("servicioReplicae")
	private ReplicaeService servicioReplicae;
	
	@Autowired
	@Qualifier("servicioReplican")
	private ReplicanService servicioReplican;
	
	@Autowired
	@Qualifier("servicioReplicap")
	private ReplicapService servicioReplicap;
	
	@Autowired
	@Qualifier("servicioRecervacion")
	private ReservacionService servicioRecervacion;
	
	@Autowired
	@Qualifier("servicioReservags")
	private ReservagsService servicioReservags;
	
	@Autowired
	@Qualifier("servicioResetopass")
	private ResetopassService servicioResetopass;
	
	@Autowired
	@Qualifier("servicioTemporadas")
	private TemporadasService servicioTemporadas;
	
	@Autowired
	@Qualifier("servicioTipo")
	private TipoService servicioTipo;
	
	@Autowired
	@Qualifier("servicioTipousuario")
	private TipoUsuarioService servicioTipousuario;
	
	@Autowired
	@Qualifier("servicioUserc")
	private UserCService servicioUserc;
	
	@Autowired
	@Qualifier("servicioUsers")
	private UserService servicioUsers;
		
	@RequestMapping(value = "/banner/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody
	public Optional<Banner> getApiBanner(@PathVariable(name = "id") int id) {
		return  servicioBanner.getBannerById(id);
	}
	
	@RequestMapping(value = "/comentariose/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Comentariose> getApiComentariose(@PathVariable(name = "id") int id) {
		return  servicioComentariose.getComentarioseById(id);
	}
	
	@RequestMapping(value = "/comentariosn/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Comentariosn> getApiComentariosn(@PathVariable(name = "id") int id) {
		return  servicioComentariosn.getComentariosnById(id);
	}
	
	@RequestMapping(value = "/comentariosp/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Comentariosp> getApiComentariosp(@PathVariable(name = "id") int id) {
		return  servicioComentariosp.getComentariospById(id);
	}
	
	@RequestMapping(value = "/comun/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Comun> getApiComun(@PathVariable(name = "id") int id) {
		return  servicioComun.getComunById(id);
	}
	
	@RequestMapping(value = "/contactnegocios/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<ContactNegocios> getApiContactNegocio(@PathVariable(name = "id") int id) {
		return  servicioContactNegocios.getContactNegociosById(id);
	}
	
	@RequestMapping(value = "/contacto/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Contacto> getApiContacto(@PathVariable(name = "id") int id) {
		return  servicioContacto.getContactoById(id);
	}
	
	@RequestMapping(value = "/estados/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Estados> getApiEstados(@PathVariable(name = "id") int id) {
		return  servicioEstados.getEstadosById(id);
	}
	
	@RequestMapping(value = "/evento/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Evento> getApiEvento(@PathVariable(name = "id") int id) {
		return  servicioEvento.getEventoById(id);
	}
	
	@RequestMapping(value = "/galerians/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<GaleriaNs> getApiGaleriaNs(@PathVariable(name = "id") int id) {
		return  servicioGaleriaNs.getGaleriaNsById(id);
	}
	
	@RequestMapping(value = "/galeria/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Galeria> getApiGaleria(@PathVariable(name = "id") int id) {
		return  servicioGaleria.getGaleriaById(id);
	}
		
	@RequestMapping(value = "/historys/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Historys> getApiHistorys(@PathVariable(name = "id") int id) {
		return  servicioHistorys.getHistorysById(id);
	}
	
	@RequestMapping(value = "/imagenev/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Imagenev> getApiImagenEv(@PathVariable(name = "id") int id) {
		return  servicioImagenev.getImagenevById(id);
	}
		
	@RequestMapping(value = "/imagenmenurestaurante/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Imagenmenurestaurante> getApiImagenmenurestaurante(@PathVariable(name = "id") int id) {
		return  servicioImagenmenurestaurante.getImagenmenurestauranteById(id);
	}
	
	@RequestMapping(value = "/imagennegocios/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Imagennegocios> getApiImagennegocios(@PathVariable(name = "id") int id) {
		return  servicioImagennegocios.getImagennegociosById(id);
	}
	
	@RequestMapping(value = "/menurestaurante/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Menurestaurante> getApiMenurestaurante(@PathVariable(name = "id") int id) {
		return  servicioMenurestaurante.getMenurestauranteById(id);
	}
	
	@RequestMapping(value = "/municipios/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Municipios> getApiMunicipios(@PathVariable(name = "id") int id) {
		return  servicioMunicipios.getMunicipiosById(id);
	}
	
	@RequestMapping(value = "/negocioes/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<NegocioEs> getApiNegocioEs(@PathVariable(name = "id") int id) {
		return  servicioNegocioEs.getNegocioEsById(id);
	}
		
	@RequestMapping(value = "/negocios/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Negocios> getApiNegocios(@PathVariable(name = "id") int id) {
		return  servicioNegocios.getNegociosById(id);
	}
	
	@RequestMapping(value = "/notas/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Notas> getApiNotas(@PathVariable(name = "id") int id) {
		return  servicioNotas.getNotasById(id);
	}
	
	@RequestMapping(value = "/patrocinador/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Patrocinador> getApiPatrocinador(@PathVariable(name = "id") int id) {
		return  servicioPatrocinador.getPatrocinadorById(id);
	}
	
	@RequestMapping(value = "/precios/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Precios> getApiPrecios(@PathVariable(name = "id") int id) {
		return  servicioPrecios.getPreciosById(id);
	}
	
	@RequestMapping(value = "/producto/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Producto> getApiProducto(@PathVariable(name = "id") int id) {
		return  servicioProducto.getProductoById(id);
	}
	
	@RequestMapping(value = "/receta/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Receta> getApiReceta(@PathVariable(name = "id") int id) {
		return  servicioReceta.getRecetaById(id);
	}
	
	@RequestMapping(value = "/replicae/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Replicae> getApiReplicae(@PathVariable(name = "id") int id) {
		return  servicioReplicae.getReplicaeById(id);
	}
	
	@RequestMapping(value = "/replican/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Replican> getApiReplican(@PathVariable(name = "id") int id) {
		return  servicioReplican.getReplicanById(id);
	}
	
	@RequestMapping(value = "/replicap/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Replicap> getApiReplicap(@PathVariable(name = "id") int id) {
		return  servicioReplicap.getReplicapById(id);
	}
	
	@RequestMapping(value = "/recervacion/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Reservacion> getApiRecervacion(@PathVariable(name = "id") int id) {
		return  servicioRecervacion.getReservacionById(id);
	}
	
	@RequestMapping(value = "/reservags/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Reservags> getApiReservags(@PathVariable(name = "id") int id) {
		return  servicioReservags.getReservagsById(id);
	}
		
	@RequestMapping(value = "/resetopass/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Resetopass> getApiResetopass(@PathVariable(name = "id") int id) {
		return  servicioResetopass.getResetopassById(id);
	}
	
	@RequestMapping(value = "/temporadas/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Temporadas> getApiTemporadas(@PathVariable(name = "id") int id) {
		return  servicioTemporadas.getTemporadasById(id);
	}
	
	@RequestMapping(value = "/tipo/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Tipo> getApiTipo(@PathVariable(name = "id") int id) {
		return  servicioTipo.getTipoById(id);
	}
	
	@RequestMapping(value = "/tipousuario/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<TipoUsuario> getApiTipousuario(@PathVariable(name = "id") int id) {
		return  servicioTipousuario.getTipoUsuarioById(id);
	}
	
	@RequestMapping(value = "/userc/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Userc> getApiUserc(@PathVariable(name = "id") int id) {
		return  servicioUserc.getUsercById(id);
	}
	
	@RequestMapping(value = "/users/{id}",  method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<User> getApiUsers(@PathVariable(name = "id") int id) {
		return  servicioUsers.getUserById(id);
	}
}

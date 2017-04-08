package io.swagger.api;

import io.swagger.model.DocumentoListado;
import io.swagger.model.Erro;
import java.io.File;
import io.swagger.model.HashAssinado;
import io.swagger.model.HashDocumento;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-08T19:27:32.512Z")

@Api(value = "documentos", description = "the documentos API")
public interface DocumentosApi {

    @ApiOperation(value = "", notes = "Recebe hash de documento assinatura.", response = HashDocumento.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "retorna hash de pdf", response = HashDocumento.class),
        @ApiResponse(code = 200, message = "erro inesperado", response = HashDocumento.class) })
    @RequestMapping(value = "/documentos/enviarHashAssinado",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<List<HashDocumento>> enviarHashAssinadoParaUsuarioPorCdDocumento(@ApiParam(value = "json com cpfUsuario, cdDocumento e hashAssinado do documento." ,required=true ) @RequestBody HashAssinado hashAssinado);


    @ApiOperation(value = "", notes = "Retorna lista com identificador de todos os documentos que aguardam assinatura de usuario", response = DocumentoListado.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "lista response", response = DocumentoListado.class),
        @ApiResponse(code = 200, message = "erro inesperado", response = DocumentoListado.class) })
    @RequestMapping(value = "/documentos/{cpfUsuario}/listar",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<DocumentoListado>> listarDocumentosAguarandoAssinaturaPorCpf(@ApiParam(value = "CPF do usuario utilizado para busca de documentos aguardando assinatura (sem formatacao).",required=true ) @PathVariable("cpfUsuario") Long cpfUsuario);


    @ApiOperation(value = "", notes = "Retorna stream de documento para visualizacao.", response = File.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "retorna pdf", response = File.class),
        @ApiResponse(code = 200, message = "erro inesperado", response = File.class) })
    @RequestMapping(value = "/documentos/{cpfUsuario}/visualizar/{cdDocumento}",
        produces = { "application/pdf", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<File> obterDocumentoParaUsuarioPorCdDocumento(@ApiParam(value = "CPF do usuario utilizado para busca de documentos aguardando assinatura (sem formatacao).",required=true ) @PathVariable("cpfUsuario") Long cpfUsuario,
        @ApiParam(value = "cdDocumento retornado na listagem utilizado para visualizar documento.",required=true ) @PathVariable("cdDocumento") Long cdDocumento);


    @ApiOperation(value = "", notes = "Retorna hash de documento para assinatura.", response = HashDocumento.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "retorna hash de pdf", response = HashDocumento.class),
        @ApiResponse(code = 200, message = "erro inesperado", response = HashDocumento.class) })
    @RequestMapping(value = "/documentos/{cpfUsuario}/hash/{cdDocumento}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<HashDocumento>> obterHashParaUsuarioPorCdDocumento(@ApiParam(value = "CPF do usuario utilizado para busca de documentos aguardando assinatura (sem formatacao).",required=true ) @PathVariable("cpfUsuario") Long cpfUsuario,
        @ApiParam(value = "cdDocumento retornado na listagem utilizado para solicitar.",required=true ) @PathVariable("cdDocumento") Long cdDocumento);

}

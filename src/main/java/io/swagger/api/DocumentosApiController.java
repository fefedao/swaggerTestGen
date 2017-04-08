package io.swagger.api;

import io.swagger.model.DocumentoListado;
import io.swagger.model.Erro;
import java.io.File;
import io.swagger.model.HashAssinado;
import io.swagger.model.HashDocumento;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-08T19:27:32.512Z")

@Controller
public class DocumentosApiController implements DocumentosApi {

    public ResponseEntity<List<HashDocumento>> enviarHashAssinadoParaUsuarioPorCdDocumento(@ApiParam(value = "json com cpfUsuario, cdDocumento e hashAssinado do documento." ,required=true ) @RequestBody HashAssinado hashAssinado) {
        // do some magic!
        return new ResponseEntity<List<HashDocumento>>(HttpStatus.OK);
    }

    public ResponseEntity<List<DocumentoListado>> listarDocumentosAguarandoAssinaturaPorCpf(@ApiParam(value = "CPF do usuario utilizado para busca de documentos aguardando assinatura (sem formatacao).",required=true ) @PathVariable("cpfUsuario") Long cpfUsuario) {
        // do some magic!
        return new ResponseEntity<List<DocumentoListado>>(HttpStatus.OK);
    }

    public ResponseEntity<File> obterDocumentoParaUsuarioPorCdDocumento(@ApiParam(value = "CPF do usuario utilizado para busca de documentos aguardando assinatura (sem formatacao).",required=true ) @PathVariable("cpfUsuario") Long cpfUsuario,
        @ApiParam(value = "cdDocumento retornado na listagem utilizado para visualizar documento.",required=true ) @PathVariable("cdDocumento") Long cdDocumento) {
        // do some magic!
        return new ResponseEntity<File>(HttpStatus.OK);
    }

    public ResponseEntity<List<HashDocumento>> obterHashParaUsuarioPorCdDocumento(@ApiParam(value = "CPF do usuario utilizado para busca de documentos aguardando assinatura (sem formatacao).",required=true ) @PathVariable("cpfUsuario") Long cpfUsuario,
        @ApiParam(value = "cdDocumento retornado na listagem utilizado para solicitar.",required=true ) @PathVariable("cdDocumento") Long cdDocumento) {
        // do some magic!
        return new ResponseEntity<List<HashDocumento>>(HttpStatus.OK);
    }

}

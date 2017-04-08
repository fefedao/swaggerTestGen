package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DocumentoListado
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-08T19:27:32.512Z")

public class DocumentoListado   {
  @JsonProperty("cdDocumento")
  private Long cdDocumento = null;

  @JsonProperty("deCategoria")
  private String deCategoria = null;

  @JsonProperty("nmDocumento")
  private String nmDocumento = null;

  @JsonProperty("cdUsuUltimaAlteracao")
  private Long cdUsuUltimaAlteracao = null;

  @JsonProperty("nmUsuUltimaAlteracao")
  private String nmUsuUltimaAlteracao = null;

  @JsonProperty("nuProcesso")
  private Long nuProcesso = null;

  @JsonProperty("cdForo")
  private Long cdForo = null;

  @JsonProperty("nmForo")
  private String nmForo = null;

  @JsonProperty("cdCartorio")
  private Long cdCartorio = null;

  @JsonProperty("nmCartorio")
  private String nmCartorio = null;

  public DocumentoListado cdDocumento(Long cdDocumento) {
    this.cdDocumento = cdDocumento;
    return this;
  }

   /**
   * Get cdDocumento
   * @return cdDocumento
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getCdDocumento() {
    return cdDocumento;
  }

  public void setCdDocumento(Long cdDocumento) {
    this.cdDocumento = cdDocumento;
  }

  public DocumentoListado deCategoria(String deCategoria) {
    this.deCategoria = deCategoria;
    return this;
  }

   /**
   * Get deCategoria
   * @return deCategoria
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDeCategoria() {
    return deCategoria;
  }

  public void setDeCategoria(String deCategoria) {
    this.deCategoria = deCategoria;
  }

  public DocumentoListado nmDocumento(String nmDocumento) {
    this.nmDocumento = nmDocumento;
    return this;
  }

   /**
   * Get nmDocumento
   * @return nmDocumento
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNmDocumento() {
    return nmDocumento;
  }

  public void setNmDocumento(String nmDocumento) {
    this.nmDocumento = nmDocumento;
  }

  public DocumentoListado cdUsuUltimaAlteracao(Long cdUsuUltimaAlteracao) {
    this.cdUsuUltimaAlteracao = cdUsuUltimaAlteracao;
    return this;
  }

   /**
   * Get cdUsuUltimaAlteracao
   * @return cdUsuUltimaAlteracao
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getCdUsuUltimaAlteracao() {
    return cdUsuUltimaAlteracao;
  }

  public void setCdUsuUltimaAlteracao(Long cdUsuUltimaAlteracao) {
    this.cdUsuUltimaAlteracao = cdUsuUltimaAlteracao;
  }

  public DocumentoListado nmUsuUltimaAlteracao(String nmUsuUltimaAlteracao) {
    this.nmUsuUltimaAlteracao = nmUsuUltimaAlteracao;
    return this;
  }

   /**
   * Get nmUsuUltimaAlteracao
   * @return nmUsuUltimaAlteracao
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNmUsuUltimaAlteracao() {
    return nmUsuUltimaAlteracao;
  }

  public void setNmUsuUltimaAlteracao(String nmUsuUltimaAlteracao) {
    this.nmUsuUltimaAlteracao = nmUsuUltimaAlteracao;
  }

  public DocumentoListado nuProcesso(Long nuProcesso) {
    this.nuProcesso = nuProcesso;
    return this;
  }

   /**
   * Get nuProcesso
   * @return nuProcesso
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getNuProcesso() {
    return nuProcesso;
  }

  public void setNuProcesso(Long nuProcesso) {
    this.nuProcesso = nuProcesso;
  }

  public DocumentoListado cdForo(Long cdForo) {
    this.cdForo = cdForo;
    return this;
  }

   /**
   * Get cdForo
   * @return cdForo
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getCdForo() {
    return cdForo;
  }

  public void setCdForo(Long cdForo) {
    this.cdForo = cdForo;
  }

  public DocumentoListado nmForo(String nmForo) {
    this.nmForo = nmForo;
    return this;
  }

   /**
   * Get nmForo
   * @return nmForo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNmForo() {
    return nmForo;
  }

  public void setNmForo(String nmForo) {
    this.nmForo = nmForo;
  }

  public DocumentoListado cdCartorio(Long cdCartorio) {
    this.cdCartorio = cdCartorio;
    return this;
  }

   /**
   * Get cdCartorio
   * @return cdCartorio
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getCdCartorio() {
    return cdCartorio;
  }

  public void setCdCartorio(Long cdCartorio) {
    this.cdCartorio = cdCartorio;
  }

  public DocumentoListado nmCartorio(String nmCartorio) {
    this.nmCartorio = nmCartorio;
    return this;
  }

   /**
   * Get nmCartorio
   * @return nmCartorio
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNmCartorio() {
    return nmCartorio;
  }

  public void setNmCartorio(String nmCartorio) {
    this.nmCartorio = nmCartorio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentoListado documentoListado = (DocumentoListado) o;
    return Objects.equals(this.cdDocumento, documentoListado.cdDocumento) &&
        Objects.equals(this.deCategoria, documentoListado.deCategoria) &&
        Objects.equals(this.nmDocumento, documentoListado.nmDocumento) &&
        Objects.equals(this.cdUsuUltimaAlteracao, documentoListado.cdUsuUltimaAlteracao) &&
        Objects.equals(this.nmUsuUltimaAlteracao, documentoListado.nmUsuUltimaAlteracao) &&
        Objects.equals(this.nuProcesso, documentoListado.nuProcesso) &&
        Objects.equals(this.cdForo, documentoListado.cdForo) &&
        Objects.equals(this.nmForo, documentoListado.nmForo) &&
        Objects.equals(this.cdCartorio, documentoListado.cdCartorio) &&
        Objects.equals(this.nmCartorio, documentoListado.nmCartorio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cdDocumento, deCategoria, nmDocumento, cdUsuUltimaAlteracao, nmUsuUltimaAlteracao, nuProcesso, cdForo, nmForo, cdCartorio, nmCartorio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoListado {\n");
    
    sb.append("    cdDocumento: ").append(toIndentedString(cdDocumento)).append("\n");
    sb.append("    deCategoria: ").append(toIndentedString(deCategoria)).append("\n");
    sb.append("    nmDocumento: ").append(toIndentedString(nmDocumento)).append("\n");
    sb.append("    cdUsuUltimaAlteracao: ").append(toIndentedString(cdUsuUltimaAlteracao)).append("\n");
    sb.append("    nmUsuUltimaAlteracao: ").append(toIndentedString(nmUsuUltimaAlteracao)).append("\n");
    sb.append("    nuProcesso: ").append(toIndentedString(nuProcesso)).append("\n");
    sb.append("    cdForo: ").append(toIndentedString(cdForo)).append("\n");
    sb.append("    nmForo: ").append(toIndentedString(nmForo)).append("\n");
    sb.append("    cdCartorio: ").append(toIndentedString(cdCartorio)).append("\n");
    sb.append("    nmCartorio: ").append(toIndentedString(nmCartorio)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


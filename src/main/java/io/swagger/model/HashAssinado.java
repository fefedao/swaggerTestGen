package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * HashAssinado
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-08T19:27:32.512Z")

public class HashAssinado   {
  @JsonProperty("cpfUsuario")
  private Long cpfUsuario = null;

  @JsonProperty("cdDocumento")
  private Long cdDocumento = null;

  @JsonProperty("hashAssinado")
  private String hashAssinado = null;

  public HashAssinado cpfUsuario(Long cpfUsuario) {
    this.cpfUsuario = cpfUsuario;
    return this;
  }

   /**
   * Get cpfUsuario
   * @return cpfUsuario
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getCpfUsuario() {
    return cpfUsuario;
  }

  public void setCpfUsuario(Long cpfUsuario) {
    this.cpfUsuario = cpfUsuario;
  }

  public HashAssinado cdDocumento(Long cdDocumento) {
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

  public HashAssinado hashAssinado(String hashAssinado) {
    this.hashAssinado = hashAssinado;
    return this;
  }

   /**
   * Get hashAssinado
   * @return hashAssinado
  **/
  @ApiModelProperty(required = true, value = "")
  public String getHashAssinado() {
    return hashAssinado;
  }

  public void setHashAssinado(String hashAssinado) {
    this.hashAssinado = hashAssinado;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HashAssinado hashAssinado = (HashAssinado) o;
    return Objects.equals(this.cpfUsuario, hashAssinado.cpfUsuario) &&
        Objects.equals(this.cdDocumento, hashAssinado.cdDocumento) &&
        Objects.equals(this.hashAssinado, hashAssinado.hashAssinado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpfUsuario, cdDocumento, hashAssinado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HashAssinado {\n");
    
    sb.append("    cpfUsuario: ").append(toIndentedString(cpfUsuario)).append("\n");
    sb.append("    cdDocumento: ").append(toIndentedString(cdDocumento)).append("\n");
    sb.append("    hashAssinado: ").append(toIndentedString(hashAssinado)).append("\n");
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


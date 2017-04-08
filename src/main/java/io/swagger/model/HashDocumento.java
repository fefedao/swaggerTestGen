package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * HashDocumento
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-08T19:27:32.512Z")

public class HashDocumento   {
  @JsonProperty("cdDocumento")
  private Long cdDocumento = null;

  @JsonProperty("hashDocumento")
  private String hashDocumento = null;

  public HashDocumento cdDocumento(Long cdDocumento) {
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

  public HashDocumento hashDocumento(String hashDocumento) {
    this.hashDocumento = hashDocumento;
    return this;
  }

   /**
   * Get hashDocumento
   * @return hashDocumento
  **/
  @ApiModelProperty(required = true, value = "")
  public String getHashDocumento() {
    return hashDocumento;
  }

  public void setHashDocumento(String hashDocumento) {
    this.hashDocumento = hashDocumento;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HashDocumento hashDocumento = (HashDocumento) o;
    return Objects.equals(this.cdDocumento, hashDocumento.cdDocumento) &&
        Objects.equals(this.hashDocumento, hashDocumento.hashDocumento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cdDocumento, hashDocumento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HashDocumento {\n");
    
    sb.append("    cdDocumento: ").append(toIndentedString(cdDocumento)).append("\n");
    sb.append("    hashDocumento: ").append(toIndentedString(hashDocumento)).append("\n");
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


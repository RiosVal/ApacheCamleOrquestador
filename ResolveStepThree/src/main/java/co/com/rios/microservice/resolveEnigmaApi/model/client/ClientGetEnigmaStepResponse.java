package co.com.rios.microservice.resolveEnigmaApi.model.client;

import java.util.Objects;
import co.com.rios.microservice.resolveEnigmaApi.model.Header;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetEnigmaStepResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-10T15:24:27.886-05:00[America/Bogota]")
public class ClientGetEnigmaStepResponse   {
  @JsonProperty("header")
  private Header header = null;

  @JsonProperty("answer")
  private String answer = null;

  public ClientGetEnigmaStepResponse header(Header header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public Header getHeader() {
    return header;
  }

  public void setHeader(Header header) {
    this.header = header;
  }

  public ClientGetEnigmaStepResponse answer(String answer) {
    this.answer = answer;
    return this;
  }

  /**
   * Get answer
   * @return answer
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientGetEnigmaStepResponse getEnigmaStepResponse = (ClientGetEnigmaStepResponse) o;
    return Objects.equals(this.header, getEnigmaStepResponse.header) &&
        Objects.equals(this.answer, getEnigmaStepResponse.answer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, answer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEnigmaStepResponse {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
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

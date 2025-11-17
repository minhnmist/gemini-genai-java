package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DeleteModelResponse extends DeleteModelResponse {

  private final Optional<HttpResponse> sdkHttpResponse;

  private AutoValue_DeleteModelResponse(
      Optional<HttpResponse> sdkHttpResponse) {
    this.sdkHttpResponse = sdkHttpResponse;
  }

  @JsonProperty("sdkHttpResponse")
  @Override
  public Optional<HttpResponse> sdkHttpResponse() {
    return sdkHttpResponse;
  }

  @Override
  public String toString() {
    return "DeleteModelResponse{"
        + "sdkHttpResponse=" + sdkHttpResponse
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DeleteModelResponse) {
      DeleteModelResponse that = (DeleteModelResponse) o;
      return this.sdkHttpResponse.equals(that.sdkHttpResponse());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= sdkHttpResponse.hashCode();
    return h$;
  }

  @Override
  public DeleteModelResponse.Builder toBuilder() {
    return new AutoValue_DeleteModelResponse.Builder(this);
  }

  static final class Builder extends DeleteModelResponse.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    Builder() {
    }
    Builder(DeleteModelResponse source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
    }
    @Override
    public DeleteModelResponse.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    DeleteModelResponse.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public DeleteModelResponse build() {
      return new AutoValue_DeleteModelResponse(
          this.sdkHttpResponse);
    }
  }

}

package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CreateFileResponse extends CreateFileResponse {

  private final Optional<HttpResponse> sdkHttpResponse;

  private AutoValue_CreateFileResponse(
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
    return "CreateFileResponse{"
        + "sdkHttpResponse=" + sdkHttpResponse
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateFileResponse) {
      CreateFileResponse that = (CreateFileResponse) o;
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
  public CreateFileResponse.Builder toBuilder() {
    return new AutoValue_CreateFileResponse.Builder(this);
  }

  static final class Builder extends CreateFileResponse.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    Builder() {
    }
    Builder(CreateFileResponse source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
    }
    @Override
    public CreateFileResponse.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    CreateFileResponse.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public CreateFileResponse build() {
      return new AutoValue_CreateFileResponse(
          this.sdkHttpResponse);
    }
  }

}

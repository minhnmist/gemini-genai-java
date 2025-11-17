package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DeleteFileResponse extends DeleteFileResponse {

  private final Optional<HttpResponse> sdkHttpResponse;

  private AutoValue_DeleteFileResponse(
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
    return "DeleteFileResponse{"
        + "sdkHttpResponse=" + sdkHttpResponse
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DeleteFileResponse) {
      DeleteFileResponse that = (DeleteFileResponse) o;
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
  public DeleteFileResponse.Builder toBuilder() {
    return new AutoValue_DeleteFileResponse.Builder(this);
  }

  static final class Builder extends DeleteFileResponse.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    Builder() {
    }
    Builder(DeleteFileResponse source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
    }
    @Override
    public DeleteFileResponse.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    DeleteFileResponse.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public DeleteFileResponse build() {
      return new AutoValue_DeleteFileResponse(
          this.sdkHttpResponse);
    }
  }

}

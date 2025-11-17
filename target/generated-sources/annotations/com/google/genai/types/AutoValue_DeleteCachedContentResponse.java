package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DeleteCachedContentResponse extends DeleteCachedContentResponse {

  private final Optional<HttpResponse> sdkHttpResponse;

  private AutoValue_DeleteCachedContentResponse(
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
    return "DeleteCachedContentResponse{"
        + "sdkHttpResponse=" + sdkHttpResponse
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DeleteCachedContentResponse) {
      DeleteCachedContentResponse that = (DeleteCachedContentResponse) o;
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
  public DeleteCachedContentResponse.Builder toBuilder() {
    return new AutoValue_DeleteCachedContentResponse.Builder(this);
  }

  static final class Builder extends DeleteCachedContentResponse.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    Builder() {
    }
    Builder(DeleteCachedContentResponse source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
    }
    @Override
    public DeleteCachedContentResponse.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    DeleteCachedContentResponse.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public DeleteCachedContentResponse build() {
      return new AutoValue_DeleteCachedContentResponse(
          this.sdkHttpResponse);
    }
  }

}

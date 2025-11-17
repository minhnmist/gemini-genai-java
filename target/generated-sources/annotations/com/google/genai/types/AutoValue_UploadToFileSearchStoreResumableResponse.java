package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_UploadToFileSearchStoreResumableResponse extends UploadToFileSearchStoreResumableResponse {

  private final Optional<HttpResponse> sdkHttpResponse;

  private AutoValue_UploadToFileSearchStoreResumableResponse(
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
    return "UploadToFileSearchStoreResumableResponse{"
        + "sdkHttpResponse=" + sdkHttpResponse
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UploadToFileSearchStoreResumableResponse) {
      UploadToFileSearchStoreResumableResponse that = (UploadToFileSearchStoreResumableResponse) o;
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
  public UploadToFileSearchStoreResumableResponse.Builder toBuilder() {
    return new AutoValue_UploadToFileSearchStoreResumableResponse.Builder(this);
  }

  static final class Builder extends UploadToFileSearchStoreResumableResponse.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    Builder() {
    }
    Builder(UploadToFileSearchStoreResumableResponse source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
    }
    @Override
    public UploadToFileSearchStoreResumableResponse.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    UploadToFileSearchStoreResumableResponse.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public UploadToFileSearchStoreResumableResponse build() {
      return new AutoValue_UploadToFileSearchStoreResumableResponse(
          this.sdkHttpResponse);
    }
  }

}

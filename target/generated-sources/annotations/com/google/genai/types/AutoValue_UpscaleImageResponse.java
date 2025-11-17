package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_UpscaleImageResponse extends UpscaleImageResponse {

  private final Optional<HttpResponse> sdkHttpResponse;

  private final Optional<List<GeneratedImage>> generatedImages;

  private AutoValue_UpscaleImageResponse(
      Optional<HttpResponse> sdkHttpResponse,
      Optional<List<GeneratedImage>> generatedImages) {
    this.sdkHttpResponse = sdkHttpResponse;
    this.generatedImages = generatedImages;
  }

  @JsonProperty("sdkHttpResponse")
  @Override
  public Optional<HttpResponse> sdkHttpResponse() {
    return sdkHttpResponse;
  }

  @JsonProperty("generatedImages")
  @Override
  public Optional<List<GeneratedImage>> generatedImages() {
    return generatedImages;
  }

  @Override
  public String toString() {
    return "UpscaleImageResponse{"
        + "sdkHttpResponse=" + sdkHttpResponse + ", "
        + "generatedImages=" + generatedImages
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UpscaleImageResponse) {
      UpscaleImageResponse that = (UpscaleImageResponse) o;
      return this.sdkHttpResponse.equals(that.sdkHttpResponse())
          && this.generatedImages.equals(that.generatedImages());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= sdkHttpResponse.hashCode();
    h$ *= 1000003;
    h$ ^= generatedImages.hashCode();
    return h$;
  }

  @Override
  public UpscaleImageResponse.Builder toBuilder() {
    return new AutoValue_UpscaleImageResponse.Builder(this);
  }

  static final class Builder extends UpscaleImageResponse.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    private Optional<List<GeneratedImage>> generatedImages = Optional.empty();
    Builder() {
    }
    Builder(UpscaleImageResponse source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
      this.generatedImages = source.generatedImages();
    }
    @Override
    public UpscaleImageResponse.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    UpscaleImageResponse.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public UpscaleImageResponse.Builder generatedImages(List<GeneratedImage> generatedImages) {
      this.generatedImages = Optional.of(generatedImages);
      return this;
    }
    @Override
    UpscaleImageResponse.Builder generatedImages(Optional<List<GeneratedImage>> generatedImages) {
      if (generatedImages == null) {
        throw new NullPointerException("Null generatedImages");
      }
      this.generatedImages = generatedImages;
      return this;
    }
    @Override
    public UpscaleImageResponse build() {
      return new AutoValue_UpscaleImageResponse(
          this.sdkHttpResponse,
          this.generatedImages);
    }
  }

}

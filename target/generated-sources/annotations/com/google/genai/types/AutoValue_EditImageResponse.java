package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_EditImageResponse extends EditImageResponse {

  private final Optional<HttpResponse> sdkHttpResponse;

  private final Optional<List<GeneratedImage>> generatedImages;

  private AutoValue_EditImageResponse(
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
    return "EditImageResponse{"
        + "sdkHttpResponse=" + sdkHttpResponse + ", "
        + "generatedImages=" + generatedImages
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof EditImageResponse) {
      EditImageResponse that = (EditImageResponse) o;
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
  public EditImageResponse.Builder toBuilder() {
    return new AutoValue_EditImageResponse.Builder(this);
  }

  static final class Builder extends EditImageResponse.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    private Optional<List<GeneratedImage>> generatedImages = Optional.empty();
    Builder() {
    }
    Builder(EditImageResponse source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
      this.generatedImages = source.generatedImages();
    }
    @Override
    public EditImageResponse.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    EditImageResponse.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public EditImageResponse.Builder generatedImages(List<GeneratedImage> generatedImages) {
      this.generatedImages = Optional.of(generatedImages);
      return this;
    }
    @Override
    EditImageResponse.Builder generatedImages(Optional<List<GeneratedImage>> generatedImages) {
      if (generatedImages == null) {
        throw new NullPointerException("Null generatedImages");
      }
      this.generatedImages = generatedImages;
      return this;
    }
    @Override
    public EditImageResponse build() {
      return new AutoValue_EditImageResponse(
          this.sdkHttpResponse,
          this.generatedImages);
    }
  }

}

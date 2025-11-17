package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.jspecify.annotations.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GenerateImagesResponse extends GenerateImagesResponse {

  private final Optional<HttpResponse> sdkHttpResponse;

  private final Optional<List<GeneratedImage>> generatedImages;

  private final Optional<SafetyAttributes> positivePromptSafetyAttributes;

  private AutoValue_GenerateImagesResponse(
      Optional<HttpResponse> sdkHttpResponse,
      Optional<List<GeneratedImage>> generatedImages,
      Optional<SafetyAttributes> positivePromptSafetyAttributes) {
    this.sdkHttpResponse = sdkHttpResponse;
    this.generatedImages = generatedImages;
    this.positivePromptSafetyAttributes = positivePromptSafetyAttributes;
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

  @JsonProperty("positivePromptSafetyAttributes")
  @Override
  public Optional<SafetyAttributes> positivePromptSafetyAttributes() {
    return positivePromptSafetyAttributes;
  }

  @Override
  public String toString() {
    return "GenerateImagesResponse{"
        + "sdkHttpResponse=" + sdkHttpResponse + ", "
        + "generatedImages=" + generatedImages + ", "
        + "positivePromptSafetyAttributes=" + positivePromptSafetyAttributes
        + "}";
  }

  @Override
  public boolean equals(@Nullable Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GenerateImagesResponse) {
      GenerateImagesResponse that = (GenerateImagesResponse) o;
      return this.sdkHttpResponse.equals(that.sdkHttpResponse())
          && this.generatedImages.equals(that.generatedImages())
          && this.positivePromptSafetyAttributes.equals(that.positivePromptSafetyAttributes());
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
    h$ *= 1000003;
    h$ ^= positivePromptSafetyAttributes.hashCode();
    return h$;
  }

  @Override
  public GenerateImagesResponse.Builder toBuilder() {
    return new AutoValue_GenerateImagesResponse.Builder(this);
  }

  static final class Builder extends GenerateImagesResponse.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    private Optional<List<GeneratedImage>> generatedImages = Optional.empty();
    private Optional<SafetyAttributes> positivePromptSafetyAttributes = Optional.empty();
    Builder() {
    }
    Builder(GenerateImagesResponse source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
      this.generatedImages = source.generatedImages();
      this.positivePromptSafetyAttributes = source.positivePromptSafetyAttributes();
    }
    @Override
    public GenerateImagesResponse.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    GenerateImagesResponse.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public GenerateImagesResponse.Builder generatedImages(List<GeneratedImage> generatedImages) {
      this.generatedImages = Optional.of(generatedImages);
      return this;
    }
    @Override
    GenerateImagesResponse.Builder generatedImages(Optional<List<GeneratedImage>> generatedImages) {
      if (generatedImages == null) {
        throw new NullPointerException("Null generatedImages");
      }
      this.generatedImages = generatedImages;
      return this;
    }
    @Override
    public GenerateImagesResponse.Builder positivePromptSafetyAttributes(SafetyAttributes positivePromptSafetyAttributes) {
      this.positivePromptSafetyAttributes = Optional.of(positivePromptSafetyAttributes);
      return this;
    }
    @Override
    GenerateImagesResponse.Builder positivePromptSafetyAttributes(Optional<SafetyAttributes> positivePromptSafetyAttributes) {
      if (positivePromptSafetyAttributes == null) {
        throw new NullPointerException("Null positivePromptSafetyAttributes");
      }
      this.positivePromptSafetyAttributes = positivePromptSafetyAttributes;
      return this;
    }
    @Override
    public GenerateImagesResponse build() {
      return new AutoValue_GenerateImagesResponse(
          this.sdkHttpResponse,
          this.generatedImages,
          this.positivePromptSafetyAttributes);
    }
  }

}

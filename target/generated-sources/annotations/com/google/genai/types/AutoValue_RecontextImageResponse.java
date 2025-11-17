package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_RecontextImageResponse extends RecontextImageResponse {

  private final Optional<List<GeneratedImage>> generatedImages;

  private AutoValue_RecontextImageResponse(
      Optional<List<GeneratedImage>> generatedImages) {
    this.generatedImages = generatedImages;
  }

  @JsonProperty("generatedImages")
  @Override
  public Optional<List<GeneratedImage>> generatedImages() {
    return generatedImages;
  }

  @Override
  public String toString() {
    return "RecontextImageResponse{"
        + "generatedImages=" + generatedImages
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RecontextImageResponse) {
      RecontextImageResponse that = (RecontextImageResponse) o;
      return this.generatedImages.equals(that.generatedImages());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= generatedImages.hashCode();
    return h$;
  }

  @Override
  public RecontextImageResponse.Builder toBuilder() {
    return new AutoValue_RecontextImageResponse.Builder(this);
  }

  static final class Builder extends RecontextImageResponse.Builder {
    private Optional<List<GeneratedImage>> generatedImages = Optional.empty();
    Builder() {
    }
    Builder(RecontextImageResponse source) {
      this.generatedImages = source.generatedImages();
    }
    @Override
    public RecontextImageResponse.Builder generatedImages(List<GeneratedImage> generatedImages) {
      this.generatedImages = Optional.of(generatedImages);
      return this;
    }
    @Override
    RecontextImageResponse.Builder generatedImages(Optional<List<GeneratedImage>> generatedImages) {
      if (generatedImages == null) {
        throw new NullPointerException("Null generatedImages");
      }
      this.generatedImages = generatedImages;
      return this;
    }
    @Override
    public RecontextImageResponse build() {
      return new AutoValue_RecontextImageResponse(
          this.generatedImages);
    }
  }

}

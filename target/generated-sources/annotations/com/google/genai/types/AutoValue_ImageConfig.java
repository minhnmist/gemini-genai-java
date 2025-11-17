package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ImageConfig extends ImageConfig {

  private final Optional<String> aspectRatio;

  private final Optional<String> imageSize;

  private AutoValue_ImageConfig(
      Optional<String> aspectRatio,
      Optional<String> imageSize) {
    this.aspectRatio = aspectRatio;
    this.imageSize = imageSize;
  }

  @JsonProperty("aspectRatio")
  @Override
  public Optional<String> aspectRatio() {
    return aspectRatio;
  }

  @JsonProperty("imageSize")
  @Override
  public Optional<String> imageSize() {
    return imageSize;
  }

  @Override
  public String toString() {
    return "ImageConfig{"
        + "aspectRatio=" + aspectRatio + ", "
        + "imageSize=" + imageSize
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ImageConfig) {
      ImageConfig that = (ImageConfig) o;
      return this.aspectRatio.equals(that.aspectRatio())
          && this.imageSize.equals(that.imageSize());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= aspectRatio.hashCode();
    h$ *= 1000003;
    h$ ^= imageSize.hashCode();
    return h$;
  }

  @Override
  public ImageConfig.Builder toBuilder() {
    return new AutoValue_ImageConfig.Builder(this);
  }

  static final class Builder extends ImageConfig.Builder {
    private Optional<String> aspectRatio = Optional.empty();
    private Optional<String> imageSize = Optional.empty();
    Builder() {
    }
    Builder(ImageConfig source) {
      this.aspectRatio = source.aspectRatio();
      this.imageSize = source.imageSize();
    }
    @Override
    public ImageConfig.Builder aspectRatio(String aspectRatio) {
      this.aspectRatio = Optional.of(aspectRatio);
      return this;
    }
    @Override
    ImageConfig.Builder aspectRatio(Optional<String> aspectRatio) {
      if (aspectRatio == null) {
        throw new NullPointerException("Null aspectRatio");
      }
      this.aspectRatio = aspectRatio;
      return this;
    }
    @Override
    public ImageConfig.Builder imageSize(String imageSize) {
      this.imageSize = Optional.of(imageSize);
      return this;
    }
    @Override
    ImageConfig.Builder imageSize(Optional<String> imageSize) {
      if (imageSize == null) {
        throw new NullPointerException("Null imageSize");
      }
      this.imageSize = imageSize;
      return this;
    }
    @Override
    public ImageConfig build() {
      return new AutoValue_ImageConfig(
          this.aspectRatio,
          this.imageSize);
    }
  }

}

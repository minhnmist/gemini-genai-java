package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_VideoGenerationReferenceImage extends VideoGenerationReferenceImage {

  private final Optional<Image> image;

  private final Optional<VideoGenerationReferenceType> referenceType;

  private AutoValue_VideoGenerationReferenceImage(
      Optional<Image> image,
      Optional<VideoGenerationReferenceType> referenceType) {
    this.image = image;
    this.referenceType = referenceType;
  }

  @JsonProperty("image")
  @Override
  public Optional<Image> image() {
    return image;
  }

  @JsonProperty("referenceType")
  @Override
  public Optional<VideoGenerationReferenceType> referenceType() {
    return referenceType;
  }

  @Override
  public String toString() {
    return "VideoGenerationReferenceImage{"
        + "image=" + image + ", "
        + "referenceType=" + referenceType
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof VideoGenerationReferenceImage) {
      VideoGenerationReferenceImage that = (VideoGenerationReferenceImage) o;
      return this.image.equals(that.image())
          && this.referenceType.equals(that.referenceType());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= image.hashCode();
    h$ *= 1000003;
    h$ ^= referenceType.hashCode();
    return h$;
  }

  @Override
  public VideoGenerationReferenceImage.Builder toBuilder() {
    return new AutoValue_VideoGenerationReferenceImage.Builder(this);
  }

  static final class Builder extends VideoGenerationReferenceImage.Builder {
    private Optional<Image> image = Optional.empty();
    private Optional<VideoGenerationReferenceType> referenceType = Optional.empty();
    Builder() {
    }
    Builder(VideoGenerationReferenceImage source) {
      this.image = source.image();
      this.referenceType = source.referenceType();
    }
    @Override
    public VideoGenerationReferenceImage.Builder image(Image image) {
      this.image = Optional.of(image);
      return this;
    }
    @Override
    VideoGenerationReferenceImage.Builder image(Optional<Image> image) {
      if (image == null) {
        throw new NullPointerException("Null image");
      }
      this.image = image;
      return this;
    }
    @Override
    public VideoGenerationReferenceImage.Builder referenceType(VideoGenerationReferenceType referenceType) {
      this.referenceType = Optional.of(referenceType);
      return this;
    }
    @Override
    VideoGenerationReferenceImage.Builder referenceType(Optional<VideoGenerationReferenceType> referenceType) {
      if (referenceType == null) {
        throw new NullPointerException("Null referenceType");
      }
      this.referenceType = referenceType;
      return this;
    }
    @Override
    public VideoGenerationReferenceImage build() {
      return new AutoValue_VideoGenerationReferenceImage(
          this.image,
          this.referenceType);
    }
  }

}

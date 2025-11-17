package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_VideoGenerationMask extends VideoGenerationMask {

  private final Optional<Image> image;

  private final Optional<VideoGenerationMaskMode> maskMode;

  private AutoValue_VideoGenerationMask(
      Optional<Image> image,
      Optional<VideoGenerationMaskMode> maskMode) {
    this.image = image;
    this.maskMode = maskMode;
  }

  @JsonProperty("image")
  @Override
  public Optional<Image> image() {
    return image;
  }

  @JsonProperty("maskMode")
  @Override
  public Optional<VideoGenerationMaskMode> maskMode() {
    return maskMode;
  }

  @Override
  public String toString() {
    return "VideoGenerationMask{"
        + "image=" + image + ", "
        + "maskMode=" + maskMode
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof VideoGenerationMask) {
      VideoGenerationMask that = (VideoGenerationMask) o;
      return this.image.equals(that.image())
          && this.maskMode.equals(that.maskMode());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= image.hashCode();
    h$ *= 1000003;
    h$ ^= maskMode.hashCode();
    return h$;
  }

  @Override
  public VideoGenerationMask.Builder toBuilder() {
    return new AutoValue_VideoGenerationMask.Builder(this);
  }

  static final class Builder extends VideoGenerationMask.Builder {
    private Optional<Image> image = Optional.empty();
    private Optional<VideoGenerationMaskMode> maskMode = Optional.empty();
    Builder() {
    }
    Builder(VideoGenerationMask source) {
      this.image = source.image();
      this.maskMode = source.maskMode();
    }
    @Override
    public VideoGenerationMask.Builder image(Image image) {
      this.image = Optional.of(image);
      return this;
    }
    @Override
    VideoGenerationMask.Builder image(Optional<Image> image) {
      if (image == null) {
        throw new NullPointerException("Null image");
      }
      this.image = image;
      return this;
    }
    @Override
    public VideoGenerationMask.Builder maskMode(VideoGenerationMaskMode maskMode) {
      this.maskMode = Optional.of(maskMode);
      return this;
    }
    @Override
    VideoGenerationMask.Builder maskMode(Optional<VideoGenerationMaskMode> maskMode) {
      if (maskMode == null) {
        throw new NullPointerException("Null maskMode");
      }
      this.maskMode = maskMode;
      return this;
    }
    @Override
    public VideoGenerationMask build() {
      return new AutoValue_VideoGenerationMask(
          this.image,
          this.maskMode);
    }
  }

}

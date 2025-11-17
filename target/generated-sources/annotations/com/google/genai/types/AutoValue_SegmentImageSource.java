package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SegmentImageSource extends SegmentImageSource {

  private final Optional<String> prompt;

  private final Optional<Image> image;

  private final Optional<ScribbleImage> scribbleImage;

  private AutoValue_SegmentImageSource(
      Optional<String> prompt,
      Optional<Image> image,
      Optional<ScribbleImage> scribbleImage) {
    this.prompt = prompt;
    this.image = image;
    this.scribbleImage = scribbleImage;
  }

  @JsonProperty("prompt")
  @Override
  public Optional<String> prompt() {
    return prompt;
  }

  @JsonProperty("image")
  @Override
  public Optional<Image> image() {
    return image;
  }

  @JsonProperty("scribbleImage")
  @Override
  public Optional<ScribbleImage> scribbleImage() {
    return scribbleImage;
  }

  @Override
  public String toString() {
    return "SegmentImageSource{"
        + "prompt=" + prompt + ", "
        + "image=" + image + ", "
        + "scribbleImage=" + scribbleImage
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SegmentImageSource) {
      SegmentImageSource that = (SegmentImageSource) o;
      return this.prompt.equals(that.prompt())
          && this.image.equals(that.image())
          && this.scribbleImage.equals(that.scribbleImage());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= prompt.hashCode();
    h$ *= 1000003;
    h$ ^= image.hashCode();
    h$ *= 1000003;
    h$ ^= scribbleImage.hashCode();
    return h$;
  }

  @Override
  public SegmentImageSource.Builder toBuilder() {
    return new AutoValue_SegmentImageSource.Builder(this);
  }

  static final class Builder extends SegmentImageSource.Builder {
    private Optional<String> prompt = Optional.empty();
    private Optional<Image> image = Optional.empty();
    private Optional<ScribbleImage> scribbleImage = Optional.empty();
    Builder() {
    }
    Builder(SegmentImageSource source) {
      this.prompt = source.prompt();
      this.image = source.image();
      this.scribbleImage = source.scribbleImage();
    }
    @Override
    public SegmentImageSource.Builder prompt(String prompt) {
      this.prompt = Optional.of(prompt);
      return this;
    }
    @Override
    SegmentImageSource.Builder prompt(Optional<String> prompt) {
      if (prompt == null) {
        throw new NullPointerException("Null prompt");
      }
      this.prompt = prompt;
      return this;
    }
    @Override
    public SegmentImageSource.Builder image(Image image) {
      this.image = Optional.of(image);
      return this;
    }
    @Override
    SegmentImageSource.Builder image(Optional<Image> image) {
      if (image == null) {
        throw new NullPointerException("Null image");
      }
      this.image = image;
      return this;
    }
    @Override
    public SegmentImageSource.Builder scribbleImage(ScribbleImage scribbleImage) {
      this.scribbleImage = Optional.of(scribbleImage);
      return this;
    }
    @Override
    SegmentImageSource.Builder scribbleImage(Optional<ScribbleImage> scribbleImage) {
      if (scribbleImage == null) {
        throw new NullPointerException("Null scribbleImage");
      }
      this.scribbleImage = scribbleImage;
      return this;
    }
    @Override
    public SegmentImageSource build() {
      return new AutoValue_SegmentImageSource(
          this.prompt,
          this.image,
          this.scribbleImage);
    }
  }

}

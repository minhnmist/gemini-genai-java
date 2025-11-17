package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ScribbleImage extends ScribbleImage {

  private final Optional<Image> image;

  private AutoValue_ScribbleImage(
      Optional<Image> image) {
    this.image = image;
  }

  @JsonProperty("image")
  @Override
  public Optional<Image> image() {
    return image;
  }

  @Override
  public String toString() {
    return "ScribbleImage{"
        + "image=" + image
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ScribbleImage) {
      ScribbleImage that = (ScribbleImage) o;
      return this.image.equals(that.image());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= image.hashCode();
    return h$;
  }

  @Override
  public ScribbleImage.Builder toBuilder() {
    return new AutoValue_ScribbleImage.Builder(this);
  }

  static final class Builder extends ScribbleImage.Builder {
    private Optional<Image> image = Optional.empty();
    Builder() {
    }
    Builder(ScribbleImage source) {
      this.image = source.image();
    }
    @Override
    public ScribbleImage.Builder image(Image image) {
      this.image = Optional.of(image);
      return this;
    }
    @Override
    ScribbleImage.Builder image(Optional<Image> image) {
      if (image == null) {
        throw new NullPointerException("Null image");
      }
      this.image = image;
      return this;
    }
    @Override
    public ScribbleImage build() {
      return new AutoValue_ScribbleImage(
          this.image);
    }
  }

}

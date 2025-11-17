package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GeneratedImage extends GeneratedImage {

  private final Optional<Image> image;

  private final Optional<String> raiFilteredReason;

  private final Optional<SafetyAttributes> safetyAttributes;

  private final Optional<String> enhancedPrompt;

  private AutoValue_GeneratedImage(
      Optional<Image> image,
      Optional<String> raiFilteredReason,
      Optional<SafetyAttributes> safetyAttributes,
      Optional<String> enhancedPrompt) {
    this.image = image;
    this.raiFilteredReason = raiFilteredReason;
    this.safetyAttributes = safetyAttributes;
    this.enhancedPrompt = enhancedPrompt;
  }

  @JsonProperty("image")
  @Override
  public Optional<Image> image() {
    return image;
  }

  @JsonProperty("raiFilteredReason")
  @Override
  public Optional<String> raiFilteredReason() {
    return raiFilteredReason;
  }

  @JsonProperty("safetyAttributes")
  @Override
  public Optional<SafetyAttributes> safetyAttributes() {
    return safetyAttributes;
  }

  @JsonProperty("enhancedPrompt")
  @Override
  public Optional<String> enhancedPrompt() {
    return enhancedPrompt;
  }

  @Override
  public String toString() {
    return "GeneratedImage{"
        + "image=" + image + ", "
        + "raiFilteredReason=" + raiFilteredReason + ", "
        + "safetyAttributes=" + safetyAttributes + ", "
        + "enhancedPrompt=" + enhancedPrompt
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GeneratedImage) {
      GeneratedImage that = (GeneratedImage) o;
      return this.image.equals(that.image())
          && this.raiFilteredReason.equals(that.raiFilteredReason())
          && this.safetyAttributes.equals(that.safetyAttributes())
          && this.enhancedPrompt.equals(that.enhancedPrompt());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= image.hashCode();
    h$ *= 1000003;
    h$ ^= raiFilteredReason.hashCode();
    h$ *= 1000003;
    h$ ^= safetyAttributes.hashCode();
    h$ *= 1000003;
    h$ ^= enhancedPrompt.hashCode();
    return h$;
  }

  @Override
  public GeneratedImage.Builder toBuilder() {
    return new AutoValue_GeneratedImage.Builder(this);
  }

  static final class Builder extends GeneratedImage.Builder {
    private Optional<Image> image = Optional.empty();
    private Optional<String> raiFilteredReason = Optional.empty();
    private Optional<SafetyAttributes> safetyAttributes = Optional.empty();
    private Optional<String> enhancedPrompt = Optional.empty();
    Builder() {
    }
    Builder(GeneratedImage source) {
      this.image = source.image();
      this.raiFilteredReason = source.raiFilteredReason();
      this.safetyAttributes = source.safetyAttributes();
      this.enhancedPrompt = source.enhancedPrompt();
    }
    @Override
    public GeneratedImage.Builder image(Image image) {
      this.image = Optional.of(image);
      return this;
    }
    @Override
    GeneratedImage.Builder image(Optional<Image> image) {
      if (image == null) {
        throw new NullPointerException("Null image");
      }
      this.image = image;
      return this;
    }
    @Override
    public GeneratedImage.Builder raiFilteredReason(String raiFilteredReason) {
      this.raiFilteredReason = Optional.of(raiFilteredReason);
      return this;
    }
    @Override
    GeneratedImage.Builder raiFilteredReason(Optional<String> raiFilteredReason) {
      if (raiFilteredReason == null) {
        throw new NullPointerException("Null raiFilteredReason");
      }
      this.raiFilteredReason = raiFilteredReason;
      return this;
    }
    @Override
    public GeneratedImage.Builder safetyAttributes(SafetyAttributes safetyAttributes) {
      this.safetyAttributes = Optional.of(safetyAttributes);
      return this;
    }
    @Override
    GeneratedImage.Builder safetyAttributes(Optional<SafetyAttributes> safetyAttributes) {
      if (safetyAttributes == null) {
        throw new NullPointerException("Null safetyAttributes");
      }
      this.safetyAttributes = safetyAttributes;
      return this;
    }
    @Override
    public GeneratedImage.Builder enhancedPrompt(String enhancedPrompt) {
      this.enhancedPrompt = Optional.of(enhancedPrompt);
      return this;
    }
    @Override
    GeneratedImage.Builder enhancedPrompt(Optional<String> enhancedPrompt) {
      if (enhancedPrompt == null) {
        throw new NullPointerException("Null enhancedPrompt");
      }
      this.enhancedPrompt = enhancedPrompt;
      return this;
    }
    @Override
    public GeneratedImage build() {
      return new AutoValue_GeneratedImage(
          this.image,
          this.raiFilteredReason,
          this.safetyAttributes,
          this.enhancedPrompt);
    }
  }

}

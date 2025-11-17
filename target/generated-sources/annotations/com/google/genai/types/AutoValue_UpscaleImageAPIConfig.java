package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_UpscaleImageAPIConfig extends UpscaleImageAPIConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<String> outputGcsUri;

  private final Optional<SafetyFilterLevel> safetyFilterLevel;

  private final Optional<PersonGeneration> personGeneration;

  private final Optional<Boolean> includeRaiReason;

  private final Optional<String> outputMimeType;

  private final Optional<Integer> outputCompressionQuality;

  private final Optional<Boolean> enhanceInputImage;

  private final Optional<Float> imagePreservationFactor;

  private final Optional<Map<String, String>> labels;

  private final Optional<Integer> numberOfImages;

  private final Optional<String> mode;

  private AutoValue_UpscaleImageAPIConfig(
      Optional<HttpOptions> httpOptions,
      Optional<String> outputGcsUri,
      Optional<SafetyFilterLevel> safetyFilterLevel,
      Optional<PersonGeneration> personGeneration,
      Optional<Boolean> includeRaiReason,
      Optional<String> outputMimeType,
      Optional<Integer> outputCompressionQuality,
      Optional<Boolean> enhanceInputImage,
      Optional<Float> imagePreservationFactor,
      Optional<Map<String, String>> labels,
      Optional<Integer> numberOfImages,
      Optional<String> mode) {
    this.httpOptions = httpOptions;
    this.outputGcsUri = outputGcsUri;
    this.safetyFilterLevel = safetyFilterLevel;
    this.personGeneration = personGeneration;
    this.includeRaiReason = includeRaiReason;
    this.outputMimeType = outputMimeType;
    this.outputCompressionQuality = outputCompressionQuality;
    this.enhanceInputImage = enhanceInputImage;
    this.imagePreservationFactor = imagePreservationFactor;
    this.labels = labels;
    this.numberOfImages = numberOfImages;
    this.mode = mode;
  }

  @JsonProperty("httpOptions")
  @Override
  public Optional<HttpOptions> httpOptions() {
    return httpOptions;
  }

  @JsonProperty("outputGcsUri")
  @Override
  public Optional<String> outputGcsUri() {
    return outputGcsUri;
  }

  @JsonProperty("safetyFilterLevel")
  @Override
  public Optional<SafetyFilterLevel> safetyFilterLevel() {
    return safetyFilterLevel;
  }

  @JsonProperty("personGeneration")
  @Override
  public Optional<PersonGeneration> personGeneration() {
    return personGeneration;
  }

  @JsonProperty("includeRaiReason")
  @Override
  public Optional<Boolean> includeRaiReason() {
    return includeRaiReason;
  }

  @JsonProperty("outputMimeType")
  @Override
  public Optional<String> outputMimeType() {
    return outputMimeType;
  }

  @JsonProperty("outputCompressionQuality")
  @Override
  public Optional<Integer> outputCompressionQuality() {
    return outputCompressionQuality;
  }

  @JsonProperty("enhanceInputImage")
  @Override
  public Optional<Boolean> enhanceInputImage() {
    return enhanceInputImage;
  }

  @JsonProperty("imagePreservationFactor")
  @Override
  public Optional<Float> imagePreservationFactor() {
    return imagePreservationFactor;
  }

  @JsonProperty("labels")
  @Override
  public Optional<Map<String, String>> labels() {
    return labels;
  }

  @JsonProperty("numberOfImages")
  @Override
  public Optional<Integer> numberOfImages() {
    return numberOfImages;
  }

  @JsonProperty("mode")
  @Override
  public Optional<String> mode() {
    return mode;
  }

  @Override
  public String toString() {
    return "UpscaleImageAPIConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "outputGcsUri=" + outputGcsUri + ", "
        + "safetyFilterLevel=" + safetyFilterLevel + ", "
        + "personGeneration=" + personGeneration + ", "
        + "includeRaiReason=" + includeRaiReason + ", "
        + "outputMimeType=" + outputMimeType + ", "
        + "outputCompressionQuality=" + outputCompressionQuality + ", "
        + "enhanceInputImage=" + enhanceInputImage + ", "
        + "imagePreservationFactor=" + imagePreservationFactor + ", "
        + "labels=" + labels + ", "
        + "numberOfImages=" + numberOfImages + ", "
        + "mode=" + mode
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UpscaleImageAPIConfig) {
      UpscaleImageAPIConfig that = (UpscaleImageAPIConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.outputGcsUri.equals(that.outputGcsUri())
          && this.safetyFilterLevel.equals(that.safetyFilterLevel())
          && this.personGeneration.equals(that.personGeneration())
          && this.includeRaiReason.equals(that.includeRaiReason())
          && this.outputMimeType.equals(that.outputMimeType())
          && this.outputCompressionQuality.equals(that.outputCompressionQuality())
          && this.enhanceInputImage.equals(that.enhanceInputImage())
          && this.imagePreservationFactor.equals(that.imagePreservationFactor())
          && this.labels.equals(that.labels())
          && this.numberOfImages.equals(that.numberOfImages())
          && this.mode.equals(that.mode());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= httpOptions.hashCode();
    h$ *= 1000003;
    h$ ^= outputGcsUri.hashCode();
    h$ *= 1000003;
    h$ ^= safetyFilterLevel.hashCode();
    h$ *= 1000003;
    h$ ^= personGeneration.hashCode();
    h$ *= 1000003;
    h$ ^= includeRaiReason.hashCode();
    h$ *= 1000003;
    h$ ^= outputMimeType.hashCode();
    h$ *= 1000003;
    h$ ^= outputCompressionQuality.hashCode();
    h$ *= 1000003;
    h$ ^= enhanceInputImage.hashCode();
    h$ *= 1000003;
    h$ ^= imagePreservationFactor.hashCode();
    h$ *= 1000003;
    h$ ^= labels.hashCode();
    h$ *= 1000003;
    h$ ^= numberOfImages.hashCode();
    h$ *= 1000003;
    h$ ^= mode.hashCode();
    return h$;
  }

  @Override
  public UpscaleImageAPIConfig.Builder toBuilder() {
    return new AutoValue_UpscaleImageAPIConfig.Builder(this);
  }

  static final class Builder extends UpscaleImageAPIConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<String> outputGcsUri = Optional.empty();
    private Optional<SafetyFilterLevel> safetyFilterLevel = Optional.empty();
    private Optional<PersonGeneration> personGeneration = Optional.empty();
    private Optional<Boolean> includeRaiReason = Optional.empty();
    private Optional<String> outputMimeType = Optional.empty();
    private Optional<Integer> outputCompressionQuality = Optional.empty();
    private Optional<Boolean> enhanceInputImage = Optional.empty();
    private Optional<Float> imagePreservationFactor = Optional.empty();
    private Optional<Map<String, String>> labels = Optional.empty();
    private Optional<Integer> numberOfImages = Optional.empty();
    private Optional<String> mode = Optional.empty();
    Builder() {
    }
    Builder(UpscaleImageAPIConfig source) {
      this.httpOptions = source.httpOptions();
      this.outputGcsUri = source.outputGcsUri();
      this.safetyFilterLevel = source.safetyFilterLevel();
      this.personGeneration = source.personGeneration();
      this.includeRaiReason = source.includeRaiReason();
      this.outputMimeType = source.outputMimeType();
      this.outputCompressionQuality = source.outputCompressionQuality();
      this.enhanceInputImage = source.enhanceInputImage();
      this.imagePreservationFactor = source.imagePreservationFactor();
      this.labels = source.labels();
      this.numberOfImages = source.numberOfImages();
      this.mode = source.mode();
    }
    @Override
    public UpscaleImageAPIConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    UpscaleImageAPIConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public UpscaleImageAPIConfig.Builder outputGcsUri(String outputGcsUri) {
      this.outputGcsUri = Optional.of(outputGcsUri);
      return this;
    }
    @Override
    UpscaleImageAPIConfig.Builder outputGcsUri(Optional<String> outputGcsUri) {
      if (outputGcsUri == null) {
        throw new NullPointerException("Null outputGcsUri");
      }
      this.outputGcsUri = outputGcsUri;
      return this;
    }
    @Override
    public UpscaleImageAPIConfig.Builder safetyFilterLevel(SafetyFilterLevel safetyFilterLevel) {
      this.safetyFilterLevel = Optional.of(safetyFilterLevel);
      return this;
    }
    @Override
    UpscaleImageAPIConfig.Builder safetyFilterLevel(Optional<SafetyFilterLevel> safetyFilterLevel) {
      if (safetyFilterLevel == null) {
        throw new NullPointerException("Null safetyFilterLevel");
      }
      this.safetyFilterLevel = safetyFilterLevel;
      return this;
    }
    @Override
    public UpscaleImageAPIConfig.Builder personGeneration(PersonGeneration personGeneration) {
      this.personGeneration = Optional.of(personGeneration);
      return this;
    }
    @Override
    UpscaleImageAPIConfig.Builder personGeneration(Optional<PersonGeneration> personGeneration) {
      if (personGeneration == null) {
        throw new NullPointerException("Null personGeneration");
      }
      this.personGeneration = personGeneration;
      return this;
    }
    @Override
    public UpscaleImageAPIConfig.Builder includeRaiReason(boolean includeRaiReason) {
      this.includeRaiReason = Optional.of(includeRaiReason);
      return this;
    }
    @Override
    UpscaleImageAPIConfig.Builder includeRaiReason(Optional<Boolean> includeRaiReason) {
      if (includeRaiReason == null) {
        throw new NullPointerException("Null includeRaiReason");
      }
      this.includeRaiReason = includeRaiReason;
      return this;
    }
    @Override
    public UpscaleImageAPIConfig.Builder outputMimeType(String outputMimeType) {
      this.outputMimeType = Optional.of(outputMimeType);
      return this;
    }
    @Override
    UpscaleImageAPIConfig.Builder outputMimeType(Optional<String> outputMimeType) {
      if (outputMimeType == null) {
        throw new NullPointerException("Null outputMimeType");
      }
      this.outputMimeType = outputMimeType;
      return this;
    }
    @Override
    public UpscaleImageAPIConfig.Builder outputCompressionQuality(Integer outputCompressionQuality) {
      this.outputCompressionQuality = Optional.of(outputCompressionQuality);
      return this;
    }
    @Override
    UpscaleImageAPIConfig.Builder outputCompressionQuality(Optional<Integer> outputCompressionQuality) {
      if (outputCompressionQuality == null) {
        throw new NullPointerException("Null outputCompressionQuality");
      }
      this.outputCompressionQuality = outputCompressionQuality;
      return this;
    }
    @Override
    public UpscaleImageAPIConfig.Builder enhanceInputImage(boolean enhanceInputImage) {
      this.enhanceInputImage = Optional.of(enhanceInputImage);
      return this;
    }
    @Override
    UpscaleImageAPIConfig.Builder enhanceInputImage(Optional<Boolean> enhanceInputImage) {
      if (enhanceInputImage == null) {
        throw new NullPointerException("Null enhanceInputImage");
      }
      this.enhanceInputImage = enhanceInputImage;
      return this;
    }
    @Override
    public UpscaleImageAPIConfig.Builder imagePreservationFactor(Float imagePreservationFactor) {
      this.imagePreservationFactor = Optional.of(imagePreservationFactor);
      return this;
    }
    @Override
    UpscaleImageAPIConfig.Builder imagePreservationFactor(Optional<Float> imagePreservationFactor) {
      if (imagePreservationFactor == null) {
        throw new NullPointerException("Null imagePreservationFactor");
      }
      this.imagePreservationFactor = imagePreservationFactor;
      return this;
    }
    @Override
    public UpscaleImageAPIConfig.Builder labels(Map<String, String> labels) {
      this.labels = Optional.of(labels);
      return this;
    }
    @Override
    UpscaleImageAPIConfig.Builder labels(Optional<Map<String, String>> labels) {
      if (labels == null) {
        throw new NullPointerException("Null labels");
      }
      this.labels = labels;
      return this;
    }
    @Override
    public UpscaleImageAPIConfig.Builder numberOfImages(Integer numberOfImages) {
      this.numberOfImages = Optional.of(numberOfImages);
      return this;
    }
    @Override
    UpscaleImageAPIConfig.Builder numberOfImages(Optional<Integer> numberOfImages) {
      if (numberOfImages == null) {
        throw new NullPointerException("Null numberOfImages");
      }
      this.numberOfImages = numberOfImages;
      return this;
    }
    @Override
    public UpscaleImageAPIConfig.Builder mode(String mode) {
      this.mode = Optional.of(mode);
      return this;
    }
    @Override
    UpscaleImageAPIConfig.Builder mode(Optional<String> mode) {
      if (mode == null) {
        throw new NullPointerException("Null mode");
      }
      this.mode = mode;
      return this;
    }
    @Override
    public UpscaleImageAPIConfig build() {
      return new AutoValue_UpscaleImageAPIConfig(
          this.httpOptions,
          this.outputGcsUri,
          this.safetyFilterLevel,
          this.personGeneration,
          this.includeRaiReason,
          this.outputMimeType,
          this.outputCompressionQuality,
          this.enhanceInputImage,
          this.imagePreservationFactor,
          this.labels,
          this.numberOfImages,
          this.mode);
    }
  }

}

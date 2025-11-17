package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_UpscaleImageConfig extends UpscaleImageConfig {

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

  private AutoValue_UpscaleImageConfig(
      Optional<HttpOptions> httpOptions,
      Optional<String> outputGcsUri,
      Optional<SafetyFilterLevel> safetyFilterLevel,
      Optional<PersonGeneration> personGeneration,
      Optional<Boolean> includeRaiReason,
      Optional<String> outputMimeType,
      Optional<Integer> outputCompressionQuality,
      Optional<Boolean> enhanceInputImage,
      Optional<Float> imagePreservationFactor,
      Optional<Map<String, String>> labels) {
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

  @Override
  public String toString() {
    return "UpscaleImageConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "outputGcsUri=" + outputGcsUri + ", "
        + "safetyFilterLevel=" + safetyFilterLevel + ", "
        + "personGeneration=" + personGeneration + ", "
        + "includeRaiReason=" + includeRaiReason + ", "
        + "outputMimeType=" + outputMimeType + ", "
        + "outputCompressionQuality=" + outputCompressionQuality + ", "
        + "enhanceInputImage=" + enhanceInputImage + ", "
        + "imagePreservationFactor=" + imagePreservationFactor + ", "
        + "labels=" + labels
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UpscaleImageConfig) {
      UpscaleImageConfig that = (UpscaleImageConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.outputGcsUri.equals(that.outputGcsUri())
          && this.safetyFilterLevel.equals(that.safetyFilterLevel())
          && this.personGeneration.equals(that.personGeneration())
          && this.includeRaiReason.equals(that.includeRaiReason())
          && this.outputMimeType.equals(that.outputMimeType())
          && this.outputCompressionQuality.equals(that.outputCompressionQuality())
          && this.enhanceInputImage.equals(that.enhanceInputImage())
          && this.imagePreservationFactor.equals(that.imagePreservationFactor())
          && this.labels.equals(that.labels());
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
    return h$;
  }

  @Override
  public UpscaleImageConfig.Builder toBuilder() {
    return new AutoValue_UpscaleImageConfig.Builder(this);
  }

  static final class Builder extends UpscaleImageConfig.Builder {
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
    Builder() {
    }
    Builder(UpscaleImageConfig source) {
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
    }
    @Override
    public UpscaleImageConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    UpscaleImageConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public UpscaleImageConfig.Builder outputGcsUri(String outputGcsUri) {
      this.outputGcsUri = Optional.of(outputGcsUri);
      return this;
    }
    @Override
    UpscaleImageConfig.Builder outputGcsUri(Optional<String> outputGcsUri) {
      if (outputGcsUri == null) {
        throw new NullPointerException("Null outputGcsUri");
      }
      this.outputGcsUri = outputGcsUri;
      return this;
    }
    @Override
    public UpscaleImageConfig.Builder safetyFilterLevel(SafetyFilterLevel safetyFilterLevel) {
      this.safetyFilterLevel = Optional.of(safetyFilterLevel);
      return this;
    }
    @Override
    UpscaleImageConfig.Builder safetyFilterLevel(Optional<SafetyFilterLevel> safetyFilterLevel) {
      if (safetyFilterLevel == null) {
        throw new NullPointerException("Null safetyFilterLevel");
      }
      this.safetyFilterLevel = safetyFilterLevel;
      return this;
    }
    @Override
    public UpscaleImageConfig.Builder personGeneration(PersonGeneration personGeneration) {
      this.personGeneration = Optional.of(personGeneration);
      return this;
    }
    @Override
    UpscaleImageConfig.Builder personGeneration(Optional<PersonGeneration> personGeneration) {
      if (personGeneration == null) {
        throw new NullPointerException("Null personGeneration");
      }
      this.personGeneration = personGeneration;
      return this;
    }
    @Override
    public UpscaleImageConfig.Builder includeRaiReason(boolean includeRaiReason) {
      this.includeRaiReason = Optional.of(includeRaiReason);
      return this;
    }
    @Override
    UpscaleImageConfig.Builder includeRaiReason(Optional<Boolean> includeRaiReason) {
      if (includeRaiReason == null) {
        throw new NullPointerException("Null includeRaiReason");
      }
      this.includeRaiReason = includeRaiReason;
      return this;
    }
    @Override
    public UpscaleImageConfig.Builder outputMimeType(String outputMimeType) {
      this.outputMimeType = Optional.of(outputMimeType);
      return this;
    }
    @Override
    UpscaleImageConfig.Builder outputMimeType(Optional<String> outputMimeType) {
      if (outputMimeType == null) {
        throw new NullPointerException("Null outputMimeType");
      }
      this.outputMimeType = outputMimeType;
      return this;
    }
    @Override
    public UpscaleImageConfig.Builder outputCompressionQuality(Integer outputCompressionQuality) {
      this.outputCompressionQuality = Optional.of(outputCompressionQuality);
      return this;
    }
    @Override
    UpscaleImageConfig.Builder outputCompressionQuality(Optional<Integer> outputCompressionQuality) {
      if (outputCompressionQuality == null) {
        throw new NullPointerException("Null outputCompressionQuality");
      }
      this.outputCompressionQuality = outputCompressionQuality;
      return this;
    }
    @Override
    public UpscaleImageConfig.Builder enhanceInputImage(boolean enhanceInputImage) {
      this.enhanceInputImage = Optional.of(enhanceInputImage);
      return this;
    }
    @Override
    UpscaleImageConfig.Builder enhanceInputImage(Optional<Boolean> enhanceInputImage) {
      if (enhanceInputImage == null) {
        throw new NullPointerException("Null enhanceInputImage");
      }
      this.enhanceInputImage = enhanceInputImage;
      return this;
    }
    @Override
    public UpscaleImageConfig.Builder imagePreservationFactor(Float imagePreservationFactor) {
      this.imagePreservationFactor = Optional.of(imagePreservationFactor);
      return this;
    }
    @Override
    UpscaleImageConfig.Builder imagePreservationFactor(Optional<Float> imagePreservationFactor) {
      if (imagePreservationFactor == null) {
        throw new NullPointerException("Null imagePreservationFactor");
      }
      this.imagePreservationFactor = imagePreservationFactor;
      return this;
    }
    @Override
    public UpscaleImageConfig.Builder labels(Map<String, String> labels) {
      this.labels = Optional.of(labels);
      return this;
    }
    @Override
    UpscaleImageConfig.Builder labels(Optional<Map<String, String>> labels) {
      if (labels == null) {
        throw new NullPointerException("Null labels");
      }
      this.labels = labels;
      return this;
    }
    @Override
    public UpscaleImageConfig build() {
      return new AutoValue_UpscaleImageConfig(
          this.httpOptions,
          this.outputGcsUri,
          this.safetyFilterLevel,
          this.personGeneration,
          this.includeRaiReason,
          this.outputMimeType,
          this.outputCompressionQuality,
          this.enhanceInputImage,
          this.imagePreservationFactor,
          this.labels);
    }
  }

}

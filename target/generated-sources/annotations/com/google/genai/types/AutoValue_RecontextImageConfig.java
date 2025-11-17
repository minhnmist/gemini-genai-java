package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_RecontextImageConfig extends RecontextImageConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<Integer> numberOfImages;

  private final Optional<Integer> baseSteps;

  private final Optional<String> outputGcsUri;

  private final Optional<Integer> seed;

  private final Optional<SafetyFilterLevel> safetyFilterLevel;

  private final Optional<PersonGeneration> personGeneration;

  private final Optional<Boolean> addWatermark;

  private final Optional<String> outputMimeType;

  private final Optional<Integer> outputCompressionQuality;

  private final Optional<Boolean> enhancePrompt;

  private final Optional<Map<String, String>> labels;

  private AutoValue_RecontextImageConfig(
      Optional<HttpOptions> httpOptions,
      Optional<Integer> numberOfImages,
      Optional<Integer> baseSteps,
      Optional<String> outputGcsUri,
      Optional<Integer> seed,
      Optional<SafetyFilterLevel> safetyFilterLevel,
      Optional<PersonGeneration> personGeneration,
      Optional<Boolean> addWatermark,
      Optional<String> outputMimeType,
      Optional<Integer> outputCompressionQuality,
      Optional<Boolean> enhancePrompt,
      Optional<Map<String, String>> labels) {
    this.httpOptions = httpOptions;
    this.numberOfImages = numberOfImages;
    this.baseSteps = baseSteps;
    this.outputGcsUri = outputGcsUri;
    this.seed = seed;
    this.safetyFilterLevel = safetyFilterLevel;
    this.personGeneration = personGeneration;
    this.addWatermark = addWatermark;
    this.outputMimeType = outputMimeType;
    this.outputCompressionQuality = outputCompressionQuality;
    this.enhancePrompt = enhancePrompt;
    this.labels = labels;
  }

  @JsonProperty("httpOptions")
  @Override
  public Optional<HttpOptions> httpOptions() {
    return httpOptions;
  }

  @JsonProperty("numberOfImages")
  @Override
  public Optional<Integer> numberOfImages() {
    return numberOfImages;
  }

  @JsonProperty("baseSteps")
  @Override
  public Optional<Integer> baseSteps() {
    return baseSteps;
  }

  @JsonProperty("outputGcsUri")
  @Override
  public Optional<String> outputGcsUri() {
    return outputGcsUri;
  }

  @JsonProperty("seed")
  @Override
  public Optional<Integer> seed() {
    return seed;
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

  @JsonProperty("addWatermark")
  @Override
  public Optional<Boolean> addWatermark() {
    return addWatermark;
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

  @JsonProperty("enhancePrompt")
  @Override
  public Optional<Boolean> enhancePrompt() {
    return enhancePrompt;
  }

  @JsonProperty("labels")
  @Override
  public Optional<Map<String, String>> labels() {
    return labels;
  }

  @Override
  public String toString() {
    return "RecontextImageConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "numberOfImages=" + numberOfImages + ", "
        + "baseSteps=" + baseSteps + ", "
        + "outputGcsUri=" + outputGcsUri + ", "
        + "seed=" + seed + ", "
        + "safetyFilterLevel=" + safetyFilterLevel + ", "
        + "personGeneration=" + personGeneration + ", "
        + "addWatermark=" + addWatermark + ", "
        + "outputMimeType=" + outputMimeType + ", "
        + "outputCompressionQuality=" + outputCompressionQuality + ", "
        + "enhancePrompt=" + enhancePrompt + ", "
        + "labels=" + labels
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RecontextImageConfig) {
      RecontextImageConfig that = (RecontextImageConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.numberOfImages.equals(that.numberOfImages())
          && this.baseSteps.equals(that.baseSteps())
          && this.outputGcsUri.equals(that.outputGcsUri())
          && this.seed.equals(that.seed())
          && this.safetyFilterLevel.equals(that.safetyFilterLevel())
          && this.personGeneration.equals(that.personGeneration())
          && this.addWatermark.equals(that.addWatermark())
          && this.outputMimeType.equals(that.outputMimeType())
          && this.outputCompressionQuality.equals(that.outputCompressionQuality())
          && this.enhancePrompt.equals(that.enhancePrompt())
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
    h$ ^= numberOfImages.hashCode();
    h$ *= 1000003;
    h$ ^= baseSteps.hashCode();
    h$ *= 1000003;
    h$ ^= outputGcsUri.hashCode();
    h$ *= 1000003;
    h$ ^= seed.hashCode();
    h$ *= 1000003;
    h$ ^= safetyFilterLevel.hashCode();
    h$ *= 1000003;
    h$ ^= personGeneration.hashCode();
    h$ *= 1000003;
    h$ ^= addWatermark.hashCode();
    h$ *= 1000003;
    h$ ^= outputMimeType.hashCode();
    h$ *= 1000003;
    h$ ^= outputCompressionQuality.hashCode();
    h$ *= 1000003;
    h$ ^= enhancePrompt.hashCode();
    h$ *= 1000003;
    h$ ^= labels.hashCode();
    return h$;
  }

  @Override
  public RecontextImageConfig.Builder toBuilder() {
    return new AutoValue_RecontextImageConfig.Builder(this);
  }

  static final class Builder extends RecontextImageConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<Integer> numberOfImages = Optional.empty();
    private Optional<Integer> baseSteps = Optional.empty();
    private Optional<String> outputGcsUri = Optional.empty();
    private Optional<Integer> seed = Optional.empty();
    private Optional<SafetyFilterLevel> safetyFilterLevel = Optional.empty();
    private Optional<PersonGeneration> personGeneration = Optional.empty();
    private Optional<Boolean> addWatermark = Optional.empty();
    private Optional<String> outputMimeType = Optional.empty();
    private Optional<Integer> outputCompressionQuality = Optional.empty();
    private Optional<Boolean> enhancePrompt = Optional.empty();
    private Optional<Map<String, String>> labels = Optional.empty();
    Builder() {
    }
    Builder(RecontextImageConfig source) {
      this.httpOptions = source.httpOptions();
      this.numberOfImages = source.numberOfImages();
      this.baseSteps = source.baseSteps();
      this.outputGcsUri = source.outputGcsUri();
      this.seed = source.seed();
      this.safetyFilterLevel = source.safetyFilterLevel();
      this.personGeneration = source.personGeneration();
      this.addWatermark = source.addWatermark();
      this.outputMimeType = source.outputMimeType();
      this.outputCompressionQuality = source.outputCompressionQuality();
      this.enhancePrompt = source.enhancePrompt();
      this.labels = source.labels();
    }
    @Override
    public RecontextImageConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    RecontextImageConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public RecontextImageConfig.Builder numberOfImages(Integer numberOfImages) {
      this.numberOfImages = Optional.of(numberOfImages);
      return this;
    }
    @Override
    RecontextImageConfig.Builder numberOfImages(Optional<Integer> numberOfImages) {
      if (numberOfImages == null) {
        throw new NullPointerException("Null numberOfImages");
      }
      this.numberOfImages = numberOfImages;
      return this;
    }
    @Override
    public RecontextImageConfig.Builder baseSteps(Integer baseSteps) {
      this.baseSteps = Optional.of(baseSteps);
      return this;
    }
    @Override
    RecontextImageConfig.Builder baseSteps(Optional<Integer> baseSteps) {
      if (baseSteps == null) {
        throw new NullPointerException("Null baseSteps");
      }
      this.baseSteps = baseSteps;
      return this;
    }
    @Override
    public RecontextImageConfig.Builder outputGcsUri(String outputGcsUri) {
      this.outputGcsUri = Optional.of(outputGcsUri);
      return this;
    }
    @Override
    RecontextImageConfig.Builder outputGcsUri(Optional<String> outputGcsUri) {
      if (outputGcsUri == null) {
        throw new NullPointerException("Null outputGcsUri");
      }
      this.outputGcsUri = outputGcsUri;
      return this;
    }
    @Override
    public RecontextImageConfig.Builder seed(Integer seed) {
      this.seed = Optional.of(seed);
      return this;
    }
    @Override
    RecontextImageConfig.Builder seed(Optional<Integer> seed) {
      if (seed == null) {
        throw new NullPointerException("Null seed");
      }
      this.seed = seed;
      return this;
    }
    @Override
    public RecontextImageConfig.Builder safetyFilterLevel(SafetyFilterLevel safetyFilterLevel) {
      this.safetyFilterLevel = Optional.of(safetyFilterLevel);
      return this;
    }
    @Override
    RecontextImageConfig.Builder safetyFilterLevel(Optional<SafetyFilterLevel> safetyFilterLevel) {
      if (safetyFilterLevel == null) {
        throw new NullPointerException("Null safetyFilterLevel");
      }
      this.safetyFilterLevel = safetyFilterLevel;
      return this;
    }
    @Override
    public RecontextImageConfig.Builder personGeneration(PersonGeneration personGeneration) {
      this.personGeneration = Optional.of(personGeneration);
      return this;
    }
    @Override
    RecontextImageConfig.Builder personGeneration(Optional<PersonGeneration> personGeneration) {
      if (personGeneration == null) {
        throw new NullPointerException("Null personGeneration");
      }
      this.personGeneration = personGeneration;
      return this;
    }
    @Override
    public RecontextImageConfig.Builder addWatermark(boolean addWatermark) {
      this.addWatermark = Optional.of(addWatermark);
      return this;
    }
    @Override
    RecontextImageConfig.Builder addWatermark(Optional<Boolean> addWatermark) {
      if (addWatermark == null) {
        throw new NullPointerException("Null addWatermark");
      }
      this.addWatermark = addWatermark;
      return this;
    }
    @Override
    public RecontextImageConfig.Builder outputMimeType(String outputMimeType) {
      this.outputMimeType = Optional.of(outputMimeType);
      return this;
    }
    @Override
    RecontextImageConfig.Builder outputMimeType(Optional<String> outputMimeType) {
      if (outputMimeType == null) {
        throw new NullPointerException("Null outputMimeType");
      }
      this.outputMimeType = outputMimeType;
      return this;
    }
    @Override
    public RecontextImageConfig.Builder outputCompressionQuality(Integer outputCompressionQuality) {
      this.outputCompressionQuality = Optional.of(outputCompressionQuality);
      return this;
    }
    @Override
    RecontextImageConfig.Builder outputCompressionQuality(Optional<Integer> outputCompressionQuality) {
      if (outputCompressionQuality == null) {
        throw new NullPointerException("Null outputCompressionQuality");
      }
      this.outputCompressionQuality = outputCompressionQuality;
      return this;
    }
    @Override
    public RecontextImageConfig.Builder enhancePrompt(boolean enhancePrompt) {
      this.enhancePrompt = Optional.of(enhancePrompt);
      return this;
    }
    @Override
    RecontextImageConfig.Builder enhancePrompt(Optional<Boolean> enhancePrompt) {
      if (enhancePrompt == null) {
        throw new NullPointerException("Null enhancePrompt");
      }
      this.enhancePrompt = enhancePrompt;
      return this;
    }
    @Override
    public RecontextImageConfig.Builder labels(Map<String, String> labels) {
      this.labels = Optional.of(labels);
      return this;
    }
    @Override
    RecontextImageConfig.Builder labels(Optional<Map<String, String>> labels) {
      if (labels == null) {
        throw new NullPointerException("Null labels");
      }
      this.labels = labels;
      return this;
    }
    @Override
    public RecontextImageConfig build() {
      return new AutoValue_RecontextImageConfig(
          this.httpOptions,
          this.numberOfImages,
          this.baseSteps,
          this.outputGcsUri,
          this.seed,
          this.safetyFilterLevel,
          this.personGeneration,
          this.addWatermark,
          this.outputMimeType,
          this.outputCompressionQuality,
          this.enhancePrompt,
          this.labels);
    }
  }

}

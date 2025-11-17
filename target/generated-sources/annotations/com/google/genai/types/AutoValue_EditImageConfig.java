package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_EditImageConfig extends EditImageConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<String> outputGcsUri;

  private final Optional<String> negativePrompt;

  private final Optional<Integer> numberOfImages;

  private final Optional<String> aspectRatio;

  private final Optional<Float> guidanceScale;

  private final Optional<Integer> seed;

  private final Optional<SafetyFilterLevel> safetyFilterLevel;

  private final Optional<PersonGeneration> personGeneration;

  private final Optional<Boolean> includeSafetyAttributes;

  private final Optional<Boolean> includeRaiReason;

  private final Optional<ImagePromptLanguage> language;

  private final Optional<String> outputMimeType;

  private final Optional<Integer> outputCompressionQuality;

  private final Optional<Boolean> addWatermark;

  private final Optional<Map<String, String>> labels;

  private final Optional<EditMode> editMode;

  private final Optional<Integer> baseSteps;

  private AutoValue_EditImageConfig(
      Optional<HttpOptions> httpOptions,
      Optional<String> outputGcsUri,
      Optional<String> negativePrompt,
      Optional<Integer> numberOfImages,
      Optional<String> aspectRatio,
      Optional<Float> guidanceScale,
      Optional<Integer> seed,
      Optional<SafetyFilterLevel> safetyFilterLevel,
      Optional<PersonGeneration> personGeneration,
      Optional<Boolean> includeSafetyAttributes,
      Optional<Boolean> includeRaiReason,
      Optional<ImagePromptLanguage> language,
      Optional<String> outputMimeType,
      Optional<Integer> outputCompressionQuality,
      Optional<Boolean> addWatermark,
      Optional<Map<String, String>> labels,
      Optional<EditMode> editMode,
      Optional<Integer> baseSteps) {
    this.httpOptions = httpOptions;
    this.outputGcsUri = outputGcsUri;
    this.negativePrompt = negativePrompt;
    this.numberOfImages = numberOfImages;
    this.aspectRatio = aspectRatio;
    this.guidanceScale = guidanceScale;
    this.seed = seed;
    this.safetyFilterLevel = safetyFilterLevel;
    this.personGeneration = personGeneration;
    this.includeSafetyAttributes = includeSafetyAttributes;
    this.includeRaiReason = includeRaiReason;
    this.language = language;
    this.outputMimeType = outputMimeType;
    this.outputCompressionQuality = outputCompressionQuality;
    this.addWatermark = addWatermark;
    this.labels = labels;
    this.editMode = editMode;
    this.baseSteps = baseSteps;
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

  @JsonProperty("negativePrompt")
  @Override
  public Optional<String> negativePrompt() {
    return negativePrompt;
  }

  @JsonProperty("numberOfImages")
  @Override
  public Optional<Integer> numberOfImages() {
    return numberOfImages;
  }

  @JsonProperty("aspectRatio")
  @Override
  public Optional<String> aspectRatio() {
    return aspectRatio;
  }

  @JsonProperty("guidanceScale")
  @Override
  public Optional<Float> guidanceScale() {
    return guidanceScale;
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

  @JsonProperty("includeSafetyAttributes")
  @Override
  public Optional<Boolean> includeSafetyAttributes() {
    return includeSafetyAttributes;
  }

  @JsonProperty("includeRaiReason")
  @Override
  public Optional<Boolean> includeRaiReason() {
    return includeRaiReason;
  }

  @JsonProperty("language")
  @Override
  public Optional<ImagePromptLanguage> language() {
    return language;
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

  @JsonProperty("addWatermark")
  @Override
  public Optional<Boolean> addWatermark() {
    return addWatermark;
  }

  @JsonProperty("labels")
  @Override
  public Optional<Map<String, String>> labels() {
    return labels;
  }

  @JsonProperty("editMode")
  @Override
  public Optional<EditMode> editMode() {
    return editMode;
  }

  @JsonProperty("baseSteps")
  @Override
  public Optional<Integer> baseSteps() {
    return baseSteps;
  }

  @Override
  public String toString() {
    return "EditImageConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "outputGcsUri=" + outputGcsUri + ", "
        + "negativePrompt=" + negativePrompt + ", "
        + "numberOfImages=" + numberOfImages + ", "
        + "aspectRatio=" + aspectRatio + ", "
        + "guidanceScale=" + guidanceScale + ", "
        + "seed=" + seed + ", "
        + "safetyFilterLevel=" + safetyFilterLevel + ", "
        + "personGeneration=" + personGeneration + ", "
        + "includeSafetyAttributes=" + includeSafetyAttributes + ", "
        + "includeRaiReason=" + includeRaiReason + ", "
        + "language=" + language + ", "
        + "outputMimeType=" + outputMimeType + ", "
        + "outputCompressionQuality=" + outputCompressionQuality + ", "
        + "addWatermark=" + addWatermark + ", "
        + "labels=" + labels + ", "
        + "editMode=" + editMode + ", "
        + "baseSteps=" + baseSteps
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof EditImageConfig) {
      EditImageConfig that = (EditImageConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.outputGcsUri.equals(that.outputGcsUri())
          && this.negativePrompt.equals(that.negativePrompt())
          && this.numberOfImages.equals(that.numberOfImages())
          && this.aspectRatio.equals(that.aspectRatio())
          && this.guidanceScale.equals(that.guidanceScale())
          && this.seed.equals(that.seed())
          && this.safetyFilterLevel.equals(that.safetyFilterLevel())
          && this.personGeneration.equals(that.personGeneration())
          && this.includeSafetyAttributes.equals(that.includeSafetyAttributes())
          && this.includeRaiReason.equals(that.includeRaiReason())
          && this.language.equals(that.language())
          && this.outputMimeType.equals(that.outputMimeType())
          && this.outputCompressionQuality.equals(that.outputCompressionQuality())
          && this.addWatermark.equals(that.addWatermark())
          && this.labels.equals(that.labels())
          && this.editMode.equals(that.editMode())
          && this.baseSteps.equals(that.baseSteps());
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
    h$ ^= negativePrompt.hashCode();
    h$ *= 1000003;
    h$ ^= numberOfImages.hashCode();
    h$ *= 1000003;
    h$ ^= aspectRatio.hashCode();
    h$ *= 1000003;
    h$ ^= guidanceScale.hashCode();
    h$ *= 1000003;
    h$ ^= seed.hashCode();
    h$ *= 1000003;
    h$ ^= safetyFilterLevel.hashCode();
    h$ *= 1000003;
    h$ ^= personGeneration.hashCode();
    h$ *= 1000003;
    h$ ^= includeSafetyAttributes.hashCode();
    h$ *= 1000003;
    h$ ^= includeRaiReason.hashCode();
    h$ *= 1000003;
    h$ ^= language.hashCode();
    h$ *= 1000003;
    h$ ^= outputMimeType.hashCode();
    h$ *= 1000003;
    h$ ^= outputCompressionQuality.hashCode();
    h$ *= 1000003;
    h$ ^= addWatermark.hashCode();
    h$ *= 1000003;
    h$ ^= labels.hashCode();
    h$ *= 1000003;
    h$ ^= editMode.hashCode();
    h$ *= 1000003;
    h$ ^= baseSteps.hashCode();
    return h$;
  }

  @Override
  public EditImageConfig.Builder toBuilder() {
    return new AutoValue_EditImageConfig.Builder(this);
  }

  static final class Builder extends EditImageConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<String> outputGcsUri = Optional.empty();
    private Optional<String> negativePrompt = Optional.empty();
    private Optional<Integer> numberOfImages = Optional.empty();
    private Optional<String> aspectRatio = Optional.empty();
    private Optional<Float> guidanceScale = Optional.empty();
    private Optional<Integer> seed = Optional.empty();
    private Optional<SafetyFilterLevel> safetyFilterLevel = Optional.empty();
    private Optional<PersonGeneration> personGeneration = Optional.empty();
    private Optional<Boolean> includeSafetyAttributes = Optional.empty();
    private Optional<Boolean> includeRaiReason = Optional.empty();
    private Optional<ImagePromptLanguage> language = Optional.empty();
    private Optional<String> outputMimeType = Optional.empty();
    private Optional<Integer> outputCompressionQuality = Optional.empty();
    private Optional<Boolean> addWatermark = Optional.empty();
    private Optional<Map<String, String>> labels = Optional.empty();
    private Optional<EditMode> editMode = Optional.empty();
    private Optional<Integer> baseSteps = Optional.empty();
    Builder() {
    }
    Builder(EditImageConfig source) {
      this.httpOptions = source.httpOptions();
      this.outputGcsUri = source.outputGcsUri();
      this.negativePrompt = source.negativePrompt();
      this.numberOfImages = source.numberOfImages();
      this.aspectRatio = source.aspectRatio();
      this.guidanceScale = source.guidanceScale();
      this.seed = source.seed();
      this.safetyFilterLevel = source.safetyFilterLevel();
      this.personGeneration = source.personGeneration();
      this.includeSafetyAttributes = source.includeSafetyAttributes();
      this.includeRaiReason = source.includeRaiReason();
      this.language = source.language();
      this.outputMimeType = source.outputMimeType();
      this.outputCompressionQuality = source.outputCompressionQuality();
      this.addWatermark = source.addWatermark();
      this.labels = source.labels();
      this.editMode = source.editMode();
      this.baseSteps = source.baseSteps();
    }
    @Override
    public EditImageConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    EditImageConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public EditImageConfig.Builder outputGcsUri(String outputGcsUri) {
      this.outputGcsUri = Optional.of(outputGcsUri);
      return this;
    }
    @Override
    EditImageConfig.Builder outputGcsUri(Optional<String> outputGcsUri) {
      if (outputGcsUri == null) {
        throw new NullPointerException("Null outputGcsUri");
      }
      this.outputGcsUri = outputGcsUri;
      return this;
    }
    @Override
    public EditImageConfig.Builder negativePrompt(String negativePrompt) {
      this.negativePrompt = Optional.of(negativePrompt);
      return this;
    }
    @Override
    EditImageConfig.Builder negativePrompt(Optional<String> negativePrompt) {
      if (negativePrompt == null) {
        throw new NullPointerException("Null negativePrompt");
      }
      this.negativePrompt = negativePrompt;
      return this;
    }
    @Override
    public EditImageConfig.Builder numberOfImages(Integer numberOfImages) {
      this.numberOfImages = Optional.of(numberOfImages);
      return this;
    }
    @Override
    EditImageConfig.Builder numberOfImages(Optional<Integer> numberOfImages) {
      if (numberOfImages == null) {
        throw new NullPointerException("Null numberOfImages");
      }
      this.numberOfImages = numberOfImages;
      return this;
    }
    @Override
    public EditImageConfig.Builder aspectRatio(String aspectRatio) {
      this.aspectRatio = Optional.of(aspectRatio);
      return this;
    }
    @Override
    EditImageConfig.Builder aspectRatio(Optional<String> aspectRatio) {
      if (aspectRatio == null) {
        throw new NullPointerException("Null aspectRatio");
      }
      this.aspectRatio = aspectRatio;
      return this;
    }
    @Override
    public EditImageConfig.Builder guidanceScale(Float guidanceScale) {
      this.guidanceScale = Optional.of(guidanceScale);
      return this;
    }
    @Override
    EditImageConfig.Builder guidanceScale(Optional<Float> guidanceScale) {
      if (guidanceScale == null) {
        throw new NullPointerException("Null guidanceScale");
      }
      this.guidanceScale = guidanceScale;
      return this;
    }
    @Override
    public EditImageConfig.Builder seed(Integer seed) {
      this.seed = Optional.of(seed);
      return this;
    }
    @Override
    EditImageConfig.Builder seed(Optional<Integer> seed) {
      if (seed == null) {
        throw new NullPointerException("Null seed");
      }
      this.seed = seed;
      return this;
    }
    @Override
    public EditImageConfig.Builder safetyFilterLevel(SafetyFilterLevel safetyFilterLevel) {
      this.safetyFilterLevel = Optional.of(safetyFilterLevel);
      return this;
    }
    @Override
    EditImageConfig.Builder safetyFilterLevel(Optional<SafetyFilterLevel> safetyFilterLevel) {
      if (safetyFilterLevel == null) {
        throw new NullPointerException("Null safetyFilterLevel");
      }
      this.safetyFilterLevel = safetyFilterLevel;
      return this;
    }
    @Override
    public EditImageConfig.Builder personGeneration(PersonGeneration personGeneration) {
      this.personGeneration = Optional.of(personGeneration);
      return this;
    }
    @Override
    EditImageConfig.Builder personGeneration(Optional<PersonGeneration> personGeneration) {
      if (personGeneration == null) {
        throw new NullPointerException("Null personGeneration");
      }
      this.personGeneration = personGeneration;
      return this;
    }
    @Override
    public EditImageConfig.Builder includeSafetyAttributes(boolean includeSafetyAttributes) {
      this.includeSafetyAttributes = Optional.of(includeSafetyAttributes);
      return this;
    }
    @Override
    EditImageConfig.Builder includeSafetyAttributes(Optional<Boolean> includeSafetyAttributes) {
      if (includeSafetyAttributes == null) {
        throw new NullPointerException("Null includeSafetyAttributes");
      }
      this.includeSafetyAttributes = includeSafetyAttributes;
      return this;
    }
    @Override
    public EditImageConfig.Builder includeRaiReason(boolean includeRaiReason) {
      this.includeRaiReason = Optional.of(includeRaiReason);
      return this;
    }
    @Override
    EditImageConfig.Builder includeRaiReason(Optional<Boolean> includeRaiReason) {
      if (includeRaiReason == null) {
        throw new NullPointerException("Null includeRaiReason");
      }
      this.includeRaiReason = includeRaiReason;
      return this;
    }
    @Override
    public EditImageConfig.Builder language(ImagePromptLanguage language) {
      this.language = Optional.of(language);
      return this;
    }
    @Override
    EditImageConfig.Builder language(Optional<ImagePromptLanguage> language) {
      if (language == null) {
        throw new NullPointerException("Null language");
      }
      this.language = language;
      return this;
    }
    @Override
    public EditImageConfig.Builder outputMimeType(String outputMimeType) {
      this.outputMimeType = Optional.of(outputMimeType);
      return this;
    }
    @Override
    EditImageConfig.Builder outputMimeType(Optional<String> outputMimeType) {
      if (outputMimeType == null) {
        throw new NullPointerException("Null outputMimeType");
      }
      this.outputMimeType = outputMimeType;
      return this;
    }
    @Override
    public EditImageConfig.Builder outputCompressionQuality(Integer outputCompressionQuality) {
      this.outputCompressionQuality = Optional.of(outputCompressionQuality);
      return this;
    }
    @Override
    EditImageConfig.Builder outputCompressionQuality(Optional<Integer> outputCompressionQuality) {
      if (outputCompressionQuality == null) {
        throw new NullPointerException("Null outputCompressionQuality");
      }
      this.outputCompressionQuality = outputCompressionQuality;
      return this;
    }
    @Override
    public EditImageConfig.Builder addWatermark(boolean addWatermark) {
      this.addWatermark = Optional.of(addWatermark);
      return this;
    }
    @Override
    EditImageConfig.Builder addWatermark(Optional<Boolean> addWatermark) {
      if (addWatermark == null) {
        throw new NullPointerException("Null addWatermark");
      }
      this.addWatermark = addWatermark;
      return this;
    }
    @Override
    public EditImageConfig.Builder labels(Map<String, String> labels) {
      this.labels = Optional.of(labels);
      return this;
    }
    @Override
    EditImageConfig.Builder labels(Optional<Map<String, String>> labels) {
      if (labels == null) {
        throw new NullPointerException("Null labels");
      }
      this.labels = labels;
      return this;
    }
    @Override
    public EditImageConfig.Builder editMode(EditMode editMode) {
      this.editMode = Optional.of(editMode);
      return this;
    }
    @Override
    EditImageConfig.Builder editMode(Optional<EditMode> editMode) {
      if (editMode == null) {
        throw new NullPointerException("Null editMode");
      }
      this.editMode = editMode;
      return this;
    }
    @Override
    public EditImageConfig.Builder baseSteps(Integer baseSteps) {
      this.baseSteps = Optional.of(baseSteps);
      return this;
    }
    @Override
    EditImageConfig.Builder baseSteps(Optional<Integer> baseSteps) {
      if (baseSteps == null) {
        throw new NullPointerException("Null baseSteps");
      }
      this.baseSteps = baseSteps;
      return this;
    }
    @Override
    public EditImageConfig build() {
      return new AutoValue_EditImageConfig(
          this.httpOptions,
          this.outputGcsUri,
          this.negativePrompt,
          this.numberOfImages,
          this.aspectRatio,
          this.guidanceScale,
          this.seed,
          this.safetyFilterLevel,
          this.personGeneration,
          this.includeSafetyAttributes,
          this.includeRaiReason,
          this.language,
          this.outputMimeType,
          this.outputCompressionQuality,
          this.addWatermark,
          this.labels,
          this.editMode,
          this.baseSteps);
    }
  }

}

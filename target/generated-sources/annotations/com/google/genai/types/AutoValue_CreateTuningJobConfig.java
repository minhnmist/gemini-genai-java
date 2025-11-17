package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CreateTuningJobConfig extends CreateTuningJobConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<TuningMethod> method;

  private final Optional<TuningValidationDataset> validationDataset;

  private final Optional<String> tunedModelDisplayName;

  private final Optional<String> description;

  private final Optional<Integer> epochCount;

  private final Optional<Float> learningRateMultiplier;

  private final Optional<Boolean> exportLastCheckpointOnly;

  private final Optional<String> preTunedModelCheckpointId;

  private final Optional<AdapterSize> adapterSize;

  private final Optional<Integer> batchSize;

  private final Optional<Float> learningRate;

  private final Optional<EvaluationConfig> evaluationConfig;

  private final Optional<Map<String, String>> labels;

  private final Optional<Float> beta;

  private AutoValue_CreateTuningJobConfig(
      Optional<HttpOptions> httpOptions,
      Optional<TuningMethod> method,
      Optional<TuningValidationDataset> validationDataset,
      Optional<String> tunedModelDisplayName,
      Optional<String> description,
      Optional<Integer> epochCount,
      Optional<Float> learningRateMultiplier,
      Optional<Boolean> exportLastCheckpointOnly,
      Optional<String> preTunedModelCheckpointId,
      Optional<AdapterSize> adapterSize,
      Optional<Integer> batchSize,
      Optional<Float> learningRate,
      Optional<EvaluationConfig> evaluationConfig,
      Optional<Map<String, String>> labels,
      Optional<Float> beta) {
    this.httpOptions = httpOptions;
    this.method = method;
    this.validationDataset = validationDataset;
    this.tunedModelDisplayName = tunedModelDisplayName;
    this.description = description;
    this.epochCount = epochCount;
    this.learningRateMultiplier = learningRateMultiplier;
    this.exportLastCheckpointOnly = exportLastCheckpointOnly;
    this.preTunedModelCheckpointId = preTunedModelCheckpointId;
    this.adapterSize = adapterSize;
    this.batchSize = batchSize;
    this.learningRate = learningRate;
    this.evaluationConfig = evaluationConfig;
    this.labels = labels;
    this.beta = beta;
  }

  @JsonProperty("httpOptions")
  @Override
  public Optional<HttpOptions> httpOptions() {
    return httpOptions;
  }

  @JsonProperty("method")
  @Override
  public Optional<TuningMethod> method() {
    return method;
  }

  @JsonProperty("validationDataset")
  @Override
  public Optional<TuningValidationDataset> validationDataset() {
    return validationDataset;
  }

  @JsonProperty("tunedModelDisplayName")
  @Override
  public Optional<String> tunedModelDisplayName() {
    return tunedModelDisplayName;
  }

  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return description;
  }

  @JsonProperty("epochCount")
  @Override
  public Optional<Integer> epochCount() {
    return epochCount;
  }

  @JsonProperty("learningRateMultiplier")
  @Override
  public Optional<Float> learningRateMultiplier() {
    return learningRateMultiplier;
  }

  @JsonProperty("exportLastCheckpointOnly")
  @Override
  public Optional<Boolean> exportLastCheckpointOnly() {
    return exportLastCheckpointOnly;
  }

  @JsonProperty("preTunedModelCheckpointId")
  @Override
  public Optional<String> preTunedModelCheckpointId() {
    return preTunedModelCheckpointId;
  }

  @JsonProperty("adapterSize")
  @Override
  public Optional<AdapterSize> adapterSize() {
    return adapterSize;
  }

  @JsonProperty("batchSize")
  @Override
  public Optional<Integer> batchSize() {
    return batchSize;
  }

  @JsonProperty("learningRate")
  @Override
  public Optional<Float> learningRate() {
    return learningRate;
  }

  @JsonProperty("evaluationConfig")
  @Override
  public Optional<EvaluationConfig> evaluationConfig() {
    return evaluationConfig;
  }

  @JsonProperty("labels")
  @Override
  public Optional<Map<String, String>> labels() {
    return labels;
  }

  @JsonProperty("beta")
  @Override
  public Optional<Float> beta() {
    return beta;
  }

  @Override
  public String toString() {
    return "CreateTuningJobConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "method=" + method + ", "
        + "validationDataset=" + validationDataset + ", "
        + "tunedModelDisplayName=" + tunedModelDisplayName + ", "
        + "description=" + description + ", "
        + "epochCount=" + epochCount + ", "
        + "learningRateMultiplier=" + learningRateMultiplier + ", "
        + "exportLastCheckpointOnly=" + exportLastCheckpointOnly + ", "
        + "preTunedModelCheckpointId=" + preTunedModelCheckpointId + ", "
        + "adapterSize=" + adapterSize + ", "
        + "batchSize=" + batchSize + ", "
        + "learningRate=" + learningRate + ", "
        + "evaluationConfig=" + evaluationConfig + ", "
        + "labels=" + labels + ", "
        + "beta=" + beta
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateTuningJobConfig) {
      CreateTuningJobConfig that = (CreateTuningJobConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.method.equals(that.method())
          && this.validationDataset.equals(that.validationDataset())
          && this.tunedModelDisplayName.equals(that.tunedModelDisplayName())
          && this.description.equals(that.description())
          && this.epochCount.equals(that.epochCount())
          && this.learningRateMultiplier.equals(that.learningRateMultiplier())
          && this.exportLastCheckpointOnly.equals(that.exportLastCheckpointOnly())
          && this.preTunedModelCheckpointId.equals(that.preTunedModelCheckpointId())
          && this.adapterSize.equals(that.adapterSize())
          && this.batchSize.equals(that.batchSize())
          && this.learningRate.equals(that.learningRate())
          && this.evaluationConfig.equals(that.evaluationConfig())
          && this.labels.equals(that.labels())
          && this.beta.equals(that.beta());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= httpOptions.hashCode();
    h$ *= 1000003;
    h$ ^= method.hashCode();
    h$ *= 1000003;
    h$ ^= validationDataset.hashCode();
    h$ *= 1000003;
    h$ ^= tunedModelDisplayName.hashCode();
    h$ *= 1000003;
    h$ ^= description.hashCode();
    h$ *= 1000003;
    h$ ^= epochCount.hashCode();
    h$ *= 1000003;
    h$ ^= learningRateMultiplier.hashCode();
    h$ *= 1000003;
    h$ ^= exportLastCheckpointOnly.hashCode();
    h$ *= 1000003;
    h$ ^= preTunedModelCheckpointId.hashCode();
    h$ *= 1000003;
    h$ ^= adapterSize.hashCode();
    h$ *= 1000003;
    h$ ^= batchSize.hashCode();
    h$ *= 1000003;
    h$ ^= learningRate.hashCode();
    h$ *= 1000003;
    h$ ^= evaluationConfig.hashCode();
    h$ *= 1000003;
    h$ ^= labels.hashCode();
    h$ *= 1000003;
    h$ ^= beta.hashCode();
    return h$;
  }

  @Override
  public CreateTuningJobConfig.Builder toBuilder() {
    return new AutoValue_CreateTuningJobConfig.Builder(this);
  }

  static final class Builder extends CreateTuningJobConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<TuningMethod> method = Optional.empty();
    private Optional<TuningValidationDataset> validationDataset = Optional.empty();
    private Optional<String> tunedModelDisplayName = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Optional<Integer> epochCount = Optional.empty();
    private Optional<Float> learningRateMultiplier = Optional.empty();
    private Optional<Boolean> exportLastCheckpointOnly = Optional.empty();
    private Optional<String> preTunedModelCheckpointId = Optional.empty();
    private Optional<AdapterSize> adapterSize = Optional.empty();
    private Optional<Integer> batchSize = Optional.empty();
    private Optional<Float> learningRate = Optional.empty();
    private Optional<EvaluationConfig> evaluationConfig = Optional.empty();
    private Optional<Map<String, String>> labels = Optional.empty();
    private Optional<Float> beta = Optional.empty();
    Builder() {
    }
    Builder(CreateTuningJobConfig source) {
      this.httpOptions = source.httpOptions();
      this.method = source.method();
      this.validationDataset = source.validationDataset();
      this.tunedModelDisplayName = source.tunedModelDisplayName();
      this.description = source.description();
      this.epochCount = source.epochCount();
      this.learningRateMultiplier = source.learningRateMultiplier();
      this.exportLastCheckpointOnly = source.exportLastCheckpointOnly();
      this.preTunedModelCheckpointId = source.preTunedModelCheckpointId();
      this.adapterSize = source.adapterSize();
      this.batchSize = source.batchSize();
      this.learningRate = source.learningRate();
      this.evaluationConfig = source.evaluationConfig();
      this.labels = source.labels();
      this.beta = source.beta();
    }
    @Override
    public CreateTuningJobConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    CreateTuningJobConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public CreateTuningJobConfig.Builder method(TuningMethod method) {
      this.method = Optional.of(method);
      return this;
    }
    @Override
    CreateTuningJobConfig.Builder method(Optional<TuningMethod> method) {
      if (method == null) {
        throw new NullPointerException("Null method");
      }
      this.method = method;
      return this;
    }
    @Override
    public CreateTuningJobConfig.Builder validationDataset(TuningValidationDataset validationDataset) {
      this.validationDataset = Optional.of(validationDataset);
      return this;
    }
    @Override
    CreateTuningJobConfig.Builder validationDataset(Optional<TuningValidationDataset> validationDataset) {
      if (validationDataset == null) {
        throw new NullPointerException("Null validationDataset");
      }
      this.validationDataset = validationDataset;
      return this;
    }
    @Override
    public CreateTuningJobConfig.Builder tunedModelDisplayName(String tunedModelDisplayName) {
      this.tunedModelDisplayName = Optional.of(tunedModelDisplayName);
      return this;
    }
    @Override
    CreateTuningJobConfig.Builder tunedModelDisplayName(Optional<String> tunedModelDisplayName) {
      if (tunedModelDisplayName == null) {
        throw new NullPointerException("Null tunedModelDisplayName");
      }
      this.tunedModelDisplayName = tunedModelDisplayName;
      return this;
    }
    @Override
    public CreateTuningJobConfig.Builder description(String description) {
      this.description = Optional.of(description);
      return this;
    }
    @Override
    CreateTuningJobConfig.Builder description(Optional<String> description) {
      if (description == null) {
        throw new NullPointerException("Null description");
      }
      this.description = description;
      return this;
    }
    @Override
    public CreateTuningJobConfig.Builder epochCount(Integer epochCount) {
      this.epochCount = Optional.of(epochCount);
      return this;
    }
    @Override
    CreateTuningJobConfig.Builder epochCount(Optional<Integer> epochCount) {
      if (epochCount == null) {
        throw new NullPointerException("Null epochCount");
      }
      this.epochCount = epochCount;
      return this;
    }
    @Override
    public CreateTuningJobConfig.Builder learningRateMultiplier(Float learningRateMultiplier) {
      this.learningRateMultiplier = Optional.of(learningRateMultiplier);
      return this;
    }
    @Override
    CreateTuningJobConfig.Builder learningRateMultiplier(Optional<Float> learningRateMultiplier) {
      if (learningRateMultiplier == null) {
        throw new NullPointerException("Null learningRateMultiplier");
      }
      this.learningRateMultiplier = learningRateMultiplier;
      return this;
    }
    @Override
    public CreateTuningJobConfig.Builder exportLastCheckpointOnly(boolean exportLastCheckpointOnly) {
      this.exportLastCheckpointOnly = Optional.of(exportLastCheckpointOnly);
      return this;
    }
    @Override
    CreateTuningJobConfig.Builder exportLastCheckpointOnly(Optional<Boolean> exportLastCheckpointOnly) {
      if (exportLastCheckpointOnly == null) {
        throw new NullPointerException("Null exportLastCheckpointOnly");
      }
      this.exportLastCheckpointOnly = exportLastCheckpointOnly;
      return this;
    }
    @Override
    public CreateTuningJobConfig.Builder preTunedModelCheckpointId(String preTunedModelCheckpointId) {
      this.preTunedModelCheckpointId = Optional.of(preTunedModelCheckpointId);
      return this;
    }
    @Override
    CreateTuningJobConfig.Builder preTunedModelCheckpointId(Optional<String> preTunedModelCheckpointId) {
      if (preTunedModelCheckpointId == null) {
        throw new NullPointerException("Null preTunedModelCheckpointId");
      }
      this.preTunedModelCheckpointId = preTunedModelCheckpointId;
      return this;
    }
    @Override
    public CreateTuningJobConfig.Builder adapterSize(AdapterSize adapterSize) {
      this.adapterSize = Optional.of(adapterSize);
      return this;
    }
    @Override
    CreateTuningJobConfig.Builder adapterSize(Optional<AdapterSize> adapterSize) {
      if (adapterSize == null) {
        throw new NullPointerException("Null adapterSize");
      }
      this.adapterSize = adapterSize;
      return this;
    }
    @Override
    public CreateTuningJobConfig.Builder batchSize(Integer batchSize) {
      this.batchSize = Optional.of(batchSize);
      return this;
    }
    @Override
    CreateTuningJobConfig.Builder batchSize(Optional<Integer> batchSize) {
      if (batchSize == null) {
        throw new NullPointerException("Null batchSize");
      }
      this.batchSize = batchSize;
      return this;
    }
    @Override
    public CreateTuningJobConfig.Builder learningRate(Float learningRate) {
      this.learningRate = Optional.of(learningRate);
      return this;
    }
    @Override
    CreateTuningJobConfig.Builder learningRate(Optional<Float> learningRate) {
      if (learningRate == null) {
        throw new NullPointerException("Null learningRate");
      }
      this.learningRate = learningRate;
      return this;
    }
    @Override
    public CreateTuningJobConfig.Builder evaluationConfig(EvaluationConfig evaluationConfig) {
      this.evaluationConfig = Optional.of(evaluationConfig);
      return this;
    }
    @Override
    CreateTuningJobConfig.Builder evaluationConfig(Optional<EvaluationConfig> evaluationConfig) {
      if (evaluationConfig == null) {
        throw new NullPointerException("Null evaluationConfig");
      }
      this.evaluationConfig = evaluationConfig;
      return this;
    }
    @Override
    public CreateTuningJobConfig.Builder labels(Map<String, String> labels) {
      this.labels = Optional.of(labels);
      return this;
    }
    @Override
    CreateTuningJobConfig.Builder labels(Optional<Map<String, String>> labels) {
      if (labels == null) {
        throw new NullPointerException("Null labels");
      }
      this.labels = labels;
      return this;
    }
    @Override
    public CreateTuningJobConfig.Builder beta(Float beta) {
      this.beta = Optional.of(beta);
      return this;
    }
    @Override
    CreateTuningJobConfig.Builder beta(Optional<Float> beta) {
      if (beta == null) {
        throw new NullPointerException("Null beta");
      }
      this.beta = beta;
      return this;
    }
    @Override
    public CreateTuningJobConfig build() {
      return new AutoValue_CreateTuningJobConfig(
          this.httpOptions,
          this.method,
          this.validationDataset,
          this.tunedModelDisplayName,
          this.description,
          this.epochCount,
          this.learningRateMultiplier,
          this.exportLastCheckpointOnly,
          this.preTunedModelCheckpointId,
          this.adapterSize,
          this.batchSize,
          this.learningRate,
          this.evaluationConfig,
          this.labels,
          this.beta);
    }
  }

}

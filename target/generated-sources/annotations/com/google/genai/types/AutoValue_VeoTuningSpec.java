package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_VeoTuningSpec extends VeoTuningSpec {

  private final Optional<VeoHyperParameters> hyperParameters;

  private final Optional<String> trainingDatasetUri;

  private final Optional<String> validationDatasetUri;

  private AutoValue_VeoTuningSpec(
      Optional<VeoHyperParameters> hyperParameters,
      Optional<String> trainingDatasetUri,
      Optional<String> validationDatasetUri) {
    this.hyperParameters = hyperParameters;
    this.trainingDatasetUri = trainingDatasetUri;
    this.validationDatasetUri = validationDatasetUri;
  }

  @JsonProperty("hyperParameters")
  @Override
  public Optional<VeoHyperParameters> hyperParameters() {
    return hyperParameters;
  }

  @JsonProperty("trainingDatasetUri")
  @Override
  public Optional<String> trainingDatasetUri() {
    return trainingDatasetUri;
  }

  @JsonProperty("validationDatasetUri")
  @Override
  public Optional<String> validationDatasetUri() {
    return validationDatasetUri;
  }

  @Override
  public String toString() {
    return "VeoTuningSpec{"
        + "hyperParameters=" + hyperParameters + ", "
        + "trainingDatasetUri=" + trainingDatasetUri + ", "
        + "validationDatasetUri=" + validationDatasetUri
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof VeoTuningSpec) {
      VeoTuningSpec that = (VeoTuningSpec) o;
      return this.hyperParameters.equals(that.hyperParameters())
          && this.trainingDatasetUri.equals(that.trainingDatasetUri())
          && this.validationDatasetUri.equals(that.validationDatasetUri());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= hyperParameters.hashCode();
    h$ *= 1000003;
    h$ ^= trainingDatasetUri.hashCode();
    h$ *= 1000003;
    h$ ^= validationDatasetUri.hashCode();
    return h$;
  }

  @Override
  public VeoTuningSpec.Builder toBuilder() {
    return new AutoValue_VeoTuningSpec.Builder(this);
  }

  static final class Builder extends VeoTuningSpec.Builder {
    private Optional<VeoHyperParameters> hyperParameters = Optional.empty();
    private Optional<String> trainingDatasetUri = Optional.empty();
    private Optional<String> validationDatasetUri = Optional.empty();
    Builder() {
    }
    Builder(VeoTuningSpec source) {
      this.hyperParameters = source.hyperParameters();
      this.trainingDatasetUri = source.trainingDatasetUri();
      this.validationDatasetUri = source.validationDatasetUri();
    }
    @Override
    public VeoTuningSpec.Builder hyperParameters(VeoHyperParameters hyperParameters) {
      this.hyperParameters = Optional.of(hyperParameters);
      return this;
    }
    @Override
    VeoTuningSpec.Builder hyperParameters(Optional<VeoHyperParameters> hyperParameters) {
      if (hyperParameters == null) {
        throw new NullPointerException("Null hyperParameters");
      }
      this.hyperParameters = hyperParameters;
      return this;
    }
    @Override
    public VeoTuningSpec.Builder trainingDatasetUri(String trainingDatasetUri) {
      this.trainingDatasetUri = Optional.of(trainingDatasetUri);
      return this;
    }
    @Override
    VeoTuningSpec.Builder trainingDatasetUri(Optional<String> trainingDatasetUri) {
      if (trainingDatasetUri == null) {
        throw new NullPointerException("Null trainingDatasetUri");
      }
      this.trainingDatasetUri = trainingDatasetUri;
      return this;
    }
    @Override
    public VeoTuningSpec.Builder validationDatasetUri(String validationDatasetUri) {
      this.validationDatasetUri = Optional.of(validationDatasetUri);
      return this;
    }
    @Override
    VeoTuningSpec.Builder validationDatasetUri(Optional<String> validationDatasetUri) {
      if (validationDatasetUri == null) {
        throw new NullPointerException("Null validationDatasetUri");
      }
      this.validationDatasetUri = validationDatasetUri;
      return this;
    }
    @Override
    public VeoTuningSpec build() {
      return new AutoValue_VeoTuningSpec(
          this.hyperParameters,
          this.trainingDatasetUri,
          this.validationDatasetUri);
    }
  }

}

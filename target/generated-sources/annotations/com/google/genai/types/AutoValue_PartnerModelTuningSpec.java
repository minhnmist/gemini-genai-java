package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_PartnerModelTuningSpec extends PartnerModelTuningSpec {

  private final Optional<Map<String, Object>> hyperParameters;

  private final Optional<String> trainingDatasetUri;

  private final Optional<String> validationDatasetUri;

  private AutoValue_PartnerModelTuningSpec(
      Optional<Map<String, Object>> hyperParameters,
      Optional<String> trainingDatasetUri,
      Optional<String> validationDatasetUri) {
    this.hyperParameters = hyperParameters;
    this.trainingDatasetUri = trainingDatasetUri;
    this.validationDatasetUri = validationDatasetUri;
  }

  @JsonProperty("hyperParameters")
  @Override
  public Optional<Map<String, Object>> hyperParameters() {
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
    return "PartnerModelTuningSpec{"
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
    if (o instanceof PartnerModelTuningSpec) {
      PartnerModelTuningSpec that = (PartnerModelTuningSpec) o;
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
  public PartnerModelTuningSpec.Builder toBuilder() {
    return new AutoValue_PartnerModelTuningSpec.Builder(this);
  }

  static final class Builder extends PartnerModelTuningSpec.Builder {
    private Optional<Map<String, Object>> hyperParameters = Optional.empty();
    private Optional<String> trainingDatasetUri = Optional.empty();
    private Optional<String> validationDatasetUri = Optional.empty();
    Builder() {
    }
    Builder(PartnerModelTuningSpec source) {
      this.hyperParameters = source.hyperParameters();
      this.trainingDatasetUri = source.trainingDatasetUri();
      this.validationDatasetUri = source.validationDatasetUri();
    }
    @Override
    public PartnerModelTuningSpec.Builder hyperParameters(Map<String, Object> hyperParameters) {
      this.hyperParameters = Optional.of(hyperParameters);
      return this;
    }
    @Override
    PartnerModelTuningSpec.Builder hyperParameters(Optional<Map<String, Object>> hyperParameters) {
      if (hyperParameters == null) {
        throw new NullPointerException("Null hyperParameters");
      }
      this.hyperParameters = hyperParameters;
      return this;
    }
    @Override
    public PartnerModelTuningSpec.Builder trainingDatasetUri(String trainingDatasetUri) {
      this.trainingDatasetUri = Optional.of(trainingDatasetUri);
      return this;
    }
    @Override
    PartnerModelTuningSpec.Builder trainingDatasetUri(Optional<String> trainingDatasetUri) {
      if (trainingDatasetUri == null) {
        throw new NullPointerException("Null trainingDatasetUri");
      }
      this.trainingDatasetUri = trainingDatasetUri;
      return this;
    }
    @Override
    public PartnerModelTuningSpec.Builder validationDatasetUri(String validationDatasetUri) {
      this.validationDatasetUri = Optional.of(validationDatasetUri);
      return this;
    }
    @Override
    PartnerModelTuningSpec.Builder validationDatasetUri(Optional<String> validationDatasetUri) {
      if (validationDatasetUri == null) {
        throw new NullPointerException("Null validationDatasetUri");
      }
      this.validationDatasetUri = validationDatasetUri;
      return this;
    }
    @Override
    public PartnerModelTuningSpec build() {
      return new AutoValue_PartnerModelTuningSpec(
          this.hyperParameters,
          this.trainingDatasetUri,
          this.validationDatasetUri);
    }
  }

}

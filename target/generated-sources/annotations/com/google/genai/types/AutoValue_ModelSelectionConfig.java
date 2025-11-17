package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ModelSelectionConfig extends ModelSelectionConfig {

  private final Optional<FeatureSelectionPreference> featureSelectionPreference;

  private AutoValue_ModelSelectionConfig(
      Optional<FeatureSelectionPreference> featureSelectionPreference) {
    this.featureSelectionPreference = featureSelectionPreference;
  }

  @JsonProperty("featureSelectionPreference")
  @Override
  public Optional<FeatureSelectionPreference> featureSelectionPreference() {
    return featureSelectionPreference;
  }

  @Override
  public String toString() {
    return "ModelSelectionConfig{"
        + "featureSelectionPreference=" + featureSelectionPreference
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ModelSelectionConfig) {
      ModelSelectionConfig that = (ModelSelectionConfig) o;
      return this.featureSelectionPreference.equals(that.featureSelectionPreference());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= featureSelectionPreference.hashCode();
    return h$;
  }

  @Override
  public ModelSelectionConfig.Builder toBuilder() {
    return new AutoValue_ModelSelectionConfig.Builder(this);
  }

  static final class Builder extends ModelSelectionConfig.Builder {
    private Optional<FeatureSelectionPreference> featureSelectionPreference = Optional.empty();
    Builder() {
    }
    Builder(ModelSelectionConfig source) {
      this.featureSelectionPreference = source.featureSelectionPreference();
    }
    @Override
    public ModelSelectionConfig.Builder featureSelectionPreference(FeatureSelectionPreference featureSelectionPreference) {
      this.featureSelectionPreference = Optional.of(featureSelectionPreference);
      return this;
    }
    @Override
    ModelSelectionConfig.Builder featureSelectionPreference(Optional<FeatureSelectionPreference> featureSelectionPreference) {
      if (featureSelectionPreference == null) {
        throw new NullPointerException("Null featureSelectionPreference");
      }
      this.featureSelectionPreference = featureSelectionPreference;
      return this;
    }
    @Override
    public ModelSelectionConfig build() {
      return new AutoValue_ModelSelectionConfig(
          this.featureSelectionPreference);
    }
  }

}

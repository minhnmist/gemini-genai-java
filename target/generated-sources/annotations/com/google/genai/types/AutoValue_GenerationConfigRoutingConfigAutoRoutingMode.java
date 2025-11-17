package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GenerationConfigRoutingConfigAutoRoutingMode extends GenerationConfigRoutingConfigAutoRoutingMode {

  private final Optional<ModelRoutingPreference> modelRoutingPreference;

  private AutoValue_GenerationConfigRoutingConfigAutoRoutingMode(
      Optional<ModelRoutingPreference> modelRoutingPreference) {
    this.modelRoutingPreference = modelRoutingPreference;
  }

  @JsonProperty("modelRoutingPreference")
  @Override
  public Optional<ModelRoutingPreference> modelRoutingPreference() {
    return modelRoutingPreference;
  }

  @Override
  public String toString() {
    return "GenerationConfigRoutingConfigAutoRoutingMode{"
        + "modelRoutingPreference=" + modelRoutingPreference
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GenerationConfigRoutingConfigAutoRoutingMode) {
      GenerationConfigRoutingConfigAutoRoutingMode that = (GenerationConfigRoutingConfigAutoRoutingMode) o;
      return this.modelRoutingPreference.equals(that.modelRoutingPreference());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= modelRoutingPreference.hashCode();
    return h$;
  }

  @Override
  public GenerationConfigRoutingConfigAutoRoutingMode.Builder toBuilder() {
    return new AutoValue_GenerationConfigRoutingConfigAutoRoutingMode.Builder(this);
  }

  static final class Builder extends GenerationConfigRoutingConfigAutoRoutingMode.Builder {
    private Optional<ModelRoutingPreference> modelRoutingPreference = Optional.empty();
    Builder() {
    }
    Builder(GenerationConfigRoutingConfigAutoRoutingMode source) {
      this.modelRoutingPreference = source.modelRoutingPreference();
    }
    @Override
    public GenerationConfigRoutingConfigAutoRoutingMode.Builder modelRoutingPreference(ModelRoutingPreference modelRoutingPreference) {
      this.modelRoutingPreference = Optional.of(modelRoutingPreference);
      return this;
    }
    @Override
    GenerationConfigRoutingConfigAutoRoutingMode.Builder modelRoutingPreference(Optional<ModelRoutingPreference> modelRoutingPreference) {
      if (modelRoutingPreference == null) {
        throw new NullPointerException("Null modelRoutingPreference");
      }
      this.modelRoutingPreference = modelRoutingPreference;
      return this;
    }
    @Override
    public GenerationConfigRoutingConfigAutoRoutingMode build() {
      return new AutoValue_GenerationConfigRoutingConfigAutoRoutingMode(
          this.modelRoutingPreference);
    }
  }

}

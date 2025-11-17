package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ListModelsParameters extends ListModelsParameters {

  private final Optional<ListModelsConfig> config;

  private AutoValue_ListModelsParameters(
      Optional<ListModelsConfig> config) {
    this.config = config;
  }

  @JsonProperty("config")
  @Override
  public Optional<ListModelsConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "ListModelsParameters{"
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ListModelsParameters) {
      ListModelsParameters that = (ListModelsParameters) o;
      return this.config.equals(that.config());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public ListModelsParameters.Builder toBuilder() {
    return new AutoValue_ListModelsParameters.Builder(this);
  }

  static final class Builder extends ListModelsParameters.Builder {
    private Optional<ListModelsConfig> config = Optional.empty();
    Builder() {
    }
    Builder(ListModelsParameters source) {
      this.config = source.config();
    }
    @Override
    public ListModelsParameters.Builder config(ListModelsConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    ListModelsParameters.Builder config(Optional<ListModelsConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public ListModelsParameters build() {
      return new AutoValue_ListModelsParameters(
          this.config);
    }
  }

}

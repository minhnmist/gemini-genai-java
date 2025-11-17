package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CreateFileSearchStoreParameters extends CreateFileSearchStoreParameters {

  private final Optional<CreateFileSearchStoreConfig> config;

  private AutoValue_CreateFileSearchStoreParameters(
      Optional<CreateFileSearchStoreConfig> config) {
    this.config = config;
  }

  @JsonProperty("config")
  @Override
  public Optional<CreateFileSearchStoreConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "CreateFileSearchStoreParameters{"
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateFileSearchStoreParameters) {
      CreateFileSearchStoreParameters that = (CreateFileSearchStoreParameters) o;
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
  public CreateFileSearchStoreParameters.Builder toBuilder() {
    return new AutoValue_CreateFileSearchStoreParameters.Builder(this);
  }

  static final class Builder extends CreateFileSearchStoreParameters.Builder {
    private Optional<CreateFileSearchStoreConfig> config = Optional.empty();
    Builder() {
    }
    Builder(CreateFileSearchStoreParameters source) {
      this.config = source.config();
    }
    @Override
    public CreateFileSearchStoreParameters.Builder config(CreateFileSearchStoreConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    CreateFileSearchStoreParameters.Builder config(Optional<CreateFileSearchStoreConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public CreateFileSearchStoreParameters build() {
      return new AutoValue_CreateFileSearchStoreParameters(
          this.config);
    }
  }

}

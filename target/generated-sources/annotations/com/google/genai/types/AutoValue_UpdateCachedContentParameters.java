package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_UpdateCachedContentParameters extends UpdateCachedContentParameters {

  private final Optional<String> name;

  private final Optional<UpdateCachedContentConfig> config;

  private AutoValue_UpdateCachedContentParameters(
      Optional<String> name,
      Optional<UpdateCachedContentConfig> config) {
    this.name = name;
    this.config = config;
  }

  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return name;
  }

  @JsonProperty("config")
  @Override
  public Optional<UpdateCachedContentConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "UpdateCachedContentParameters{"
        + "name=" + name + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UpdateCachedContentParameters) {
      UpdateCachedContentParameters that = (UpdateCachedContentParameters) o;
      return this.name.equals(that.name())
          && this.config.equals(that.config());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public UpdateCachedContentParameters.Builder toBuilder() {
    return new AutoValue_UpdateCachedContentParameters.Builder(this);
  }

  static final class Builder extends UpdateCachedContentParameters.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<UpdateCachedContentConfig> config = Optional.empty();
    Builder() {
    }
    Builder(UpdateCachedContentParameters source) {
      this.name = source.name();
      this.config = source.config();
    }
    @Override
    public UpdateCachedContentParameters.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    UpdateCachedContentParameters.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public UpdateCachedContentParameters.Builder config(UpdateCachedContentConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    UpdateCachedContentParameters.Builder config(Optional<UpdateCachedContentConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public UpdateCachedContentParameters build() {
      return new AutoValue_UpdateCachedContentParameters(
          this.name,
          this.config);
    }
  }

}

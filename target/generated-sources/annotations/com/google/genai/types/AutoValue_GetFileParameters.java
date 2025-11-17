package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GetFileParameters extends GetFileParameters {

  private final Optional<String> name;

  private final Optional<GetFileConfig> config;

  private AutoValue_GetFileParameters(
      Optional<String> name,
      Optional<GetFileConfig> config) {
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
  public Optional<GetFileConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "GetFileParameters{"
        + "name=" + name + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GetFileParameters) {
      GetFileParameters that = (GetFileParameters) o;
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
  public GetFileParameters.Builder toBuilder() {
    return new AutoValue_GetFileParameters.Builder(this);
  }

  static final class Builder extends GetFileParameters.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<GetFileConfig> config = Optional.empty();
    Builder() {
    }
    Builder(GetFileParameters source) {
      this.name = source.name();
      this.config = source.config();
    }
    @Override
    public GetFileParameters.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    GetFileParameters.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public GetFileParameters.Builder config(GetFileConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    GetFileParameters.Builder config(Optional<GetFileConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public GetFileParameters build() {
      return new AutoValue_GetFileParameters(
          this.name,
          this.config);
    }
  }

}

package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GetCachedContentParameters extends GetCachedContentParameters {

  private final Optional<String> name;

  private final Optional<GetCachedContentConfig> config;

  private AutoValue_GetCachedContentParameters(
      Optional<String> name,
      Optional<GetCachedContentConfig> config) {
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
  public Optional<GetCachedContentConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "GetCachedContentParameters{"
        + "name=" + name + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GetCachedContentParameters) {
      GetCachedContentParameters that = (GetCachedContentParameters) o;
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
  public GetCachedContentParameters.Builder toBuilder() {
    return new AutoValue_GetCachedContentParameters.Builder(this);
  }

  static final class Builder extends GetCachedContentParameters.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<GetCachedContentConfig> config = Optional.empty();
    Builder() {
    }
    Builder(GetCachedContentParameters source) {
      this.name = source.name();
      this.config = source.config();
    }
    @Override
    public GetCachedContentParameters.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    GetCachedContentParameters.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public GetCachedContentParameters.Builder config(GetCachedContentConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    GetCachedContentParameters.Builder config(Optional<GetCachedContentConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public GetCachedContentParameters build() {
      return new AutoValue_GetCachedContentParameters(
          this.name,
          this.config);
    }
  }

}

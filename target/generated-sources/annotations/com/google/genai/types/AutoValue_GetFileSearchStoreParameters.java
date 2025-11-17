package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GetFileSearchStoreParameters extends GetFileSearchStoreParameters {

  private final Optional<String> name;

  private final Optional<GetFileSearchStoreConfig> config;

  private AutoValue_GetFileSearchStoreParameters(
      Optional<String> name,
      Optional<GetFileSearchStoreConfig> config) {
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
  public Optional<GetFileSearchStoreConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "GetFileSearchStoreParameters{"
        + "name=" + name + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GetFileSearchStoreParameters) {
      GetFileSearchStoreParameters that = (GetFileSearchStoreParameters) o;
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
  public GetFileSearchStoreParameters.Builder toBuilder() {
    return new AutoValue_GetFileSearchStoreParameters.Builder(this);
  }

  static final class Builder extends GetFileSearchStoreParameters.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<GetFileSearchStoreConfig> config = Optional.empty();
    Builder() {
    }
    Builder(GetFileSearchStoreParameters source) {
      this.name = source.name();
      this.config = source.config();
    }
    @Override
    public GetFileSearchStoreParameters.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    GetFileSearchStoreParameters.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public GetFileSearchStoreParameters.Builder config(GetFileSearchStoreConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    GetFileSearchStoreParameters.Builder config(Optional<GetFileSearchStoreConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public GetFileSearchStoreParameters build() {
      return new AutoValue_GetFileSearchStoreParameters(
          this.name,
          this.config);
    }
  }

}

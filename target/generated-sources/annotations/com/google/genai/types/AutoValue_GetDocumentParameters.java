package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GetDocumentParameters extends GetDocumentParameters {

  private final Optional<String> name;

  private final Optional<GetDocumentConfig> config;

  private AutoValue_GetDocumentParameters(
      Optional<String> name,
      Optional<GetDocumentConfig> config) {
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
  public Optional<GetDocumentConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "GetDocumentParameters{"
        + "name=" + name + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GetDocumentParameters) {
      GetDocumentParameters that = (GetDocumentParameters) o;
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
  public GetDocumentParameters.Builder toBuilder() {
    return new AutoValue_GetDocumentParameters.Builder(this);
  }

  static final class Builder extends GetDocumentParameters.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<GetDocumentConfig> config = Optional.empty();
    Builder() {
    }
    Builder(GetDocumentParameters source) {
      this.name = source.name();
      this.config = source.config();
    }
    @Override
    public GetDocumentParameters.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    GetDocumentParameters.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public GetDocumentParameters.Builder config(GetDocumentConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    GetDocumentParameters.Builder config(Optional<GetDocumentConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public GetDocumentParameters build() {
      return new AutoValue_GetDocumentParameters(
          this.name,
          this.config);
    }
  }

}

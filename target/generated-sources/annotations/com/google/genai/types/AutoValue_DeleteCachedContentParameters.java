package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DeleteCachedContentParameters extends DeleteCachedContentParameters {

  private final Optional<String> name;

  private final Optional<DeleteCachedContentConfig> config;

  private AutoValue_DeleteCachedContentParameters(
      Optional<String> name,
      Optional<DeleteCachedContentConfig> config) {
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
  public Optional<DeleteCachedContentConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "DeleteCachedContentParameters{"
        + "name=" + name + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DeleteCachedContentParameters) {
      DeleteCachedContentParameters that = (DeleteCachedContentParameters) o;
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
  public DeleteCachedContentParameters.Builder toBuilder() {
    return new AutoValue_DeleteCachedContentParameters.Builder(this);
  }

  static final class Builder extends DeleteCachedContentParameters.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<DeleteCachedContentConfig> config = Optional.empty();
    Builder() {
    }
    Builder(DeleteCachedContentParameters source) {
      this.name = source.name();
      this.config = source.config();
    }
    @Override
    public DeleteCachedContentParameters.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    DeleteCachedContentParameters.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public DeleteCachedContentParameters.Builder config(DeleteCachedContentConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    DeleteCachedContentParameters.Builder config(Optional<DeleteCachedContentConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public DeleteCachedContentParameters build() {
      return new AutoValue_DeleteCachedContentParameters(
          this.name,
          this.config);
    }
  }

}

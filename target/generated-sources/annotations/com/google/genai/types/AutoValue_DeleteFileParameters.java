package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DeleteFileParameters extends DeleteFileParameters {

  private final Optional<String> name;

  private final Optional<DeleteFileConfig> config;

  private AutoValue_DeleteFileParameters(
      Optional<String> name,
      Optional<DeleteFileConfig> config) {
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
  public Optional<DeleteFileConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "DeleteFileParameters{"
        + "name=" + name + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DeleteFileParameters) {
      DeleteFileParameters that = (DeleteFileParameters) o;
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
  public DeleteFileParameters.Builder toBuilder() {
    return new AutoValue_DeleteFileParameters.Builder(this);
  }

  static final class Builder extends DeleteFileParameters.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<DeleteFileConfig> config = Optional.empty();
    Builder() {
    }
    Builder(DeleteFileParameters source) {
      this.name = source.name();
      this.config = source.config();
    }
    @Override
    public DeleteFileParameters.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    DeleteFileParameters.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public DeleteFileParameters.Builder config(DeleteFileConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    DeleteFileParameters.Builder config(Optional<DeleteFileConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public DeleteFileParameters build() {
      return new AutoValue_DeleteFileParameters(
          this.name,
          this.config);
    }
  }

}

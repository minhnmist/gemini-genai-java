package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DeleteDocumentParameters extends DeleteDocumentParameters {

  private final Optional<String> name;

  private final Optional<DeleteDocumentConfig> config;

  private AutoValue_DeleteDocumentParameters(
      Optional<String> name,
      Optional<DeleteDocumentConfig> config) {
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
  public Optional<DeleteDocumentConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "DeleteDocumentParameters{"
        + "name=" + name + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DeleteDocumentParameters) {
      DeleteDocumentParameters that = (DeleteDocumentParameters) o;
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
  public DeleteDocumentParameters.Builder toBuilder() {
    return new AutoValue_DeleteDocumentParameters.Builder(this);
  }

  static final class Builder extends DeleteDocumentParameters.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<DeleteDocumentConfig> config = Optional.empty();
    Builder() {
    }
    Builder(DeleteDocumentParameters source) {
      this.name = source.name();
      this.config = source.config();
    }
    @Override
    public DeleteDocumentParameters.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    DeleteDocumentParameters.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public DeleteDocumentParameters.Builder config(DeleteDocumentConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    DeleteDocumentParameters.Builder config(Optional<DeleteDocumentConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public DeleteDocumentParameters build() {
      return new AutoValue_DeleteDocumentParameters(
          this.name,
          this.config);
    }
  }

}

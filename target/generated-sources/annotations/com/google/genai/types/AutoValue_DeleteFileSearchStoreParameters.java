package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DeleteFileSearchStoreParameters extends DeleteFileSearchStoreParameters {

  private final Optional<String> name;

  private final Optional<DeleteFileSearchStoreConfig> config;

  private AutoValue_DeleteFileSearchStoreParameters(
      Optional<String> name,
      Optional<DeleteFileSearchStoreConfig> config) {
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
  public Optional<DeleteFileSearchStoreConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "DeleteFileSearchStoreParameters{"
        + "name=" + name + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DeleteFileSearchStoreParameters) {
      DeleteFileSearchStoreParameters that = (DeleteFileSearchStoreParameters) o;
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
  public DeleteFileSearchStoreParameters.Builder toBuilder() {
    return new AutoValue_DeleteFileSearchStoreParameters.Builder(this);
  }

  static final class Builder extends DeleteFileSearchStoreParameters.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<DeleteFileSearchStoreConfig> config = Optional.empty();
    Builder() {
    }
    Builder(DeleteFileSearchStoreParameters source) {
      this.name = source.name();
      this.config = source.config();
    }
    @Override
    public DeleteFileSearchStoreParameters.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    DeleteFileSearchStoreParameters.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public DeleteFileSearchStoreParameters.Builder config(DeleteFileSearchStoreConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    DeleteFileSearchStoreParameters.Builder config(Optional<DeleteFileSearchStoreConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public DeleteFileSearchStoreParameters build() {
      return new AutoValue_DeleteFileSearchStoreParameters(
          this.name,
          this.config);
    }
  }

}

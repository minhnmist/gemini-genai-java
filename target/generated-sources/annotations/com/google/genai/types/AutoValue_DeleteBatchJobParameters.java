package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DeleteBatchJobParameters extends DeleteBatchJobParameters {

  private final Optional<String> name;

  private final Optional<DeleteBatchJobConfig> config;

  private AutoValue_DeleteBatchJobParameters(
      Optional<String> name,
      Optional<DeleteBatchJobConfig> config) {
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
  public Optional<DeleteBatchJobConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "DeleteBatchJobParameters{"
        + "name=" + name + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DeleteBatchJobParameters) {
      DeleteBatchJobParameters that = (DeleteBatchJobParameters) o;
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
  public DeleteBatchJobParameters.Builder toBuilder() {
    return new AutoValue_DeleteBatchJobParameters.Builder(this);
  }

  static final class Builder extends DeleteBatchJobParameters.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<DeleteBatchJobConfig> config = Optional.empty();
    Builder() {
    }
    Builder(DeleteBatchJobParameters source) {
      this.name = source.name();
      this.config = source.config();
    }
    @Override
    public DeleteBatchJobParameters.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    DeleteBatchJobParameters.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public DeleteBatchJobParameters.Builder config(DeleteBatchJobConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    DeleteBatchJobParameters.Builder config(Optional<DeleteBatchJobConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public DeleteBatchJobParameters build() {
      return new AutoValue_DeleteBatchJobParameters(
          this.name,
          this.config);
    }
  }

}

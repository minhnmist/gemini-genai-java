package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CreateFileParameters extends CreateFileParameters {

  private final Optional<File> file;

  private final Optional<CreateFileConfig> config;

  private AutoValue_CreateFileParameters(
      Optional<File> file,
      Optional<CreateFileConfig> config) {
    this.file = file;
    this.config = config;
  }

  @JsonProperty("file")
  @Override
  public Optional<File> file() {
    return file;
  }

  @JsonProperty("config")
  @Override
  public Optional<CreateFileConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "CreateFileParameters{"
        + "file=" + file + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateFileParameters) {
      CreateFileParameters that = (CreateFileParameters) o;
      return this.file.equals(that.file())
          && this.config.equals(that.config());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= file.hashCode();
    h$ *= 1000003;
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public CreateFileParameters.Builder toBuilder() {
    return new AutoValue_CreateFileParameters.Builder(this);
  }

  static final class Builder extends CreateFileParameters.Builder {
    private Optional<File> file = Optional.empty();
    private Optional<CreateFileConfig> config = Optional.empty();
    Builder() {
    }
    Builder(CreateFileParameters source) {
      this.file = source.file();
      this.config = source.config();
    }
    @Override
    public CreateFileParameters.Builder file(File file) {
      this.file = Optional.of(file);
      return this;
    }
    @Override
    CreateFileParameters.Builder file(Optional<File> file) {
      if (file == null) {
        throw new NullPointerException("Null file");
      }
      this.file = file;
      return this;
    }
    @Override
    public CreateFileParameters.Builder config(CreateFileConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    CreateFileParameters.Builder config(Optional<CreateFileConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public CreateFileParameters build() {
      return new AutoValue_CreateFileParameters(
          this.file,
          this.config);
    }
  }

}

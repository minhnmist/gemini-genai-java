package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ImportFileParameters extends ImportFileParameters {

  private final Optional<String> fileSearchStoreName;

  private final Optional<String> fileName;

  private final Optional<ImportFileConfig> config;

  private AutoValue_ImportFileParameters(
      Optional<String> fileSearchStoreName,
      Optional<String> fileName,
      Optional<ImportFileConfig> config) {
    this.fileSearchStoreName = fileSearchStoreName;
    this.fileName = fileName;
    this.config = config;
  }

  @JsonProperty("fileSearchStoreName")
  @Override
  public Optional<String> fileSearchStoreName() {
    return fileSearchStoreName;
  }

  @JsonProperty("fileName")
  @Override
  public Optional<String> fileName() {
    return fileName;
  }

  @JsonProperty("config")
  @Override
  public Optional<ImportFileConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "ImportFileParameters{"
        + "fileSearchStoreName=" + fileSearchStoreName + ", "
        + "fileName=" + fileName + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ImportFileParameters) {
      ImportFileParameters that = (ImportFileParameters) o;
      return this.fileSearchStoreName.equals(that.fileSearchStoreName())
          && this.fileName.equals(that.fileName())
          && this.config.equals(that.config());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= fileSearchStoreName.hashCode();
    h$ *= 1000003;
    h$ ^= fileName.hashCode();
    h$ *= 1000003;
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public ImportFileParameters.Builder toBuilder() {
    return new AutoValue_ImportFileParameters.Builder(this);
  }

  static final class Builder extends ImportFileParameters.Builder {
    private Optional<String> fileSearchStoreName = Optional.empty();
    private Optional<String> fileName = Optional.empty();
    private Optional<ImportFileConfig> config = Optional.empty();
    Builder() {
    }
    Builder(ImportFileParameters source) {
      this.fileSearchStoreName = source.fileSearchStoreName();
      this.fileName = source.fileName();
      this.config = source.config();
    }
    @Override
    public ImportFileParameters.Builder fileSearchStoreName(String fileSearchStoreName) {
      this.fileSearchStoreName = Optional.of(fileSearchStoreName);
      return this;
    }
    @Override
    ImportFileParameters.Builder fileSearchStoreName(Optional<String> fileSearchStoreName) {
      if (fileSearchStoreName == null) {
        throw new NullPointerException("Null fileSearchStoreName");
      }
      this.fileSearchStoreName = fileSearchStoreName;
      return this;
    }
    @Override
    public ImportFileParameters.Builder fileName(String fileName) {
      this.fileName = Optional.of(fileName);
      return this;
    }
    @Override
    ImportFileParameters.Builder fileName(Optional<String> fileName) {
      if (fileName == null) {
        throw new NullPointerException("Null fileName");
      }
      this.fileName = fileName;
      return this;
    }
    @Override
    public ImportFileParameters.Builder config(ImportFileConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    ImportFileParameters.Builder config(Optional<ImportFileConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public ImportFileParameters build() {
      return new AutoValue_ImportFileParameters(
          this.fileSearchStoreName,
          this.fileName,
          this.config);
    }
  }

}

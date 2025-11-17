package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CreateBatchJobConfig extends CreateBatchJobConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<String> displayName;

  private final Optional<BatchJobDestination> dest;

  private AutoValue_CreateBatchJobConfig(
      Optional<HttpOptions> httpOptions,
      Optional<String> displayName,
      Optional<BatchJobDestination> dest) {
    this.httpOptions = httpOptions;
    this.displayName = displayName;
    this.dest = dest;
  }

  @JsonProperty("httpOptions")
  @Override
  public Optional<HttpOptions> httpOptions() {
    return httpOptions;
  }

  @JsonProperty("displayName")
  @Override
  public Optional<String> displayName() {
    return displayName;
  }

  @JsonProperty("dest")
  @Override
  public Optional<BatchJobDestination> dest() {
    return dest;
  }

  @Override
  public String toString() {
    return "CreateBatchJobConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "displayName=" + displayName + ", "
        + "dest=" + dest
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateBatchJobConfig) {
      CreateBatchJobConfig that = (CreateBatchJobConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.displayName.equals(that.displayName())
          && this.dest.equals(that.dest());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= httpOptions.hashCode();
    h$ *= 1000003;
    h$ ^= displayName.hashCode();
    h$ *= 1000003;
    h$ ^= dest.hashCode();
    return h$;
  }

  @Override
  public CreateBatchJobConfig.Builder toBuilder() {
    return new AutoValue_CreateBatchJobConfig.Builder(this);
  }

  static final class Builder extends CreateBatchJobConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<String> displayName = Optional.empty();
    private Optional<BatchJobDestination> dest = Optional.empty();
    Builder() {
    }
    Builder(CreateBatchJobConfig source) {
      this.httpOptions = source.httpOptions();
      this.displayName = source.displayName();
      this.dest = source.dest();
    }
    @Override
    public CreateBatchJobConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    CreateBatchJobConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public CreateBatchJobConfig.Builder displayName(String displayName) {
      this.displayName = Optional.of(displayName);
      return this;
    }
    @Override
    CreateBatchJobConfig.Builder displayName(Optional<String> displayName) {
      if (displayName == null) {
        throw new NullPointerException("Null displayName");
      }
      this.displayName = displayName;
      return this;
    }
    @Override
    public CreateBatchJobConfig.Builder dest(BatchJobDestination dest) {
      this.dest = Optional.of(dest);
      return this;
    }
    @Override
    CreateBatchJobConfig.Builder dest(Optional<BatchJobDestination> dest) {
      if (dest == null) {
        throw new NullPointerException("Null dest");
      }
      this.dest = dest;
      return this;
    }
    @Override
    public CreateBatchJobConfig build() {
      return new AutoValue_CreateBatchJobConfig(
          this.httpOptions,
          this.displayName,
          this.dest);
    }
  }

}
